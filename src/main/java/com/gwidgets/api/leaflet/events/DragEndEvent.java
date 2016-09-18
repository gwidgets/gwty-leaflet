package com.gwidgets.api.leaflet.events;


/**
 * The Class DragEndEvent.
 */
public class DragEndEvent extends Event {

	
	protected DragEndEvent() {

	}

	/**
	 * Gets the distance in pixels the draggable element was moved by.
	 *
	 * @return the distance
	 */
	public native Number getDistance()/*-{
		return this.distance;
	}-*/;

}
