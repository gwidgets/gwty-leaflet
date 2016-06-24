package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Polygon extends Polyline{

	@JsMethod
	public native Object toGeoJSON();

}