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
package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.elemental.Function;

/**
 * The Interface GeoJSONOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType
public interface GeoJSONOptions {

	/**
	 * Function that will be used for creating layers for GeoJSON points (if not specified, simple markers will be created).
	 *
	 * @param featureData the feature data
	 * @param latlng the latlng
	 * @return the function
	 */
	public Function pointToLayer(JavaScriptObject featureData, LatLng latlng);

	/**
	 * Function that will be used to get style options for vector layers created for GeoJSON features.
	 *
	 * @param featureData the feature data
	 * @return the function
	 */
	public Function style(JavaScriptObject featureData);

	/**
	 * Function that will be called on each created feature layer. Useful for attaching events and popups to features.
	 *
	 * @param featureData the feature data
	 * @param layer the layer
	 * @return the function
	 */
	public Function onEachFeature(JavaScriptObject featureData, ILayer layer);

	/**
	 * Function that will be used to decide whether to show a feature or not.
	 *
	 * @param featureData the feature data
	 * @param layer the layer
	 * @return the function
	 */
	public Function filter(JavaScriptObject featureData, ILayer layer);

	/**
	 * Function that will be used for converting GeoJSON coordinates to LatLng points (if not specified, coords will be assumed to be WGS84 — standard [longitude, latitude] values in degrees).
	 *
	 * @param coords the coords
	 * @return the function
	 */
	public Function coordsToLatLng(JsArray<JavaScriptObject> coords);

}