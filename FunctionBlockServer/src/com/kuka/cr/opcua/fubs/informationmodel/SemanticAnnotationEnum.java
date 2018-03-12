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

import org.opcfoundation.ua.builtintypes.Enumeration;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.prosysopc.ua.TypeDefinitionId;

@TypeDefinitionId("nsu=http://kuka.com/fubs;i=3002")
public enum SemanticAnnotationEnum implements Enumeration {
	/**
	 * 
	 */
	EClass(0),

	/**
	 * 
	 */
	Owl(1),

	/**
	 * 
	 */
	Other(2);

	public static EnumSet<SemanticAnnotationEnum> NONE = EnumSet.noneOf( SemanticAnnotationEnum.class );
	public static EnumSet<SemanticAnnotationEnum> ALL = EnumSet.allOf( SemanticAnnotationEnum.class );

	private final int value;

	SemanticAnnotationEnum(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return value;
	}

	private static final Map<Integer, SemanticAnnotationEnum> map;

	static {
        map = new HashMap<Integer, SemanticAnnotationEnum>();
        for (SemanticAnnotationEnum i : SemanticAnnotationEnum.values())
        	map.put(i.value, i);
	}

	public static SemanticAnnotationEnum valueOf(int value) {
		return map.get(value);
	}

	public static SemanticAnnotationEnum valueOf(Integer value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static SemanticAnnotationEnum valueOf(UnsignedInteger value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static SemanticAnnotationEnum[] valueOf(int[] value)
	{
		SemanticAnnotationEnum[] result = new SemanticAnnotationEnum[value.length];
		for(int i=0; i<value.length; i++)
			result[i] = valueOf(value[i]);
		return result;
	}

	public static SemanticAnnotationEnum[] valueOf(Integer[] value)
	{
		SemanticAnnotationEnum[] result = new SemanticAnnotationEnum[value.length];
		for(int i=0; i<value.length; i++)
			result[i] = valueOf(value[i]);
		return result;
	}
	
	public static SemanticAnnotationEnum[] valueOf(UnsignedInteger[] value)
	{
		SemanticAnnotationEnum[] result = new SemanticAnnotationEnum[value.length];
		for(int i=0; i<value.length; i++)
			result[i] = valueOf(value[i]);
		return result;
	}

	public static UnsignedInteger getMask(SemanticAnnotationEnum...list) {
        int result = 0;
        for (SemanticAnnotationEnum c : list)
        	result |= c.value;
        return UnsignedInteger.getFromBits(result);
	}

	public static UnsignedInteger getMask(Collection<SemanticAnnotationEnum> list) {
		int result = 0;
		for (SemanticAnnotationEnum c : list)
			result |= c.value;
		return UnsignedInteger.getFromBits(result);
	}

	public static EnumSet<SemanticAnnotationEnum> getSet(UnsignedInteger mask) {
		return getSet(mask.intValue());
	}

	public static EnumSet<SemanticAnnotationEnum> getSet(int mask) {
		List<SemanticAnnotationEnum> res = new ArrayList<SemanticAnnotationEnum>();
		for (SemanticAnnotationEnum l : SemanticAnnotationEnum.values())
			if ( (mask & l.value) == l.value )
				res.add(l);
		return EnumSet.copyOf(res);
	}
}
