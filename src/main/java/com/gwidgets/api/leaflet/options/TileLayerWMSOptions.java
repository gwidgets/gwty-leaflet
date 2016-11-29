/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.CRS;

/**
 * The Class TileLayerWMSOptions.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
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
	private CRS crs;

	/**
	 * Gets the Comma-separated WMS layers. </br>
	 * 
	 * @return the layers
	 */
	@JsOverlay
	public final String getLayers() {
		return this.layers;
	}

	/**
	 * Gets the Comma-separated list of WMS styles. </br>
	 * 
	 * @return the styles
	 */
	@JsOverlay
	public final String getStyles() {
		return this.styles;
	}

	/**
	 * Gets the WMS image format. </br>
	 * default 'image/jpeg'
	 * 
	 * @return the format
	 */
	@JsOverlay
	public final String getFormat() {
		return this.format;
	}

	/**
	 * Gets whether the WMS service will return images with transparency. </br>
	 * default false
	 * 
	 * @return the transparent
	 */
	@JsOverlay
	public final Boolean getTransparent() {
		return this.transparent;
	}

	/**
	 * Gets of the WMS service to use. </br>
	 * default '1.1.1'
	 * 
	 * @return the version
	 */
	@JsOverlay
	public final String getVersion() {
		return this.version;
	}

	/**
	 * Gets the Coordinate Reference System to use for the WMS requests,
	 * defaults to map CRS. Don't change this if you're not sure what it means.
	 * </br>
	 * 
	 * @return the crs
	 */
	@JsOverlay
	public final CRS getCrs() {
		return this.crs;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private String layers;

		private String styles = "";

		private String format = "image/jpeg";

		private Boolean transparent = false;

		private String version = "1.1.1";

		private CRS crs = null;

		/**
		 * Instantiates a new builder.
		 *
		 * @param layers
		 *            Comma-separated list of WMS layers to show.
		 */
		public Builder(String layers) {
			this.layers = layers;
		}

		/**
		 * Comma-separated list of WMS styles. </br>
		 * 
		 * @param styles
		 *            the styles
		 * @return the builder
		 */
		public Builder styles(String styles) {
			this.styles = styles;
			return this;
		}

		/**
		 * WMS image format (use 'image/png' for layers with transparency).
		 * </br>
		 * default 'image/jpeg'
		 * 
		 * @param format
		 *            the format
		 * @return the builder
		 */
		public Builder format(String format) {
			this.format = format;
			return this;
		}

		/**
		 * If true, the WMS service will return images with transparency. </br>
		 * default false
		 * 
		 * @param transparent
		 *            the transparent
		 * @return the builder
		 */
		public Builder transparent(Boolean transparent) {
			this.transparent = transparent;
			return this;
		}

		/**
		 * Version of the WMS service to use. </br>
		 * default "1.1.1"
		 * 
		 * @param version
		 *            the version
		 * @return the builder
		 */
		public Builder version(String version) {
			this.version = version;
			return this;
		}

		/**
		 * Coordinate Reference System to use for the WMS requests, defaults to
		 * map CRS. Don't change this if you're not sure what it means. </br>
		 * 
		 * @param crs
		 *            the crs
		 * @return the builder
		 */
		public Builder crs(CRS crs) {
			this.crs = crs;
			return this;
		}

		/**
		 * Builds the TileLayerWMSOptions new instance
		 *
		 * @return the tile layer WMS options
		 */
		public TileLayerWMSOptions build() {
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