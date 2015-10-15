package com.jesjobom.main;

import com.jesjobom.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jesjobom.util.PropertiesHolder;
import org.springframework.context.annotation.ImportResource;

/**
 * Teste para obtenção de arquivos de propriedades de forma dinâmica.
 * 
 * Este é apenas um exemplo de como geralmente faço pra dinamizar qual arquivo
 * de propriedades usar dependendo de variáveis passadas à VM/Container e como
 * obter os valores desses arquivos.
 * 
 * Utilizei o Spring Boot para facilitar o teste sem precisar de um Tomcat,
 * mas essecialmente as configurações de XML ou anotações essencialmente serão
 * as mesmas.
 * 
 * @author jesjobom
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.jesjobom")
@ImportResource("config/main.xml")
public class Main implements CommandLineRunner {

	@Autowired
	private PropertiesHolder propertiesHolder;
	
	@Autowired
	private CustomService customService;

	@Override
	public void run(String... args) {
		System.out.println("\n=== VALORES OBTIDOS PELA INTANCIA ANOTADA @Component ===");
		System.out.println("Custom Env Name (PropertyPlaceholder padrão): " + propertiesHolder.customEnvName);
		System.out.println("Custom Config File (PropertyPlaceholder padrão): " + propertiesHolder.customConfigFile);
		System.out.println("Prop1 (PropertyPlaceholder gerado): " + propertiesHolder.prop1);
		System.out.println("Prop2 (Properties injetado): " + propertiesHolder.prop2);
		System.out.println("Prop3 (Properties injetado): " + propertiesHolder.prop3);
		
		System.out.println("\n=== VALORES OBTIDOS PELO BEAN INSTANCIADO NO XML ===");
		System.out.println("Custom Env Name (PropertyPlaceholder padrão): " + customService.getCustomEnvName());
		System.out.println("Custom Config File (PropertyPlaceholder padrão): " + customService.getCustomConfigFile());
		System.out.println("Prop1 (Properties injetado): " + customService.getProp1());
		System.out.println("Prop2 (PropertyPlaceholder gerado): " + customService.getProp2());
		System.out.println("Prop3 (PropertyPlaceholder gerado): " + customService.getProp3());
		
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
}
