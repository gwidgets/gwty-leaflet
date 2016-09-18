/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gwidgets.api.leaflet.events;

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.elemental.DOMMouseEvent;

import jsinterop.annotations.JsType;


/**
 * The Class LocationEvent.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType
public class LocationEvent extends Event {

	
	protected LocationEvent(){}



	/**
	 * Gets the detected geographical location of the user.
	 *
	 * @return the latlng
	 */
	public final native LatLng getLatlng() /*-{
		return this.latlng;
	}-*/;

	/**
	 * Gets the geographical bounds of the area user is located in (with respect to the accuracy of location).
	 *
	 * @return the bounds
	 */
	public final native LatLngBounds getBounds() /*-{
		return this.bounds;
	}-*/;

	/**
	 * Gets the accuracy of location in meters.
	 *
	 * @return the accuracy
	 */
	public final native Number getAccuracy() /*-{
		return this.accuracy;
	}-*/;

	/**
	 * Gets the height of the position above the WGS84 ellipsoid in meters.
	 *
	 * @return the altitude
	 */
	public final native Number getAltitude() /*-{
		return this.altitude;
	}-*/;

	/**
	 * Gets the accuracy of the altitude in meters.
	 *
	 * @return the altitude accuracy
	 */
	public final native Number getAltitudeAccuracy() /*-{
		return this.altitudeAccuracy;
	}-*/;

	/**
	 * Gets the direction of travel in degrees counting clockwise from true North.
	 *
	 * @return the heading
	 */
	public final native Number getHeading() /*-{
		return this.heading;
	}-*/;

	/**
	 * Gets the current velocity in meters per second.
	 *
	 * @return the speed
	 */
	public final native Number getSpeed() /*-{
		return this.speed;
	}-*/;

	/**
	 * Gets the time when the position was acquired.
	 *
	 * @return the timestamp
	 */
	public final native Number getTimestamp() /*-{
		return this.timestamp;
	}-*/;

}