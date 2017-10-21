package com.prism.test;

import com.google.gson.Gson;
import com.prism.test.repository.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class Application {

    @Autowired PersonDao personDao;

    Gson gson = new Gson();

    @GetMapping("/sql")
    public @ResponseBody String getUser(@RequestParam String name) {
        //return gson.toJson(personDao.findAll());
        return gson.toJson(personDao.findByName(name));
    }



    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
