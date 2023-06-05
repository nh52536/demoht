package com.ht.demozad.shipment;


import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

import java.util.Date;
import java.util.List;

public interface ShipmentService {

    public List<Shipment> getAllShipments() throws Exception;
    public Shipment getShipmentByID(String id) throws Exception;
     public List<Shipment> getShipmentByStatus(String status) throws Exception;

     public List<Shipment> getShipmentByDate(Date date, Date date1) throws Exception;


    boolean addShipmentToDatabase(RequestBodyShipment requestBody) throws Exception;
}
