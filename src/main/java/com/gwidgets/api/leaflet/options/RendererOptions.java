package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.options.PopupOptions.Builder;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class RendererOptions {
	
	@JsProperty
	private Number padding;
	
	@JsProperty
	private String pane;
	
	@JsProperty
	private String attribution;
	/**********************************************
	 *********************************************/

	private RendererOptions() {
		
	}

	@JsOverlay
	public final Number getPadding() {
		return this.padding;
	}

	@JsOverlay
	public final String getPane() {
		return this.pane;
	}
	
	@JsOverlay 
	public final String getAttribution() {
		return this.attribution;
	}
	
	
	public static class Builder{
		
	
		private Number padding = 0.1;
		
		private String pane = "overlayPane";
		
		private String attribution;
		
		
		public Builder(){
			
			
			
		}
		
		
		public Builder padding(Number padding){
			this.padding = padding;
			return this;
		}
		
		public Builder pane(String pane){
			this.pane = pane;
			return this;
		}
		
		 public Builder attribution(String attribution){this.attribution = attribution; return this;}
		
		public RendererOptions build(){
			RendererOptions rendererOptions = new RendererOptions();
			rendererOptions.padding = this.padding;
			rendererOptions.pane = this.pane;
			rendererOptions.attribution = this.attribution;
			
			return rendererOptions;
		}
		
	}
	
	
	
	

}
