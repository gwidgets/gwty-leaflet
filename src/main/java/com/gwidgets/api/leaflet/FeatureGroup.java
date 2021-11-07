package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.options.PathOptions;

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
 * Extended layerGroup that also has mouse events (propagated from members of the group) and a shared bindPopup method.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class FeatureGroup extends LayerGroup {
	
	


	/**
	 * <p>Constructor for FeatureGroup.</p>
	 */
	protected FeatureGroup() {
		
	}

	/**
	 * Returns the LatLngBounds of the Feature Group (created from bounds and coordinates of its children).
	 *
	 * @return the bounds
	 */
	@JsMethod
	public native LatLngBounds getBounds();

	/**
	 * Sets the given path options to each layer of the group that has a setStyle method.
	 *
	 * @param style the style
	 * @return the L class
	 */
	@JsMethod
	public native L setStyle(PathOptions style);

	/**
	 * Brings the layer group to the top of all other layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L bringToFront();

	/**
	 * Brings the layer group to the bottom of all other layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L bringToBack();






}
