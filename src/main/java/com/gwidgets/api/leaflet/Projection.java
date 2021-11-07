package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
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
 * An object with methods for projecting geographical coordinates of the world onto a flat surface (and back).
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class Projection {
	
	@JsProperty
	public LatLngBounds bounds;

    
	private Projection() {
		
		
	}
	/**
	 * Projects geographical coordinates into a 2D point.
	 *
	 * @param latlng the latlng
	 * @return the point
	 */
	@JsMethod
	public native Point project(LatLng latlng);

	/**
	 * The inverse of project. Projects a 2D point into geographical location.
	 *
	 * @param point the point
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng unproject(Point point);

}
