package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Popup {

	@JsMethod
	public native L addTo(Map map);

	@JsMethod
	public native L openOn(Map map);

	@JsMethod
	public native L setLatLng(LatLng latlng);

	@JsMethod
	public native L setContent(String htmlContent);

	@JsMethod
	public native L setContent(HTMLElement htmlContent);

}