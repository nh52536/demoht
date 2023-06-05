package com.ht.demozad.shipment;

import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;


public class RequestBodyShipment {
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

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    private String id;
    private String href;
    private String carrier;
    private String trackingcode;
    private String carriertrackingurl;
    private Date trackingdate;
    private String status;
    private Date statuschangedate;
    private String statuschangereason;
    private Integer weight;
    private Date estimateddeliverydate;
    private Date createdate;
}
