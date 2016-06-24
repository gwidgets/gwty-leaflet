package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.options.TileLayerWMSOptions;

@JsType(isNative = true)
public class WMS extends TileLayer{

	@JsMethod
	public static native L setParams(TileLayerWMSOptions params,
			Boolean noRedraw);

}