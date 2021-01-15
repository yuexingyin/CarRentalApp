package sample.entity;

import sample.enums.ModelEnum;

import java.util.*;

public class Stock {

    private final List<Vehicle> vehicleList = new ArrayList<>();

    public Stock () {
        init();
    }

    private void init() {

        Vehicle toyota1 = new Vehicle();
        toyota1.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        toyota1.setModel(ModelEnum.TOYOTA_CAMRY.getName());
        toyota1.setPlate("123456");
        toyota1.setOdometer(122323);
        toyota1.setYear("2021");
        toyota1.setAvailable(true);

        Vehicle toyota2 = new Vehicle();
        toyota2.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        toyota2.setModel(ModelEnum.TOYOTA_CAMRY.getName());
        toyota2.setPlate("123457");
        toyota2.setOdometer(140523);
        toyota2.setYear("2019");
        toyota2.setAvailable(true);

        Vehicle bmw1 = new Vehicle();
        bmw1.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        bmw1.setModel(ModelEnum.BMW_650.getName());
        bmw1.setPlate("123458");
        bmw1.setOdometer(16000);
        bmw1.setYear("2020");
        bmw1.setAvailable(true);

        Vehicle bmw2 = new Vehicle();
        bmw2.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        bmw2.setModel(ModelEnum.BMW_650.getName());
        bmw2.setPlate("123459");
        bmw2.setOdometer(203456);
        bmw2.setYear("2005");
        bmw2.setAvailable(true);

        vehicleList.add(toyota1);
        vehicleList.add(toyota2);

        vehicleList.add(bmw1);
        vehicleList.add(bmw2);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
