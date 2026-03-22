package com.cg.exception;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cg.dto.ErrorDTO;

import jakarta.servlet.http.HttpServletRequest;

import static org.springframework.validation.BindingResultUtils.getBindingResult;

@ControllerAdvice
public class GlobleExceptionHandler {
	
	@ResponseBody
	@ExceptionHandler({EmployeNotFoundException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND) //404
	public ErrorDTO handleException(EmployeNotFoundException e, HttpServletRequest request) {
		return new ErrorDTO(e.getMessage(), LocalDate.now(), request.getRequestURI());
	}

//for showing multiple error
	@ResponseBody
	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST) //400
	//key-->field name
	public Map<String,ErrorDTO> handleException1(MethodArgumentNotValidException e, HttpServletRequest request) {
		List<ObjectError> errors= e.getBindingResult().getAllErrors();
		Map<String,ErrorDTO> map=new HashMap<String,ErrorDTO>();
		for(ObjectError error:errors){ //FieldError is a child of ObjectError
			String fieldName=((FieldError)error).getField();
			map.put(fieldName,new ErrorDTO(error.getDefaultMessage(), LocalDate.now(), request.getRequestURI()));
		}
		return map;
	}
	@ResponseBody
	@ExceptionHandler({DateTimeParseException.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) //404
	public ErrorDTO handleException(DateTimeParseException e, HttpServletRequest request) {
		return new ErrorDTO(e.getMessage(), LocalDate.now(), request.getRequestURI());
	}
}
