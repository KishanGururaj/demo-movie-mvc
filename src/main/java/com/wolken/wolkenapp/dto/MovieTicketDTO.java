package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
public class MovieTicketDTO {
	
	private String movieName;
	private String timings;
	private int  noOfTickets;
	

}
