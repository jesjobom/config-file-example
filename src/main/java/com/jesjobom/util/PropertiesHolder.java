package com.jesjobom.util;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.stereotype.Component;

/**
 * Classe usada para gerar o singleton a ser injetado pelo Spring.
 * Os atributos são injetados utilizado valores obtidos do {@link Properties}
 * que foi gerado pelo {@link PropertiesFactoryBean} instaciado no XML.
 *
 * @author jesjobom
 */
@Component
public class PropertiesHolder {
	
	//Valor injetado pelo PropertyPlaceholder padrão
	@Value("${CUSTOM_ENV:}")
	public String customEnvName;
	
	//Valor injetado pelo PropertyPlaceholder padrão
	@Value("${CUSTOM_EXTERNAL_CONFIG:}")
	public String customConfigFile;
	
	//Valor injetado pelo PropertyPlaceholder gerado no XML
	@Value("${prop1.int:}")
	public Integer prop1;
	
	//Valor injetado pelo Properties gerado no XML
	@Value("#{defaultProperties['prop2.bool']}")
	public Boolean prop2;
	
	//Valor injetado pelo Properties gerado no XML
	@Value("#{defaultProperties['prop3']}")
	public String prop3;
}
