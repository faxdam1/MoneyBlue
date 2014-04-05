package com.moneyblue.infraestructura.persistencia.impl;

import com.moneyblue.dominio.modelo.Cliente;
import com.moneyblue.infraestructura.persistencia.IClienteRepository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;


public class ClienteRepository implements Serializable,IClienteRepository {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	
	
//	  Analizar costo en diseño y consto en desarrollo al no relacionar DTOs
//	   this.procReadActor =new SimpleJdbcCall(jdbcTemplate)
//	   .withProcedureName("consEPSAfiliadoIdentificacion")
//	   .returningResultSet("Person",BeanPropertyRowMapper.newInstance(Person.class))
//	   .withSchemaName("dbo");
   	
	
	
//	   this.procReadActor =new SimpleJdbcCall(jdbcTemplate)
//	   .withProcedureName("consEPSAfiliadoIdentificacion")
//	   .returningResultSet("Person", new RowMapper<Person>() {
//        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Person person = new Person();
//            person.setStrEPS(rs.getString("strEPS"));
//            person.setStrIdentificacion(rs.getString("strIdentificacion"));
//            return person;
//        }})
//	   .withSchemaName("dbo");
	
//	   Map<String,Object> m=procReadActor.execute(in);
//	   
//	   
//	 List<Person> listaPerson= (List<Person>)m.get("Person");
	
	
	public Cliente agregarCliente(Cliente cliente) {
		
		try {
			
			SqlParameterSource in = new MapSqlParameterSource()
					.addValue("strNombre", cliente.getStrNombre())
					.addValue("strApellidos", cliente.getStrApellidos())
					.addValue("strIdentificacion",cliente.getStrIdentificacion())
					.addValue("idTipodeIdentificacion",	cliente.getIdTipodeIdentificacion())
					.addValue("strGenero", cliente.getStrGenero())
					.addValue("idPais", cliente.getIdPais())
					.addValue("idDepartamento", cliente.getIdDepartamento())
					.addValue("idCiudad", cliente.getIdCiudad())
					.addValue("strEmail", cliente.getStrEmail())
					.addValue("strTelefono", cliente.getStrTelefono())
					.addValue("strCelular", cliente.getStrCelular())
					.addValue("strRutaImagen", cliente.getStrRutaImagen())
					.addValue("strUsuario", cliente.getStrUsuario())
					.addValue("strPassword", cliente.getStrPassword())
					.addValue("dtmFechaNacimiento",	new java.sql.Date(cliente.getDtmFechaNacimiento().getTime()))
					.addValue("strUsuarioCreacion", "darango")
					.addValue("numID", 0)
					.addValue("logRetorno", 0);
					
			this.simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withProcedureName("ma_spAgregarCliente")
			.withSchemaName("dbo");
			
			Map<String,Object> m = simpleJdbcCall.execute(in);
			
			cliente.setNumID(((BigDecimal)m.get("numID")).intValue());
			
			return cliente;

		} catch (Exception ex) {
			throw ex;
		}
	}

}
