package com.moneyblue.dominio.modelo;

import java.util.Date;

//Clase Ciudad
public class Ciudad {
	public Ciudad() {
	}

	public Ciudad(int numID, Pais pais, Departamento departamento,
			String strNombre, String strDescripcion, String strCodigoDane,
			String strUsuarioCreacion, Date dtmFechaCreacion) {
		this.numID = numID;
		this.pais = pais;
		this.departamento = departamento;
		this.strNombre = strNombre;
		this.strDescripcion = strDescripcion;
		this.strCodigoDane = strCodigoDane;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
	}

	private int numID;
	public Pais pais=new Pais();
	public Departamento departamento=new Departamento();
	private String strNombre;
	private String strDescripcion;
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
