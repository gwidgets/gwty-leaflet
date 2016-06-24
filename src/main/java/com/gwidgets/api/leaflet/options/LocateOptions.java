package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class LocateOptions {
	
	@JsProperty
	Boolean watch = false;
	@JsProperty
	Boolean setView = false;
	@JsProperty
	Number maxZoomLocate = Double.POSITIVE_INFINITY;
	@JsProperty
	Number timeout = 10000;
	@JsProperty
	Number maximumAge = 0;
	@JsProperty
	Boolean enableHighAccuracy = false;

}
