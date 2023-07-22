package com.atorres.nttdata.clientms.utils;

import org.springframework.stereotype.Component;

@Component
public class EnumConverter {
	public ClientType toClientType(CreateClientType enum1Value) {
		return ClientType.valueOf(enum1Value.name());
	}
}
