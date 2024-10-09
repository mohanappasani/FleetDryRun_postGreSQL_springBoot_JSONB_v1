package com.example.task.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task.entity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, Long> {
}