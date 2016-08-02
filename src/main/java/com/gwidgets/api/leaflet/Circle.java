package com.gwidgets.api.leaflet;

import com.google.gwt.core.client.JavaScriptObject;

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
 * A class for drawing circle overlays on a map. Extends Path. Use addLayer method of the Map class to add it to the map.
 */
@JsType(isNative = true)
public class Circle extends Path{

	/**
	 * Returns the current geographical position of the circle.
	 *
	 * @return the lat lng 
	 */
	@JsMethod
	public native LatLng getLatLng();

	/**
	 * Returns the current radius of a circle. Units are in meters.
	 *
	 * @return the radius
	 */
	@JsMethod
	public native Number getRadius();

	/**
	 * Sets the position of a circle to a new location.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLng(LatLng latlng);

	/**
	 * Sets the radius of a circle. Units are in meters.
	 *
	 * @param radius the radius
	 * @return the L class
	 */
	@JsMethod
	public native L setRadius(Number radius);

	/**
	 * Returns a GeoJSON representation of the circle (GeoJSON Point Feature).
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();

}