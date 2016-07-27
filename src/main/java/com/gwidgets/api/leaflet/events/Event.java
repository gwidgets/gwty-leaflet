package com.gwidgets.api.leaflet.events;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsType;

@JsType
public class Event  extends JavaScriptObject {
	
	protected Event(){
		
		
	}
	
	public final native  String getType() /*-{
	return this.target;
    }-*/;

	public final native HTMLElement getTarget()  /*-{
		return this.target;
	}-*/;

	
	

}