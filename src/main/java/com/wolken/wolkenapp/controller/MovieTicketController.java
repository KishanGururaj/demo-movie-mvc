package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.aop.interceptor.ConcurrencyThrottleInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.MovieTicketDTO;
@Component
@RequestMapping("/")
public class MovieTicketController {
	@RequestMapping("/ticket.do")
	public String bookTicket(@ModelAttribute MovieTicketDTO movieTicketDTO , HttpServletRequest req) {
	String name	=movieTicketDTO.getMovieName();
	req.setAttribute("name", name);
	return "final.jsp";
	}
	

}
