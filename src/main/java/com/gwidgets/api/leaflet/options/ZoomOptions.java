package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ZoomOptions {
	
	private ZoomOptions() {
		
	}

	@JsProperty
	private Boolean animate = true;
	
	
	public Boolean getAnimate() {
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