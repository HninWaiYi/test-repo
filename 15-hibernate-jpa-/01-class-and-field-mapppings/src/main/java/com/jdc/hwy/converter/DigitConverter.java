package com.jdc.hwy.converter;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class DigitConverter implements AttributeConverter<Integer, String> {

	@Override
	public String convertToDatabaseColumn(Integer num) {
		Random random = new Random();
		return IntStream.range(0, num)
				.mapToObj(i -> String.format("%02d", random.nextInt(100)))
				.collect(Collectors.joining("-"));
		
		

	}

	@Override
	public Integer convertToEntityAttribute(String str) {
		String[] array = str.split("-");	
		return array.length;
	}

}
