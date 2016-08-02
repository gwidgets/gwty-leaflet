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
 * Extends FeatureGroup to allow creating multi-polygons (single layer that consists of several polygons that share styling/popup).
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class MultiPolygon extends FeatureGroup{

	/**
	 * Replace all polygons and their paths with the given array of arrays of geographical points.
	 *
	 * @param latlngs the latlngs
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLngs(LatLng[][] latlngs);

	/**
	 * Returns an array of arrays of geographical points in each polygon.
	 *
	 * @return the lat lngs
	 */
	@JsMethod
	public native LatLng[][] getLatLngs();
	
	
	
	/**
	 * Opens the popup previously bound by bindPopup.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L openPopup();
	

	/**
	 * Returns a GeoJSON representation of the multipolygon
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();

}