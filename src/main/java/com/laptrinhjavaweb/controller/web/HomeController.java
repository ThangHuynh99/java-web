package com.laptrinhjavaweb.controller.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.UserModel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
@WebServlet (urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = 7045239165028028305L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setFullName("Hello World");
		request.setAttribute("model", userModel);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/Home.jsp");
		rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse respond)throws ServletException, IOException {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
