package com.drill.config;

import org.springframework.web.servlet.HandlerInterceptor;

import com.drill.domain.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		User sid = (User) session.getAttribute("sid");
		if (sid == null) {
			response.sendRedirect("/login");
		}
		return true;
	}
}
