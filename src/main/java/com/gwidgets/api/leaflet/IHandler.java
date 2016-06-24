package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface IHandler {

	public Point latLngToPoint(LatLng latlng, Number zoom);

	public LatLng pointToLatLng(Point point, Number zoom);

	public Point project(LatLng latlng);

	public Number scale(Number zoom);

}