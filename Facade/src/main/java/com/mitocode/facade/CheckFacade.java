package com.mitocode.facade;

import com.mitocode.api.AvionAPI;
import com.mitocode.api.HotelAPI;

public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;	
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}		
}
