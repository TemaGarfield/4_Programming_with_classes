package by.kotik.task3.entity;

import java.util.ArrayList;

public class State {
    private String stateName;
    private double stateArea;
    private ArrayList<Region> stateRegions;
    private City capital;

    public State(String stateName, City capital) {
        this.stateName = stateName;
        this.capital = capital;
        this.stateRegions = new ArrayList<>();
    }

    public State(String stateName, double stateArea, ArrayList<Region> stateRegions, City capital) {
        this.stateName = stateName;
        this.stateArea = stateArea;
        this.stateRegions = stateRegions;
        this.capital = capital;
    }

    public void addRegion(Region region) {
        stateRegions.add(region);
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getStateArea() {
        if (stateArea == 0.0D) {
            for (Region region:stateRegions) {
                stateArea += region.getRegionArea();
            }
        }
        return stateArea;
    }

    public void setStateArea(double stateArea) {
        this.stateArea = stateArea;
    }

    public ArrayList<Region> getStateRegions() {
        return stateRegions;
    }

    public void setStateRegions(ArrayList<Region> stateRegions) {
        this.stateRegions = stateRegions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void showCapitals() {
        for (Region region:stateRegions) {
            System.out.println(region.getRegionCapital().getCityName());
        }
    }

    public void showCapital() {
        System.out.println(capital.getCityName());
    }

    public void showRegionNumber() {
        System.out.println(stateRegions.size());
    }
}
