package com.cg.dto;

import com.cg.entity.Trainee;

public class EntityMapping {
    public static Trainee convertObjectToEntity(TraineeDTO tdto){
        return new Trainee(tdto.getTraineeName(), tdto.getTraineeDomain(), tdto.getTraineeLocation());
    }
    public static TraineeDTO convertEntityToDTO(Trainee t){
        return new TraineeDTO(t.gettId(),t.gettName(),t.gettDomain(),t.gettLocation());
    }
}
