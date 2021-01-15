package sample.service.model;

import sample.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class AvailableStock {

    private List<Vehicle> availableVehicleList = new ArrayList<>();

    public List<Vehicle> getAvailableVehicleList() {
        return availableVehicleList;
    }

    public void setAvailableVehicleList(List<Vehicle> availableVehicleList) {
        this.availableVehicleList = availableVehicleList;
    }
}
