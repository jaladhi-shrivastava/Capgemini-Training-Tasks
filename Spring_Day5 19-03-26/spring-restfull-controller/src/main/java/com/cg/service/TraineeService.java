package com.cg.service;

import com.cg.dao.ITraineeRepo;
import com.cg.dto.EntityMapping;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class TraineeService implements ITraineeService {

    @Autowired
    private ITraineeRepo traineeRepo;
    @Override
    public TraineeDTO createTrainee(TraineeDTO t) {
        return EntityMapping.convertEntityToDTO(traineeRepo.saveAndFlush(EntityMapping.convertObjectToEntity(t)));
    }

    @Override
    public List<TraineeDTO> getAllTrainee() {
        List<Trainee> trainee = traineeRepo.findAll();
        List<TraineeDTO> list=new ArrayList<>();
        trainee.forEach(t->list.add(EntityMapping.convertEntityToDTO(t)));
        return list;
    }

    @Override
    public List<TraineeDTO> getTraineeByName(String tName) {
        List<Trainee> t=traineeRepo.getBytName(tName);
        List<TraineeDTO> list=new ArrayList<>();
        t.forEach(e->list.add(EntityMapping.convertEntityToDTO(e)));
        return list;
    }

    @Override
    public TraineeDTO getTraineeById(int id) {
        Optional<Trainee> t=traineeRepo.findById(id);
        if(t.isPresent()){
            return EntityMapping.convertEntityToDTO(t.get());
        }else{
            return null;
        }
    }

    @Override
    public TraineeDTO deleteTraineeById(int id) {
        Optional<Trainee> t=traineeRepo.findById(id);
        if(t.isPresent()){
            traineeRepo.deleteById(id);
            return EntityMapping.convertEntityToDTO(t.get());
        }else{
            return null;
        }
    }

    @Override
    public TraineeDTO updateTraineeById(TraineeDTO t) {
        Optional<Trainee> op=traineeRepo.findById(t.getTraineeId());
        if(op.isPresent()){
            Trainee tr=op.get();
            if(t.getTraineeName()!=null){
                tr.settName(t.getTraineeName());
            }
            if (t.getTraineeDomain()!=null){
                tr.settDomain(t.getTraineeDomain());
            }
            if (t.getTraineeLocation()!=null){
                tr.settLocation(t.getTraineeLocation());
            }
            return EntityMapping.convertEntityToDTO(traineeRepo.saveAndFlush(tr));
        }

        return null;
    }
}
