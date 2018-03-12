/**
 * Prosys OPC UA Java SDK
 *
 * Copyright (c) Prosys PMS Ltd., http://www.prosysopc.com.
 * All rights reserved.
 */

/**
 * DO NOT EDIT THIS FILE DIRECTLY! It is generated and will be overwritten on regeneration.
*/

package com.kuka.cr.opcua.fubs.informationmodel.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import org.opcfoundation.ua.builtintypes.DiagnosticInfo;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;
import org.opcfoundation.ua.builtintypes.StatusCode;
import org.opcfoundation.ua.builtintypes.Variant;

import com.prosysopc.ua.types.opcua.server.ProgramStateMachineTypeNode;
import com.kuka.cr.opcua.fubs.informationmodel.FubProgramStateMachineType;
import com.prosysopc.ua.types.opcua.server.BaseObjectTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseObjectTypeNode;
import com.kuka.cr.opcua.fubs.informationmodel.server.SemanticAnnotationTypeNode;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;

  
public abstract class FubProgramStateMachineTypeNodeBase extends ProgramStateMachineTypeNode implements FubProgramStateMachineType {
  
  protected FubProgramStateMachineTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }
  
  @Override
  public void afterCreate(){
    super.afterCreate();
    
    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getInputVariablesNode());
    callAfterCreateIfExists(getOutputVariablesNode());
    callAfterCreateIfExists(getSemanticAnnotationNode());
  }



  @Mandatory
  @Override
  public BaseObjectTypeNode getInputVariablesNode() {
  	QualifiedName browseName = getQualifiedName("http://kuka.com/fubs", "InputVariables");
  	return (BaseObjectTypeNode) getComponent(browseName);
  }
  @Mandatory
  @Override
  public BaseObjectTypeNode getOutputVariablesNode() {
  	QualifiedName browseName = getQualifiedName("http://kuka.com/fubs", "OutputVariables");
  	return (BaseObjectTypeNode) getComponent(browseName);
  }
  @Optional
  @Override
  public SemanticAnnotationTypeNode getSemanticAnnotationNode() {
  	QualifiedName browseName = getQualifiedName("http://kuka.com/fubs", "SemanticAnnotation");
  	return (SemanticAnnotationTypeNode) getComponent(browseName);
  }
 

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos)
      throws StatusException {
    QualifiedName browseName;
    UaNode component;
    browseName = getQualifiedName("http://kuka.com/fubs", "Create");
    component = getComponent(browseName);
    if (component != null && component.getNodeId().equals(methodId)) {
      String returnValue = onCreate(serviceContext);
      return new Variant[] { 
        new Variant(returnValue)
      };
    }
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
  
  @Override
  public String create() throws StatusException {
    return onCreate(ServiceContext.INTERNAL_OPERATION_CONTEXT);
  }

  protected abstract String onCreate(ServiceContext serviceContext) throws StatusException;
}
