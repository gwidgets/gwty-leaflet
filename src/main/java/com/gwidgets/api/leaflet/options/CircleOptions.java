package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.Renderer;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class CircleOptions extends PathOptions {
	
	protected CircleOptions(){
		
		
	}
	
	private double radius;
	
	
	/**
	 * Returns the current radius of a circle. Units are in meters.
	 *
	 * @return the radius
	 */
	@JsOverlay
	public final double getRadius() {
		return this.radius;
	}




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
		
	    private String dashOffset;

		private Renderer renderer;

	    private String pane = "overlayPane"; 

	    private String attribution;

	    private Boolean interactive = true;
	    
	    private double radius = 10;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

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
		
		public Builder dashOffset(String dashOffset){this.dashOffset = dashOffset; return this;}

	    public Builder renderer(Renderer renderer){this.renderer = renderer; return this;}

	    public Builder attribution(String attribution){this.attribution = attribution; return this;}

	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder interactive(Boolean interactive){this.interactive = interactive; return this;}
	    
	    public Builder radius(double radius){this.radius = radius;return this;}

		/**
		 * Builds the PathOptions new instance
		 *
		 * @return the path options
		 */
		public CircleOptions build(){
			CircleOptions options = new CircleOptions();
			options.stroke = this.stroke;
			options.color = this.color;
			options.opacity = this.opacity;
			options.weight = this.weight;
			options.fill = this.fill;
			options.fillColor = this.fillColor;
			options.fillOpacity = this.fillOpacity;
			options.fillRule = this.fillRule;
			options.dashArray = this.dashArray;
			options.lineCap = this.lineCap;
			options.lineJoin = this.lineJoin;
			options.pointerEvents = this.pointerEvents;
			options.className = this.className;
			options.dashOffset = this.dashOffset;
			options.renderer = this.renderer;
		    options.pane = this.pane;
		    options.attribution = this.attribution;
		    options.interactive = this.interactive;
		    options.radius = this.radius;

			return options;

		}

	}

}
