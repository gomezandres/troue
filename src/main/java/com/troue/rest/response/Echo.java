package com.troue.rest.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = false, includeFieldNames = true)
public class Echo {

	@Getter
	@Setter
	private String mensaje;

	public Echo(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

}
