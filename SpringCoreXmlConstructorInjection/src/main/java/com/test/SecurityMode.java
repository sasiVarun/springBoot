package com.test;

public class SecurityMode {
	
	private String mode;
	private int roleId;
	private String access;
	
	public SecurityMode(String mode,int roleId,String access) {
		super();
		this.mode = mode;
		this.roleId = roleId;
		this.access = access;
	}

	@Override
	public String toString() {
		return "SecurityMode [mode=" + mode + ", roleId=" + roleId + ", access=" + access + "]";
	}
}
