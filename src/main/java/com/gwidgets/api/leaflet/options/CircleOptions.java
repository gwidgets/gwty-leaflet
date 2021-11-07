package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.Renderer;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class CircleOptions extends PathOptions {
	
	protected CircleOptions(){}
	
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
	    
	    private Double radius;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * Whether to draw stroke along the path. Set it to false to disable
		 * borders on polygons or circles.
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
		 * Stroke color.
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
		 * Stroke width in pixels.
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
		 * Stroke opacity.
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
		 * filling on polygons or circles.
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
		 * Fill color.
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
		 * Fill opacity.
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
		 * docs </a> for more info
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
		 * 2).
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
		 * shape </a> to be used at the end of the stroke.
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
		 * shape to be used</a> at the corners of the stroke.
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
		 *
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
		 * Custom class name set on an element.
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
	    
	    public Builder radius(Double radius){this.radius = radius;return this;}

		/**
		 * Builds the PathOptions new instance
		 *
		 * @return the path options
		 */
		public CircleOptions build(){
			CircleOptions options = new CircleOptions();
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
			if(this.radius != null)
		    options.radius = this.radius;
			
			return options;
		}
	}
}
