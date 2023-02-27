package com.xworkz.gymm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.gymm.dto.GymmDto;
import com.xworkz.gymm.service.GymmService;
import com.xworkz.gymm.service.GymmServiceImpl;

@WebServlet(value = "/save")
public class GymmServlet1 extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		
		GymmService service = new GymmServiceImpl();
		
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String address = request.getParameter("price");
		

		
		GymmDto gymmDto = new GymmDto(name, location, address);
		
		boolean status = service.save(gymmDto);
		
		if(status) {

			request.getRequestDispatcher("read.jsp").forward(request, response);

		}
		
		
	}


}
