package com.jesjobom.service;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Classe para ser instanciada pelo XML criando um bean para injeção.
 * Os atributos são setados no XML com valores obtidos pelo 
 * {@link PropertyPlaceholderConfigurer} também instanciado no XML e pelo
 * PropertyPlaceholder default do Spring.
 *
 * @author jesjobom
 */
public class CustomService {

	private String customEnvName;
	
	private String customConfigFile;
	
	private Integer prop1;
	
	private Boolean prop2;
	
	private String prop3;

	public String getCustomEnvName() {
		return customEnvName;
	}

	public void setCustomEnvName(String customEnvName) {
		this.customEnvName = customEnvName;
	}

	public String getCustomConfigFile() {
		return customConfigFile;
	}

	public void setCustomConfigFile(String customConfigFile) {
		this.customConfigFile = customConfigFile;
	}

	public Integer getProp1() {
		return prop1;
	}

	public void setProp1(Integer prop1) {
		this.prop1 = prop1;
	}

	public Boolean getProp2() {
		return prop2;
	}

	public void setProp2(Boolean prop2) {
		this.prop2 = prop2;
	}

	public String getProp3() {
		return prop3;
	}

	public void setProp3(String prop3) {
		this.prop3 = prop3;
	}
}
