package com.example.task.service;


import org.springframework.stereotype.Service;

import com.example.task.dao.DataRepository;
import com.example.task.entity.DataEntity;

import java.util.List;

@Service
public class DataService {

    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public DataEntity saveData(DataEntity data) {
        return dataRepository.save(data);
    }

    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }
}
