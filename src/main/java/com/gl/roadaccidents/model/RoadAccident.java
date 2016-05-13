package com.gl.roadaccidents.model;

import java.util.Date;

/**
 * Created by gavin on 16-5-13.
 */
public class RoadAccident extends BaseEntity{

    /*

    Accident_Index,Longitude,
    Latitude,Police_Force,Accident_Severity,
    Number_of_Vehicles,Number_of_Casualties,Date,
    Day_of_Week,Time,Local_Authority_(District),
    Light_Conditions,
    Weather_Conditions,
    Road_Surface_Conditions

     */
    private static final long serialVersionUID = 182816040115377252L;
    private String accidentIndex;
    private Double longitude;
    private Double latitude;
    private PoliceForce policeForce;
    private AccidentSeverity accidentSeverity;
    private Integer numberOfVehicles;
    private Integer numberOfCasualties;
    private Date occurOn;
    private Integer dayOfWeek;
    private Date occurAt;
    private DistrictAuthority districtAuthority;
    private LightCondition lightCondition;
    private WeatherCondition weatherCondition;
    private RoadSurface roadSurface;

    public String getAccidentIndex() {
        return accidentIndex;
    }

    public void setAccidentIndex(String accidentIndex) {
        this.accidentIndex = accidentIndex;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public PoliceForce getPoliceForce() {
        return policeForce;
    }

    public void setPoliceForce(PoliceForce policeForce) {
        this.policeForce = policeForce;
    }

    public AccidentSeverity getAccidentSeverity() {
        return accidentSeverity;
    }

    public void setAccidentSeverity(AccidentSeverity accidentSeverity) {
        this.accidentSeverity = accidentSeverity;
    }

    public Integer getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(Integer numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public Integer getNumberOfCasualties() {
        return numberOfCasualties;
    }

    public void setNumberOfCasualties(Integer numberOfCasualties) {
        this.numberOfCasualties = numberOfCasualties;
    }

    public Date getOccurOn() {
        return occurOn;
    }

    public void setOccurOn(Date occurOn) {
        this.occurOn = occurOn;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Date getOccurAt() {
        return occurAt;
    }

    public void setOccurAt(Date occurAt) {
        this.occurAt = occurAt;
    }

    public DistrictAuthority getDistrictAuthority() {
        return districtAuthority;
    }

    public void setDistrictAuthority(DistrictAuthority districtAuthority) {
        this.districtAuthority = districtAuthority;
    }

    public LightCondition getLightCondition() {
        return lightCondition;
    }

    public void setLightCondition(LightCondition lightCondition) {
        this.lightCondition = lightCondition;
    }

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public RoadSurface getRoadSurface() {
        return roadSurface;
    }

    public void setRoadSurface(RoadSurface roadSurface) {
        this.roadSurface = roadSurface;
    }
}
