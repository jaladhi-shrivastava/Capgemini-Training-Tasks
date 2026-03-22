package com.hackerrank.restcontrolleradvice.exception;

import com.hackerrank.restcontrolleradvice.dto.BuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzException;
import com.hackerrank.restcontrolleradvice.dto.GlobalError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

    //TODO:: implement handler methods for FizzException, BuzzException and FizzBuzzException

    @ResponseBody
    @ExceptionHandler({BuzzException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST) //404
    public GlobalError handleException(BuzzException e, HttpServletRequest request) {
        return new GlobalError(e.getMessage(),e.getErrorReason());
    }

    @ResponseBody
    @ExceptionHandler({FizzException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) //404
    public GlobalError handleException(FizzException e, HttpServletRequest request) {
        return new GlobalError(e.getMessage(),e.getErrorReason());
    }


    @ResponseBody
    @ExceptionHandler({FizzBuzzException.class})
    @ResponseStatus(value = HttpStatus.INSUFFICIENT_STORAGE) //404
    public GlobalError handleException(FizzBuzzException e, HttpServletRequest request) {
        return new GlobalError(e.getMessage(),e.getErrorReason());
    }
}
