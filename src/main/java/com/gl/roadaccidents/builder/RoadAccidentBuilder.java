package com.gl.roadaccidents.builder;

import com.gl.roadaccidents.model.*;

import java.util.Date;

/**
 * Created by gavin on 16-5-13.
 */
public class RoadAccidentBuilder {
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
}
