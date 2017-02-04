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
package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;


import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Class PolylineOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class PolylineOptions extends PathOptions {

	private PolylineOptions() {

	}

	@JsProperty
	private double smoothFactor;

	@JsProperty
	private Boolean noClip;

	/**
	 * Gets How much to simplify the polyline on each zoom level. More means
	 * better performance and smoother look, and less means more accurate
	 * representation.
	 * </br>
	 * default 1.0
	 * @return the smooth factor
	 */
	@JsOverlay
	public final double getSmoothFactor() {
		return this.smoothFactor;
	}

	/**
	 * Gets whether the polyline clipping is disabled.
	 * </br>
	 * default false
	 * @return the no clip
	 */
	@JsOverlay
	public final Boolean getNoClip() {
		return this.noClip;
	}

	/**
	 * Gets Whether to draw stroke along the path. Set it to false to disable
	 * borders on polygons or circles. </br>
	 * default true
	 * 
	 * @return the stroke
	 */
	@JsOverlay
	public final Boolean getStroke_() {
		return this.stroke;
	}

	/**
	 * Gets the Stroke color. </br>
	 * default "#03f"
	 * 
	 * @return the color
	 */
	@JsOverlay
	public final String getColor_() {
		return this.color;
	}

	/**
	 * Gets the Stroke width in pixels. </br>
	 * default 5
	 * 
	 * @return the weight
	 */
	@JsOverlay
	public final double getWeight_() {
		return this.weight;
	}

	/**
	 * Gets the Stroke opacity. </br>
	 * default 0.5
	 * 
	 * @return the opacity
	 */
	@JsOverlay
	public final double getOpacity_() {
		return this.opacity;
	}

	/**
	 * Gets Whether to fill the path with color. Set it to false to disable
	 * filling on polygons or circles. </br>
	 * default true
	 * 
	 * @return the fill
	 */
	@JsOverlay
	public final Boolean getFill_() {
		return this.fill;
	}

	/**
	 * Gets the fill color. </br>
	 * default "#03f"
	 * 
	 * @return the fill color
	 */
	@JsOverlay
	public final String getFillColor_() {
		return this.fillColor;
	}

	/**
	 * Gets the fill opacity. </br>
	 * default 0.2
	 * 
	 * @return the fill opacity
	 */
	@JsOverlay
	public final double getFillOpacity_() {
		return this.fillOpacity;
	}

	/**
	 * Gets the string that defines how the inside of a shape is determined. See
	 * <a href="https://developer.mozilla.org/docs/Web/SVG/Attribute/fill-rule">
	 * docs </a> for more info </br>
	 * default "evenodd"
	 * 
	 * @return the fill rule
	 */
	@JsOverlay
	public final String getFillRule_() {
		return this.fillRule;
	}

	/**
	 * Gets the string that defines the stroke <a href=
	 * "https://developer.mozilla.org/en/SVG/Attribute/stroke-dasharray"> dash
	 * pattern</a>. Doesn't work on canvas-powered layers (e.g. Android 2).
	 * </br>
	 * default null
	 * 
	 * @return the dash array
	 */
	@JsOverlay
	public final String getDashArray_() {
		return this.dashArray;
	}

	/**
	 * Gets the string that defines <a href=
	 * "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linecap">
	 * shape </a> to be used at the end of the stroke. </br>
	 * default null
	 * 
	 * @return the line cap
	 */
	@JsOverlay
	public final String getLineCap_() {
		return this.lineCap;
	}

	/**
	 * Gets the string that defines <a href=
	 * "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linejoin">
	 * shape to be used</a> at the corners of the stroke. </br>
	 * default null
	 * 
	 * @return the line join
	 */
	@JsOverlay
	public final String getLineJoin_() {
		return this.lineJoin;
	}



	/**
	 * Gets the pointer-events attribute on the path if SVG backend is used.
	 * </br>
	 * default null
	 * 
	 * @return the pointer events
	 */
	@JsOverlay
	public final String getPointerEvents_() {
		return this.pointerEvents;
	}

	/**
	 * Gets the custom class name set on an element. </br>
	 * default empty string
	 * 
	 * @return the class name
	 */
	@JsOverlay
	public final String getClassName_() {
		return this.className;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private Boolean stroke = true;

		private String color = "#03f";

		private double weight = 5;

		private double opacity = 0.5;

		private Boolean fill = true;

		private String fillColor = "#03f";

		private double fillOpacity = 0.2;

		private String fillRule = "evenodd";

		private String dashArray = null;

		private String lineCap = null;

		private String lineJoin = null;

		private String pointerEvents = null;

		private String className = "";

		private double smoothFactor = 1.0;

		private Boolean noClip = false;


		public Builder() {

		}

		/**
		 * How much to simplify the polyline on each zoom level. More means better performance and smoother look, and less means more accurate representation.
		 * </br>
		 * default 1.0
		 * @param smoothFactor
		 *            the smooth factor
		 * @return the builder
		 */
		public Builder smoothFactor(double smoothFactor) {
			this.smoothFactor = smoothFactor;
			return this;
		}

		/**
		 * Disabled polyline clipping.
		 * </br>
		 * default false
		 * @param noClip
		 *            the no clip
		 * @return the builder
		 */
		public Builder noClip(Boolean noClip) {
			this.noClip = noClip;
			return this;
		}

		/**
		 * Whether to draw stroke along the path. Set it to false to disable
		 * borders on polygons or circles. </br>
		 * default true
		 * 
		 * @param stroke
		 *            the stroke
		 * @return the builder
		 */
		public Builder stroke(Boolean stroke) {
			this.stroke = stroke;
			return this;
		}

		/**
		 * Stroke color. </br>
		 * default "#03f"
		 * 
		 * @param color
		 *            the color
		 * @return the builder
		 */
		public Builder color(String color) {
			this.color = color;
			return this;
		}

		/**
		 * Stroke width in pixels. </br>
		 * default 5
		 * 
		 * @param weight
		 *            the weight
		 * @return the builder
		 */
		public Builder weight(double weight) {
			this.weight = weight;
			return this;
		}

		/**
		 * Stroke opacity. </br>
		 * default 0.5
		 * 
		 * @param opacity
		 *            the opacity
		 * @return the builder
		 */
		public Builder opacity(double opacity) {
			this.opacity = opacity;
			return this;
		}

		/**
		 * Whether to fill the path with color. Set it to false to disable
		 * filling on polygons or circles. </br>
		 * default true
		 * 
		 * @param fill
		 *            the fill
		 * @return the builder
		 */
		public Builder fill(Boolean fill) {
			this.fill = fill;
			return this;
		}

		/**
		 * Fill color. </br>
		 * default "#03f"
		 * 
		 * @param fillColor
		 *            the fill color
		 * @return the builder
		 */
		public Builder fillColor(String fillColor) {
			this.fillColor = fillColor;
			return this;
		}

		/**
		 * Fill opacity. </br>
		 * default 0.2
		 * 
		 * @param fillOpacity
		 *            the fill opacity
		 * @return the builder
		 */
		public Builder fillOpacity(double fillOpacity) {
			this.fillOpacity = fillOpacity;
			return this;
		}

		/**
		 * A string that defines how the inside of a shape is determined. See
		 * <a href=
		 * "https://developer.mozilla.org/docs/Web/SVG/Attribute/fill-rule">
		 * docs </a> for more info </br>
		 * 
		 * @param fillRule
		 *            the fill rule
		 * @return the builder
		 */
		public Builder fillRule(String fillRule) {
			this.fillRule = fillRule;
			return this;
		}

		/**
		 * A string that defines the stroke <a href=
		 * "https://developer.mozilla.org/en/SVG/Attribute/stroke-dasharray">
		 * dash pattern</a>. Doesn't work on canvas-powered layers (e.g. Android
		 * 2). </br>
		 * default "evenodd"
		 * 
		 * @param dashArray
		 *            the dash array
		 * @return the builder
		 */
		public Builder dashArray(String dashArray) {
			this.dashArray = dashArray;
			return this;
		}

		/**
		 * A string that defines <a href=
		 * "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linecap">
		 * shape </a> to be used at the end of the stroke. </br>
		 * default null
		 * 
		 * @param lineCap
		 *            the line cap
		 * @return the builder
		 */
		public Builder lineCap(String lineCap) {
			this.lineCap = lineCap;
			return this;
		}

		/**
		 * A string that defines <a href=
		 * "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linejoin">
		 * shape to be used</a> at the corners of the stroke. </br>
		 * default null
		 * 
		 * @param lineJoin
		 *            the line join
		 * @return the builder
		 */
		public Builder lineJoin(String lineJoin) {
			this.lineJoin = lineJoin;
			return this;
		}

		/**
		 * Sets the pointer-events attribute on the path if SVG backend is used.
		 * </br>
		 * default null
		 * 
		 * @param pointerEvents
		 *            the pointer events
		 * @return the builder
		 */
		public Builder pointerEvents(String pointerEvents) {
			this.pointerEvents = pointerEvents;
			return this;
		}

		/**
		 * Custom class name set on an element. </br>
		 * default empty string
		 * 
		 * @param className
		 *            the class name
		 * @return the builder
		 */
		public Builder className(String className) {
			this.className = className;
			return this;
		}

		/**
		 * Builds the PolylineOptions new instance
		 *
		 * @return the polyline options
		 */
		public PolylineOptions build() {
			PolylineOptions options = new PolylineOptions();
			options.smoothFactor = this.smoothFactor;
			options.noClip = this.noClip;
			options.stroke = this.stroke;
			options.color = this.color;
			options.weight = this.weight;
			options.opacity = this.opacity;
			options.fill = this.fill;
			options.fillColor = this.fillColor;
			options.fillOpacity = this.fillOpacity;
			options.fillRule = this.fillRule;
			options.dashArray = this.dashArray;
			options.lineCap = this.lineCap;
			options.lineJoin = this.lineJoin;
			options.pointerEvents = this.pointerEvents;
			options.className = this.className;

			return options;
		}

	}

}