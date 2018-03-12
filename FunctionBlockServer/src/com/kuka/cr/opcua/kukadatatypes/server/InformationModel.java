/**
* Prosys OPC UA Java SDK
*
* Copyright (c) Prosys PMS Ltd., http://www.prosysopc.com.
* All rights reserved.
*/

/**
* DO NOT EDIT THIS FILE DIRECTLY! It is generated and will be overwritten on regeneration.
*/

package com.kuka.cr.opcua.kukadatatypes.server;

import com.prosysopc.ua.CodegenModel;
import com.kuka.cr.opcua.kukadatatypes.Serializers;
import com.prosysopc.ua.nodes.UaInstance;
import java.util.ArrayList;
import java.util.List;

public class InformationModel {
    
  private static List<Class<? extends UaInstance>> createClassesList(){
    ArrayList<Class<? extends UaInstance>> list = new ArrayList<Class<? extends UaInstance>>();
     return list;
    }

  public static final CodegenModel MODEL = new CodegenModel(
    createClassesList(), 
    Serializers.SERIALIZERS
  );
}
