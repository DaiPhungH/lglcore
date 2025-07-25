package com.language.service.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.language.service.common.Constants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessResponse {
    private String code;
    private String message;

    public SuccessResponse() {
    }

    public SuccessResponse(String message) {
        this.code = Constants.SUCCESS;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
