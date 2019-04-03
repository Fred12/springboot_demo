package com.example.demo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class TimeEntriesController {
	
	@Autowired
	TimeEntriesRepository repository;	
	
	@GetMapping("/add_timeentry")
	ModelAndView addTimeentry() {
		TimeEntry timeEntry = new TimeEntry(LocalDateTime.now());
		repository.save(timeEntry);
		return timeentries();
	}
	
	
	@GetMapping("/timeentries")
	ModelAndView timeentries() {		
		
		//Business Logik
		ModelAndView modelAndView = new ModelAndView("timeentries");
		modelAndView.addObject("title","Zeitanträge Anwendung");
		modelAndView.addObject("timeEntries", repository.findAll());		
		
		return modelAndView;
	}
	
	
}
