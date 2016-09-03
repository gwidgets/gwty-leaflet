package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlZoomOptions {
	
	
	private ControlZoomOptions() {
		
	}

	@JsProperty
	private String position = "topleft";
	
	
	public String getPosition() {
		return this.position;
	}


	public static class Builder {
		
		@JsProperty
		String position = "topleft";

		public Builder() {

		}
		
		public Builder position(String position){
			
			this.position = position;
			return this;
		}
		
		
		public ControlZoomOptions build(){
			ControlZoomOptions options = new ControlZoomOptions();
			options.position = this.position;
			return options;
			
		}

	}

}