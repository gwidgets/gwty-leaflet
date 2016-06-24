package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PathOptions {

	@JsProperty
	public Boolean stroke = true;

	@JsProperty
	public String color = "#03f";

	@JsProperty
	public Number weight = 5;

	@JsProperty
	public Number opacity = 0.5;

	@JsProperty
	public Boolean fill = true;

	@JsProperty
	public String fillColor = "#03f";

	@JsProperty
	public Number fillOpacity = 0.2;

	@JsProperty
	public String dashArray = null;

	@JsProperty
	public Boolean clickable = true;

	@JsProperty
	public String pointerEvents = null;

}