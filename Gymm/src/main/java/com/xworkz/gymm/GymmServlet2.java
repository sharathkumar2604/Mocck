package com.xworkz.gymm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.gymm.dto.GymmDto;
import com.xworkz.gymm.service.GymmService;
import com.xworkz.gymm.service.GymmServiceImpl;

@WebServlet(value = "/read")
public class GymmServlet2 extends HttpServlet{
	GymmService service = new GymmServiceImpl();
	public void doGet(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		
		res.setContentType("text/html");
	PrintWriter writer = res.getWriter();
	List<GymmDto> list = service.readAll();
	writer.print("<table>");
	for (GymmDto dto : list)
	{
		writer.print("<tr><td>");
		writer.print(dto.getName());
		writer.print("</td>");
		
		writer.print("<td>");
		writer.print(dto.getLocation());
		writer.print("</td>");
	
		writer.print("<td>");
		writer.print(dto.getPrice());
		writer.print("</td>");
		
		
		
		
	}
	writer.print("</table>");
	}
	
}
