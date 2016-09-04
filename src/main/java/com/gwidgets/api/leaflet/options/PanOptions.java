package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PanOptions {
	
	private PanOptions() {
		
	}

    @JsProperty
	private  Boolean animate;
	@JsProperty
	private  Number duration;
	@JsProperty
	private  Number easeLinearity;
	@JsProperty
	private  Boolean noMoveStart;
	
	
	@JsOverlay public final Boolean getAnimate() {
		return this.animate;
	}




	@JsOverlay public final Number getDuration() {
		return this.duration;
	}




	@JsOverlay public final Number getEaseLinearity() {
		return this.easeLinearity;
	}




	@JsOverlay public final Boolean getNoMoveStart() {
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