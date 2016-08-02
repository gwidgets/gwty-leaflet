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
import jsinterop.annotations.JsType;

/**
 * Defines coordinate reference systems for projecting geographical points into pixel (screen) coordinates and back (and to coordinates in other units for WMS services).
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public interface ICRS {

	/**
	 * Projects geographical coordinates on a given zoom into pixel coordinates.
	 *
	 * @param latlng the latlng
	 * @param zoom the zoom
	 * @return the point
	 */
	public Point latLngToPoint(LatLng latlng, Number zoom);

	/**
	 * The inverse of latLngToPoint. Projects pixel coordinates on a given zoom into geographical coordinates.
	 *
	 * @param point the point
	 * @param zoom the zoom
	 * @return the lat lng
	 */
	public LatLng pointToLatLng(Point point, Number zoom);

	/**
	 * Projects geographical coordinates into coordinates in units accepted for this CRS (e.g. meters for EPSG:3857, for passing it to WMS services).
	 *
	 * @param latlng the latlng
	 * @return the point
	 */
	public Point project(LatLng latlng);

	/**
	 * Returns the scale used when transforming projected coordinates into pixel coordinates for a particular zoom. For example, it returns 256 * 2^zoom for Mercator-based CRS.
	 *
	 * @param zoom the zoom
	 * @return the number
	 */
	public Number scale(Number zoom);

}