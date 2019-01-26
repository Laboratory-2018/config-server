package com.example.config.server.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
public class ConfigController
{
    @RequestMapping("/greeting")
    public String add(@RequestParam(value = "key") @NotNull String key,
                      @RequestParam(value = "value") @NotNull String value,
                      @RequestParam(value = "application") @NotNull String application,
                      @RequestParam(value = "profile", defaultValue="pro") String profile,
                      @RequestParam(value = "lable") String lable)
    {
        return null;
    }
}