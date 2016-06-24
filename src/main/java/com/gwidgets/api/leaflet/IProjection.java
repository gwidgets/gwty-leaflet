package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface IProjection {

	public Point project(LatLng latlng);

	public LatLng unproject(Point point);

}