package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class TileLayerOptions {

	private TileLayerOptions() {

	}

	@JsProperty
	private Number minZoom;

	@JsProperty
	private Number maxZoom;

	@JsProperty
	private Number maxNativeZoom;

	@JsProperty
	private Number tileSize;

	@JsProperty
	private String[] subdomains;

	@JsProperty
	private String errorTileUrl;

	@JsProperty
	private String attribution;

	@JsProperty
	private Boolean tms;

	@JsProperty
	private Boolean continuousWorld;

	@JsProperty
	private Boolean noWrap;

	@JsProperty
	private Number zoomOffset;

	@JsProperty
	private Boolean zoomReverse;

	@JsProperty
	private Number opacity;

	@JsProperty
	private Number zIndex;

	@JsProperty
	private Boolean unloadInvisibleTiles;

	@JsProperty
	private Boolean updateWhenIdle;

	@JsProperty
	private Boolean detectRetina;

	@JsProperty
	private Boolean reuseTiles;

	@JsProperty
	private LatLngBounds bounds;

	@JsOverlay public final Number getMinZoom() {
		return this.minZoom;
	}

	@JsOverlay public final Number getMaxZoom() {
		return this.maxZoom;
	}

	@JsOverlay public final Number getMaxNativeZoom() {
		return this.maxNativeZoom;
	}

	@JsOverlay public final Number getTileSize() {
		return this.tileSize;
	}

	@JsOverlay public final String[] getSubdomains() {
		return this.subdomains;
	}

	@JsOverlay public final String getErrorTileUrl() {
		return this.errorTileUrl;
	}

	@JsOverlay public final String getAttribution() {
		return this.attribution;
	}

	@JsOverlay public final Boolean getTms() {
		return this.tms;
	}

	@JsOverlay public final Boolean getContinuousWorld() {
		return this.continuousWorld;
	}

	@JsOverlay public final Boolean getNoWrap() {
		return this.noWrap;
	}

	@JsOverlay public final Number getZoomOffset() {
		return this.zoomOffset;
	}

	@JsOverlay public final Boolean getZoomReverse() {
		return this.zoomReverse;
	}

	@JsOverlay public final Number getOpacity() {
		return this.opacity;
	}

	@JsOverlay public final Number getzIndex() {
		return this.zIndex;
	}

	@JsOverlay public final Boolean getUnloadInvisibleTiles() {
		return this.unloadInvisibleTiles;
	}

	@JsOverlay public final Boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	@JsOverlay public final Boolean getDetectRetina() {
		return this.detectRetina;
	}

	@JsOverlay public final Boolean getReuseTiles() {
		return this.reuseTiles;
	}

	@JsOverlay public final LatLngBounds getBounds() {
		return this.bounds;
	}

	public static class Builder {

		private Number minZoom = 0;

		private Number maxZoom = 18;

		private Number maxNativeZoom = null;

		private Number tileSize = 256;

		private String[] subdomains = { "abc" };

		private String errorTileUrl = "";

		private String attribution = "";

		private Boolean tms = false;

		private Boolean continuousWorld = false;

		private Boolean noWrap = false;

		private Number zoomOffset = 0;

		private Boolean zoomReverse = false;

		private Number opacity = 1.0;

		private Number zIndex = null;

		private Boolean unloadInvisibleTiles = true;

		private Boolean updateWhenIdle = false;

		private Boolean detectRetina = false;

		private Boolean reuseTiles = false;

		private LatLngBounds bounds = null;

		public Builder() {

		}

		public Builder minZoom(Number minZoom) {
			this.minZoom = minZoom;
			return this;
		}

		public Builder maxZoom(Number maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		public Builder maxNativeZoom(Number maxNativeZoom) {
			this.maxNativeZoom = maxNativeZoom;
			return this;
		}

		public Builder tileSize(Number tileSize) {
			this.tileSize = tileSize;
			return this;
		}

		public Builder subdomains(String[] subdomains) {
			this.subdomains = subdomains;
			return this;
		}

		public Builder errorTileUrl(String errorTileUrl) {
			this.errorTileUrl = errorTileUrl;
			return this;
		}

		public Builder attribution(String attribution) {
			this.attribution = attribution;
			return this;
		}

		public Builder tms(Boolean tms) {
			this.tms = tms;
			return this;
		}

		public Builder continuousWorld(Boolean continuousWorld) {
			this.continuousWorld = continuousWorld;
			return this;
		}

		public Builder noWrap(Boolean noWrap) {
			this.noWrap = noWrap;
			return this;
		}

		public Builder zoomOffset(Number zoomOffset) {
			this.zoomOffset = zoomOffset;
			return this;
		}

		public Builder zoomReverse(Boolean zoomReverse) {
			this.zoomReverse = zoomReverse;
			return this;
		}

		public Builder opacity(Number opacity) {
			this.opacity = opacity;
			return this;
		}

		public Builder zIndex(Number zIndex) {
			this.zIndex = zIndex;
			return this;
		}

		public Builder unloadInvisibleTiles(Boolean unloadInvisibleTiles) {
			this.unloadInvisibleTiles = unloadInvisibleTiles;
			return this;
		}

		public Builder updateWhenIdle(Boolean updateWhenIdle) {
			this.updateWhenIdle = updateWhenIdle;
			return this;
		}

		public Builder detectRetina(Boolean detectRetina) {
			this.detectRetina = detectRetina;
			return this;
		}

		public Builder reuseTiles(Boolean reuseTiles) {
			this.reuseTiles = reuseTiles;
			return this;
		}

		public Builder bounds(LatLngBounds bounds) {
			this.bounds = bounds;
			return this;
		}
		
		public TileLayerOptions build(){
			
			TileLayerOptions options = new TileLayerOptions();
			options.minZoom = this.minZoom;
			options.maxZoom = this.maxZoom;
			options.maxNativeZoom = this.maxNativeZoom;
			options.tileSize = this.tileSize;
			options.subdomains = this.subdomains;
			options.errorTileUrl = this.errorTileUrl;
			options.attribution = this.attribution;
			options.tms = this.tms;
			options.continuousWorld = this.continuousWorld;
			options.noWrap = this.noWrap;
			options.zoomOffset = this.zoomOffset;
			options.zoomReverse = this.zoomReverse;
			options.opacity = this.opacity;
			options.zIndex = this.zIndex;
			options.unloadInvisibleTiles = this.unloadInvisibleTiles;
			options.updateWhenIdle = this.updateWhenIdle;
			options.detectRetina = this.detectRetina;
			options.reuseTiles = this.reuseTiles;
			options.bounds = this.bounds;
			
			return options;
			
		}

	}

}