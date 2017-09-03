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

import com.gwidgets.api.leaflet.Renderer;
import com.gwidgets.api.leaflet.options.CircleOptions.Builder;

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
	private boolean noClip;

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
	public final boolean getNoClip() {
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
	public final boolean getStroke_() {
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
	public final boolean getFill_() {
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

		private Boolean stroke;

		private String color;

		private Double weight;

		private Double opacity;

		private Boolean fill;

		private String fillColor;

		private Double fillOpacity;

		private String fillRule;

		private String dashArray;

		private String lineCap;

		private String lineJoin;

		private String pointerEvents;

		private String className;
		
	    private String dashOffset;

		private Renderer renderer;

	    private String pane; 

	    private String attribution;

	    private Boolean interactive;

		private Double smoothFactor;

		private Boolean noClip;


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
		public Builder smoothFactor(Double smoothFactor) {
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
		public Builder weight(Double weight) {
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
		public Builder opacity(Double opacity) {
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
		public Builder fillOpacity(Double fillOpacity) {
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
		
		public Builder dashOffset(String dashOffset){this.dashOffset = dashOffset; return this;}

	    public Builder renderer(Renderer renderer){this.renderer = renderer; return this;}

	    public Builder attribution(String attribution){this.attribution = attribution; return this;}

	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder interactive(Boolean interactive){this.interactive = interactive; return this;}

		/**
		 * Builds the PolylineOptions new instance
		 *
		 * @return the polyline options
		 */
		public PolylineOptions build() {
			    PolylineOptions options = new PolylineOptions();
			    if(this.smoothFactor != null)
			    options.smoothFactor = this.smoothFactor;
			    if(this.noClip != null)
			    options.noClip = this.noClip;
			    if(this.stroke != null)
				options.stroke = this.stroke;
				if(this.color != null)
				options.color = this.color;
				if(this.opacity != null)
				options.opacity = this.opacity;
				if(this.weight != null)
				options.weight = this.weight;
				if(this.fill != null)
				options.fill = this.fill;
				if(this.fillColor != null)
				options.fillColor = this.fillColor;
				if(this.fillOpacity != null)
				options.fillOpacity = this.fillOpacity;
				if(this.fillRule != null)
				options.fillRule = this.fillRule;
				if(this.dashArray != null)
				options.dashArray = this.dashArray;
				if(this.lineCap != null)
				options.lineCap = this.lineCap;
				if(this.lineJoin != null)
				options.lineJoin = this.lineJoin;
				if(this.pointerEvents != null)
				options.pointerEvents = this.pointerEvents;
				if(this.className != null)
				options.className = this.className;
				if(this.dashOffset != null)
				options.dashOffset = this.dashOffset;
				if(this.renderer != null)
				options.renderer = this.renderer;
				if(this.pane != null)
			    options.pane = this.pane;
				if(this.attribution != null)
			    options.attribution = this.attribution;
				if(this.interactive != null)
			    options.interactive = this.interactive;
			return options;
		}
	}
}