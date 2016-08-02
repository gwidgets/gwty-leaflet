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
import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

// TODO: Auto-generated Javadoc
/**
 * A class for drawing polyline overlays on a map. Extends Path. Use addLayer of the class Map to add it to the map.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Polyline extends Path{

	/**
	 * Adds a given point to the polyline.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L addLatLng(LatLng latlng);

	/**
	 * Sets the lat lngs.
	 *
	 * @param latlngs the latlngs
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLngs(LatLng[] latlngs);

	/**
	 * Returns an array of the points in the path.
	 *
	 * @return the lat lngs
	 */
	@JsMethod
	public native LatLng[] getLatLngs();

	/**
	 * Allows adding, removing or replacing points in the polyline. Returns the array of removed points (if any).
	 *
	 * @param index the index
	 * @param pointsToRemove the points to remove
	 * @param latlng the latlng
	 * @return an array of removed points (if any).
	 */
	@JsMethod
	public native LatLng[] spliceLatLngs(Number index, Number pointsToRemove,
			LatLng latlng);

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Path#getBounds()
	 */
	@JsMethod
	public native LatLngBounds getBounds();

	/**
	 * Returns a GeoJSON representation of the polyline (GeoJSON LineString Feature).
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();

}