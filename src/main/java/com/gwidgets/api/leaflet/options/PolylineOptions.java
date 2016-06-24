package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PolylineOptions {

	@JsProperty
	public Number smoothFactor = 1.0;

	@JsProperty
	public Boolean noClip = false;

}