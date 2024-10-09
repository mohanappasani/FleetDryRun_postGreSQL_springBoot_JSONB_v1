package com.example.task.service;

import com.example.task.dto.Address;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class AddressAttributeConverter implements AttributeConverter<Address, String> {
	private static final ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(Address address) {
		try {
			return objectMapper.writeValueAsString(address);
		} catch (JsonProcessingException jpe) {
			System.out.println("Cannot convert Address into JSON");
			return null;
		}
	}

	@Override
	public Address convertToEntityAttribute(String value) {
		try {
			return objectMapper.readValue(value, Address.class);
		} catch (JsonProcessingException e) {
			System.out.println("Cannot convert JSON into Address");
			return null;
		}
	}
}