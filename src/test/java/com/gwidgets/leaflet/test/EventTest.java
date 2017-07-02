package com.gwidgets.leaflet.test;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.Canvas;
import com.gwidgets.api.leaflet.Circle;
import com.gwidgets.api.leaflet.CircleMarker;
import com.gwidgets.api.leaflet.DivIcon;
import com.gwidgets.api.leaflet.FeatureGroup;
import com.gwidgets.api.leaflet.GeoJSON;
import com.gwidgets.api.leaflet.GridLayer;
import com.gwidgets.api.leaflet.Icon;
import com.gwidgets.api.leaflet.ImageOverlay;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LayerGroup;
import com.gwidgets.api.leaflet.Map;
import com.gwidgets.api.leaflet.Marker;
import com.gwidgets.api.leaflet.Polygon;
import com.gwidgets.api.leaflet.Polyline;
import com.gwidgets.api.leaflet.Popup;
import com.gwidgets.api.leaflet.Rectangle;
import com.gwidgets.api.leaflet.SVG;
import com.gwidgets.api.leaflet.TileLayer;
import com.gwidgets.api.leaflet.WMS;
import com.gwidgets.api.leaflet.elemental.Document;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.events.EventTypes;
import com.gwidgets.api.leaflet.options.MapOptions;

public class EventTest extends GwtyLeafletTestCase {

