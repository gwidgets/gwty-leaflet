package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class LatLng {



	@JsProperty
	public Number lat;

	@JsProperty
	public Number lng;
	
	
	
    @JsConstructor
	public LatLng(Number lat, Number lng) {
	
	}

	@JsMethod
	public native Number distanceTo(LatLng otherLatlng);

	@JsMethod
	public native Boolean equals(LatLng otherLatlng);

	@JsMethod
	public native String toString();

	@JsMethod
	public native LatLng wrap(Number left, Number right);

}