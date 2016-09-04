package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PathOptions {

	@JsProperty
	protected Boolean stroke;

	@JsProperty
	protected String color;

	@JsProperty
	protected Number weight;

	@JsProperty
	protected Number opacity;

	@JsProperty
	protected Boolean fill;

	@JsProperty
	protected String fillColor;

	@JsProperty
	protected Number fillOpacity;
	
	@JsProperty
	protected String fillRule;

	@JsProperty
	protected String dashArray;
	
	@JsProperty
	protected String lineCap;
	
	@JsProperty
	protected String lineJoin;

	@JsProperty
	protected Boolean clickable;

	@JsProperty
	protected String pointerEvents;
	
	@JsProperty
	protected String className;
	
	
	
	@JsOverlay public final Boolean getStroke() {
		return this.stroke;
	}



	@JsOverlay public final String getColor() {
		return this.color;
	}



	@JsOverlay public final Number getWeight() {
		return this.weight;
	}



	@JsOverlay public final Number getOpacity() {
		return this.opacity;
	}



	@JsOverlay public final Boolean getFill() {
		return this.fill;
	}



	@JsOverlay public final String getFillColor() {
		return this.fillColor;
	}



	@JsOverlay public final Number getFillOpacity() {
		return this.fillOpacity;
	}



	@JsOverlay public final String getFillRule() {
		return this.fillRule;
	}



	@JsOverlay public final String getDashArray() {
		return this.dashArray;
	}



	@JsOverlay public final String getLineCap() {
		return this.lineCap;
	}



	@JsOverlay public final String getLineJoin() {
		return this.lineJoin;
	}



	@JsOverlay public final Boolean getClickable() {
		return this.clickable;
	}



	@JsOverlay public final String getPointerEvents() {
		return this.pointerEvents;
	}



	@JsOverlay public final String getClassName() {
		return this.className;
	}



	public static class Builder {
		
		private Boolean stroke = true;

		
		private String color = "#03f";

		
		private Number weight = 5;

		
		private Number opacity = 0.5;

		
		private Boolean fill = true;

		
		private String fillColor = "#03f";

		
		private Number fillOpacity = 0.2;
		
		
		private String fillRule = "evenodd";

		
		private String dashArray = null;
		
		
		private String lineCap = null;
		
		
		private String lineJoin = null;

		
		private Boolean clickable = true;

		
		private String pointerEvents = null;
		
		
		private String className = "";

		public Builder() {

		}
		
	    public Builder stroke(Boolean stroke){this.stroke = stroke; return this;}

		
	    public Builder color(String color){this.color = color; return this;}

		
	    public Builder weight(Number weight){this.weight = weight; return this;}

		
	    public Builder opacity(Number opacity){this.opacity = opacity; return this;}

		
	    public Builder fill(Boolean fill){this.fill = fill; return this;}

		
	    public Builder fillColor(String fillColor){this.fillColor = fillColor; return this;}

		
	    public Builder fillOpacity(Number fillOpacity){this.fillOpacity = fillOpacity; return this;}
		
		
	    public Builder fillRule(String fillRule){this.fillRule = fillRule; return this;}

		
	    public Builder dashArray(String dashArray){this.dashArray = dashArray; return this;}
		
		
	    public Builder lineCap(String lineCap){this.lineCap = lineCap; return this;}
		
		
	    public Builder lineJoin(String lineJoin){this.lineJoin = lineJoin; return this;}

		
	    public Builder clickable(Boolean clickable){this.clickable = clickable; return this;}

		
	    public Builder pointerEvents(String pointerEvents){this.pointerEvents = pointerEvents; return this;}
		
		
	    public Builder className(String className){this.className = className; return this;}
		
	
		public PathOptions build(){
			PathOptions options = new PathOptions();
			options.stroke = this.stroke;
			options.color = this.color;
			options.weight = this.weight;
			options.fill = this.fill;
			options.fillColor = this.fillColor;
			options.fillOpacity = this.fillOpacity;
			options.fillRule = this.fillRule;
			options.dashArray = this.dashArray;
			options.lineCap = this.lineCap;
			options.lineJoin = this.lineJoin;
			options.clickable = this.clickable;
			options.pointerEvents = this.pointerEvents;
			options.className = this.className;
			
			return options;
			
			
		}

	}

}