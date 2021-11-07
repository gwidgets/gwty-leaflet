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

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Point;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * The Class MouseEvent.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative=true, name="Object", namespace=jsinterop.annotations.JsPackage.GLOBAL)
public class MouseEvent extends Event {
	
   
    private MouseEvent(){}

	/**
	 * Gets the geographical point where the mouse event occurred.
	 *
	 * @return the latlng
	 */
    @JsProperty
	public final native LatLng getLatlng();

	/**
	 * Gets the pixel coordinates of the point where the mouse event occurred relative to the map layer.
	 *
	 * @return the layer point
	 */
    @JsProperty
	public final native Point getLayerPoint();

	/**
	 * Gets the pixel coordinates of the point where the mouse event occurred relative to the map container.
	 *
	 * @return the container point
	 */
    @JsProperty
	public final native Point getContainerPoint();

	/**
	 * Gets the original DOM mouse event fired by the browser.
	 *
	 * @return the original event
	 */
    @JsProperty
	public final native elemental2.dom.MouseEvent getOriginalEvent();


}
