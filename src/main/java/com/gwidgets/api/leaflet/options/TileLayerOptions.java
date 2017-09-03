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

import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Class TileLayerOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class TileLayerOptions {

	
	public TileLayerOptions() {

	}

	
	@JsProperty
	private int minZoom;


	@JsProperty
	private int maxZoom;

	@JsProperty
	private double maxNativeZoom;
	
	/*****************************************
	********************************************/
	@JsProperty
    private double minNativeZoom;
	/**********************************************
	*********************************************/

	@JsProperty
	private int tileSize;

	@JsProperty
	private String[] subdomains;

	@JsProperty
	private String errorTileUrl;

	@JsProperty
	private String attribution;

	@JsProperty
	private boolean tms;


	@JsProperty
	private boolean noWrap;

	@JsProperty
	private int zoomOffset;

	@JsProperty
	private boolean zoomReverse;

	@JsProperty
	private double opacity;

	@JsProperty
	private int zIndex;

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
	private boolean detectRetina;


	@JsProperty
	private LatLngBounds bounds;
	
	/*****************************************
	********************************************/
	@JsProperty
    private boolean crossOrigin;
	/**********************************************
	*********************************************/
	
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
    private int keepBuffer;
	/**********************************************
	*********************************************/
	

	/**
	 * Gets the min zoom.
	 * </br>
	 * default 0
	 * @return the min zoom
	 */
	@JsOverlay public final int getMinZoom() {
		return this.minZoom;
	}

	/**
	 * Gets the max zoom.
	 * </br>
	 * default 18
	 * @return the max zoom
	 */
	@JsOverlay public final int getMaxZoom() {
		return this.maxZoom;
	}

	/**
	 * Gets the Maximum zoom number the tiles source has available. If it is specified, the tiles on all zoom levels higher than maxNativeZoom will be loaded from maxNativeZoom level and auto-scaled.
	 * </br>
	 * default null
	 * @return the max native zoom
	 */
	@JsOverlay public final double getMaxNativeZoom() {
		return this.maxNativeZoom;
	}

	/**
	 * Gets the Tile size (width and height in pixels, assuming tiles are square).
	 * </br>
	 * default 256
	 * @return the tile size
	 */
	@JsOverlay public final int getTileSize() {
		return this.tileSize;
	}

	/**
	 * Gets the Subdomains of the tile service. Can be passed in the form of one string (where each letter is a subdomain name) or an array of strings.
	 * </br>
	 * default 'abc'
	 * @return the subdomains
	 */
	@JsOverlay public final String[] getSubdomains() {
		return this.subdomains;
	}

	/**
	 * Gets the URL to the tile image to show in place of the tile that failed to load.
	 * </br>
	 * default ""
	 * @return the error tile url
	 */
	@JsOverlay public final String getErrorTileUrl() {
		return this.errorTileUrl;
	}

	/**
	 * Gets the string used by the attribution control, describes the layer data.
	 * </br>
	 * default ""
	 * @return the attribution
	 */
	@JsOverlay public final String getAttribution() {
		return this.attribution;
	}

	/**
	 * Gets whether If true, inverses Y axis numbering for tiles (turn this on for TMS services).
	 * </br>
	 * default false
	 * @return the tms
	 */
	@JsOverlay public final boolean getTms() {
		return this.tms;
	}


	/**
	 * Gets whether the tiles just won't load outside the world width (-180 to 180 longitude) instead of repeating.
	 * </br>
	 * default false
	 * @return the no wrap
	 */
	@JsOverlay public final boolean getNoWrap() {
		return this.noWrap;
	}

	/**
	 * Gets The zoom number used in tile URLs will be offset with this value.
	 * </br>
	 * default 0
	 * @return the zoom offset
	 */
	@JsOverlay public final int getZoomOffset() {
		return this.zoomOffset;
	}

	/**
	 * Gets the zoom number used in tile URLs will be reversed (maxZoom - zoom instead of zoom).
	 * </br>
	 * default false
	 * @return the zoom reverse
	 */
	@JsOverlay public final boolean getZoomReverse() {
		return this.zoomReverse;
	}

	/**
	 * Gets the opacity of the tile layer. 
	 * </br>
	 * default 1.0
	 * @return the opacity
	 */
	@JsOverlay public final double getOpacity() {
		return this.opacity;
	}

	/**
	 * Gets The explicit zIndex of the tile layer. Not set by default.
	 * </br>
	 * default null
	 * @return the z index
	 */
	@JsOverlay public final int getzIndex() {
		return this.zIndex;
	}


	/**
	 * Gets whether the new tiles are loaded during panning, otherwise only after it (for better performance). true by default on mobile WebKit, otherwise false.
	 * </br>
	 * default true
	 * @return the update when idle
	 */
	@JsOverlay public final boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	/**
	 * Gets the detect retina option is set
	 * </br>
	 * default false
	 * @return the detect retina
	 */
	@JsOverlay public final boolean getDetectRetina() {
		return this.detectRetina;
	}


	/**
	 * Gets whether the TileLayer only loads tiles that are in the given geographical bounds.
	 * </br>
	 * default null
	 * @return the bounds
	 */
	@JsOverlay public final LatLngBounds getBounds() {
		return this.bounds;
	}


	
	@JsOverlay public final double getMinNativeZoom() {
		return this.minNativeZoom;
	}



	@JsOverlay public final boolean getUpdateWhenZooming() {
		return this.updateWhenZooming;
	}



	@JsOverlay public final boolean getUpdateInterval() {
		return this.updateInterval;
	}



	@JsOverlay public final boolean getCrossOrigin() {
		return this.crossOrigin;
	}



	@JsOverlay public final String getPane() {
		return this.pane;
	}



	@JsOverlay public final String getClassName() {
		return this.className;
	}



	@JsOverlay public final int getKeepBuffer() {
		return this.keepBuffer;
	}



	public static class Builder {

		private Integer minZoom;

		private Integer maxZoom;

		private Double maxNativeZoom;

		private Integer tileSize;

		private String[] subdomains;

		private String errorTileUrl;

		private String attribution;

		private Boolean tms;

		private Boolean noWrap;

		private Integer zoomOffset;

		private Boolean zoomReverse;

		private Double opacity;

		private Integer zIndex;

		private Boolean updateWhenIdle;

		private Boolean detectRetina;

		private LatLngBounds bounds;
		
	    private Boolean crossOrigin;
		
	    private String pane;
		
	    private String className;

	    private Integer keepBuffer;

	    private Boolean updateWhenZooming;	 
		 
	    private Boolean updateInterval;

	    private Double minNativeZoom;


		public Builder() {

		}

		/**
		 * Minimum zoom number.
		 * </br>
		 * default 0
		 * @param minZoom the min zoom
		 * @return the builder
		 */
		public Builder minZoom(Integer minZoom) {
			this.minZoom = minZoom;
			return this;
		}

		/**
		 * Maximum zoom double.
		 * </br>
		 * default 18
		 * @param maxZoom the max zoom
		 * @return the builder
		 */
		public Builder maxZoom(Integer maxZoom) {
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
		public Builder maxNativeZoom(Double maxNativeZoom) {
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
		public Builder tileSize(Integer tileSize) {
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
		 *the string used by the attribution control, describes the layer data.
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
		public Builder zoomOffset(Integer zoomOffset) {
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
		public Builder opacity(Double opacity) {
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
		public Builder zIndex(Integer zIndex) {
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

	    public Builder keepBuffer(Integer keepBuffer){this.keepBuffer = keepBuffer; return this;}

	    public Builder className(String className){this.className = className; return this;}

	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder updateWhenZooming(Boolean updateWhenZooming){this.updateWhenZooming = updateWhenZooming; return this;}

	    public Builder updateInterval(Boolean updateInterval){this.updateInterval = updateInterval; return this;}

	    public Builder minNativeZoom(Double minNativeZoom){this.minNativeZoom = minNativeZoom; return this;}
		
		/**
		 * Builds the TileLayerOptions new instance
		 *
		 * @return the tile layer options
		 */
		public TileLayerOptions build(){
			//the ifs statement are for preventing the creation of undefined attributes => mimicking original Leaflet behavior
			TileLayerOptions options = new TileLayerOptions();
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