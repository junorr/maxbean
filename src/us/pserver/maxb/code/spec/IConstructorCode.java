/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.pserver.maxb.code.spec;

import us.pserver.maxb.sql.spec.ITable;



/**
 *
 * @author juno
 */
public interface IConstructorCode extends ITableCode, ICode {
	
	public ITable getTable();
	
	public String constructorCode();
	
}
