package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ZoomPanOptions {

	// Zoom/pan options
	@JsProperty
	public Boolean reset = false;
	@JsProperty
	public PanOptions pan = null;
	@JsProperty
	public ZoomOptions zoom = null;
	@JsProperty
	public Boolean animate = true;

}