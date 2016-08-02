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
 * Represents an object attached to a particular location (or a set of locations) on a map. Implemented by tile layers, markers, popups, image overlays, vector layers and layer groups.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public interface ILayer {

	/**
	 * Should contain code that creates DOM elements for the overlay, adds them to map panes where they should belong and puts listeners on relevant map events. Called on map.addLayer(layer).
	 *
	 * @param map the map
	 */
	public void onAdd(Map map);

	/**
	 * Should contain all clean up code that removes the overlay's elements from the DOM and removes listeners previously added in onAdd. Called on map.removeLayer(layer).
	 *
	 * @param map the map
	 */
	public void onRemove(Map map);

}