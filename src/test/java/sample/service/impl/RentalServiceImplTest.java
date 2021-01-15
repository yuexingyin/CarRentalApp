package sample.service.impl;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import sample.dto.Request;
import sample.entity.Record;

import java.util.List;
import java.util.UUID;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class RentalServiceImplTest {

    @InjectMocks
    private RentalServiceImpl rentalService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAvailableVehicles() {
        rentalService.getAvailableVehicles();
    }

    @Test
    public void reserveVehicle() {
        Request request = mockReserveRequest();
        rentalService.reserveVehicle(request);
    }

    private Request mockReserveRequest(){
        Request request = new Request();
        request.setUserId("1");
        request.setVehicleId(UUID.randomUUID().toString().replaceAll("-", ""));
        request.setFromDate("2021-01-01");
        request.setToDate("20201-02-02");
        return request;
    }

    @Test
    public void getBookList() {
        List<Record> recordList = rentalService.getBookList();
        System.out.println(recordList);
    }
}