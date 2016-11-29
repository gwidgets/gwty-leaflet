package com.gwidgets.api.leaflet;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.ControlAttributionOptions;
import com.gwidgets.api.leaflet.options.ControlLayersOptions;
import com.gwidgets.api.leaflet.options.ControlOptions;
import com.gwidgets.api.leaflet.options.ControlScaleOptions;
import com.gwidgets.api.leaflet.options.ControlZoomOptions;
import com.gwidgets.api.leaflet.options.DivIconOptions;
import com.gwidgets.api.leaflet.options.GeoJSONOptions;
import com.gwidgets.api.leaflet.options.GridLayerOptions;
import com.gwidgets.api.leaflet.options.IconOptions;
import com.gwidgets.api.leaflet.options.ImageOverlayOptions;
import com.gwidgets.api.leaflet.options.MapOptions;
import com.gwidgets.api.leaflet.options.MarkerOptions;
import com.gwidgets.api.leaflet.options.PathOptions;
import com.gwidgets.api.leaflet.options.PolylineOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.RendererOptions;
import com.gwidgets.api.leaflet.options.TileLayerOptions;
import com.gwidgets.api.leaflet.options.TileLayerWMSOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;



/**
 * The Master class of leaflet. All leaflet classes should be created through this class.
 *  This class transcribes factory methods from the Javascript version. 
 *  It powers the OOP facilities of Leaflet.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class L {


	/**
	 * The central class of the API — it is used to create a map on a page and manipulate it.
	 *
	 * @param id the id of the element 
	 * @param options map options
	 * @return a new Map object
	 */
	public static native Map map(String id, MapOptions options);

	/**
	 * The central class of the API — it is used to create a map on a page and manipulate it.
	 *
	 * @param the HTML element
	 * @param options map options
	 * @return  a new Map object
	 */
	public static native Map map(HTMLElement element, MapOptions options);

	/**
	 * Marker is used to put markers on the map.
	 *
	 * @param latlng the geographical points
	 * @param options the marker options
	 * @return a new Marker object
	 */
	public static native Marker marker(LatLng latlng, MarkerOptions options);

	/**
	 * Used to open popups in certain places of the map. Use openPopup() of the map object to open popups while making sure that only one popup is open at one time (recommended for usability), or use addLayer() to open as many as you want.
	 *
	 * @param options the pop up options
	 * @param source the popup source Layer
	 * @return a new Popup object
	 */
	public static native Popup popup(PopupOptions options, Layer source);

	/**
	 * Used to load and display tile layers on the map, implements ILayer interface.
	 *
	 * @param urlTemplate the url template
	 * @param options the options
	 * @return a new TileLayer object
	 */
	public static native TileLayer tileLayer(String urlTemplate,
			TileLayerOptions options);

	/**
	 * Used to load and display a single image over specific bounds of the map, implements ILayer interface.
	 *
	 * @param imageUrl the image url
	 * @param bounds the bounds
	 * @param options the ImageOverlay options
	 * @return a new ImageOverlay object
	 */
	public static native ImageOverlay imageOverlay(String imageUrl,
			LatLngBounds bounds, ImageOverlayOptions options);

	/**
	 * A class for drawing polyline overlays on a map. Extends Path. Use Map.addLayer() to add it to the map.
	 *
	 * @param latlngs the latlngs array
	 * @param options the Polyline options
	 * @return a new Polyline object
	 */
	public static native Polyline polyline(LatLng[] latlngs,
			PolylineOptions options);


	/**
	 * A class for drawing polygon overlays on a map. Extends Polyline. Use Map.addLayer() to add it to the map.

Note that points you pass when creating a polygon shouldn't have an additional last point equal to the first one — it's better to filter out such points.
	 *
	 * @param latlngs the latlngs array
	 * @param options the Polygon options
	 * @return a new MultiPolyline object
	 */
	public static native Polygon polygon(LatLng[] latlngs,
			PolylineOptions options);


	/**
	 * A class for drawing rectangle overlays on a map. Extends Polygon. Use addLayer() method of the Map object to add it to the map.
	 *
	 * @param bounds the bounds of the rectangle
	 * @param options Rectangle the options
	 * @return a new MultiPolygon object
	 */
	public static native Rectangle rectangle(LatLngBounds bounds,
			PathOptions options);

	/**
	 * A class for drawing circle overlays on a map. Extends Path. Use addLayer() method of the Map object to add it to the map.
	 *
	 * @param latlng the latlng of the circle on the map
	 * @param radius the radius of the map
	 * @param options the Circle options
	 * @return a new Circle object
	 */
	public static native Circle circle(LatLng latlng, Number radius,
			PathOptions options);

	/**
	 * A circle of a fixed size with radius specified in pixels. Extends Circle. Use addLayer() method of the Map object to add it to the map.
	 *
	 * @param latlng the latlng
	 * @param options the CircleMarker options
	 * @return a new CircleMarker object
	 */
	public static native CircleMarker circleMarker(LatLng latlng,
			PathOptions options);

	/**
	 * Used to group several layers and handle them as one. If you add it to the map, any layers added or removed from the group will be added/removed on the map as well. Implements ILayer interface.
	 *
	 * @param layers the layers array
	 * @return a new LayerGroup object
	 */
	public static native LayerGroup layerGroup(Layer[] layers);

	/**
	 * Extended layerGroup that also has mouse events (propagated from members of the group) and a shared bindPopup method. Implements ILayer interface.
	 *
	 * @param layers the layers
	 * @return a new FeatureGroup object
	 */
	public static native FeatureGroup featureGroup(Layer[] layers);

	/**
	 * Represents a GeoJSON object or an array of GeoJSON objects. Allows you to parse GeoJSON data and display it on the map. Extends FeatureGroup.
	 *
	 * @param geojson the geojson object in GeoJSON format to display on the map (you can alternatively add it later with addData method) and an options object.
	 * @param options the GeoJSON options
	 * @return a new GeoJSON object
	 */
	public static native GeoJSON geoJSON(JavaScriptObject geojson, GeoJSONOptions options);

	/**
	 * Represents a geographical point with a certain latitude and longitude.
	 *
	 * @param latitude the Latitude in degrees.
	 * @param longitude Longitude in degrees.
	 * @return a new LatLng object
	 */
	public static native LatLng latLng(Number latitude, Number longitude);

	/**
	 * Represents a rectangular geographical area on a map.
	 *
	 * @param southWest the south west point
	 * @param northEast the north east point 
	 * @return a new LatLngBounds object
	 */
	public static native LatLngBounds latLngBounds(LatLng southWest,
			LatLng northEast);

	/**
	 * Represents a point with x and y coordinates in pixels.
	 *
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param round the round
	 * @return a new Point object
	 */
	public static native Point point(Number x, Number y, Boolean round);

	/**
	 * Represents a rectangular area in pixel coordinates.
	 *
	 * @param topLeft The top left corner of the rectangle.
	 * @param bottomRight The bottom right corner of the rectangle.
	 * @return a new Bounds object
	 */
	public static native Bounds bounds(Point topLeft, Point bottomRight);

	/**
	 * Represents an icon to provide when creating a marker.
	 *
	 * @param options the Icon options
	 * @return a new Icon object
	 */
	public static native Icon icon(IconOptions options);

	/**
	 * Represents a lightweight icon for markers that uses a simple div element instead of an image.
	 *
	 * @param options the DivIcon options
	 * @return a new DivIcon object
	 */
	public static native DivIcon divIcon(DivIconOptions options);

	/**
	 * The base class for all Leaflet controls. Implements IControl interface. You can add controls to the map like this:
	 *<pre>
	 *{@code control.addTo(map);
     *       // or
     *  map.addControl(control);}
	 *</pre>
	 *
	 * @param options the Control options
	 * @return a new Control object
	 */
	public static native Control control(ControlOptions options);

	/**
	 * Represents an affine transformation: a set of coefficients a, b, c, d for transforming a point of a form (x, y) into (a*x + b, c*y + d) and doing the reverse. Used by Leaflet in its projections code.
	 *
	 * @param a 
	 * @param b 
	 * @param c 
	 * @param d 
	 * @return a new Transformation object
	 */
	public static native Transformation transformation(Number a, Number b,
			Number c, Number d);

	/**
	 * Used internally for panning animations, utilizing CSS3 Transitions for modern browsers and a timer fallback for IE6-9.
	 *
	 * @return a new PosAnimation object
	 */
	public static native PosAnimation posAnimation();

	/**
	 * A constant that represents the Leaflet version in use.
	 *
	 * @return the version
	 */
	public static native String version();
	
	
	
	/**
	 * Instantiates a Tooltip object given an optional options object that describes its appearance and location and an optional source object that is used to tag the tooltip with a reference to the Layer to which it refers.
	 *
	 * @param options the tooltip options
	 * @param source the source layer
	 * @return the tooltip object
	 */
	public static native Tooltip tooltip(TooltipOptions options, Layer source);
	
	
	/**
	 * Creates a SVG renderer with the given options.
	 *
	 * @param options the canvas options
	 * @return the canvas object
	 */
	public static native Canvas canvas(RendererOptions options);
	
	
	/**
	 * Creates a SVG renderer with the given options.
	 *
	 * @param options the canvas options
	 * @return the svg object
	 */
	public static native SVG svg(RendererOptions options);
	
	
	/**
	 * Creates a new instance of GridLayer with the supplied options.
	 *
	 * @param options the options
	 * @return the grid layer
	 */
	public static native GridLayer gridLayer(GridLayerOptions options);
	
		 /**
	 	 * The Class control.
	 	 */
 	    @JsType(isNative = true)
	    public static class control {

	        /**
        	 * A basic zoom control with two buttons (zoom in and zoom out). It is put on the map by default unless you set its zoomControl option to false. Extends Control.
        	 *
        	 * @param options the Zoom options
        	 * @return a new objectName object
        	 */
        	@JsMethod
	        public static native Zoom zoom(ControlZoomOptions options);

	        /**
        	 * The attribution control allows you to display attribution data in a small text box on a map. It is put on the map by default unless you set its attributionControl option to false, and it fetches attribution texts from layers with getAttribution method automatically. Extends Control.
        	 *
        	 * @param options the Attribution options
        	 * @return a new Attribution object
        	 */
        	@JsMethod
	        public static native Attribution attribution(
	                ControlAttributionOptions options);

	        /**
        	 * The layers control gives users the ability to switch between different base layers and switch overlays on/off (check out the detailed example). Extends Control.
        	 *
        	 * @param baseLayers the base layers
        	 * @param overlays the overlays layers
        	 * @param options the Layers options
        	 * @return a new Layers object
        	 */
        	@JsMethod
	        public static native Layers layers(JavaScriptObject baseLayers,
	                JavaScriptObject overlays, ControlLayersOptions options);

	        /**
        	 * A simple scale control that shows the scale of the current center of screen in metric (m/km) and imperial (mi/ft) systems. Extends Control.
        	 * it can be added to a map as follows:
        	 * <pre>
        	 * {@code 
        	 * L.control.scale().addTo(map);
        	 * }
        	 * </pre>
        	 *
        	 * @param options the Scale options
        	 * @return a new Scale object
        	 */
        	@JsMethod
	        public static native Scale scale(ControlScaleOptions options);

	    }


	/**
	 * Used to load and display tile layers on the map.
	 */
	@JsType(isNative = true)
	public static class tileLayer{

		

		/**
		 * Used to display WMS services as tile layers on the map. Extends TileLayer.
		 *
		 * @param baseUrl the base url
		 * @param options the WMS options object
		 * @return A new WMS object
		 */
		@JsMethod
		public static native WMS wms(String baseUrl, TileLayerWMSOptions options);

		/**
		 * Used to create Canvas-based tile layers where tiles get drawn on the browser side. Extends TileLayer.
		 *
		 * @param options the options
		 * @return a new Canvas object
		 */
		@JsMethod
		public static native Canvas canvas(TileLayerOptions options);


	}

}