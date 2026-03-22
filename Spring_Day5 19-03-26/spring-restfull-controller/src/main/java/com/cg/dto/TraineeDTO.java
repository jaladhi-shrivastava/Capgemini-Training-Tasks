package com.cg.dto;

public class TraineeDTO {
    private Integer traineeId;
    private String traineeName;
    private String traineeDomain;
    private String traineeLocation;

    public TraineeDTO() {}
    public TraineeDTO(Integer traineeId, String traineeName, String traineeDomain, String traineeLocation) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeDomain = traineeDomain;
        this.traineeLocation = traineeLocation;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getTraineeDomain() {
        return traineeDomain;
    }

    public void setTraineeDomain(String traineeDomain) {
        this.traineeDomain = traineeDomain;
    }

    public String getTraineeLocation() {
        return traineeLocation;
    }

    public void setTraineeLocation(String traineeLocation) {
        this.traineeLocation = traineeLocation;
    }
}
