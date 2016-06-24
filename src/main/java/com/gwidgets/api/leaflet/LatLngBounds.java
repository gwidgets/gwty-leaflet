package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class LatLngBounds {

	@JsMethod
	public native L extend(LatLng latlng);

	@JsMethod
	public native L extend(LatLngBounds latlng);

	@JsMethod
	public native LatLng getSouthWest();

	@JsMethod
	public native LatLng getNorthEast();

	@JsMethod
	public native LatLng getNorthWest();

	@JsMethod
	public native LatLng getSouthEast();

	@JsMethod
	public native Number getWest();

	@JsMethod
	public native Number getSouth();

	@JsMethod
	public native Number getEast();

	@JsMethod
	public native Number getNorth();

	@JsMethod
	public native LatLng getCenter();

	@JsMethod
	public native Boolean contains(LatLngBounds otherBounds);

	@JsMethod
	public native Boolean contains(LatLng latlng);

	@JsMethod
	public native Boolean intersects(LatLngBounds otherBounds);

	@JsMethod
	public native Boolean equals(LatLngBounds otherBounds);

	@JsMethod
	public native String toBBoxString();

	@JsMethod
	public native LatLngBounds pad(Number bufferRatio);

	@JsMethod
	public native Boolean isValid();

}