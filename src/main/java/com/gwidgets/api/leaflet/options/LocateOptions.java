package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class LocateOptions {
	
	@JsProperty
	public Boolean watch = false;
	@JsProperty
	public Boolean setView = false;
	@JsProperty
	public Number maxZoomLocate = Double.POSITIVE_INFINITY;
	@JsProperty
	public Number timeout = 10000;
	@JsProperty
	public Number maximumAge = 0;
	@JsProperty
	public Boolean enableHighAccuracy = false;

}
