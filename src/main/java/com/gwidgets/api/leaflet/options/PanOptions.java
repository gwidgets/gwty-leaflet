package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class PanOptions {
	
	private PanOptions() {
		
	}

    @JsProperty
	private  Boolean animate = true;
	@JsProperty
	private  Number duration = 0.25;
	@JsProperty
	private  Number easeLinearity = 0.25;
	@JsProperty
	private  Boolean noMoveStart = false;
	
	
	public Boolean getAnimate() {
		return this.animate;
	}




	public Number getDuration() {
		return this.duration;
	}




	public Number getEaseLinearity() {
		return this.easeLinearity;
	}




	public Boolean getNoMoveStart() {
		return this.noMoveStart;
	}




	public static class Builder {
		
		private  Boolean animate = true;
		 
		private  Number duration = 0.25;
		 
		private  Number easeLinearity = 0.25;
		 
		private  Boolean noMoveStart = false;

		public Builder() {

		}
		
		public  Builder animate(Boolean animate){this.animate = animate; return this;}
		 
		public  Builder duration(Number duration){this.duration = duration; return this;}
		 
		public  Builder easeLinearity(Number easeLinearity){this.easeLinearity = easeLinearity; return this;}
		 
		public  Builder noMoveStart(Boolean noMoveStart){this.noMoveStart = noMoveStart; return this;}
		
		
		public PanOptions build(){
			PanOptions options = new PanOptions();
			options.animate = this.animate;
			options.duration = this.duration;
			options.easeLinearity = this.easeLinearity;
			options.noMoveStart = this.noMoveStart;
			
			return options;
		}

	}

}