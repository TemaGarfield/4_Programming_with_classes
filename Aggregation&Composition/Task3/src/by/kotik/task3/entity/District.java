package by.kotik.task3.entity;

import java.util.ArrayList;

public class District {
    private ArrayList<City> districtCities;
    private City districtCapital;
    private String districtName;
    private double districtArea;

    public District(ArrayList<City> districtCities, City districtCapital, String districtName) {
        this.districtCities = districtCities;
        this.districtCapital = districtCapital;
        this.districtName = districtName;
    }

    public District(ArrayList<City> districtCities, City districtCapital, String districtName, double districtArea) {
        this.districtCities = districtCities;
        this.districtCapital = districtCapital;
        this.districtName = districtName;
        this.districtArea = districtArea;
    }

    public ArrayList<City> getDistrictCities() {
        return districtCities;
    }

    public void setDistrictCities(ArrayList<City> districtCities) {
        this.districtCities = districtCities;
    }

    public City getDistrictCapital() {
        return districtCapital;
    }

    public void setDistrictCapital(City districtCapital) {
        this.districtCapital = districtCapital;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public double getDistrictArea() {
        if(districtArea == 0.0D) {
            for (City city:districtCities) {
                districtArea += city.getCityArea();
            }
        }

        return districtArea;
    }

    public void setDistrictArea(double districtArea) {
        this.districtArea = districtArea;
    }
}
