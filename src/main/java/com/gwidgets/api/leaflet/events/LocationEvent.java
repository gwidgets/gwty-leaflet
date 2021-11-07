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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * The Class LocationEvent.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative=true, name="Object", namespace=jsinterop.annotations.JsPackage.GLOBAL)
public class LocationEvent extends Event {

	
	private LocationEvent(){}



	/**
	 * Gets the detected geographical location of the user.
	 *
	 * @return the latlng
	 */
	@JsProperty
	public final native LatLng getLatlng();

	/**
	 * Gets the geographical bounds of the area user is located in (with respect to the accuracy of location).
	 *
	 * @return the bounds
	 */
	@JsProperty
	public final native LatLngBounds getBounds();

	/**
	 * Gets the accuracy of location in meters.
	 *
	 * @return the accuracy
	 */
	@JsProperty
	public final native double getAccuracy();

	/**
	 * Gets the height of the position above the WGS84 ellipsoid in meters.
	 *
	 * @return the altitude
	 */
	@JsProperty
	public final native double getAltitude();

	/**
	 * Gets the accuracy of the altitude in meters.
	 *
	 * @return the altitude accuracy
	 */
	@JsProperty
	public final native double getAltitudeAccuracy();

	/**
	 * Gets the direction of travel in degrees counting clockwise from true North.
	 *
	 * @return the heading
	 */
	@JsProperty
	public final native double getHeading();

	/**
	 * Gets the current velocity in meters per second.
	 *
	 * @return the speed
	 */
	@JsProperty
	public final native double getSpeed();

	/**
	 * Gets the time when the position was acquired.
	 *
	 * @return the timestamp
	 */
	@JsProperty
	public final native double getTimestamp();

}
