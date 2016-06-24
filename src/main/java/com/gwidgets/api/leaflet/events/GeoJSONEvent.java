package com.gwidgets.api.leaflet.events;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.elemental.DOMMouseEvent;
import com.gwidgets.api.leaflet.elemental.HTMLElement;

@JsType(isNative = true)
public class GeoJSONEvent extends Event {


	@JsProperty
	public  LatLng latlng;

	@JsProperty
	public  Point layerPoint;

	@JsProperty
	public  Point containerPoint;

	@JsProperty
	public  DOMMouseEvent originalEvent;


	@JsProperty
	public  LatLngBounds bounds;

	@JsProperty
	public  Number accuracy;

	@JsProperty
	public  Number altitude;

	@JsProperty
	public  Number altitudeAccuracy;

	@JsProperty
	public  Number heading;

	@JsProperty
	public  Number speed;

	@JsProperty
	public  Number timestamp;

	@JsProperty
	public  String message;

	@JsProperty
	public  Number code;

	@JsProperty
	public  ILayer layer;


	@JsProperty
	public  String name;

	@JsProperty
	public  HTMLElement tile;

	@JsProperty
	public  String url;

	@JsProperty
	public  Point oldSize;

	@JsProperty
	public  Point newSize;


	@JsProperty
	public  Object properties;

	@JsProperty
	public  String geometryType;

	@JsProperty
	public  String id;

}