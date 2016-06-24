package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType
public class FitBoundsOptions {

	// fitBounds options
	@JsProperty
	Point paddingTopLeft = L.point(0, 0, true);
	@JsProperty
	Point paddingBottomRight = L.point(0, 0, true);
	@JsProperty
	Point padding = L.point(0, 0, true);

}