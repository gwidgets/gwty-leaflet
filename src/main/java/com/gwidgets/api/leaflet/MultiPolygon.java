package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class MultiPolygon extends FeatureGroup{

	@JsMethod
	public native L setLatLngs(LatLng[][] latlngs);

	@JsMethod
	public native LatLng[][] getLatLngs();

	@JsMethod
	public native Object toGeoJSON();

}