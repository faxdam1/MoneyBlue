package com.moneyblue.aplicacion;

import com.moneyblue.infraestructura.persistencia.IClienteRepository;
import com.moneyblue.dominio.modelo.Cliente;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.validator.ValidatorException;
import org.springframework.stereotype.Controller;


@Controller("ClienteBean") 
@ManagedBean(name = "ClienteBean")
@ViewScoped
public class ClienteBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	//Fields
    private Cliente cliente = new Cliente();
    private IClienteRepository repClienteRepository;


	//Constructors
    public ClienteBean() {
    }
    
    
    public ClienteBean(Cliente cliente) {
        this.cliente = cliente;
    }

    //Methods
    public void agregarCliente(ActionEvent actionEvent) {
        try {
            cliente = repClienteRepository.agregarCliente(cliente);
            if (cliente.getNumID() != 0) {
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro existoso", "Registro existoso"));
            } else {
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Existe una inconsitencia al registrar", "Existe una inconsitencia al registrar"));
            }
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error técnico en el registro del cliente"+ex.getMessage(), "Error técnico en el registro del cliente"));
        }
    }

    //Validators
    public void validarEmail(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {

        String mail2 = (String) arg2;
        if (!mail2.equals(getStrEmail())) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Introduce el mismo correo que has usado antes.", "Introduce el mismo correo que has usado antes."));
        }
    }

    //Public interfaces
    public int getNumID() {
        return cliente.getNumID();
    }

    public void setNumID(int numID) {
        cliente.setNumID(numID);
    }

    public String getStrNombre() {
        return cliente.getStrNombre();
    }

    public void setStrNombre(String strNombre) {
        cliente.setStrNombre(strNombre);
    }

    public String getStrApellidos() {
        return cliente.getStrApellidos();
    }

    public void setStrApellidos(String strApellidos) {
        cliente.setStrApellidos(strApellidos);
    }

    public String getStrIdentificacion() {
        return cliente.getStrIdentificacion();
    }

    public void setStrIdentificacion(String strIdentificacion) {
        cliente.setStrIdentificacion(strIdentificacion);
    }

    public int getIdTipodeIdentificacion() {
        return cliente.getIdTipodeIdentificacion();
    }

    public void setIdTipodeIdentificacion(int idTipodeIdentificacion) {
        cliente.setIdTipodeIdentificacion(idTipodeIdentificacion);
    }

    public String getStrGenero() {
        return cliente.getStrGenero();
    }

    public void setStrGenero(String strGenero) {
        cliente.setStrGenero(strGenero);
    }

    public int getIdPais() {
        return cliente.getIdPais();
    }

    public void setIdPais(int idPais) {
        cliente.setIdPais(idPais);
    }

    public int getIdDepartamento() {
        return cliente.getIdDepartamento();
    }

    public void setIdDepartamento(int idDepartamento) {
        cliente.setIdDepartamento(idDepartamento);
    }

    public int getIdCiudad() {
        return cliente.getIdCiudad();
    }

    public void setIdCiudad(int idCiudad) {
        cliente.setIdCiudad(idCiudad);
    }

    public String getStrEmail() {
        return cliente.getStrEmail();
    }

    public void setStrEmail(String strEmail) {
        cliente.setStrEmail(strEmail);
    }

    public String getStrTelefono() {
        return cliente.getStrTelefono();
    }

    public void setStrTelefono(String strTelefono) {
        cliente.setStrTelefono(strTelefono);
    }

    public String getStrCelular() {
        return cliente.getStrCelular();
    }

    public void setStrCelular(String strCelular) {
        cliente.setStrCelular(strCelular);
    }

    public String getStrUsuario() {
        return cliente.getStrUsuario();
    }

    public void setStrUsuario(String strUsuario) {
        cliente.setStrUsuario(strUsuario);
    }

    public String getStrPassword() {
        return cliente.getStrPassword();
    }

    public void setStrPassword(String strPassword) {
        cliente.setStrPassword(strPassword);
    }

    public boolean isLogEmailValido() {
        return cliente.isLogEmailValido();
    }

    public void setLogEmailValido(boolean logEmailValido) {
        cliente.setLogEmailValido(logEmailValido);
    }

    public boolean isLogAceptaLeyProteccionDatos() {
        return cliente.isLogAceptaLeyProteccionDatos();
    }

    public void setLogAceptaLeyProteccionDatos(boolean logAceptaLeyProteccionDatos) {
        cliente.setLogAceptaLeyProteccionDatos(logAceptaLeyProteccionDatos);
    }

    public boolean isLogHabilitado() {
        return cliente.isLogHabilitado();
    }

    public void setLogHabilitado(boolean logHabilitado) {
        cliente.setLogHabilitado(logHabilitado);
    }

    public String getStrRutaImagen() {
        return cliente.getStrRutaImagen();
    }

    public void setStrRutaImagen(String strRutaImagen) {
        cliente.setStrRutaImagen(strRutaImagen);
    }

    public int getNumIngresosErrados() {
        return cliente.getNumIngresosErrados();
    }

    public void setNumIngresosErrados(int numIngresosErrados) {
        cliente.setNumIngresosErrados(numIngresosErrados);
    }

    public String getStrUsuarioCreacion() {
        return cliente.getStrUsuarioCreacion();
    }

    public void setStrUsuarioCreacion(String strUsuarioCreacion) {
        cliente.setStrUsuarioCreacion(strUsuarioCreacion);
    }

    public Date getDtmFechaCreacion() {
        return cliente.getDtmFechaCreacion();
    }

    public void setDtmFechaCreacion(Date dtmFechaCreacion) {
        cliente.setDtmFechaCreacion(dtmFechaCreacion);
    }

    public Date getDtmFechaNacimiento() {
        return cliente.getDtmFechaNacimiento();
    }

    public void setDtmFechaNacimiento(Date dtmFechaNacimiento) {
        cliente.setDtmFechaNacimiento(dtmFechaNacimiento);
    }
    
    public void setRepClienteRepository(IClienteRepository repClienteRepository) {
		this.repClienteRepository = repClienteRepository;
	}

}
