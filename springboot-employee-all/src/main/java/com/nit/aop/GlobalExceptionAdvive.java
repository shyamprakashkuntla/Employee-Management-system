package com.nit.aop;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionAdvive {
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception ex, Model model) {
		model.addAttribute("erroMessage", ex.getMessage());
		return "error";
	}
}
