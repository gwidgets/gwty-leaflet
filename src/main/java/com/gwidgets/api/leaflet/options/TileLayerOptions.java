package com.gwidgets.api.leaflet.options;

import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class TileLayerOptions {

	private TileLayerOptions() {

	}

	@JsProperty
	private Number minZoom = 0;

	@JsProperty
	private Number maxZoom = 18;

	@JsProperty
	private Number maxNativeZoom = null;

	@JsProperty
	private Number tileSize = 256;

	@JsProperty
	private String[] subdomains = { "abc" };

	@JsProperty
	private String errorTileUrl = "";

	@JsProperty
	private String attribution = "";

	@JsProperty
	private Boolean tms = false;

	@JsProperty
	private Boolean continuousWorld = false;

	@JsProperty
	private Boolean noWrap = false;

	@JsProperty
	private Number zoomOffset = 0;

	@JsProperty
	private Boolean zoomReverse = false;

	@JsProperty
	private Number opacity = 1.0;

	@JsProperty
	private Number zIndex = null;

	@JsProperty
	private Boolean unloadInvisibleTiles = true;

	@JsProperty
	private Boolean updateWhenIdle = false;

	@JsProperty
	private Boolean detectRetina = false;

	@JsProperty
	private Boolean reuseTiles = false;

	@JsProperty
	private LatLngBounds bounds = null;

	public Number getMinZoom() {
		return this.minZoom;
	}

	public Number getMaxZoom() {
		return this.maxZoom;
	}

	public Number getMaxNativeZoom() {
		return this.maxNativeZoom;
	}

	public Number getTileSize() {
		return this.tileSize;
	}

	public String[] getSubdomains() {
		return this.subdomains;
	}

	public String getErrorTileUrl() {
		return this.errorTileUrl;
	}

	public String getAttribution() {
		return this.attribution;
	}

	public Boolean getTms() {
		return this.tms;
	}

	public Boolean getContinuousWorld() {
		return this.continuousWorld;
	}

	public Boolean getNoWrap() {
		return this.noWrap;
	}

	public Number getZoomOffset() {
		return this.zoomOffset;
	}

	public Boolean getZoomReverse() {
		return this.zoomReverse;
	}

	public Number getOpacity() {
		return this.opacity;
	}

	public Number getzIndex() {
		return this.zIndex;
	}

	public Boolean getUnloadInvisibleTiles() {
		return this.unloadInvisibleTiles;
	}

	public Boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	public Boolean getDetectRetina() {
		return this.detectRetina;
	}

	public Boolean getReuseTiles() {
		return this.reuseTiles;
	}

	public LatLngBounds getBounds() {
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