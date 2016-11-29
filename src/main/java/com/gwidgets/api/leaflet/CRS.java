package com.gwidgets.api.leaflet;
import jsinterop.annotations.JsMethod;
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
import jsinterop.annotations.JsType;

/**
 * Defines coordinate reference systems for projecting geographical points into pixel (screen) coordinates and back (and to coordinates in other units for WMS services).
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public abstract class CRS {

	/**
	 * Projects geographical coordinates on a given zoom into pixel coordinates.
	 *
	 * @param latlng the latlng
	 * @param zoom the zoom
	 * @return the point
	 */
	@JsMethod
	public static native Point latLngToPoint(LatLng latlng, Number zoom);

	/**
	 * The inverse of latLngToPoint. Projects pixel coordinates on a given zoom into geographical coordinates.
	 *
	 * @param point the point
	 * @param zoom the zoom
	 * @return the lat lng
	 */
	@JsMethod
	public static native LatLng pointToLatLng(Point point, Number zoom);

	/**
	 * Projects geographical coordinates into coordinates in units accepted for this CRS (e.g. meters for EPSG:3857, for passing it to WMS services).
	 *
	 * @param latlng the latlng
	 * @return the point
	 */
	@JsMethod
	public static native Point project(LatLng latlng);
	
	/**
	 * Given a projected coordinate returns the corresponding LatLng. The inverse of project.
	 *
	 * @param point the point
	 * @return the latlng
	 */
	@JsMethod
	public static native LatLng unproject(Point point);

	/**
	 * Returns the scale used when transforming projected coordinates into pixel coordinates for a particular zoom. For example, it returns 256 * 2^zoom for Mercator-based CRS.
	 *
	 * @param zoom the zoom
	 * @return the number
	 */
	@JsMethod
	public static native Number scale(Number zoom);
	
	
	/**
	 * Inverse of scale(), returns the zoom level corresponding to a scale factor of scale.
	 *
	 * @param scale the scale
	 * @return the zoom level
	 */
	@JsMethod
	public static native Number zoom(Number scale);
	
	/**
	 * Returns the projection's bounds scaled and transformed for the provided zoom.
	 *
	 * @param zoom the zoom level
	 * @return the bounds
	 */
	@JsMethod
	public static native Bounds getProjectedBounds(Number zoom);
	
	/**
	 * Returns the distance between two geographical coordinates.
	 *
	 * @param latlng1 
	 * @param latlng2 
	 * @return the distance
	 */
	@JsMethod
	public static native Number distance(LatLng latlng1, LatLng latlng2);
	
	/**
	 * Returns a LatLng where lat and lng has been wrapped according to the CRS's wrapLat and wrapLng properties, if they are outside the CRS's bounds.
	 *
	 * @param latlng
	 * @return the LatLng
	 */
	@JsMethod
	public static native Number wrapLatLng(LatLng latlng);

}