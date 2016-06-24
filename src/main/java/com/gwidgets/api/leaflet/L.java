package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;





import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.*;



@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class L {


	public static native Map map(String id, MapOptions options);

	public static native Map map(HTMLElement element, MapOptions options);

	public static native Marker marker(LatLng latlng, MarkerOptions options);

	public static native Popup popup(PopupOptions options, ILayer source);

	public static native TileLayer tileLayer(String urlTemplate,
			TileLayerOptions options);

	public static native ImageOverlay imageOverlay(String imageUrl,
			LatLngBounds bounds, ImageOverlayOptions options);

	public static native Polyline polyline(LatLng[] latlngs,
			PolylineOptions options);

	public static native MultiPolyline multiPolyline(LatLng[][] latlngs,
			PolylineOptions options);

	public static native Polygon polygon(LatLng[] latlngs,
			PolylineOptions options);

	public static native MultiPolygon multiPolygon(LatLng[][] latlngs,
			PolylineOptions options);

	public static native Rectangle rectangle(LatLngBounds bounds,
			PathOptions options);

	public static native Circle circle(LatLng latlng, Number radius,
			PathOptions options);

	public static native CircleMarker circleMarker(LatLng latlng,
			PathOptions options);

	public static native LayerGroup layerGroup(ILayer[] layers);

	public static native FeatureGroup featureGroup(ILayer[] layers);

	public static native GeoJSON geoJSON(Object geojson, GeoJSONOptions options);

	public static native LatLng latLng(Number latitude, Number longitude);

	public static native LatLngBounds latLngBounds(LatLng southWest,
			LatLng northEast);

	public static native Point point(Number x, Number y, Boolean round);

	public static native Bounds bounds(Point topLeft, Point bottomRight);

	public static native Icon icon(IconOptions options);

	public static native DivIcon divIcon(DivIconOptions options);

	public static native Control control(ControlOptions options);

	public static native Transformation transformation(Number a, Number b,
			Number c, Number d);

	public static native PosAnimation posAnimation();

	public static native String version();
	
	 @JsType(isNative = true)
	    public static class control {

	        @JsMethod
	        public static native Zoom zoom(ControlZoomOptions options);

	        @JsMethod
	        public static native Attribution attribution(
	                ControlAttributionOptions options);

	        @JsMethod
	        public static native Layers layers(JavaScriptObject baseLayers,
	                JavaScriptObject overlays, ControlLayersOptions options);

	        @JsMethod
	        public static native Scale scale(ControlScaleOptions options);

	    }


	@JsType(isNative = true)
	public static class tileLayer{

		

		@JsMethod
		public static native WMS wms(String baseUrl, TileLayerWMSOptions options);

		@JsMethod
		public static native Canvas canvas(TileLayerOptions options);


	}

}