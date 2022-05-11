/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright TiDev, Inc. 04/07/2022-Present
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.modulesdk920;

import java.util.Date;
import java.util.Map;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollFunction;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name="TiModuleSdk920", id="ti.modulesdk920")
public class TiModuleSdk920Module extends KrollModule
{
	@Kroll.constant
	public static final int INT_VALUE_1 = 1;
	@Kroll.constant
	public static final String HELLO_WORLD = "Hello World";

	private static boolean wasModuleInitialized;
	private boolean booleanValue;
	private int intValue;
	private int[] intArray;
	private long longValue;
	private long[] longArray;
	private float floatValue;
	private float[] floatArray;
	private double doubleValue;
	private String stringValue;
	private String[] stringArray;
	private Date dateValue;
	private Date[] dateArray;
	private KrollDict dictionaryValue;
	private KrollDict[] dictionaryArray;
	private KrollFunction callback;

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		wasModuleInitialized = true;
	}

	@Kroll.getProperty
	public boolean wasModuleInitialized()
	{
		return wasModuleInitialized;
	}

	@Kroll.getProperty
	public boolean getBooleanValue()
	{
		return this.booleanValue;
	}

	@Kroll.setProperty
	public void setBooleanValue(boolean value)
	{
		this.booleanValue = value;
	}

	@Kroll.getProperty
	public int getIntValue()
	{
		return this.intValue;
	}

	@Kroll.setProperty
	public void setIntValue(int value)
	{
		this.intValue = value;
	}

	@Kroll.getProperty
	public int[] getIntArray()
	{
		return this.intArray;
	}

	@Kroll.setProperty
	public void setIntArray(int[] array)
	{
		this.intArray = array;
	}

	@Kroll.getProperty
	public long getLongValue()
	{
		return this.longValue;
	}

	@Kroll.setProperty
	public void setLongValue(long value)
	{
		this.longValue = value;
	}

	@Kroll.getProperty
	public long[] getLongArray()
	{
		return this.longArray;
	}

	@Kroll.setProperty
	public void setLongArray(long[] array)
	{
		this.longArray = array;
	}

	@Kroll.getProperty
	public float getFloatValue()
	{
		return this.floatValue;
	}

	@Kroll.setProperty
	public void setFloatValue(float value)
	{
		this.floatValue = value;
	}

	@Kroll.getProperty
	public float[] getFloatArray()
	{
		return this.floatArray;
	}

	@Kroll.setProperty
	public void setFloatArray(float[] array)
	{
		this.floatArray = array;
	}

	@Kroll.getProperty
	public double getDoubleValue()
	{
		return this.doubleValue;
	}

	@Kroll.setProperty
	public void setDoubleValue(double value)
	{
		this.doubleValue = value;
	}

	@Kroll.getProperty
	public String getStringValue()
	{
		return this.stringValue;
	}

	@Kroll.setProperty
	public void setStringValue(String value)
	{
		this.stringValue = value;
	}

	@Kroll.getProperty
	public String[] getStringArray()
	{
		return this.stringArray;
	}

	@Kroll.setProperty
	public void setStringArray(String[] array)
	{
		this.stringArray = array;
	}

	@Kroll.getProperty
	public Date getDateValue()
	{
		return this.dateValue;
	}

	@Kroll.setProperty
	public void setDateValue(Date value)
	{
		this.dateValue = value;
	}

	@Kroll.getProperty
	public Date[] getDateArray()
	{
		return this.dateArray;
	}

	@Kroll.setProperty
	@SuppressWarnings("unchecked")
	public void setDateArray(Object[] array)
	{
		if (array != null) {
			this.dateArray = new Date[array.length];
			for (int index = 0; index < array.length; index++) {
				this.dateArray[index] = (Date) array[index];
			}
		} else {
			this.dateArray = null;
		}
	}

	@Kroll.getProperty
	public KrollDict getDictionaryValue()
	{
		return this.dictionaryValue;
	}

	@Kroll.setProperty
	public void setDictionaryValue(KrollDict value)
	{
		this.dictionaryValue = value;
	}

	@Kroll.getProperty
	public KrollDict[] getDictionaryArray()
	{
		return this.dictionaryArray;
	}

	@Kroll.setProperty
	@SuppressWarnings("unchecked")
	public void setDictionaryArray(Object[] array)
	{
		if (array != null) {
			this.dictionaryArray = new KrollDict[array.length];
			for (int index = 0; index < array.length; index++) {
				Object value = array[index];
				if (value instanceof KrollDict) {
					this.dictionaryArray[index] = (KrollDict) value;
				} else if (value instanceof Map) {
					this.dictionaryArray[index] = new KrollDict((Map) value);
				} else if (value == null) {
					this.dictionaryArray[index] = null;
				} else {
					throw new IllegalArgumentException("Array element [" + index + "] is not a dictionary type.");
				}
			}
		} else {
			this.dictionaryArray = null;
		}
	}

	@Kroll.getProperty
	public KrollFunction getCallback()
	{
		return this.callback;
	}

	@Kroll.setProperty
	public void setCallback(KrollFunction callback)
	{
		this.callback = callback;
	}

	@Kroll.method
	public void invokeCallbackAsync(Object[] args)
	{
		if (this.callback != null) {
			this.callback.callAsync(getKrollObject(), args);
		}
	}

	@Kroll.method
	public Object invokeCallbackSync(Object[] args)
	{
		if (this.callback != null) {
			return this.callback.call(getKrollObject(), args);
		}
		return null;
	}
}
