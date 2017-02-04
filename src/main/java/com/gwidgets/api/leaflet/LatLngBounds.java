package com.gwidgets.api.leaflet;

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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * Represents a rectangular geographical area on a map.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class LatLngBounds {

	
	
	private LatLngBounds() {
		
	}

	/**
	 * Extends the bounds to contain the given point.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L extend(LatLng latlng);

	/**
	 * Extends the bounds to contain the given bounds.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L extend(LatLngBounds latlng);

	/**
	 * Returns the south-west point of the bounds.
	 *
	 * @return the south west
	 */
	@JsMethod
	public native LatLng getSouthWest();

	/**
	 * Returns the north-east point of the bounds.
	 *
	 * @return the north east
	 */
	@JsMethod
	public native LatLng getNorthEast();

	/**
	 * Returns the north-west point of the bounds.
	 *
	 * @return the north west
	 */
	@JsMethod
	public native LatLng getNorthWest();

	/**
	 * Returns the south-east point of the bounds.
	 *
	 * @return the south east
	 */
	@JsMethod
	public native LatLng getSouthEast();

	/**
	 * Returns the west longitude of the bounds.
	 *
	 * @return the west
	 */
	@JsMethod
	public native double getWest();

	/**
	 * Returns the south latitude of the bounds.
	 *
	 * @return the south
	 */
	@JsMethod
	public native double getSouth();

	/**
	 * Returns the east longitude of the bounds.
	 *
	 * @return the east
	 */
	@JsMethod
	public native double getEast();

	/**
	 * Returns the north latitude of the bounds.
	 *
	 * @return the north
	 */
	@JsMethod
	public native double getNorth();

	/**
	 * Returns the center point of the bounds.
	 *
	 * @return the center
	 */
	@JsMethod
	public native LatLng getCenter();

	/**
	 * Returns true if the rectangle contains the given one.
	 *
	 * @param otherBounds the other bounds
	 * @return true/false
	 */
	@JsMethod
	public native Boolean contains(LatLngBounds otherBounds);

	/**
	 * Returns true if the rectangle contains the given point.
	 *
	 * @param latlng the latlng
	 * @return true/false
	 */
	@JsMethod
	public native Boolean contains(LatLng latlng);

	/**
	 * Returns true if the rectangle intersects the given bounds.
	 *
	 * @param otherBounds the other bounds
	 * @return true/false
	 */
	@JsMethod
	public native Boolean intersects(LatLngBounds otherBounds);

	/**
	 * Returns true if the rectangle is equivalent (within a small margin of error) to the given bounds.
	 *
	 * @param otherBounds the other bounds
	 * @return true/flase
	 */
	@JsMethod
	public native Boolean equals(LatLngBounds otherBounds);

	/**
	 * Returns a string with bounding box coordinates in a 'southwest_lng,southwest_lat,northeast_lng,northeast_lat' format. Useful for sending requests to web services that return geo data
	 *
	 * @return the string
	 */
	@JsMethod
	public native String toBBoxString();

	/**
	 * Returns bigger bounds created by extending the current bounds by a given percentage in each direction.
	 *
	 * @param bufferRatio the buffer ratio
	 * @return the lat lng bounds
	 */
	@JsMethod
	public native LatLngBounds pad(double bufferRatio);

	/**
	 * Returns true if the bounds are properly initialized.
	 *
	 * @return true/false
	 */
	@JsMethod
	public native Boolean isValid();

}