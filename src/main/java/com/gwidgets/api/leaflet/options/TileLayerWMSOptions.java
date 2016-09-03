package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.ICRS;

@JsType
public class TileLayerWMSOptions {

	private TileLayerWMSOptions(String layers) {
		this.layers = layers;
	}

	@JsProperty
	private String layers = "";

	@JsProperty
	private String styles = "";

	@JsProperty
	private String format = "image/jpeg";

	@JsProperty
	private Boolean transparent = false;

	@JsProperty
	private String version = "1.1.1";

	@JsProperty
	private ICRS crs = null;

	public String getLayers() {
		return this.layers;
	}

	public String getStyles() {
		return this.styles;
	}

	public String getFormat() {
		return this.format;
	}

	public Boolean getTransparent() {
		return this.transparent;
	}

	public String getVersion() {
		return this.version;
	}

	public ICRS getCrs() {
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
			TileLayerWMSOptions options = new TileLayerWMSOptions(layers);
			options.styles = this.styles;
			options.format = this.format;
			options.transparent = this.transparent;
			options.version = this.version;
			options.crs = this.crs;
			
			return options;
			
		}
	}

}