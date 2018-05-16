package com.ipartek.formacion.nidea.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UASI.WS_GRAL_wsdl.ClaseAlojamiento;
import UASI.WS_GRAL_wsdl.ClaseDiasFestivos;
import UASI.WS_GRAL_wsdl.ClaseNoticias;
import UASI.WS_GRAL_wsdl.Pub_gralSoapProxy;

/**
 * Servlet implementation class HomeController
 */
@WebServlet( "/alojamientos" )
public class AlojamientosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//cliente para ws UA
		Pub_gralSoapProxy proxy = new Pub_gralSoapProxy();
		
		//conseguir noticias
		ClaseAlojamiento[] alojam = proxy.wsalojamientos();
		
		/*ArrayList<String> noticias2 = new ArrayList<>();
		noticias2.add("UA gana en Ruby");
		noticias2.add("UA 500");
		noticias2.add("UA gana en Futbol");*/
		
		//pasar como atributo en request noticias
		
		request.setAttribute("alojam", alojam );
		
		request.getRequestDispatcher("alojamiento.jsp").forward(request, response);		
	}

}
