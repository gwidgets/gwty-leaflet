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
import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

/**
 * Represents a UI element in one of the corners of the map. Implemented by zoom, attribution, scale and layers controls.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public interface IControl {

	/**
	 * Should contain code that creates all the neccessary DOM elements for the control, adds listeners on relevant map events, and returns the element containing the control. Called on map.addControl(control) or control.addTo(map).
	 *
	 * @param map the map
	 * @return the HTML element of the control
	 */
	public HTMLElement onAdd(Map map);

	/**
	 * Optional, should contain all clean up code (e.g. removes control's event listeners). Called on map.removeControl(control) or control.removeFrom(map). The control's DOM container is removed automatically.
	 *
	 * @param map the map
	 */
	public void onRemove(Map map);

}