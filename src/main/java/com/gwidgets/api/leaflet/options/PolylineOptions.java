package com.gwidgets.api.leaflet.options;


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PolylineOptions extends PathOptions{
	
	private PolylineOptions() {
		
	}

	@JsProperty
	private Number smoothFactor = 1.0;

	@JsProperty
	private Boolean noClip = false;
	
	
	
	
	public Number getSmoothFactor() {
		return this.smoothFactor;
	}




	public Boolean getNoClip() {
		return this.noClip;
	}

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
		
		
		private Number smoothFactor = 1.0;

		
		private Boolean noClip = false;

		public Builder() {

		}
		
		private Builder smoothFactor(Number smoothFactor){this.smoothFactor = smoothFactor; return this;}

		
		private Builder noClip(Boolean noClip){this.noClip = noClip; return this;}
		
		
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
		
	
		public PolylineOptions build(){
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
			options.clickable = this.clickable;
			options.pointerEvents = this.pointerEvents;
			options.className = this.className;
			
			return options;
		}
		
	}

}