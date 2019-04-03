package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimeEntriesRepository  extends MongoRepository<TimeEntry, Long>{
	
}
