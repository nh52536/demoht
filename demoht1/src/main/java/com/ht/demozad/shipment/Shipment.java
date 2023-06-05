package com.ht.demozad.shipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "shipment")
public class Shipment {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "href", nullable = false)
    private String href;

    @Column(name = "carrier", nullable = false)
    private String carrier;

    @Column(name = "trackingcode", nullable = false)
    private String trackingcode;

    @Column(name = "carriertrackingurl", nullable = false)
    private String carriertrackingurl;


    @Column(name = "trackingdate", nullable = false)
    private Date trackingdate;


    @Column(name = "status", nullable = false)
    private String status;


    @Column(name = "statuschangedate", nullable = false)
    private Date statuschangedate;


    @Column(name = "statuschangereason", nullable = false)
    private String statuschangereason;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "estimateddeliverydate", nullable = false)
    private Date estimateddeliverydate;

    @Column(name = "createdate", nullable = false)
    private Date createdate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTrackingcode() {
        return trackingcode;
    }

    public void setTrackingcode(String trackingcode) {
        this.trackingcode = trackingcode;
    }

    public String getCarriertrackingurl() {
        return carriertrackingurl;
    }

    public void setCarriertrackingurl(String carriertrackingurl) {
        this.carriertrackingurl = carriertrackingurl;
    }

    public Date getTrackingdate() {
        return trackingdate;
    }

    public void setTrackingdate(Date trackingdate) {
        this.trackingdate = trackingdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatuschangedate() {
        return statuschangedate;
    }

    public void setStatuschangedate(Date statuschangedate) {
        this.statuschangedate = statuschangedate;
    }

    public String getStatuschangereason() {
        return statuschangereason;
    }

    public void setStatuschangereason(String statuschangereason) {
        this.statuschangereason = statuschangereason;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getEstimateddeliverydate() {
        return estimateddeliverydate;
    }

    public void setEstimateddeliverydate(Date estimateddeliverydate) {
        this.estimateddeliverydate = estimateddeliverydate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipment shipment = (Shipment) o;
        return Objects.equals(id, shipment.id) && Objects.equals(href, shipment.href) && Objects.equals(carrier, shipment.carrier) && Objects.equals(trackingcode, shipment.trackingcode) && Objects.equals(carriertrackingurl, shipment.carriertrackingurl) && Objects.equals(trackingdate, shipment.trackingdate) && Objects.equals(status, shipment.status) && Objects.equals(statuschangedate, shipment.statuschangedate) && Objects.equals(statuschangereason, shipment.statuschangereason) && Objects.equals(weight, shipment.weight) && Objects.equals(estimateddeliverydate, shipment.estimateddeliverydate) && Objects.equals(createdate, shipment.createdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, carrier, trackingcode, carriertrackingurl, trackingdate, status, statuschangedate, statuschangereason, weight, estimateddeliverydate, createdate);
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}