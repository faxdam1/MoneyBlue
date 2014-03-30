package com.moneyblue.dominio.modelo;

import java.util.Date;

//Clase TipoIdentificacion
public class TipoIdentificacion {
	public TipoIdentificacion() {
	}

	public TipoIdentificacion(int numID, String strNombre,
			String strDescripcion, String strCodigo, String strUsuarioCreacion,
			Date dtmFechaCreacion) {
		this.numID = numID;
		this.strNombre = strNombre;
		this.strDescripcion = strDescripcion;
		this.strCodigo = strCodigo;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
	}

	private int numID;
	private String strNombre;
	private String strDescripcion;
	private String strCodigo;
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

	public String getStrCodigo() {
		return strCodigo;
	}

	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
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
