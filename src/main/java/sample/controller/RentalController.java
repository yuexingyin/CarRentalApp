package sample.controller;

import io.swagger.annotations.ApiOperation;
import sample.constant.URI;
import sample.dto.Request;
import sample.dto.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sample.entity.Record;
import sample.entity.User;
import sample.service.RentalService;
import sample.service.model.AvailableStock;
import sample.service.model.ReserveStatus;

import java.util.List;

@RestController
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @ApiOperation(value = "Get Available Vehicles")
    @GetMapping(URI.API_GET_AVAILABLE_VEHICLES)
    public ResponseEntity<ServiceResponse<AvailableStock>> getAvailableVehicleList(){
        return ResponseEntity.ok(ServiceResponse.success(rentalService.getAvailableVehicles()));
    }

    @ApiOperation(value = "Reserve a vehicle")
    @PostMapping(URI.API_RESERVE_A_VEHICLE)
    public ResponseEntity<ServiceResponse<ReserveStatus>> reserveVehicle(@RequestBody Request request){
        return ResponseEntity.ok(ServiceResponse.success(rentalService.reserveVehicle(request)));
    }

    @ApiOperation(value = "Get book list")
    @GetMapping(URI.API_GET_BOOK_LIST)
    public ResponseEntity<ServiceResponse<List<Record>>> getBookList(){
        return ResponseEntity.ok(ServiceResponse.success(rentalService.getBookList()));
    }

    @ApiOperation(value = "Get user list")
    @GetMapping(URI.API_GET_USER_LIST)
    public ResponseEntity<ServiceResponse<List<User>>> getUserList(){
        return ResponseEntity.ok(ServiceResponse.success(rentalService.getUserList()));
    }
}
