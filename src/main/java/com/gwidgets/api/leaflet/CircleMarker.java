package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class CircleMarker extends Circle {

	@JsMethod
	public native L setLatLng(LatLng latlng);

	@JsMethod
	public native L setRadius(Number radius);

	@JsMethod
	public native Object toGeoJSON();

}