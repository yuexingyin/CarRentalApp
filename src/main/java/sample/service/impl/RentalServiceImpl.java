package sample.service.impl;

import sample.dto.Request;
import sample.entity.Record;
import sample.entity.Stock;
import sample.entity.User;
import sample.entity.Vehicle;
import org.springframework.stereotype.Service;
import sample.service.RentalService;
import sample.service.model.AvailableStock;
import sample.service.model.ReserveStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentalServiceImpl implements RentalService {

    private static final Stock stock = new Stock();

    private static final List<User> userList = initUserList();

    private static final List<Record> bookList = new ArrayList<>();

    @Override
    public AvailableStock getAvailableVehicles() {

        List<Vehicle> availableVehicleList = stock.getVehicleList()
                .stream()
                .filter(Vehicle::isAvailable)
                .collect(Collectors.toList());

        AvailableStock availableStock = new AvailableStock();
        availableStock.setAvailableVehicleList(availableVehicleList);

        return availableStock;
    }

    @Override
    public ReserveStatus reserveVehicle(Request request) {

        ReserveStatus status = new ReserveStatus();

        List<Vehicle> vehicleList = stock.getVehicleList();
        for(Vehicle vehicle : vehicleList) {
            if(vehicle.getId().equals(request.getVehicleId())
                    && isValidUser(request.getUserId())) {
                if(vehicle.isAvailable()){
                    vehicle.setAvailable(false);
                    addToBookList(request);
                    status.setStatus(true);
                }
            }
        }

        if(status.isStatus() == null){
            status.setStatus(false);
        }

        return status;
    }

    private void addToBookList(Request request) {
        Record record = new Record();
        record.setUserId(request.getUserId());
        record.setVehicleId(request.getVehicleId());
        record.setFromDate(request.getFromDate());
        record.setToDate(request.getToDate());
        bookList.add(record);
    }

    @Override
    public List<Record> getBookList() {
        return bookList;
    }

    @Override
    public List<User> getUserList() {
        return userList;
    }

    private boolean isValidUser(String userId){
        for(User user : userList){
            if(user.getId().equals(userId)){
                return true;
            }
        }
        return false;
    }

    private static List<User> initUserList(){
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setId("1");
        user1.setName("Jack");

        User user2 = new User();
        user2.setId("2");
        user2.setName("Rose");

        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
