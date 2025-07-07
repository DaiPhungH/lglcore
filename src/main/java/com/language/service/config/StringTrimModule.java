package com.language.service.config;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class StringTrimModule extends SimpleModule {

    public StringTrimModule() {
        // Đăng ký Custom Deserializer cho kiểu String
        addDeserializer(String.class, new StringTrimDeserializer());
    }
}