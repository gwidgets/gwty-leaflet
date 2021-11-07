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

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.CRS;
import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Class TileLayerWMSOptions.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class TileLayerWMSOptions {

	public TileLayerWMSOptions() {

	}

	@JsProperty
	private String layers;

	@JsProperty
	private String styles;

	@JsProperty
	private String format;

	@JsProperty
	private boolean transparent;

	@JsProperty
	private String version;

	@JsProperty
	private CRS crs;
	
	
	/******* Inherited options from TileLayer ****/ 
	
    @JsProperty
	private double minZoom;


	@JsProperty
	private double maxZoom;

	@JsProperty
	private double maxNativeZoom;
	
	/*****************************************
	********************************************/
	@JsProperty
    private double minNativeZoom;
	/**********************************************
	*********************************************/


	@JsProperty
	private String[] subdomains;

	@JsProperty
	private String errorTileUrl;


	@JsProperty
	private boolean tms;


	@JsProperty
	private double zoomOffset;

	@JsProperty
	private boolean zoomReverse;


	@JsProperty
	private boolean detectRetina;


	@JsProperty
    private boolean crossOrigin;
	/**********************************************
	*********************************************/
	

	@JsProperty
	private double tileSize;

	@JsProperty
	private String attribution;


	@JsProperty
	private boolean noWrap;


	@JsProperty
	private double opacity;

	@JsProperty
	private double zIndex;

	@JsProperty
	private boolean updateWhenIdle;
	
	/*****************************************
	********************************************/
	 @JsProperty
     private boolean updateWhenZooming;
	/**********************************************
	*********************************************/
	 
	 /*****************************************
	********************************************/
	 @JsProperty
     private boolean updateInterval;
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
    private double keepBuffer;
	/**********************************************
	*********************************************/

	/**
	 * Gets the Comma-separated WMS layers.
	 * 
	 * @return the layers
	 */
	@JsOverlay
	public final String getLayers() {
		return this.layers;
	}

	/**
	 * Gets the Comma-separated list of WMS styles.
	 * 
	 * @return the styles
	 */
	@JsOverlay
	public final String getStyles() {
		return this.styles;
	}

	/**
	 * Gets the WMS image format.
	 * default 'image/jpeg'
	 * 
	 * @return the format
	 */
	@JsOverlay
	public final String getFormat() {
		return this.format;
	}

	/**
	 * Gets whether the WMS service will return images with transparency.
	 * default false
	 * 
	 * @return the transparent
	 */
	@JsOverlay
	public final boolean getTransparent() {
		return this.transparent;
	}

	/**
	 * Gets of the WMS service to use.
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
	 *
	 * 
	 * @return the crs
	 */
	@JsOverlay
	public final CRS getCrs() {
		return this.crs;
	}

	@JsOverlay
	public final double getMinZoom() {
		return this.minZoom;
	}

	@JsOverlay
	public final double getMaxZoom() {
		return this.maxZoom;
	}

	@JsOverlay
	public final double getMaxNativeZoom() {
		return this.maxNativeZoom;
	}

	@JsOverlay
	public final double getMinNativeZoom() {
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
	public final boolean getTms() {
		return this.tms;
	}

	@JsOverlay
	public final double getZoomOffset() {
		return this.zoomOffset;
	}

	@JsOverlay
	public final boolean getZoomReverse() {
		return this.zoomReverse;
	}

	@JsOverlay
	public final boolean getDetectRetina() {
		return this.detectRetina;
	}

	@JsOverlay
	public final boolean getCrossOrigin() {
		return this.crossOrigin;
	}

	@JsOverlay
	public final double getTileSize() {
		return this.tileSize;
	}

	@JsOverlay
	public final String getAttribution() {
		return this.attribution;
	}

	@JsOverlay
	public final boolean getNoWrap() {
		return this.noWrap;
	}

	@JsOverlay
	public final double getOpacity() {
		return this.opacity;
	}

	@JsOverlay
	public final double getzIndex() {
		return this.zIndex;
	}

	@JsOverlay
	public final boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	@JsOverlay
	public final boolean getUpdateWhenZooming() {
		return this.updateWhenZooming;
	}

	@JsOverlay
	public final boolean getUpdateInterval() {
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
	public final double getKeepBuffer() {
		return this.keepBuffer;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private String layers;

		private String styles;

		private String format;

		private Boolean transparent;

		private String version;

		private CRS crs;
		
		private Double minZoom;

		private Double maxZoom;

		private Double maxNativeZoom;

		private Double tileSize;

		private String[] subdomains;

		private String errorTileUrl;

		private String attribution;

		private Boolean tms;

		private Boolean noWrap;

		private Double zoomOffset;

		private Boolean zoomReverse;

		private Double opacity;

		private Double zIndex;

		private Boolean updateWhenIdle;

		private Boolean detectRetina;

		private LatLngBounds bounds;
		
	    private Boolean crossOrigin;
		
	    private String pane;
		
	    private String className;

	    private Double keepBuffer;

	    private Boolean updateWhenZooming;	 
		 
	    private Boolean updateInterval;

	    private Double minNativeZoom;


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
		 * Comma-separated list of WMS styles.
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
		 *
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
		 * If true, the WMS service will return images with transparency.
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
		 * Version of the WMS service to use.
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
		 * map CRS. Don't change this if you're not sure what it means.
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
		 *
		 * default 0
		 * @param minZoom the min zoom
		 * @return the builder
		 */
		public Builder minZoom(Double minZoom) {
			this.minZoom = minZoom;
			return this;
		}

		/**
		 * Maximum zoom number.
		 *
		 * default 18
		 * @param maxZoom the max zoom
		 * @return the builder
		 */
		public Builder maxZoom(Double maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		/**
		 * Maximum zoom number the tiles source has available. If it is specified, the tiles on all zoom levels higher than maxNativeZoom will be loaded from maxNativeZoom level and auto-scaled.
		 *
		 * default null
		 * @param maxNativeZoom the max native zoom
		 * @return the builder
		 */
		public Builder maxNativeZoom(Double maxNativeZoom) {
			this.maxNativeZoom = maxNativeZoom;
			return this;
		}

		/**
		 * Tile size (width and height in pixels, assuming tiles are square).
		 *
		 * default 256
		 * @param tileSize the tile size
		 * @return the builder
		 */
		public Builder tileSize(Double tileSize) {
			this.tileSize = tileSize;
			return this;
		}

		/**
		 * Subdomains of the tile service. Can be passed in the form of one string (where each letter is a subdomain name) or an array of strings.
		 *
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
		 *
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
		 *
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
		 *
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
		 *
		 * default 0
		 * @param zoomOffset the zoom offset
		 * @return the builder
		 */
		public Builder zoomOffset(Double zoomOffset) {
			this.zoomOffset = zoomOffset;
			return this;
		}

		/**
		 * If set to true, the zoom number used in tile URLs will be reversed (maxZoom - zoom instead of zoom).
		 *
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
		 *
		 * default 1.0
		 * @param opacity the opacity
		 * @return the builder
		 */
		public Builder opacity(Double opacity) {
			this.opacity = opacity;
			return this;
		}

		/**
		 * The explicit zIndex of the tile layer. Not set by default.
		 *
		 * default null
		 * @param zIndex the z index
		 * @return the builder
		 */
		public Builder zIndex(Double zIndex) {
			this.zIndex = zIndex;
			return this;
		}


		/**
		 * If false, new tiles are loaded during panning, otherwise only after it (for better performance). true by default on mobile WebKit, otherwise false.
		 *
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
		 *
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
		 *
		 * default null
		 * @param bounds the bounds
		 * @return the builder
		 */
		public Builder bounds(LatLngBounds bounds) {
			this.bounds = bounds;
			return this;
		}
		
		public Builder crossOrigin(Boolean crossOrigin){this.crossOrigin = crossOrigin; return this;}

	    public Builder keepBuffer(Double keepBuffer){this.keepBuffer = keepBuffer; return this;}

	    public Builder className(String className){this.className = className; return this;}

	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder updateWhenZooming(Boolean updateWhenZooming){this.updateWhenZooming = updateWhenZooming; return this;}

	    public Builder updateInterval(Boolean updateInterval){this.updateInterval = updateInterval; return this;}

	    public Builder minNativeZoom(Double minNativeZoom){this.minNativeZoom = minNativeZoom; return this;}

		/**
		 * Builds the TileLayerWMSOptions new instance
		 *
		 * @return the tile layer WMS options
		 */
		public TileLayerWMSOptions build() {
			TileLayerWMSOptions options = new TileLayerWMSOptions();
			if(this.layers != null)
			options.layers = this.layers;
			if(this.styles != null)
			options.styles = this.styles;
			if(this.format != null)
			options.format = this.format;
			if(this.transparent != null)
			options.transparent = this.transparent;
			if(this.version != null)
			options.version = this.version;
			if(this.crs != null)
			options.crs = this.crs;
			if(this.minZoom != null)
			options.minZoom = this.minZoom;
			if(this.maxZoom != null)
			options.maxZoom = this.maxZoom;
			if(this.maxNativeZoom != null)
			options.maxNativeZoom = this.maxNativeZoom;
			if(this.tileSize != null)
			options.tileSize = this.tileSize;
			if(this.subdomains != null)
			options.subdomains = this.subdomains;
			if(this.errorTileUrl != null)
			options.errorTileUrl = this.errorTileUrl;
			if(this.attribution != null)
			options.attribution = this.attribution;
			if(this.tms != null)
			options.tms = this.tms;
			if(this.noWrap != null)
			options.noWrap = this.noWrap;
			if(this.zoomOffset != null)
			options.zoomOffset = this.zoomOffset;
			if(this.zoomReverse != null)
			options.zoomReverse = this.zoomReverse;
			if(this.opacity != null)
			options.opacity = this.opacity;
			if(this.zIndex != null)
			options.zIndex = this.zIndex;
			if(this.updateWhenIdle != null)
			options.updateWhenIdle = this.updateWhenIdle;
			if(this.detectRetina != null)
			options.detectRetina = this.detectRetina;
			if(this.bounds != null)
			options.bounds = this.bounds;
			if(this.crossOrigin != null)
			options.crossOrigin = this.crossOrigin;
			if(this.pane != null)
			options.pane = this.pane;
			if(this.className != null)
			options.className = this.className;
			if(this.keepBuffer != null)
			options.keepBuffer = this.keepBuffer;
			if(this.updateWhenZooming != null)
			options.updateWhenZooming = this.updateWhenZooming;
			if(this.updateInterval != null)
			options.updateInterval = this.updateInterval;
			if(this.minNativeZoom != null)
			options.minNativeZoom = this.minNativeZoom;

			return options;
		}
	}
}