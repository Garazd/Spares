package com.spares.controller;

import com.spares.Ajax;
import com.spares.entity.Spare;
import com.spares.exceptions.RestException;
import com.spares.service.SpareService;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpareController {

    private static final Logger logger = Logger.getLogger(SpareController.class);

    @Autowired
    private SpareService spareService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> createSpare(@RequestParam("spare") Spare spare) throws RestException {
        try {
            if (spare == null || spare.equals("")) {
                return Ajax.emptyResponse();
            }
            spareService.create(spare);
            return Ajax.emptyResponse();
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/spares", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getSpares() throws RestException {
        try {
            List<Spare> result = spareService.getAll();
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }
}
