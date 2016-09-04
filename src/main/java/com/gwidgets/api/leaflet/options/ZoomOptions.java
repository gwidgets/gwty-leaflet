package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ZoomOptions {
	
	private ZoomOptions() {
		
	}

	@JsProperty
	private Boolean animate;
	
	
	@JsOverlay public final Boolean getAnimate() {
		return this.animate;
	}


	public static class Builder {
		
		
		private Boolean animate = true;

		public Builder() {

		}
		
		public Builder animate(Boolean animate){
			
			this.animate = animate;
			
			return this;
		}
		
		public ZoomOptions build(){
			ZoomOptions options = new ZoomOptions();
			options.animate = animate;
			
			return options;
		}

	}

}