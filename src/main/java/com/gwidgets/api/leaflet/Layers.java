package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.Function;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Layers extends Control{



	@JsMethod
	public native L addBaseLayer(ILayer layer, String name);

	@JsMethod
	public native L addOverlay(ILayer layer, String name);

	@JsMethod
	public native L removeLayer(ILayer layer);

	// Events

	@JsMethod
	public static native L clearAllEventListeners();

	@JsMethod
	public static native L on(String type, Function fn);

	@JsMethod
	public static native L once(String type, Function fn);

	@JsMethod
	public static native L off(String type, Function fn);

	@JsMethod
	public static native L fire(String type);

}