package sample.service;

import sample.dto.Request;
import sample.entity.Record;
import sample.entity.User;
import sample.service.model.AvailableStock;
import sample.service.model.ReserveStatus;

import java.util.List;

public interface RentalService {

    AvailableStock getAvailableVehicles();

    ReserveStatus reserveVehicle(Request request);

    List<Record> getBookList();

    List<User> getUserList();
}
