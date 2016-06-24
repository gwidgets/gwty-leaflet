package com.gwidgets.api.leaflet.events;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Event {

	@JsProperty
	public  String type;

	@JsProperty
	public  JavaScriptObject target;

}