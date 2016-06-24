package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class PosAnimation {



	@JsMethod
	public native L run(HTMLElement element, Point newPos, Number duration,
			Number easeLinearity);

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