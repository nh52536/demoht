package com.ht.demozad.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class ShipmentController {




    @Autowired
    private ShipmentService shipmentService;
    @RequestMapping("/getAll")
    public List<Shipment> getAllShipments() throws Exception {
        try {
            return shipmentService.getAllShipments();

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @GetMapping("/getShipmentById/{id}")
    public Shipment getShipmentById(@PathVariable("id") String id) throws Exception{
        try {
            return shipmentService.getShipmentByID(id);

        }catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @GetMapping("/getAllShipmentsByStatus/{status}")
    public List<Shipment> getShipmentByStatus(@PathVariable("status") String status) throws Exception {
        try {
        return shipmentService.getShipmentByStatus(status);
    }catch (Exception e) {
        throw  new Exception(e.getMessage());
    }
    }

    @GetMapping("/getAllShipmentsByDate/{date1}/{date2}")
    public  List<Shipment> getShipmentByDate(@PathVariable("date1") String date, @PathVariable("date2") String date1) throws Exception {
        try {

            Date localdate1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            Date localDatedate2 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
                return shipmentService.getShipmentByDate(localdate1, localDatedate2);

        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @PostMapping("/addSHipment")
    public boolean addShipmentToDataBase(@RequestBody RequestBodyShipment requestBody) throws Exception {

        try{
        return shipmentService.addShipmentToDatabase(requestBody);

        }catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }
}

