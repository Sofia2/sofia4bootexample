/*******************************************************************************
 * © Indra Sistemas, S.A.
 * 2013 - 2017  SPAIN
 * 
 * All rights reserved
 ******************************************************************************/
package com.indra.sofia2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.indra.sofia2.proxy.Sofia2Initializer;

@SpringBootApplication
public class Application {

	  public static void main(String[] args) {
		  new SpringApplicationBuilder(Application.class).initializers(new Sofia2Initializer()).run(args);
	  } 
	
}
