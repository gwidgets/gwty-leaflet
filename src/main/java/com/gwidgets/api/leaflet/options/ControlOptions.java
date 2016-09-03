package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlOptions {
	
	@JsProperty
	private String position = "topleft";
	
	
	private ControlOptions(){
		
		
	}

	
	public String getPosition() {
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