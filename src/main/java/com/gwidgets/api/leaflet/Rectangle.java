package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Rectangle extends Polygon{

	@JsMethod
	public native L setBounds(LatLngBounds bounds);

}