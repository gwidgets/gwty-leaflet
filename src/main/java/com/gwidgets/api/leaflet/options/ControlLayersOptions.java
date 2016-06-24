package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlLayersOptions {

	@JsProperty
	public String position = "topright";

	@JsProperty
	public Boolean collapsed = true;

	@JsProperty
	public Boolean autoZIndex = true;

}