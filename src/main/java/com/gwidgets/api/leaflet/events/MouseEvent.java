package com.gwidgets.api.leaflet.events;

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.elemental.DOMMouseEvent;

import jsinterop.annotations.JsType;

@JsType
public class MouseEvent extends Event {
	
    protected MouseEvent(){}

	public final native LatLng getLatlng() /*-{
		return this.latlng;
	}-*/;

	public final native Point getLayerPoint() /*-{
		return this.layerPoint;
	}-*/;

	public final native Point getContainerPoint() /*-{
		return this.containerPoint;
	}-*/;

	public final native DOMMouseEvent getOriginalEvent() /*-{
		return this.originalEvent;
	}-*/;


}