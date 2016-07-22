package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType
public class FitBoundsOptions {

	// fitBounds options
	@JsProperty
	public Point paddingTopLeft = L.point(0, 0, true);
	@JsProperty
	public Point paddingBottomRight = L.point(0, 0, true);
	@JsProperty
	public Point padding = L.point(0, 0, true);

}