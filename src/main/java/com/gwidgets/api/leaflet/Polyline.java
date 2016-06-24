package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Polyline extends Path{

	@JsMethod
	public native L addLatLng(LatLng latlng);

	@JsMethod
	public native L setLatLngs(LatLng[] latlngs);

	@JsMethod
	public native LatLng[] getLatLngs();

	@JsMethod
	public native LatLng[] spliceLatLngs(Number index, Number pointsToRemove,
			LatLng latlng);

	@JsMethod
	public native LatLngBounds getBounds();

	@JsMethod
	public native Object toGeoJSON();

}