package com.laptrinhjavaweb.controller.admin;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;	
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
@WebServlet (urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = 7045239165028028305L;

	protected void doGet(HttpServletRequest request, HttpServletResponse respond)throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse respond)throws ServletException, IOException {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
