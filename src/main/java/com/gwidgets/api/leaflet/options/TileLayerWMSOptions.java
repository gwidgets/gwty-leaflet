package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.ICRS;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class TileLayerWMSOptions {

	private TileLayerWMSOptions() {
		
	}

	@JsProperty
	private String layers;

	@JsProperty
	private String styles;

	@JsProperty
	private String format;

	@JsProperty
	private Boolean transparent;

	@JsProperty
	private String version;

	@JsProperty
	private ICRS crs;

	@JsOverlay public final String getLayers() {
		return this.layers;
	}

	@JsOverlay public final String getStyles() {
		return this.styles;
	}

	@JsOverlay public final String getFormat() {
		return this.format;
	}

	@JsOverlay public final Boolean getTransparent() {
		return this.transparent;
	}

	@JsOverlay public final String getVersion() {
		return this.version;
	}

	@JsOverlay public final ICRS getCrs() {
		return this.crs;
	}

	public static class Builder {

		private String layers = "";

		private String styles = "";

		private String format = "image/jpeg";

		private Boolean transparent = false;

		private String version = "1.1.1";

		private ICRS crs = null;

		public Builder(String layers) {
                 this.layers = layers;
		}

		public Builder styles(String styles) {
			this.styles = styles;
			return this;
		}

		public Builder format(String format) {
			this.format = format;
			return this;
		}

		public Builder transparent(Boolean transparent) {
			this.transparent = transparent;
			return this;
		}

		public Builder version(String version) {
			this.version = version;
			return this;
		}

		public Builder crs(ICRS crs) {
			this.crs = crs;
			return this;
		}
		
		public TileLayerWMSOptions build(){
			TileLayerWMSOptions options = new TileLayerWMSOptions();
			options.layers = this.layers;
			options.styles = this.styles;
			options.format = this.format;
			options.transparent = this.transparent;
			options.version = this.version;
			options.crs = this.crs;
			
			return options;
			
		}
	}

}