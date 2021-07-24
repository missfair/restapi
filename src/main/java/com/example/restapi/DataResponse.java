package com.example.restapi;

public class DataResponse {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public  DataResponse(){}
    public DataResponse(String id) {
        this.id = id;
    }
}