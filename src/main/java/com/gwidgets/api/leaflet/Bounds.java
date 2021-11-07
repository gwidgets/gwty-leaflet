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


/**
 * Represents a rectangular area in pixel coordinates.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class Bounds {
	
	

	private Bounds() {
		
	}

	/**
	 * Extends the bounds to contain the given point.
	 *
	 * @param point the point
	 */
	@JsMethod
	public native void extend(Point point);

	/**
	 * Returns the center point of the bounds.
	 *
	 * @return the center
	 */
	@JsMethod
	public native Point getCenter();

	/**
	 * Returns true if the rectangle contains the given one.
	 *
	 * @param otherBounds the bounds
	 * @return true/false
	 */
	@JsMethod
	public native Boolean contains(Bounds otherBounds);

	/**
	 * Returns true if the rectangle contains the given point.
	 *
	 * @return true/false
	 * @param point a {@link com.gwidgets.api.leaflet.Point} object
	 */
	@JsMethod
	public native Boolean contains(Point point);

	/**
	 * Returns true if the rectangle intersects the given bounds.
	 *
	 * @param otherBounds the other bounds
	 * @return true/false
	 */
	@JsMethod
	public native Boolean intersects(Bounds otherBounds);

	/**
	 * Returns true if the bounds are properly initialized.
	 *
	 * @return true/false
	 */
	@JsMethod
	public native Boolean isValid();

	/**
	 * Returns the size of the given bounds.
	 *
	 * @return the size
	 */
	@JsMethod
	public native Point getSize();

}
