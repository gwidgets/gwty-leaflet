package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PanOptions {

	// Pan options
	@JsProperty
	public Boolean animate = true;
	@JsProperty
	public Number duration = 0.25;
	@JsProperty
	public Number easeLinearity = 0.25;
	@JsProperty
	public Boolean noMoveStart = false;

}