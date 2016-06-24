package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlScaleOptions {

	@JsProperty
	public String position = "bottomleft";

	@JsProperty
	public Number maxWidth = 100;

	@JsProperty
	public Boolean metric = true;

	@JsProperty
	public Boolean imperial = true;

	@JsProperty
	public Boolean updateWhenIdle = false;

}