package com.talentos_banco.talentos_proz.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorException {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

}


