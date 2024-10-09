package com.example.task.entity;

import com.example.task.dto.Address;
import com.example.task.service.AddressAttributeConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_table")
@Data // This is from Lombok to generate getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class DataEntity {

	@Id
    @Column(name = "student_id", length = 8)
    private String id;

    @Column(name = "admit_year", length = 4)
    private String admitYear;

    @Convert(converter = AddressAttributeConverter.class)
    @Column(name = "address", length = 500)
    private Address address;
}

