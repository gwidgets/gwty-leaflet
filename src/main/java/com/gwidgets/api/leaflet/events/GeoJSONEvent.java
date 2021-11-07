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

import com.gwidgets.api.leaflet.Layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Class GeoJSONEvent.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative=true, name="Object", namespace=jsinterop.annotations.JsPackage.GLOBAL)
public class GeoJSONEvent extends Event {


	private GeoJSONEvent() {

	}

	/**
	 * Gets the layer for the GeoJSON feature that is being added to the map.
	 *
	 * @return the layer
	 */
	@JsProperty
	public final native Layer getLayer();


	/**
	 * Gets the GeoJSON properties of the feature.
	 *
	 * @return the properties
	 */
	@JsProperty
	public final native Object getProperties();

	/**
	 * Gets the GeoJSON geometry type of the feature.
	 *
	 * @return the geometry type
	 */
	@JsProperty
	public final native String getGeometryType();

	/**
	 * Gets the GeoJSON ID of the feature (if present).
	 *
	 * @return the id
	 */
	@JsProperty
	public final native String getId();

}
