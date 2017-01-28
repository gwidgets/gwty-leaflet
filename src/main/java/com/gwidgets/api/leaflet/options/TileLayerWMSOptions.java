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
import com.gwidgets.api.leaflet.LatLngBounds;
import com.gwidgets.api.leaflet.options.TileLayerOptions.Builder;

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
	
	
	/******* Inherited options from TileLayer ****/ 
	
    @JsProperty
	private Number minZoom;


	@JsProperty
	private Number maxZoom;

	@JsProperty
	private Number maxNativeZoom;
	
	/*****************************************
	********************************************/
	@JsProperty
    private Number minNativeZoom;
	/**********************************************
	*********************************************/


	@JsProperty
	private String[] subdomains;

	@JsProperty
	private String errorTileUrl;


	@JsProperty
	private Boolean tms;


	@JsProperty
	private Number zoomOffset;

	@JsProperty
	private Boolean zoomReverse;


	@JsProperty
	private Boolean detectRetina;


	@JsProperty
    private Boolean crossOrigin;
	/**********************************************
	*********************************************/
	

	@JsProperty
	private Number tileSize;

	@JsProperty
	private String attribution;


	@JsProperty
	private Boolean noWrap;


	@JsProperty
	private Number opacity;

	@JsProperty
	private Number zIndex;

	@JsProperty
	private Boolean updateWhenIdle;
	
	/*****************************************
	********************************************/
	 @JsProperty
     private Boolean updateWhenZooming;
	/**********************************************
	*********************************************/
	 
	 /*****************************************
	********************************************/
	 @JsProperty
     private Boolean updateInterval;
	/**********************************************
	*********************************************/


	@JsProperty
	private LatLngBounds bounds;
	
	/*****************************************
	********************************************/
	
	/*****************************************
	********************************************/
	@JsProperty
    private String pane;
	/**********************************************
	*********************************************/
	
	/*****************************************
	********************************************/
	@JsProperty
    private String className;
	/**********************************************
	*********************************************/
	
	/*****************************************
	********************************************/
	@JsProperty
    private Number keepBuffer;
	/**********************************************
	*********************************************/

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

	@JsOverlay
	public final Number getMinZoom() {
		return this.minZoom;
	}

	@JsOverlay
	public final Number getMaxZoom() {
		return this.maxZoom;
	}

	@JsOverlay
	public final Number getMaxNativeZoom() {
		return this.maxNativeZoom;
	}

	@JsOverlay
	public final Number getMinNativeZoom() {
		return this.minNativeZoom;
	}

	@JsOverlay
	public final String[] getSubdomains() {
		return this.subdomains;
	}

	@JsOverlay
	public final String getErrorTileUrl() {
		return this.errorTileUrl;
	}
	
	@JsOverlay
	public final Boolean getTms() {
		return this.tms;
	}

	@JsOverlay
	public final Number getZoomOffset() {
		return this.zoomOffset;
	}

	@JsOverlay
	public final Boolean getZoomReverse() {
		return this.zoomReverse;
	}

	@JsOverlay
	public final Boolean getDetectRetina() {
		return this.detectRetina;
	}

	@JsOverlay
	public final Boolean getCrossOrigin() {
		return this.crossOrigin;
	}

	@JsOverlay
	public final Number getTileSize() {
		return this.tileSize;
	}

	@JsOverlay
	public final String getAttribution() {
		return this.attribution;
	}

	@JsOverlay
	public final Boolean getNoWrap() {
		return this.noWrap;
	}

	@JsOverlay
	public final Number getOpacity() {
		return this.opacity;
	}

	@JsOverlay
	public final Number getzIndex() {
		return this.zIndex;
	}

	@JsOverlay
	public final Boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	@JsOverlay
	public final Boolean getUpdateWhenZooming() {
		return this.updateWhenZooming;
	}

	@JsOverlay
	public final Boolean getUpdateInterval() {
		return this.updateInterval;
	}

	@JsOverlay
	public final LatLngBounds getBounds() {
		return this.bounds;
	}

	@JsOverlay
	public final String getPane() {
		return this.pane;
	}

	@JsOverlay
	public final String getClassName() {
		return this.className;
	}

	@JsOverlay
	public final Number getKeepBuffer() {
		return this.keepBuffer;
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
		
		private Number minZoom = 0;

		private Number maxZoom = 18;

		private Number maxNativeZoom = null;

		private Number tileSize = 256;

		private String[] subdomains = { "abc" };

		private String errorTileUrl = "";

		private String attribution = "";

		private Boolean tms = false;

		private Boolean noWrap = false;

		private Number zoomOffset = 0;

		private Boolean zoomReverse = false;

		private Number opacity = 1.0;

		private Number zIndex = null;

		private Boolean updateWhenIdle = false;

		private Boolean detectRetina = false;

		private LatLngBounds bounds = null;
		
	    private Boolean crossOrigin;
		
	    private String pane;
		
	    private String className;

	    private Number keepBuffer;

	    private Boolean updateWhenZooming;	 
		 
	    private Boolean updateInterval;

	    private Number minNativeZoom;


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
		 * Minimum zoom number.
		 * </br>
		 * default 0
		 * @param minZoom the min zoom
		 * @return the builder
		 */
		public Builder minZoom(Number minZoom) {
			this.minZoom = minZoom;
			return this;
		}

		/**
		 * Maximum zoom number.
		 * </br>
		 * default 18
		 * @param maxZoom the max zoom
		 * @return the builder
		 */
		public Builder maxZoom(Number maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		/**
		 * Maximum zoom number the tiles source has available. If it is specified, the tiles on all zoom levels higher than maxNativeZoom will be loaded from maxNativeZoom level and auto-scaled.
		 * </br>
		 * default null
		 * @param maxNativeZoom the max native zoom
		 * @return the builder
		 */
		public Builder maxNativeZoom(Number maxNativeZoom) {
			this.maxNativeZoom = maxNativeZoom;
			return this;
		}

		/**
		 * Tile size (width and height in pixels, assuming tiles are square).
		 * </br>
		 * default 256
		 * @param tileSize the tile size
		 * @return the builder
		 */
		public Builder tileSize(Number tileSize) {
			this.tileSize = tileSize;
			return this;
		}

		/**
		 * Subdomains of the tile service. Can be passed in the form of one string (where each letter is a subdomain name) or an array of strings.
		 * </br>
		 * default {"abc"}
		 * @param subdomains the subdomains
		 * @return the builder
		 */
		public Builder subdomains(String[] subdomains) {
			this.subdomains = subdomains;
			return this;
		}

		/**
		 * URL to the tile image to show in place of the tile that failed to load.
		 * </br>
		 * default ""
		 * @param errorTileUrl the error tile url
		 * @return the builder
		 */
		public Builder errorTileUrl(String errorTileUrl) {
			this.errorTileUrl = errorTileUrl;
			return this;
		}

		/**
		 * the string used by the attribution control, describes the layer data.
		 * </br>
		 * default ""
		 * @param attribution the attribution
		 * @return the builder
		 */
		public Builder attribution(String attribution) {
			this.attribution = attribution;
			return this;
		}

		/**
		 * If true, inverses Y axis numbering for tiles (turn this on for TMS services).
		 * </br>
		 * default true
		 * @param tms the tms
		 * @return the builder
		 */
		public Builder tms(Boolean tms) {
			this.tms = tms;
			return this;
		}


		/**
		 * If set to true, the tiles just won't load outside the world width (-180 to 180 longitude) instead of repeating.
		 * default false
		 * @param noWrap the no wrap
		 * @return the builder
		 */
		public Builder noWrap(Boolean noWrap) {
			this.noWrap = noWrap;
			return this;
		}

		/**
		 * The zoom number used in tile URLs will be offset with this value.
		 * </br>
		 * default 0
		 * @param zoomOffset the zoom offset
		 * @return the builder
		 */
		public Builder zoomOffset(Number zoomOffset) {
			this.zoomOffset = zoomOffset;
			return this;
		}

		/**
		 * If set to true, the zoom number used in tile URLs will be reversed (maxZoom - zoom instead of zoom).
		 * </br>
		 * default false
		 * @param zoomReverse the zoom reverse
		 * @return the builder
		 */
		public Builder zoomReverse(Boolean zoomReverse) {
			this.zoomReverse = zoomReverse;
			return this;
		}

		/**
		 * The opacity of the tile layer.
		 * </br>
		 * default 1.0
		 * @param opacity the opacity
		 * @return the builder
		 */
		public Builder opacity(Number opacity) {
			this.opacity = opacity;
			return this;
		}

		/**
		 * The explicit zIndex of the tile layer. Not set by default.
		 * </br>
		 * default null
		 * @param zIndex the z index
		 * @return the builder
		 */
		public Builder zIndex(Number zIndex) {
			this.zIndex = zIndex;
			return this;
		}


		/**
		 * If false, new tiles are loaded during panning, otherwise only after it (for better performance). true by default on mobile WebKit, otherwise false.
		 * </br>
		 * default true
		 * @param updateWhenIdle the update when idle
		 * @return the builder
		 */
		public Builder updateWhenIdle(Boolean updateWhenIdle) {
			this.updateWhenIdle = updateWhenIdle;
			return this;
		}

		/**
		 * If true and user is on a retina display, it will request four tiles of half the specified size and a bigger zoom level in place of one to utilize the high resolution.
		 * </br>
		 * default false
		 * @param detectRetina the detect retina
		 * @return the builder
		 */
		public Builder detectRetina(Boolean detectRetina) {
			this.detectRetina = detectRetina;
			return this;
		}


		/**
		 * When this option is set, the TileLayer only loads tiles that are in the given geographical bounds.
		 * </br>
		 * default null
		 * @param bounds the bounds
		 * @return the builder
		 */
		public Builder bounds(LatLngBounds bounds) {
			this.bounds = bounds;
			return this;
		}
		
		public Builder crossOrigin(Boolean crossOrigin){this.crossOrigin = crossOrigin; return this;}

	    public Builder keepBuffer(Number keepBuffer){this.keepBuffer = keepBuffer; return this;}

	    public Builder className(String className){this.className = className; return this;}

	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder updateWhenZooming(Boolean updateWhenZooming){this.updateWhenZooming = updateWhenZooming; return this;}

	    public Builder updateInterval(Boolean updateInterval){this.updateInterval = updateInterval; return this;}

	    public Builder minNativeZoom(Number minNativeZoom){this.minNativeZoom = minNativeZoom; return this;}

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
			options.minZoom = this.minZoom;
			options.maxZoom = this.maxZoom;
			options.maxNativeZoom = this.maxNativeZoom;
			options.tileSize = this.tileSize;
			options.subdomains = this.subdomains;
			options.errorTileUrl = this.errorTileUrl;
			options.attribution = this.attribution;
			options.tms = this.tms;
			options.noWrap = this.noWrap;
			options.zoomOffset = this.zoomOffset;
			options.zoomReverse = this.zoomReverse;
			options.opacity = this.opacity;
			options.zIndex = this.zIndex;
			options.updateWhenIdle = this.updateWhenIdle;
			options.detectRetina = this.detectRetina;
			options.bounds = this.bounds;
			options.crossOrigin = this.crossOrigin;
			options.pane = this.pane;
			options.className = this.className;
			options.keepBuffer = this.keepBuffer;
			options.updateWhenZooming = this.updateWhenZooming;	 
			options.updateInterval = this.updateInterval;
			options.minNativeZoom = this.minNativeZoom;

			return options;

		}
	}

}