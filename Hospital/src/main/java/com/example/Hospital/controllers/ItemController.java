package com.example.Hospital.controllers;

import com.example.Hospital.Service.ItemService;
import com.example.Hospital.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public Map<String,Object> getItems(@RequestParam int pageNo){
        List<Item> items = itemService.getItemsByPage(pageNo);
        int total = itemService.getItemCount();
        int totalPages = (int) Math.ceil((double) total/(double) 10);

        Map<String,Object> map = new HashMap<>();
        map.put("items",items);
        map.put("totalPages", totalPages);
        map.put("totalItems",total);
        map.put("currentPage",pageNo);

        return map;
    }
}
