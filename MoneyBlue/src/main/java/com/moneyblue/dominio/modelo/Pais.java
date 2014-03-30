package com.moneyblue.dominio.modelo;

import java.util.Date;

//Clase Pais
public class Pais {
	public Pais() {
	}

	public Pais(int numID, String strNombre, String strDescripcion,
			String strMoneda, String strCodigoDane, String strUsuarioCreacion,
			Date dtmFechaCreacion) {
		this.numID = numID;
		this.strNombre = strNombre;
		this.strDescripcion = strDescripcion;
		this.strMoneda = strMoneda;
		this.strCodigoDane = strCodigoDane;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
	}

	private int numID;
	private String strNombre;
	private String strDescripcion;
	private String strMoneda;
	private String strCodigoDane;
	private String strUsuarioCreacion;
	private Date dtmFechaCreacion;

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrMoneda() {
		return strMoneda;
	}

	public void setStrMoneda(String strMoneda) {
		this.strMoneda = strMoneda;
	}

	public String getStrCodigoDane() {
		return strCodigoDane;
	}

	public void setStrCodigoDane(String strCodigoDane) {
		this.strCodigoDane = strCodigoDane;
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
