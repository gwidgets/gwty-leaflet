package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PanOptions {

	// Pan options
	@JsProperty
	Boolean animate = true;
	@JsProperty
	Number duration = 0.25;
	@JsProperty
	Number easeLinearity = 0.25;
	@JsProperty
	Boolean noMoveStart = false;

}