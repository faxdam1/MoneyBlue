package com.moneyblue.dominio.modelo;

import java.util.Date;

//Tipo de un producto

public class TipoProducto {

	public TipoProducto() {
	}

	public TipoProducto(String strNombre, int numID, String strDescripcion,
			String strUsuarioCreacion, Date dtmFechaCreacion) {
		this.strNombre = strNombre;
		this.numID = numID;
		this.strDescripcion = strDescripcion;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
	}

	private String strNombre;
	private int numID;
	private String strDescripcion;
	private String strUsuarioCreacion;
	private Date dtmFechaCreacion;

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrUsuarioCreacion() {
		return strUsuarioCreacion;
	}

	public void setStrUsuarioCreacion(String strUsuarioCreacion) {
		this.strUsuarioCreacion = strUsuarioCreacion;
	}

	public Date getDtmFechaCreacion() {
		return dtmFechaCreacion;
	}

	public void setDtmFechaCreacion(Date dtmFechaCreacion) {
		this.dtmFechaCreacion = dtmFechaCreacion;
	}
}
