package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.Point;

@JsType
public class DivIconOptions {

	@JsProperty
	public Point iconSize;

	@JsProperty
	public Point iconAnchor;

	@JsProperty
	public String className;

	@JsProperty
	public String html;

}