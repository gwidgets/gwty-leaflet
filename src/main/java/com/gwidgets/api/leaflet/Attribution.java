package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Attribution extends Control{

	@JsMethod
	public native L setPrefix(String prefix);

	@JsMethod
	public native L addAttribution(String text);

	@JsMethod
	public native L removeAttribution(String text);

}