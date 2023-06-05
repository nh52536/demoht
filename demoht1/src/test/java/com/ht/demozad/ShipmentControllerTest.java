package com.ht.demozad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.ht.demozad.shipment.ShipmentController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



public class ShipmentControllerTest extends com.ht.demozad.Test {

    @Before
    public void setUp() {
        super.setUp();
    }
    @Test
    public void getShipmentByStatus() throws Exception {
        String uri = "/getAllShipmentsByStatus/status";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

    }


    @Test
    public void getAllShipments() throws Exception {
        String uri = "/getAll";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

    }

    @Test
    public void getShipmentByDates() throws Exception {
        String uri = "/getAllShipmentsByDate/2023-06-05/2019-06-05";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

    }

    @Test
    public void addShipment() throws  Exception {
        String uri = "http://localhost:5432/addSHipment";

        String jsonPayload = "{\n"
                + "    \"id\":\"string\",\n"
                + "    \"href\":\"string\",\n"
                + "    \"carrier\":\"string\",\n"
                + "    \"trackingcode\":\"string\",\n"
                + "    \"carriertrackingurl\":\"string\",\n"
                + "    \"trackingdate\":\"2023-06-05T10:59:47.197Z\",\n"
                + "    \"status\":\"initialized\",\n"
                + "    \"statuschangedate\":\"2023-06-05T10:59:47.197Z\",\n"
                + "    \"statuschangereason\":\"string\",\n"
                + "    \"weight\":0,\n"
                + "    \"estimateddeliverydate\":\"2023-06-05T10:59:47.197Z\",\n"
                + "    \"createdate\":\"2023-06-05T10:59:47.197Z\"\n"
                + "}";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).content(jsonPayload)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }


    @Test
    public void getShipmentById() throws Exception {
        String uri = "http://localhost:5432/getShipmentById/1";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

    }

}