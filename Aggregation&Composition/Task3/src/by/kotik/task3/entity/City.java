package by.kotik.task3.entity;

public class City {
    private String cityName;
    private double cityArea;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName, double cityArea) {
        this.cityName = cityName;
        this.cityArea = cityArea;
    }


    public double getCityArea() {
        return cityArea;
    }

    public void setCityArea(double cityArea) {
        this.cityArea = cityArea;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
