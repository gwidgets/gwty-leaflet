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


import com.gwidgets.api.leaflet.elemental.HTMLElement;


/**
 * The base class for all Leaflet controls. Implements IControl interface. You can add controls to the map like this:
 *<pre>
 *{@code control.addTo(map);
 *       // or
 *  map.addControl(control);}
 *</pre>
 *@author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Control {
	
	


	protected Control() {
		
	}

	/**
	 * Sets the position of the control. 
	 *
	 * @param position the position
	 * @return the L class
	 */
	@JsMethod
	public native L setPosition(String position);

	/**
	 * Returns the current position of the control.
	 *
	 * @return the position
	 */
	@JsMethod
	public native String getPosition();

	/**
	 * Adds the control to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public native L addTo(Map map);

	/**
	 * Removes the control from the map.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L remove(Map map);

	/**
	 * Returns the HTML container of the control.
	 *
	 * @return the container
	 */
	@JsMethod
	public native HTMLElement getContainer();

	/**
	 * Should contain code that creates all the neccessary DOM elements for the control, adds listeners on relevant map events, and returns the element containing the control. Called on map.addControl(control) or control.addTo(map).
	 *
	 * @param map the map
	 * @return the HTML element of the control
	 */
	public native HTMLElement onAdd(Map map);

	/**
	 * Optional, should contain all clean up code (e.g. removes control's event listeners). Called on map.removeControl(control) or control.removeFrom(map). The control's DOM container is removed automatically.
	 *
	 * @param map the map
	 */
	public native void onRemove(Map map);
}
