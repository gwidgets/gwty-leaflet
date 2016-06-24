package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.ICRS;

@JsType
public class TileLayerWMSOptions {
	
	
	public TileLayerWMSOptions(String layers) {
		this.layers = layers;
	}

	@JsProperty
	public String layers = "";

	@JsProperty
	public String styles = "";

	@JsProperty
	public String format = "image/jpeg";

	@JsProperty
	public Boolean transparent = false;

	@JsProperty
	public String version = "1.1.1";

	@JsProperty
	public ICRS crs = null;

}