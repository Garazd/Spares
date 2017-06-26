package com.spares.controller;

import com.spares.Ajax;
import com.spares.entity.Car;
import com.spares.exceptions.RestException;
import com.spares.service.CarService;
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
public class CarController extends ExceptionHandlerController {

    private static final Logger logger = Logger.getLogger(CarController.class);

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> createCar(@RequestParam("car") Car car) throws RestException {
        try {
            if (car == null || car.equals("")) {
                return Ajax.emptyResponse();
            }
            carService.create(car);
            return Ajax.emptyResponse();
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getCars() throws RestException {
        try {
            List<Car> result = carService.getAll();
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }
}
