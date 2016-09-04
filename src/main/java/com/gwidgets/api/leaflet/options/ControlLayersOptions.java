package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ControlLayersOptions {
	
	private ControlLayersOptions(){
		
		
	}

	@JsProperty
	private String position;

	@JsProperty
	private Boolean collapsed;

	@JsProperty
	private Boolean autoZIndex;
	
	
	@JsOverlay public final String getPosition() {
		return this.position;
	}


	@JsOverlay public final Boolean getCollapsed() {
		return this.collapsed;
	}


	@JsOverlay public final Boolean getAutoZIndex() {
		return this.autoZIndex;
	}


	public static class Builder {
		
		private String position = "topright";

		private Boolean collapsed = true;

		private Boolean autoZIndex = true;
		
		public Builder(){
			
			
		}
		
		public Builder position(String position){this.position = position;return this;} 

		public Builder collapsed(Boolean collapsed){this.collapsed = collapsed; return this;} 

		public Builder autoZIndex(Boolean autoZIndex){this.autoZIndex = autoZIndex; return this;} 
		
		
		public ControlLayersOptions build(){
			
			ControlLayersOptions options = new ControlLayersOptions();
			options.position = this.position;
			options.collapsed = this.collapsed;
			options.autoZIndex = this.autoZIndex;
			
			return options;
			
		}
		
	}
	

}