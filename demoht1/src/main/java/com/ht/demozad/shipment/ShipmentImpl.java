package com.ht.demozad.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Nullable;

import java.util.Date;
import java.util.List;

@Component
public class ShipmentImpl implements ShipmentService{

    @Autowired
    private ShipmentRepository ShipmentRepo;
    @Override
    public  List<Shipment> getAllShipments() throws Exception {
        try {
           List<Shipment> list =  ShipmentRepo.findAll();
           if(list.isEmpty()) { throw new Exception("There is no shipments in database");} else {
               return list;
           }
        }catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Shipment getShipmentByID(String id) throws Exception{
        try {

            if( ShipmentRepo.getShipmentById(id) == null) {
                throw  new Exception("There is no shipment with this id");
            }else {
                return ShipmentRepo.getShipmentById(id);
            }
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Shipment> getShipmentByStatus(String status) throws Exception{
        try {
            @Nullable
            List<Shipment> shipments = ShipmentRepo.getShipmentbyStatus(status);
            if(shipments == null ) {
                throw  new Exception("There is no shipments with that status");
            }else {
                return shipments;
            }
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Shipment> getShipmentByDate(Date date, Date date1) throws Exception{
        try {
            if(date.after(date1)) {
                @Nullable
                List<Shipment> shipments = ShipmentRepo.getShipmentbyCreationDate(date1,date);
                if(shipments.isEmpty()) {
                    throw new Exception("There is no shipments that where created in those dates");
                }else {
                    return  shipments;
                }

            }else {
                @Nullable
                List<Shipment> shipments = ShipmentRepo.getShipmentbyCreationDate(date,date1);
                if(shipments.isEmpty()) {
                    throw new Exception("There is no shipments that where created in those dates");
                }else {
                    return  shipments;
                }

            }
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }



    @Override
    public boolean addShipmentToDatabase(RequestBodyShipment requestBody) throws Exception {
        try {
            Shipment shipment = new Shipment();
            shipment.setCreatedate(requestBody.getCreatedate());
            shipment.setCarrier(requestBody.getCarrier());
            shipment.setCarriertrackingurl(requestBody.getCarriertrackingurl());
            shipment.setEstimateddeliverydate(requestBody.getEstimateddeliverydate());
            shipment.setHref(requestBody.getHref());
            shipment.setId(requestBody.getId());
            shipment.setStatus(requestBody.getStatus());
            shipment.setTrackingcode(requestBody.getTrackingcode());
            shipment.setTrackingdate(requestBody.getTrackingdate());
            shipment.setStatuschangedate(requestBody.getStatuschangedate());
            shipment.setStatuschangereason(requestBody.getStatuschangereason());
            shipment.setWeight(requestBody.getWeight());
            ShipmentRepo.save(shipment);
            return true;
        }catch (Exception e) {

            throw new Exception(e.getMessage());
        }
    }
}
