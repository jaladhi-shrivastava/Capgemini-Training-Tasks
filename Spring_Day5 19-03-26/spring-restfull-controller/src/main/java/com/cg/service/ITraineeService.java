package com.cg.service;

import com.cg.dto.TraineeDTO;

import java.util.List;

public interface ITraineeService {

    public TraineeDTO createTrainee(TraineeDTO t);
    public List<TraineeDTO>  getAllTrainee();
    public List<TraineeDTO>  getTraineeByName(String name);
    public TraineeDTO getTraineeById(int id);
    public TraineeDTO deleteTraineeById(int id);
    public TraineeDTO updateTraineeById(TraineeDTO t);

}
