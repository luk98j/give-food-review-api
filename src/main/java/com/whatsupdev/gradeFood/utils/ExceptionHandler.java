package com.whatsupdev.gradeFood.utils;

import org.springframework.http.ResponseEntity;

public class ExceptionHandler {
    public static ResponseEntity<?> handleExceptionForController(Exception exception) {
        //Todo implement own exception here
        if (exception instanceof IllegalArgumentException) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        } else {
            return ResponseEntity.internalServerError().body(exception.getMessage());
        }
    }

}
