/*******************************************************************************
 * © Indra Sistemas, S.A.
 * 2013 - 2017  SPAIN
 * 
 * All rights reserved
 ******************************************************************************/
package com.indra.sofia2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.indra.sofia2.beans.SofiaId;
import com.indra.sofia2.pojo.AlarmaOntologia;

@RestController
public class Controller {

	
	@Autowired
	RepositoryAlarma repository;
	
	@RequestMapping(method = RequestMethod.GET)
    public String query() throws JsonProcessingException {
		List<AlarmaOntologia> retorno = repository.consulta();
		ObjectMapper objectMapper = new ObjectMapper();
		String arrayToJson = objectMapper.writeValueAsString(retorno);
		return arrayToJson;
	}
	
	@RequestMapping(method = RequestMethod.POST)
    public String insert(@RequestBody AlarmaOntologia alarma) throws JsonProcessingException {
    	SofiaId id = repository.insert(alarma);
    	ObjectMapper objectMapper = new ObjectMapper();
		String arrayToJson = objectMapper.writeValueAsString(id);
		return arrayToJson;
    }
	
	@RequestMapping(value="/{valor}/{param}",method = RequestMethod.PUT)
    public String update(@PathVariable(value="valor") String valor, @PathVariable(value="param") String param) throws JsonProcessingException {
		List<SofiaId> ids = repository.update(valor,param);
    	ObjectMapper objectMapper = new ObjectMapper();
		String arrayToJson = objectMapper.writeValueAsString(ids);
		return arrayToJson;
    }
	
	@RequestMapping(method = RequestMethod.DELETE)
    public String delete(@RequestBody String id) throws JsonProcessingException {
		List<SofiaId> ids =repository.delete(id);
    	ObjectMapper objectMapper = new ObjectMapper();
  		String arrayToJson = objectMapper.writeValueAsString(ids);
  		return arrayToJson;
    }
	
}
