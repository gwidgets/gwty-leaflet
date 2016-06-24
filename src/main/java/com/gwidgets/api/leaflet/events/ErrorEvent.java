package com.gwidgets.api.leaflet.events;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.elemental.DOMMouseEvent;

@JsType(isNative = true)
public class ErrorEvent extends Event {


	@JsProperty
	public   Point layerPoint;

	@JsProperty
	public   Point containerPoint;

	@JsProperty
	public   DOMMouseEvent originalEvent;

	@JsProperty
	public   LatLng latlng;

	@JsProperty
	public   LatLngBounds bounds;

	@JsProperty
	public   Number accuracy;

	@JsProperty
	public   Number altitude;

	@JsProperty
	public   Number altitudeAccuracy;

	@JsProperty
	public   Number heading;

	@JsProperty
	public   Number speed;

	@JsProperty
	public   Number timestamp;

	@JsProperty
	public   String message;

	@JsProperty
	public   Number code;

}