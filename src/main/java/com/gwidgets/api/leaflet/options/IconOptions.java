package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.Point;

@JsType
public class IconOptions {
	
	public IconOptions(String iconUrl){
		this.iconUrl = iconUrl;
		
	}

	@JsProperty
	public String iconUrl;

	@JsProperty
	public String iconRetinaUrl;

	@JsProperty
	public Point iconSize;

	@JsProperty
	public Point iconAnchor;

	@JsProperty
	public String shadowUrl;

	@JsProperty
	public String shadowRetinaUrl;

	@JsProperty
	public Point shadowSize;

	@JsProperty
	public Point shadowAnchor;

	@JsProperty
	public Point popupAnchor;

	@JsProperty
	public String className;

}