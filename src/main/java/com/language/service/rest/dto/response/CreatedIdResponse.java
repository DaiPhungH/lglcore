package com.language.service.rest.dto.response;

public class CreatedIdResponse {
    private long id;

    public CreatedIdResponse() {
    }

    public CreatedIdResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
