/**
 * Prosys OPC UA Java SDK
 *
 * Copyright (c) Prosys PMS Ltd., http://www.prosysopc.com.
 * All rights reserved.
 */

package com.kuka.cr.opcua.fubs.informationmodel.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.server.NodeManagerUaNode;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;
  
@TypeDefinitionId("nsu=http://kuka.com/fubs;i=1001")
public class SemanticAnnotationTypeNode extends SemanticAnnotationTypeNodeBase {
  
  /** 
   * NodeBuilder uses this, you should not call this yourself. 
   */
  protected SemanticAnnotationTypeNode(NodeManagerUaNode nodeManager, NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate(){
    // Use this method to initialize the nodes, when they are all created.
    // Note that 'super.afterCreate()' performs default initializations, so consider
    // whether your own initializations should be done before or after it.
    super.afterCreate();
  }


}
