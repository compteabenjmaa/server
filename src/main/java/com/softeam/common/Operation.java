package com.softeam.common;

/**
 * classe enumration of Operation
 * 
 * @author abenjmaa
 * @dateCreate 17/10/2018
 */
public enum Operation {

	DEPOSIT("D"), WITHDRAWAL("R");

	private String operation = "";

	Operation(String operation) {
		this.operation = operation;
	}

	public String getOperation() {
		return this.operation;
	}

}