package com.ht.demozad.shipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import java.util.Date;
import java.util.List;

@Repository
public
interface ShipmentRepository extends JpaRepository<Shipment,String> {


    @Query("SELECT u FROM Shipment u WHERE u.status = ?1 ORDER BY u.id ")
    List<Shipment> getShipmentbyStatus(String status);

    @Query("SELECT u FROM Shipment u WHERE u.createdate >= ?1  AND u.createdate <= ?2 ORDER BY u.id ")
    List<Shipment> getShipmentbyCreationDate(Date date1, Date date2);

    @Query("SELECT u FROM Shipment u WHERE u.id = ?1 ")
    Shipment getShipmentById(String id);



}
