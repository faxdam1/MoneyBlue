package com.moneyblue.dominio.modelo;

import java.util.Date;

//Clase Producto
public class Producto {

	public Producto() {
	}

	public Producto(int numID, Empresa empresa, String strCodigoProducto,
			String strNombre, String strDescripcion, String strTags,
			Categoria categoria, Segmento segmento, TipoProducto tipoProducto,
			String strUsuarioCreacion, Date dtmFechaCreacion) {
		this.numID = numID;
		this.empresa = empresa;
		this.strCodigoProducto = strCodigoProducto;
		this.strNombre = strNombre;
		this.strDescripcion = strDescripcion;
		this.strTags = strTags;
		this.categoria = categoria;
		this.segmento = segmento;
		this.tipoProducto = tipoProducto;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
	}

	private int numID;

	private String strCodigoProducto;
	private String strNombre;
	private String strDescripcion;
	private String strTags;
	private String strUsuarioCreacion;
	private Date dtmFechaCreacion;
	public Empresa empresa=new  Empresa();
	public Categoria categoria=new Categoria();
	public Segmento segmento=new Segmento();
	public TipoProducto tipoProducto=new TipoProducto();

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public String getStrCodigoProducto() {
		return strCodigoProducto;
	}

	public void setStrCodigoProducto(String strCodigoProducto) {
		this.strCodigoProducto = strCodigoProducto;
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

	public String getStrTags() {
		return strTags;
	}

	public void setStrTags(String strTags) {
		this.strTags = strTags;
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
