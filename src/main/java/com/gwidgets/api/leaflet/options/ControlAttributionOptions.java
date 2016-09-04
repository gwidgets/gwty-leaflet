package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ControlAttributionOptions {
	
	
	private ControlAttributionOptions(){
		
		
	}

	@JsProperty
	private String position;

	@JsProperty
	private String prefix;
	
	@JsOverlay public final String getPosition() {
		return this.position;
	}

	@JsOverlay public final String getPrefix() {
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