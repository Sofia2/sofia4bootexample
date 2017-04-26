/*******************************************************************************
 * � Indra Sistemas, S.A.
 * 2013 - 2017  SPAIN
 * 
 * All rights reserved
 ******************************************************************************/
package com.indra.sofia2.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Alarma
{

  @JsonProperty("Alarma")
  private AlarmaBody alarma;

  public AlarmaBody getAlarma() { return this.alarma; }

  public void setAlarma(AlarmaBody alarma) { this.alarma = alarma; }
  
}

