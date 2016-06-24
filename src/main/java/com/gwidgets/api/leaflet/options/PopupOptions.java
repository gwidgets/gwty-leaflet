package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType
public class PopupOptions {

	@JsProperty
	public Number maxWidth = 300;

	@JsProperty
	public Number minWidth = 50;

	@JsProperty
	public Number maxHeight = null;

	@JsProperty
	public Boolean autoPan = true;

	@JsProperty
	public Boolean keepInView = false;

	@JsProperty
	public Boolean closeButton = true;

	@JsProperty
	public Point offset = L.point(0, 6, true);

	@JsProperty
	public Point autoPanPadding = L.point(5, 5, true);

	@JsProperty
	public Boolean zoomAnimation = true;

	@JsProperty
	public Boolean closeOnClick = null;

}