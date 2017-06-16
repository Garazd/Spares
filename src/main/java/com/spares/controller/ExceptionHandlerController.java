package com.spares.controller;

import com.spares.exceptions.RestException;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionHandlerController {

    private static final Logger LOG = Logger.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(RestException.class)
    public @ResponseBody String handleException(RestException e) {
        LOG.error("Exception: " + e.getMessage(), e);
        return "Exception: " + e.getMessage();
    }
}
