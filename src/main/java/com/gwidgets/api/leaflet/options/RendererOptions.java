package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class RendererOptions {
	
	@JsProperty
	private double padding;
	
	@JsProperty
	private String pane;
	
	@JsProperty
	private String attribution;
	/**********************************************
	 *********************************************/

	private RendererOptions() {
		
	}

	@JsOverlay
	public final double getPadding() {
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
		
	
		private Double padding;
		
		private String pane;
		
		private String attribution;
		
		
		public Builder(){
			
					
		}
			
		public Builder padding(Double padding){
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
			if(this.padding != null)
			rendererOptions.padding = this.padding;
			if(this.pane != null)
			rendererOptions.pane = this.pane;
			if(this.attribution != null)
			rendererOptions.attribution = this.attribution;
			
			return rendererOptions;
		}	
	}
}