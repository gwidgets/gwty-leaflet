package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ZoomPanOptions {

	// Zoom/pan options
	@JsProperty
	Boolean reset = false;
	@JsProperty
	PanOptions pan = null;
	@JsProperty
	ZoomOptions zoom = null;
	@JsProperty
	Boolean animate = true;

}