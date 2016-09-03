package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ImageOverlayOptions {
	
	private ImageOverlayOptions() {
		
	}

	@JsProperty
	private Number opacity = 1.0;
	
	@JsProperty
	private String attribution = "";
	
	public static class Builder {
		
		private Number opacity = 1.0;
		
		private String attribution = "";

		public Builder() {

		}
		
		public Builder opacity(Number opacity){
			this.opacity = opacity;
			return this;
		}
		
		public Builder attribution(String attribution){
			this.attribution = attribution;
			return this;
		}
		
		public ImageOverlayOptions build(){
			ImageOverlayOptions options = new ImageOverlayOptions();
			options.opacity = this.opacity;
			options.attribution = this.attribution;
		
			return options;
		}

	}

}