package com.example.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.task.entity.DataEntity;
import com.example.task.service.DataService;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping
    public ResponseEntity<DataEntity> createData(@RequestBody DataEntity dataEntity) {
    	System.out.println("it is inside");
        return new ResponseEntity<>(dataService.saveData(dataEntity), HttpStatus.CREATED);
    }

    @GetMapping
    public List<DataEntity> getAllData() {
        return dataService.getAllData();
    }
}
