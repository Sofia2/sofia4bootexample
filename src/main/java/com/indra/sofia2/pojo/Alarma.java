/*******************************************************************************
 * © Indra Sistemas, S.A.
 * 2013 - 2017  SPAIN
 * 
 * All rights reserved
 ******************************************************************************/
package com.indra.sofia2.pojo;

public class Alarma
{
  private String mensajeAlarma;

  public String getMensajeAlarma() { return this.mensajeAlarma; }

  public void setMensajeAlarma(String mensajeAlarma) { this.mensajeAlarma = mensajeAlarma; }

  private String causa;

  public String getCausa() { return this.causa; }

  public void setCausa(String causa) { this.causa = causa; }

  private String mensajeExcepcion;

  public String getMensajeExcepcion() { return this.mensajeExcepcion; }

  public void setMensajeExcepcion(String mensajeExcepcion) { this.mensajeExcepcion = mensajeExcepcion; }

  private String procedenciaAlarma;

  public String getProcedenciaAlarma() { return this.procedenciaAlarma; }

  public void setProcedenciaAlarma(String procedenciaAlarma) { this.procedenciaAlarma = procedenciaAlarma; }

  private int timestamp;

  public int getTimestamp() { return this.timestamp; }

  public void setTimestamp(int timestamp) { this.timestamp = timestamp; }
  
}
