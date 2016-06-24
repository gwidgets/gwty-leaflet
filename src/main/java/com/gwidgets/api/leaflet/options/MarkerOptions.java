package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.Icon;

@JsType
public class MarkerOptions {

	@JsProperty
	public Icon icon;

	@JsProperty
	public Boolean clickable = true;

	@JsProperty
	public Boolean draggable = false;

	@JsProperty
	public Boolean keyboard = true;

	@JsProperty
	public String title = "";

	@JsProperty
	public Number zIndexOffset = 0;

	@JsProperty
	public Number opacity = 1.0;

	@JsProperty
	public Boolean riseOnHover = false;

	@JsProperty
	public Number riseOffset = 250;

}