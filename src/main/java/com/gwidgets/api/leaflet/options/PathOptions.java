package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PathOptions {

	@JsProperty
	protected Boolean stroke = true;

	@JsProperty
	protected String color = "#03f";

	@JsProperty
	protected Number weight = 5;

	@JsProperty
	protected Number opacity = 0.5;

	@JsProperty
	protected Boolean fill = true;

	@JsProperty
	protected String fillColor = "#03f";

	@JsProperty
	protected Number fillOpacity = 0.2;
	
	@JsProperty
	protected String fillRule = "evenodd";

	@JsProperty
	protected String dashArray = null;
	
	@JsProperty
	protected String lineCap = null;
	
	@JsProperty
	protected String lineJoin = null;

	@JsProperty
	protected Boolean clickable = true;

	@JsProperty
	protected String pointerEvents = null;
	
	@JsProperty
	protected String className = "";
	
	
	
	public Boolean getStroke() {
		return this.stroke;
	}



	public String getColor() {
		return this.color;
	}



	public Number getWeight() {
		return this.weight;
	}



	public Number getOpacity() {
		return this.opacity;
	}



	public Boolean getFill() {
		return this.fill;
	}



	public String getFillColor() {
		return this.fillColor;
	}



	public Number getFillOpacity() {
		return this.fillOpacity;
	}



	public String getFillRule() {
		return this.fillRule;
	}



	public String getDashArray() {
		return this.dashArray;
	}



	public String getLineCap() {
		return this.lineCap;
	}



	public String getLineJoin() {
		return this.lineJoin;
	}



	public Boolean getClickable() {
		return this.clickable;
	}



	public String getPointerEvents() {
		return this.pointerEvents;
	}



	public String getClassName() {
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