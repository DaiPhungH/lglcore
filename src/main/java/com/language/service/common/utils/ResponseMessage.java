package com.language.service.common.utils;

import lombok.Data;

@Data

public class ResponseMessage {
    private String message;

    public ResponseMessage(String message) {
        this.message = message;
    }

}
