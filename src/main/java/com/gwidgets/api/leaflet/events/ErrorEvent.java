package com.gwidgets.api.leaflet.events;

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.elemental.DOMMouseEvent;

import jsinterop.annotations.JsType;

@JsType
public class ErrorEvent extends Event {
	
    protected ErrorEvent(){
		
		
	}

	public final native Point getLayerPoint() /*-{
		return this.layerPoint;
	}-*/;

	public final native Point getContainerPoint() /*-{
		return this.containerPoint;
	}-*/;

	public final native DOMMouseEvent getOriginalEvent() /*-{
		return this.originalEvent;
	}-*/;

	public final native LatLng getLatlng() /*-{
		return this.latlng;
	}-*/;

	public final native LatLngBounds getBounds() /*-{
		return this.bounds;
	}-*/;

	public final native Number getAccuracy() /*-{
		return this.accuracy;
	}-*/;

	public final native Number getAltitude() /*-{
		return this.altitude;
	}-*/;

	public final native Number getAltitudeAccuracy() /*-{
		return this.altitudeAccuracy;
	}-*/;

	public final native Number getHeading() /*-{
		return this.heading;
	}-*/;

	public final native Number getSpeed() /*-{
		return this.speed;
	}-*/;

	public final native Number getTimestamp() /*-{
		return this.timestamp;
	}-*/;

	public final native String getMessage() /*-{
		return this.message;
	}-*/;

	public final native Number getCode() /*-{
		return this.code;
	}-*/;

}