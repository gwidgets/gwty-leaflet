package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class TileLayerOptions {

	@JsProperty
	public Number minZoom = 0;

	@JsProperty
	public Number maxZoom = 18;

	@JsProperty
	public Number tileSize = 256;

	@JsProperty
	public String[] subdomains = { "abc" };

	@JsProperty
	public String errorTileUrl = "";

	@JsProperty
	public String attribution = "";

	@JsProperty
	public Boolean tms = false;

	@JsProperty
	public Boolean continuousWorld = false;

	@JsProperty
	public Boolean noWrap = false;

	@JsProperty
	public Number zoomOffset = 0;

	@JsProperty
	public Boolean zoomReverse = false;

	@JsProperty
	public Number opacity = 1.0;

	@JsProperty
	public Number zIndex = null;

	@JsProperty
	public Boolean unloadInvisibleTiles = true;

	@JsProperty
	public Boolean updateWhenIdle = false;

	@JsProperty
	public Boolean detectRetina = false;

	@JsProperty
	public Boolean reuseTiles = false;

}