package com.cakefactory.controller;

import com.cakefactory.model.Item;
import com.cakefactory.service.InMemoryCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    InMemoryCatalog catalog;
    @GetMapping("/")
    ModelAndView index(Map<String, Object> model) {
        List<Item> itemsList = catalog.getItemsList();
        model.put("items", itemsList);
        return new ModelAndView("index", model);
    }
}