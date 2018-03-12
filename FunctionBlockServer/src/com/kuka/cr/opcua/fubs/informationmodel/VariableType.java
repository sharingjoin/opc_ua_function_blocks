/**
 * Prosys OPC UA Java SDK
 *
 * Copyright (c) Prosys PMS Ltd., http://www.prosysopc.com.
 * All rights reserved.
 */

/**
 * DO NOT EDIT THIS FILE DIRECTLY! It is generated and will be overwritten on regeneration.
*/

package com.kuka.cr.opcua.fubs.informationmodel;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
  
@TypeDefinitionId("nsu=http://kuka.com/fubs;i=1006")
public interface VariableType extends BaseObjectType {
  
	public static final String METADATA = "Metadata";
	public static final String VALUE = "Value";

	@Mandatory
public BaseDataVariableType getValueNode();
	
	
	@Mandatory
	void setValue(Object value) throws StatusException;
	
	@Mandatory
	Object getValue();

	@Mandatory
	public VarMetadataType getMetadataNode();
	
}
