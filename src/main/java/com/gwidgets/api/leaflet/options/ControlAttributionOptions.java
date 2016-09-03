package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlAttributionOptions {
	
	
	private ControlAttributionOptions(){
		
		
	}

	@JsProperty
	private String position = "bottomright";

	@JsProperty
	private String prefix = "Powered by Leaflet";
	
	public String getPosition() {
		return this.position;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public static class Builder{
		
		private String position = "bottomright";

		private String prefix = "Powered by Leaflet";
		
		public Builder(){
			
			
		}
		
		
		public Builder position(String position){
			this.position = position;
			return this;
		}
		
		public Builder prefix(String prefix){
			this.prefix = prefix;
			return this;
		}
		
		public ControlAttributionOptions build(){
			
			ControlAttributionOptions options = new ControlAttributionOptions();
			options.position = this.position;
			options.prefix = this.prefix;
			
			return options;
		}
		
	}

}