package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class MapPanes {
	
	@JsProperty
	HTMLElement	mapPane;
	
	@JsProperty
	HTMLElement	tilePane;
	
	@JsProperty
	HTMLElement	objectsPane;
	
	@JsProperty
	HTMLElement	shadowPane;	
	
	@JsProperty
	HTMLElement	overlayPane;
	
	@JsProperty
	HTMLElement markerPane;	
	
	@JsProperty
	HTMLElement popupPane;	

}
