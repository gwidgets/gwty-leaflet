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
 * Represents an affine transformation: a set of coefficients a, b, c, d for transforming a point of a form (x, y) into (a*x + b, c*y + d) and doing the reverse. Used by Leaflet in its projections code.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Transformation {

	/**
	 * Returns a transformed point, optionally multiplied by the given scale. Only accepts real L.Point instances, not arrays.
	 *
	 * @param point the point
	 * @param scale the scale
	 * @return the transformed point
	 */
	@JsMethod
	public native Point transform(Point point, Number scale);

	/**
	 * Returns the reverse transformation of the given point, optionally divided by the given scale. Only accepts real L.Point instances, not arrays.
	 *
	 * @param point the point
	 * @param scale the scale
	 * @return the untransformed point
	 */
	@JsMethod
	public native Point untransform(Point point, Number scale);

}