	public void testMapLoadEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {

				

				HTMLElement div = Document.createElement("div");
				div.id = "test9";
				Document.getBody().appendChild(div);
				
				 MapOptions options = new MapOptions.Builder(L.latLng(52.51, 13.40), 12.0, 7.0).maxZoom(20.0).build();
				Map map = L.map("test9", options);

				map.on(EventTypes.MapEvents.LOAD, (e) -> {


				});

				assertTrue(map.listens(EventTypes.MapEvents.LOAD));

				return null;
			}
		});
	}

	public void testMarkerClickEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {

				Marker marker = L.marker(L.latLng(52.51, 13.40), null);

				marker.on(EventTypes.MarkerEvents.CLICK, (e) -> {


				});

				assertTrue(marker.listens(EventTypes.MarkerEvents.CLICK));

				return null;
			}
		});
	}

	public void testPopupOpenEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {

				Popup popup = L.popup(null, null);

				popup.on(EventTypes.PopupEvents.POPUPOPEN, (e) -> {

				});

				assertTrue(popup.listens(EventTypes.PopupEvents.POPUPOPEN));

				return null;
			}
		});
	}

	public void testTileLayerAddEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {

				TileLayer tLayer = L.tileLayer("", null);

				tLayer.on(EventTypes.TileLayerEvents.ADD, (e) -> {

				});

				assertTrue(tLayer.listens(EventTypes.TileLayerEvents.ADD));

				return null;
			}
		});
	}

	public void testTileLayerWMSTileLoadEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {

				WMS wms = L.tileLayer.wms("", null);

				wms.on(EventTypes.TileLayerWMSEvents.TILELOAD, (e) -> {

				});

				assertTrue(wms.listens(EventTypes.TileLayerWMSEvents.TILELOAD));

				return null;
			}
		});
	}

	public void testImageOverlayMouseOutEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {

				ImageOverlay imgOverlay = L.imageOverlay("", null, null);

				imgOverlay.on(EventTypes.ImageOverlayEvents.MOUSEOUT, (e) -> {

				});

				assertTrue(imgOverlay.listens(EventTypes.ImageOverlayEvents.MOUSEOUT));

				return null;
			}
		});
	}


	public void testPolylineRemoveEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				
				LatLng[] row = {L.latLng(52.51, 13.40)};
				
				LatLng[][] latlngs = {row};
				
				Polyline polyline = L.polyline(latlngs, null);

				polyline.on(EventTypes.PolylineEvents.REMOVE, (e) -> {

				});

				assertTrue(polyline.listens(EventTypes.PolylineEvents.REMOVE));

				return null;
			}
		});
	}

	public void testPolygonRemoveEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
                LatLng[] row = {L.latLng(52.51, 13.40)};
				
				LatLng[][] latlngs = {row};
				
				Polygon polygon = L.polygon(latlngs, null);

				polygon.on(EventTypes.PolygonEvents.REMOVE, (e) -> {

				});

				assertTrue(polygon.listens(EventTypes.PolygonEvents.REMOVE));

				return null;
			}
		});
	}

	public void testRectangleMouseDownEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
                
				
				Rectangle rect = L.rectangle(L.latLngBounds(L.latLng(12, 14), L.latLng(25, 42)), null);

				rect.on(EventTypes.RectangleEvents.MOUSEDOWN, (e) -> {

				});

				assertTrue(rect.listens(EventTypes.RectangleEvents.MOUSEDOWN));

				return null;
			}
		});
	}

	public void testCircleContextMenuEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				Circle circ = L.circle(L.latLng(12, 14), null);

				circ.on(EventTypes.CircleEvents.CONTEXTMENU, (e) -> {

				});

				assertTrue(circ.listens(EventTypes.CircleEvents.CONTEXTMENU));

				return null;
			}
		});
	}

	public void testCircleMarkerMouseOutEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				CircleMarker circ = L.circleMarker(L.latLng(12, 14), null);

				circ.on(EventTypes.CircleMakerEvents.MOUSEOUT, (e) -> {

				});

				assertTrue(circ.listens(EventTypes.CircleMakerEvents.MOUSEOUT));

				return null;
			}
		});
	}

	public void testSVGUpdateEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				SVG svg = L.svg(null);

				svg.on(EventTypes.SVGEvents.UPDATE, (e) -> {

				});

				assertTrue(svg.listens(EventTypes.SVGEvents.UPDATE));

				return null;
			}
		});
	}

	public void testCanvasAddEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				Canvas canv = L.canvas(null);

				canv.on(EventTypes.CanvasEvents.ADD, (e) -> {

				});

				assertTrue(canv.listens(EventTypes.CanvasEvents.ADD));

				return null;
			}
		});
	}

	public void testLayerGroupAddEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				LayerGroup lay = L.layerGroup(null);

				lay.on(EventTypes.LayerGroupEvents.ADD, (e) -> {

				});

				assertTrue(lay.listens(EventTypes.LayerGroupEvents.ADD));

				return null;
			}
		});
	}

	public void testFeatureGroupLayerAddEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				FeatureGroup fGroup = L.featureGroup(null);

				fGroup.on(EventTypes.FeatureGroupEvents.ADD, (e) -> {

				});

				assertTrue(fGroup.listens(EventTypes.FeatureGroupEvents.ADD));

				return null;
			}
		});
	}

	public void testGeoJsonLayerRemoveEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				GeoJSON geoJson = L.geoJSON(null, null);

				geoJson.on(EventTypes.GeoJsonEvents.LAYERREMOVE, (e) -> {

				});

				assertTrue(geoJson.listens(EventTypes.GeoJsonEvents.LAYERREMOVE));

				return null;
			}
		});
	}

	public void testGridLayerTileUnloadEvent() {
		InjectedLeafletResources.whenReady(new Function() {
			public JavaScriptObject call(JavaScriptObject event) {
				
				GridLayer gridLayer = L.gridLayer(null);

				gridLayer.on(EventTypes.GridLayerEvents.TILEUNLOAD, (e) -> {

				});

				assertTrue(gridLayer.listens(EventTypes.GridLayerEvents.TILEUNLOAD));

				return null;
			}
		});
	}

//	public void testIconTooltipOpenEvent() {
//		InjectedLeafletResources.whenReady(new Function() {
//			public JavaScriptObject call(JavaScriptObject event) {
//				
//				Icon icon = L.icon(null);
//                
//				icon.on(EventTypes.IconEvents.TOOLTIPOPEN, (e) -> {
//
//					return null;
//				});
//
//				assertTrue(icon.listens(EventTypes.IconEvents.TOOLTIPOPEN));
//				
//
//				return null;
//			}
//		});
//	}

//	public void testDivIconPopupCloseEvent() {
//		InjectedLeafletResources.whenReady(new Function() {
//			public JavaScriptObject call(JavaScriptObject event) {
//				
//				DivIcon divIcon = L.divIcon(null);
//                
//				divIcon.on(EventTypes.DivIconEvents.POPUPCLOSE, (e) -> {
//
//					return null;
//				});
//
//				assertTrue(divIcon.listens(EventTypes.DivIconEvents.POPUPCLOSE));
//
//				return null;
//			}
//		});
//	}



}
