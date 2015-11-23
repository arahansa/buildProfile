package com.example.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDate implements Converter<String, LocalDateTime>{

	
	
	@Override
	public LocalDateTime convert(String source) {
		String str = "150420";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

		return null;
	}
	

}
