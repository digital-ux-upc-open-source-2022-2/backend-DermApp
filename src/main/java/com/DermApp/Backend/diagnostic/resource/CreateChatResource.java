package com.DermApp.Backend.diagnostic.resource;

import javax.validation.constraints.Size;

public class CreateChatResource {
    @Size(max = 400)
    private String message;
}
