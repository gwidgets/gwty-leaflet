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
 * Used to group several layers and handle them as one. If you add it to the map, any layers added or removed from the group will be added/removed on the map as well. 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class LayerGroup implements ILayer {

	/**
	 * Adds the group of layers to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public native L addTo(Map map);

	/**
	 * Adds a given layer to the group.
	 *
	 * @param layer the layer
	 * @return the l
	 */
	@JsMethod
	public native L addLayer(ILayer layer);

	/**
	 * Removes a given layer from the group.
	 *
	 * @param layer the layer
	 * @return the l
	 */
	@JsMethod
	public native L removeLayer(ILayer layer);

	/**
	 * Removes a given layer from the group.
	 *
	 * @param id the id
	 * @return the l
	 */
	@JsMethod
	public native L removeLayer(String id);

	/**
	 * Returns true if the given layer is currently added to the group.
	 *
	 * @param layer the layer
	 * @return the boolean
	 */
	@JsMethod
	public native Boolean hasLayer(ILayer layer);

	/**
	 * Returns the layer with the given id.
	 *
	 * @param id the id
	 * @return true/false
	 */
	@JsMethod
	public native Boolean getLayer(String id);

	/**
	 * Returns an array of all the layers added to the group.
	 *
	 * @return the layers
	 */
	@JsMethod
	public native JsArray<JavaScriptObject> getLayers();

	/**
	 * Removes all the layers from the group.
	 *
	 * @return the l
	 */
	@JsMethod
	public native L clearLayers();

	/**
	 * Iterates over the layers of the group, optionally specifying context of the iterator function.
	 *
	 * @param fn the action function
	 * @param context the context
	 * @return the l
	 */
	@JsMethod
	public native L eachLayer(Function fn, JavaScriptObject context);

	/**
	 * Returns a GeoJSON representation of the layer group (GeoJSON FeatureCollection).
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onAdd(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	@JsMethod
	public native void onAdd(Map map);

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onRemove(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	@JsMethod
	public native void onRemove(Map map);

}