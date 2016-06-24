package com.gwidgets.api.leaflet.events;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.elemental.DOMMouseEvent;

@JsType(isNative = true)
public class MouseEvent extends Event {


	@JsProperty
	public  LatLng latlng;

	@JsProperty
	public  Point layerPoint;

	@JsProperty
	public  Point containerPoint;

	@JsProperty
	public  DOMMouseEvent originalEvent;

}