package com.gwidgets.leaflet.test;

import com.gwidgets.api.leaflet.Canvas;
import com.gwidgets.api.leaflet.Circle;
import com.gwidgets.api.leaflet.CircleMarker;
import com.gwidgets.api.leaflet.FeatureGroup;
import com.gwidgets.api.leaflet.GeoJSON;
import com.gwidgets.api.leaflet.GridLayer;
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
import com.gwidgets.api.leaflet.events.EventTypes;
import com.gwidgets.api.leaflet.options.MapOptions;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;

public class EventTest extends GwtyLeafletTestCase {

	public void testMapLoadEvent() {
		InjectedLeafletResources.whenReady((e) -> {

				

				HTMLElement div = (HTMLElement) DomGlobal.document.createElement("div");
				div.id = "test9";
				DomGlobal.document.body.appendChild(div);
				
				 MapOptions options = new MapOptions.Builder(L.latLng(52.51, 13.40), 12.0, 7.0).maxZoom(20.0).build();
				Map map = L.map("test9", options);

				map.on(EventTypes.MapEvents.LOAD, (event) -> {


				});

				assertTrue(map.listens(EventTypes.MapEvents.LOAD));
				
				return null;

		});
	}

	public void testMarkerClickEvent() {
		InjectedLeafletResources.whenReady((e) -> {

				Marker marker = L.marker(L.latLng(52.51, 13.40), null);

				marker.on(EventTypes.MarkerEvents.CLICK, (event) -> {


				});

				assertTrue(marker.listens(EventTypes.MarkerEvents.CLICK));
				
				return null;

		});
	}

	public void testPopupOpenEvent() {
		InjectedLeafletResources.whenReady((e) -> {

				Popup popup = L.popup(null, null);

				popup.on(EventTypes.PopupEvents.POPUPOPEN, (event) -> {

				});

				assertTrue(popup.listens(EventTypes.PopupEvents.POPUPOPEN));
				
				return null;

		});
	}

	public void testTileLayerAddEvent() {
		InjectedLeafletResources.whenReady((e) -> {

				TileLayer tLayer = L.tileLayer("", null);

				tLayer.on(EventTypes.TileLayerEvents.ADD, (event) -> {

				});

				assertTrue(tLayer.listens(EventTypes.TileLayerEvents.ADD));

				return null;
		});
	}

	public void testTileLayerWMSTileLoadEvent() {
		InjectedLeafletResources.whenReady((e) -> {

				WMS wms = L.tileLayer.wms("", null);

				wms.on(EventTypes.TileLayerWMSEvents.TILELOAD, (event) -> {

				});

				assertTrue(wms.listens(EventTypes.TileLayerWMSEvents.TILELOAD));

				return null;
		});
	}

	public void testImageOverlayMouseOutEvent() {
		InjectedLeafletResources.whenReady((e) -> {

				ImageOverlay imgOverlay = L.imageOverlay("", null, null);

				imgOverlay.on(EventTypes.ImageOverlayEvents.MOUSEOUT, (event) -> {

				});

				assertTrue(imgOverlay.listens(EventTypes.ImageOverlayEvents.MOUSEOUT));

				return null;
		});
	}


	public void testPolylineRemoveEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				LatLng[] row = {L.latLng(52.51, 13.40)};
				
				LatLng[][] latlngs = {row};
				
				Polyline polyline = L.polyline(latlngs, null);

				polyline.on(EventTypes.PolylineEvents.REMOVE, (event) -> {

				});

				assertTrue(polyline.listens(EventTypes.PolylineEvents.REMOVE));

				return null;
		});
	}

	public void testPolygonRemoveEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
                LatLng[] row = {L.latLng(52.51, 13.40)};
				
				LatLng[][] latlngs = {row};
				
				Polygon polygon = L.polygon(latlngs, null);

				polygon.on(EventTypes.PolygonEvents.REMOVE, (event) -> {

				});

				assertTrue(polygon.listens(EventTypes.PolygonEvents.REMOVE));

				return null;
		});
	}

	public void testRectangleMouseDownEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
                
				
				Rectangle rect = L.rectangle(L.latLngBounds(L.latLng(12, 14), L.latLng(25, 42)), null);

				rect.on(EventTypes.RectangleEvents.MOUSEDOWN, (event) -> {

				});

				assertTrue(rect.listens(EventTypes.RectangleEvents.MOUSEDOWN));

				return null;
		});
	}

	public void testCircleContextMenuEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				Circle circ = L.circle(L.latLng(12, 14), null);

				circ.on(EventTypes.CircleEvents.CONTEXTMENU, (event) -> {

				});

				assertTrue(circ.listens(EventTypes.CircleEvents.CONTEXTMENU));

				return null;
		});
	}

	public void testCircleMarkerMouseOutEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				CircleMarker circ = L.circleMarker(L.latLng(12, 14), null);

				circ.on(EventTypes.CircleMakerEvents.MOUSEOUT, (event) -> {

				});

				assertTrue(circ.listens(EventTypes.CircleMakerEvents.MOUSEOUT));

				return null;
		});
	}

	public void testSVGUpdateEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				SVG svg = L.svg(null);

				svg.on(EventTypes.SVGEvents.UPDATE, (event) -> {

				});

				assertTrue(svg.listens(EventTypes.SVGEvents.UPDATE));

				return null;
		});
	}

	public void testCanvasAddEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				Canvas canv = L.canvas(null);

				canv.on(EventTypes.CanvasEvents.ADD, (event) -> {

				});

				assertTrue(canv.listens(EventTypes.CanvasEvents.ADD));

				return null;
		});
	}

	public void testLayerGroupAddEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				LayerGroup lay = L.layerGroup(null);

				lay.on(EventTypes.LayerGroupEvents.ADD, (event) -> {

				});

				assertTrue(lay.listens(EventTypes.LayerGroupEvents.ADD));

				return null;
		});
	}

	public void testFeatureGroupLayerAddEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				FeatureGroup fGroup = L.featureGroup(null);

				fGroup.on(EventTypes.FeatureGroupEvents.ADD, (event) -> {

				});

				assertTrue(fGroup.listens(EventTypes.FeatureGroupEvents.ADD));

				return null;
		});
	}

	public void testGeoJsonLayerRemoveEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				GeoJSON geoJson = L.geoJSON(null, null);

				geoJson.on(EventTypes.GeoJsonEvents.LAYERREMOVE, (event) -> {

				});

				assertTrue(geoJson.listens(EventTypes.GeoJsonEvents.LAYERREMOVE));

				return null;
		});
	}

	public void testGridLayerTileUnloadEvent() {
		InjectedLeafletResources.whenReady((e) -> {
				
				GridLayer gridLayer = L.gridLayer(null);

				gridLayer.on(EventTypes.GridLayerEvents.TILEUNLOAD, (event) -> {

				});

				assertTrue(gridLayer.listens(EventTypes.GridLayerEvents.TILEUNLOAD));

				return null;
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
