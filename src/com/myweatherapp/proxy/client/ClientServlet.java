package com.myweatherapp.proxy.client;


import java.io.IOException;
import java.io.PrintWriter;

import javax.crypto.Cipher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweatherapp.proxy.client.proxy.GlobalWeather;
public class ClientServlet extends HttpServlet{
	private static final long serialVersionUID = 3576788396948817684L;
	
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet started...");
		String country= req.getParameter("countryname");
		String city=req.getParameter("cityname");
		System.out.println(country+city);
		resp.setContentType("text/html");
		PrintWriter out =null;
		out=resp.getWriter();
		String cityweather = callWebservice(country, city);
		printWebservice(out, cityweather);
		
	}

		private void printWebservice(PrintWriter out, String cityweather) {
			if(cityweather==null){
				out.print("Data not found");
			}
			out.println(cityweather);
			//out.println(cityweather);
			System.out.println(cityweather);
			
		}

		private String callWebservice(String country, String city) {
			GlobalWeather weather = new GlobalWeather();
			String citiesbycountries=weather.getGlobalWeatherSoap12().getCitiesByCountry(country);
			String cityweather=weather.getGlobalWeatherSoap12().getWeather(city, country);
			return cityweather;
		}

}
