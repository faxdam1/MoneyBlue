package com.moneyblue.dominio.modelo;

import java.util.Date;

public class Cliente {

	public Cliente() {

	}

	public Cliente(int numID, String strNombre, String strApellidos,
			String strIdentificacion, int idTipodeIdentificacion,
			String strGenero, int idPais, int idDepartamento, int idCiudad,
			String strEmail, String strTelefono, String strCelular,
			String strUsuario, String strPassword, boolean logEmailValido,
			boolean logAceptaLeyProteccionDatos, boolean logHabilitado,
			String strRutaImagen, int numIngresosErrados,
			String strUsuarioCreacion, Date dtmFechaCreacion,
			Date dtmFechaNacimiento) {

		this.numID = numID;
		this.strNombre = strNombre;
		this.strApellidos = strApellidos;
		this.strIdentificacion = strIdentificacion;
		this.idTipodeIdentificacion = idTipodeIdentificacion;
		this.strGenero = strGenero;
		this.idPais = idPais;
		this.idDepartamento = idDepartamento;
		this.idCiudad = idCiudad;
		this.strEmail = strEmail;
		this.strTelefono = strTelefono;
		this.strCelular = strCelular;
		this.strUsuario = strUsuario;
		this.strPassword = strPassword;
		this.logEmailValido = logEmailValido;
		this.logAceptaLeyProteccionDatos = logAceptaLeyProteccionDatos;
		this.logHabilitado = logHabilitado;
		this.strRutaImagen = strRutaImagen;
		this.numIngresosErrados = numIngresosErrados;
		this.strUsuarioCreacion = strUsuarioCreacion;
		this.dtmFechaCreacion = dtmFechaCreacion;
		this.dtmFechaNacimiento = dtmFechaNacimiento;

	}

	private int numID;
	private String strNombre;
	private String strApellidos;
	private String strIdentificacion;
	private int idTipodeIdentificacion = 1;
	private String strGenero;
	private int idPais = 1;
	private int idDepartamento = 1;
	private int idCiudad = 1;
	private String strEmail;
	private String strTelefono;
	private String strCelular;
	private String strUsuario;
	private String strPassword;
	private boolean logEmailValido;
	private boolean logAceptaLeyProteccionDatos;
	private boolean logHabilitado;
	private String strRutaImagen;
	private int numIngresosErrados;
	private String strUsuarioCreacion;
	private Date dtmFechaCreacion;
	private Date dtmFechaNacimiento;

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

	public String getStrApellidos() {
		return strApellidos;
	}

	public void setStrApellidos(String strApellidos) {
		this.strApellidos = strApellidos;
	}

	public String getStrIdentificacion() {
		return strIdentificacion;
	}

	public void setStrIdentificacion(String strIdentificacion) {
		this.strIdentificacion = strIdentificacion;
	}

	public int getIdTipodeIdentificacion() {
		return idTipodeIdentificacion;
	}

	public void setIdTipodeIdentificacion(int idTipodeIdentificacion) {
		this.idTipodeIdentificacion = idTipodeIdentificacion;
	}

	public String getStrGenero() {
		return strGenero;
	}

	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrCelular() {
		return strCelular;
	}

	public void setStrCelular(String strCelular) {
		this.strCelular = strCelular;
	}

	public String getStrUsuario() {
		return strUsuario;
	}

	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public boolean isLogEmailValido() {
		return logEmailValido;
	}

	public void setLogEmailValido(boolean logEmailValido) {
		this.logEmailValido = logEmailValido;
	}

	public boolean isLogAceptaLeyProteccionDatos() {
		return logAceptaLeyProteccionDatos;
	}

	public void setLogAceptaLeyProteccionDatos(
			boolean logAceptaLeyProteccionDatos) {
		this.logAceptaLeyProteccionDatos = logAceptaLeyProteccionDatos;
	}

	public boolean isLogHabilitado() {
		return logHabilitado;
	}

	public void setLogHabilitado(boolean logHabilitado) {
		this.logHabilitado = logHabilitado;
	}

	public String getStrRutaImagen() {
		return strRutaImagen;
	}

	public void setStrRutaImagen(String strRutaImagen) {
		this.strRutaImagen = strRutaImagen;
	}

	public int getNumIngresosErrados() {
		return numIngresosErrados;
	}

	public void setNumIngresosErrados(int numIngresosErrados) {
		this.numIngresosErrados = numIngresosErrados;
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

	public Date getDtmFechaNacimiento() {
		return dtmFechaNacimiento;
	}

	public void setDtmFechaNacimiento(Date dtmFechaNacimiento) {
		this.dtmFechaNacimiento = dtmFechaNacimiento;
	}

}
