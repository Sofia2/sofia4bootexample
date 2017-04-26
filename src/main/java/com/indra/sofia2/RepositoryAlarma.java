/*******************************************************************************
 * © Indra Sistemas, S.A.
 * 2013 - 2017  SPAIN
 * 
 * All rights reserved
 ******************************************************************************/
package com.indra.sofia2;
import java.util.List;

import com.indra.sofia2.aspect.Param;
import com.indra.sofia2.aspect.Sofia2Delete;
import com.indra.sofia2.aspect.Sofia2Insert;
import com.indra.sofia2.aspect.Sofia2Query;
import com.indra.sofia2.aspect.Sofia2Repository;
import com.indra.sofia2.aspect.Sofia2Update;
import com.indra.sofia2.beans.SofiaId;
import com.indra.sofia2.pojo.AlarmaOntologia;

@Sofia2Repository("Alarma")
public interface RepositoryAlarma {

	@Sofia2Query("select * from Alarma")
	List<AlarmaOntologia> consulta();
	
	@Sofia2Query("select * from Alarma quere Alarma.causa=$causa")
	List<AlarmaOntologia> consultaCausa(@Param("$causa")String causa);
	
	@Sofia2Update("update Alarma set Alarma.causa=$valor where Alarma.causa=$param")
	List<SofiaId> update(@Param("$valor")String valor,@Param("$param") String param);
	
	@Sofia2Insert()
	SofiaId insert(AlarmaOntologia alarma);
	
	@Sofia2Delete("delete from Alarma where Alarma.causa=$parametro")
	List<SofiaId> delete(@Param("$parametro")String valor);
	
}
 