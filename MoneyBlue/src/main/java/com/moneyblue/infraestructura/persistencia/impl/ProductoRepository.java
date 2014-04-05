package com.moneyblue.infraestructura.persistencia.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.moneyblue.dominio.modelo.Producto;

public class ProductoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	public Producto agregarProducto(Producto producto) {
		
		try {
			
			SqlParameterSource in = new MapSqlParameterSource()			
					.addValue("idEmpresa", producto.empresa.getNumID())
					.addValue("strCodigoProducto",producto.getStrCodigoProducto())
					.addValue("strNombre",producto.getStrNombre())
					.addValue("strDescripcion",producto.getStrDescripcion())
					.addValue("strTags", producto.getStrTags())
					.addValue("idCategoria",producto.categoria.getNumID())
					.addValue("idSegmento", producto.segmento.getNumID())
					.addValue("idTipodeProducto", producto.tipoProducto.getNumID())
					.addValue("strUsuarioCreacion", "darango")
					.addValue("logRetorno", 0)
					.addValue("numID", 0);
			this.simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withProcedureName("ma_spAgregarProducto")
			.withSchemaName("dbo");
			
			Map<String,Object> m = simpleJdbcCall.execute(in);
			
			producto.setNumID(((BigDecimal)m.get("numID")).intValue());
			
			return producto;

		} catch (Exception ex) {
			throw ex;
		}
	}

}
