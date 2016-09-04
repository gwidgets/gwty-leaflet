package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ControlOptions {
	
	@JsProperty
	private String position;
	
	
	private ControlOptions(){
		
		
	}

	
	@JsOverlay public final String getPosition() {
		return this.position;
	}


	public static class Builder {
		
	
		private String position = "topleft";

		public Builder() {

		}
		
		public Builder position(String position){
			this.position = position;
			return this;
		}
		
		
		public ControlOptions build(){
			ControlOptions options = new ControlOptions();
			options.position = position;
			
			return options;
			
		}

	}


	

}