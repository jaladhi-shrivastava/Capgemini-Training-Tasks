package com.cg.controller;

import com.cg.dto.TraineeDTO;
import com.cg.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trainee")
public class TraineeController {

    @Autowired
    private ITraineeService traineeService;

    @PostMapping(consumes = {"application/json","application/xml"})
    public TraineeDTO createTrainee(@RequestBody TraineeDTO traineeDTO){
        return traineeService.createTrainee(traineeDTO);
    }
    @GetMapping(produces = {"application/json","application/xm"})
    public List<TraineeDTO> getTraineeList(){
        return traineeService.getAllTrainee();
    }
    @GetMapping("/name/{name}")
    public List<TraineeDTO> getTraineeListByName(@PathVariable String name){
        return traineeService.getTraineeByName(name);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TraineeDTO> getTraineeById(@PathVariable int id){
        if(traineeService.getTraineeById(id) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(traineeService.getTraineeById(id), HttpStatus.OK);
        }
    }
    @DeleteMapping("{id}")
    public TraineeDTO deleteTraineeById(@PathVariable int id){
        return traineeService.deleteTraineeById(id);
    }
    @PutMapping
    public TraineeDTO updateTraineeById(@RequestBody TraineeDTO traineeDTO){
        return traineeService.updateTraineeById(traineeDTO);
    }

}
