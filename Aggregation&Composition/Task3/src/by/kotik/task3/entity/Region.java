package by.kotik.task3.entity;

import java.util.ArrayList;

public class Region {
    private String regionName;
    private double regionArea;
    private ArrayList<District> regionDistricts;
    private City regionCapital;

    public Region(String regionName, double regionArea, City regionCapital) {
        this.regionName = regionName;
        this.regionArea = regionArea;
        this.regionCapital = regionCapital;
    }

    public Region(String regionName, ArrayList<District> regionDistricts, City regionCapital) {
        this.regionName = regionName;
        this.regionDistricts = new ArrayList<>();
        this.regionCapital = regionCapital;
    }

    public Region(String regionName, double regionArea, ArrayList<District> regionDistricts, City regionCapital) {
        this.regionName = regionName;
        this.regionArea = regionArea;
        this.regionDistricts = regionDistricts;
        this.regionCapital = regionCapital;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getRegionArea() {
        if (regionArea == 0.0D) {
            for (District district:regionDistricts) {
                regionArea += district.getDistrictArea();
            }
        }

        return regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }

    public ArrayList<District> getRegionDistricts() {
        return regionDistricts;
    }

    public void setRegionDistricts(ArrayList<District> regionDistricts) {
        this.regionDistricts = regionDistricts;
    }

    public City getRegionCapital() {
        return regionCapital;
    }


    public void setRegionCapital(City regionCapital) {
        this.regionCapital = regionCapital;
    }
}
