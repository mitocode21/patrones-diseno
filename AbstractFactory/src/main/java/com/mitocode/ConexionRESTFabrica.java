package com.mitocode;

import com.mitocode.inter.FabricaAbstracta;
import com.mitocode.inter.IConexionBD;
import com.mitocode.inter.IConexionREST;
import com.mitocode.inter.impl.ConexionRESTCompras;
import com.mitocode.inter.impl.ConexionRESTNoArea;
import com.mitocode.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
