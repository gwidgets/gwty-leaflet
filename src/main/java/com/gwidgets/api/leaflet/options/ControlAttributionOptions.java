package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlAttributionOptions {

	@JsProperty
	public String position = "bottomright";

	@JsProperty
	public String prefix = "Powered by Leaflet";

}