package com.gwidgets.api.leaflet.elemental;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.events.Event;

import jsinterop.annotations.JsFunction;


@JsFunction
public interface Function {
	
	public JavaScriptObject call(Event event, JavaScriptObject...args);

}
