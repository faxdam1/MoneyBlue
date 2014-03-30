package com.moneyblue.dominio.modelo;

import java.util.Date;

//Clase Empresa
public class Empresa {
	
	public Empresa() {
	}

	public Empresa(int numID, Cliente cliente, String strIdentificacion,
			TipoIdentificacion tipoIdentificacion, String strRut,
			String strRazonSocial, String strMarca, String strTelefono,
			String strFax, String strDireccion, String strBarrio, Pais pais,
			Departamento departamento, Ciudad ciudad, boolean logVerificada,
			String strRegimen, boolean logAutoRetenedor,
			boolean logGranContribuyente, String strObservacionesFactura,
			String strRutaLogo, boolean logHabilitada,
			String strUsuarioCreacion, Date dtmFechaCreacion) {
		this.numID = numID;
		this.cliente = cliente;
		this.strIdentificacion = strIdentificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.strRut = strRut;
		this.strRazonSocial = strRazonSocial;
		this.strMarca = strMarca;
		this.strTelefono = strTelefono;
		this.strFax = strFax;
		this.strDireccion = strDireccion;
		this.strBarrio = strBarrio;
		this.pais = pais;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.logVerificada = logVerificada;
		this.strRegimen = strRegimen;
		this.logAutoRetenedor = logAutoRetenedor;
		this.logGranContribuyente = logGranContribuyente;
		this.strObservacionesFactura = strObservacionesFactura;
		this.strRutaLogo = strRutaLogo;
		this.logHabilitada = logHabilitada;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
	}

	private int numID;
	public Cliente cliente=new Cliente();
	private String strIdentificacion;
	public TipoIdentificacion tipoIdentificacion=new TipoIdentificacion();
	private String strRut;
	private String strRazonSocial;
	private String strMarca;
	private String strTelefono;
	private String strFax;
	private String strDireccion;
	private String strBarrio;
	public Pais pais=new Pais();
	public Departamento departamento=new Departamento();
	public Ciudad ciudad=new Ciudad();
	private boolean logVerificada;
	private String strRegimen;
	private boolean logAutoRetenedor;
	private boolean logGranContribuyente;
	private String strObservacionesFactura;
	private String strRutaLogo;
	private boolean logHabilitada;
	private String strUsuarioCreacion;
	private Date dtmFechaCreacion;

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getStrIdentificacion() {
		return strIdentificacion;
	}

	public void setStrIdentificacion(String strIdentificacion) {
		this.strIdentificacion = strIdentificacion;
	}

	public String getStrRut() {
		return strRut;
	}

	public void setStrRut(String strRut) {
		this.strRut = strRut;
	}

	public String getStrRazonSocial() {
		return strRazonSocial;
	}

	public void setStrRazonSocial(String strRazonSocial) {
		this.strRazonSocial = strRazonSocial;
	}

	public String getStrMarca() {
		return strMarca;
	}

	public void setStrMarca(String strMarca) {
		this.strMarca = strMarca;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrFax() {
		return strFax;
	}

	public void setStrFax(String strFax) {
		this.strFax = strFax;
	}

	public String getStrDireccion() {
		return strDireccion;
	}

	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}

	public String getStrBarrio() {
		return strBarrio;
	}

	public void setStrBarrio(String strBarrio) {
		this.strBarrio = strBarrio;
	}

	public boolean getLogVerificada() {
		return logVerificada;
	}

	public void setLogVerificada(boolean logVerificada) {
		this.logVerificada = logVerificada;
	}

	public String getStrRegimen() {
		return strRegimen;
	}

	public void setStrRegimen(String strRegimen) {
		this.strRegimen = strRegimen;
	}

	public boolean getLogAutoRetenedor() {
		return logAutoRetenedor;
	}

	public void setLogAutoRetenedor(boolean logAutoRetenedor) {
		this.logAutoRetenedor = logAutoRetenedor;
	}

	public boolean getLogGranContribuyente() {
		return logGranContribuyente;
	}

	public void setLogGranContribuyente(boolean logGranContribuyente) {
		this.logGranContribuyente = logGranContribuyente;
	}

	public String getStrObservacionesFactura() {
		return strObservacionesFactura;
	}

	public void setStrObservacionesFactura(String strObservacionesFactura) {
		this.strObservacionesFactura = strObservacionesFactura;
	}

	public String getStrRutaLogo() {
		return strRutaLogo;
	}

	public void setStrRutaLogo(String strRutaLogo) {
		this.strRutaLogo = strRutaLogo;
	}

	public boolean getLogHabilitada() {
		return logHabilitada;
	}

	public void setLogHabilitada(boolean logHabilitada) {
		this.logHabilitada = logHabilitada;
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
