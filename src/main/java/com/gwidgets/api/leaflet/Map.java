package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.events.MouseEvent;
import com.gwidgets.api.leaflet.options.FitBoundsOptions;
import com.gwidgets.api.leaflet.options.LocateOptions;
import com.gwidgets.api.leaflet.options.PanOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.ZoomOptions;
import com.gwidgets.api.leaflet.options.ZoomPanOptions;

@JsType(isNative = true)
public class Map {

	

	// Methods for Modifying Map State
	@JsMethod
	public native L setView(LatLng center, Number zoom, ZoomPanOptions options);
	

	@JsMethod
	public native L setZoom(Number zoom, ZoomOptions options);

	@JsMethod
	public native L zoomIn(Number delta, ZoomOptions options);

	@JsMethod
	public native L zoomOut(Number delta, ZoomOptions options);

	@JsMethod
	public native L setZoomAround(LatLng latlng, Number zoom,
			ZoomOptions options);

	@JsMethod
	public native L fitBounds(LatLngBounds bounds, FitBoundsOptions options);

	@JsMethod
	public native L fitWorld(FitBoundsOptions options);

	@JsMethod
	public native L panTo(LatLng latlng, PanOptions options);

	@JsMethod
	public native L panInsideBounds(LatLngBounds bounds);

	@JsMethod
	public native L panBy(Point point, PanOptions options);

	@JsMethod
	public native L invalidateSize(Boolean options, ZoomPanOptions options2);

	@JsMethod
	public native L setMaxBounds(LatLngBounds bounds, ZoomPanOptions options);

	@JsMethod
	public native L locate(LocateOptions options);

	@JsMethod
	public native L stopLocate();

	@JsMethod
	public native L remove();

	// Methods for Getting Map State
	@JsMethod
	public native LatLng getCenter();

	@JsMethod
	public native Number getZoom();

	@JsMethod
	public native Number getMinZoom();

	@JsMethod
	public native Number getMaxZoom();

	@JsMethod
	public native LatLngBounds getBounds();

	@JsMethod
	public native Number getBoundsZoom(LatLngBounds bounds, Boolean inside);

	@JsMethod
	public native Point getSize();

	@JsMethod
	public native Bounds getPixelBounds();

	@JsMethod
	public native Point getPixelOrigin();

	// Methods for Layers and Controls
	@JsMethod
	public native L addLayer(ILayer layer, Boolean insertAtTheBottom);

	@JsMethod
	public native L removeLayer(ILayer layer);

	@JsMethod
	public native Boolean hasLayer(ILayer layer);

	@JsMethod
	public native L openPopup(Popup popup);

	@JsMethod
	public native L openPopup(String html, LatLng latlng, PopupOptions options);

	@JsMethod
	public native L openPopup(HTMLElement el, LatLng latlng,
			PopupOptions options);

	@JsMethod
	public native L closePopup(Popup popup);

	@JsMethod
	public native L addControl(IControl control);

	@JsMethod
	public native L removeControl(IControl control);

	// Conversion Methods
	@JsMethod
	public native Point latLngToLayerPoint(LatLng latlng);

	@JsMethod
	public native LatLng layerPointToLatLng(Point point);

	@JsMethod
	public native Point containerPointToLayerPoint(Point point);

	@JsMethod
	public native Point layerPointToContainerPoint(Point point);

	@JsMethod
	public native Point latLngToContainerPoint(LatLng latlng);

	@JsMethod
	public native LatLng containerPointToLatLng(Point point);

	@JsMethod
	public native Point project(LatLng latlng, Number zoom);

	@JsMethod
	public native LatLng unproject(Point point, Number zoom);

	@JsMethod
	public native Point mouseEventToContainerPoint(MouseEvent event);

	@JsMethod
	public native Point mouseEventToLayerPoint(MouseEvent event);

	@JsMethod
	public native LatLng mouseEventToLatLng(MouseEvent event);

	// Other Methods
	@JsMethod
	public native HTMLElement getContainer();

	@JsMethod
	public native MapPanes getPanes();

	@JsMethod
	public native L whenReady(Function fn, Object context);

	// Events

	/*
	 * @JsMethod public static native L addEventListener(String type, Function
	 * fn, Object context );
	 * 
	 * @JsMethod public static native L addOneTimeEventListener(String type,
	 * Function fn, Object context );
	 * 
	 * @JsMethod public static native L addEventListener(Object eventMap, Object
	 * context );
	 * 
	 * @JsMethod public static native L removeEventListener(String type,
	 * Function fn, Object context );
	 * 
	 * @JsMethod public static native L removeEventListener(Object eventMap,
	 * Object context );
	 * 
	 * @JsMethod public static native L removeEventListener();
	 * 
	 * @JsMethod public static native Boolean hasEventListeners(String type );
	 * 
	 * @JsMethod public static native L fireEvent(String type, Object data );
	 */

	@JsMethod
	public native L clearAllEventListeners();

	@JsMethod
	public native L on(String type, Function fn);

	@JsMethod
	public native L once(String type, Function fn);

	@JsMethod
	public native L off(String type, Function fn);

	@JsMethod
	public native L fire(String type);

}