package org.learn.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("/httpRequestHandler")
public class HttpRequestController implements HttpRequestHandler {
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this.getClass().getName() + " working");
		request.setAttribute("source", "HttpRequestController");
		request.getRequestDispatcher("/WEB-INF/jsp/a.jsp").forward(request, response);
	}
}
