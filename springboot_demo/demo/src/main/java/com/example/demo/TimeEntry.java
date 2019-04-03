package com.example.demo;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class TimeEntry {
	
	@Id
	private BigInteger id;
	
	@NonNull
	private LocalDateTime start;
	
	private LocalDateTime stop;
	
	private String description;
	
}
