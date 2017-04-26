/*******************************************************************************
 * © Indra Sistemas, S.A.
 * 2013 - 2017  SPAIN
 * 
 * All rights reserved
 ******************************************************************************/
package com.indra.sofia2.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.indra.sofia2.beans.Ontology;


public class AlarmaOntologia extends Ontology<Alarma>
{

  @JsonProperty("Alarma")
  private Alarma alarma;

  public Alarma getData() { return this.alarma; }

  public void setData(Alarma alarma) { this.alarma = alarma; }
  
}

