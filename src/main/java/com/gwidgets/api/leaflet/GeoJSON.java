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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.leaflet.elemental.Function;


/**
 *Represents a GeoJSON object or an array of GeoJSON objects. Allows you to parse GeoJSON data and display it on the map.
 *@author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class GeoJSON extends FeatureGroup {

	/**
	 * Adds a GeoJSON object to the layer.
	 *
	 * @param data the data
	 * @return the L class
	 */
	@JsMethod
	public native L addData(JavaScriptObject data);

	/**
	 * Changes styles of GeoJSON vector layers with the given style function.
	 *
	 * @param style the style function
	 * @return the L class
	 */
	@JsMethod
	public native L setStyle(Function style);

	/**
	 * Resets the given vector layer's style to the original GeoJSON style, useful for resetting style after hover events.
	 *
	 * @param layer the layer to reset
	 * @return the L class
	 */
	@JsMethod
	public native L resetStyle(Path layer);

	/**
	 * Creates a layer from a given GeoJSON feature.
	 *
	 * @param featureData the feature data
	 * @param pointToLayer the point to layer 
	 * @return the layer
	 */
	@JsMethod
	public native static ILayer geometryToLayer(JavaScriptObject featureData,
			Function pointToLayer);

	/**
	 * Creates a LatLng object from an array of 2 numbers (latitude, longitude) used in GeoJSON for points. If reverse is set to true, the numbers will be interpreted as (longitude, latitude).
	 *
	 * @param coords the coordinates
	 * @param reverse the reverse
	 * @return the lat lng
	 */
	@JsMethod
	public native static LatLng coordsToLatlng(JsArray<JavaScriptObject> coords, Boolean reverse);

	/**
	 * Creates a multidimensional array of LatLng objects from a GeoJSON coordinates array. levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of arrays of points, etc., 0 by default). If reverse is set to true, the numbers will be interpreted as (longitude, latitude).
	 *
	 * @param coords the coordinates
	 * @param levelsDeep  specifies the nesting level 
	 * @param reverse the reverse
	 * @return js array of coordinates
	 */
	@JsMethod
	public native static JsArray<JavaScriptObject> coordsToLatlngs(JsArray<JavaScriptObject> coords, Number levelsDeep,
			Boolean reverse);

}