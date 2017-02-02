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
package com.gwidgets.api.leaflet.events;

public class EventTypes {

	private EventTypes() {

	}

	public static class MapEvents {
		public static final String BASELAYERCHANGE = "baselayerchange";
		public static final String OVERLAYADD = "overlayadd";
		public static final String OVERLAYREMOVE = "overlayremove";
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
		public static final String ZOOMLEVELSCHANGE = "zoomlevelschange";
		public static final String RESIZE = "resize";
		public static final String UNLOAD = "unload";
		public static final String VIEWRESET = "viewreset";
		public static final String LOAD = "load";
		public static final String ZOOMSTART = "zoomstart";
		public static final String MOVESTART = "movestart";
		public static final String ZOOM = "zoom";
		public static final String MOVE = "move";
		public static final String ZOOMEND = "zoomend";
		public static final String MOVEEND = "moveend";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String AUTOPANSTART = "autopanstart";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEUP = "mouseup";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String MOUSEMOVE = "mousemove";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String KEYPRESS = "keypress";
		public static final String PRECLICK = "preclick";
		public static final String ZOOMANIM = "zoomanim";
		public static final String LOCATIONERROR = "locationerror";
		public static final String LOCATIONFOUND = "locationfound";
	}

	public static class MarkerEvents {
		public static final String MOVE = "move";
		public static final String DRAGSTART = "dragstart";
		public static final String MOVESTART = "movestart";
		public static final String DRAG = "drag";
		public static final String DRAGEND = "dragend";
		public static final String MOVEEND = "moveend";
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class PopupEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class TooltipEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class TileLayerEvents {
		public static final String LOADING = "loading";
		public static final String TILEUNLOAD = "tileunload";
		public static final String TILELOADSTART = "tileloadstart";
		public static final String TILEERROR = "tileerror";
		public static final String TILELOAD = "tileload";
		public static final String LOAD = "load";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class TileLayerWMSEvents {
		public static final String LOADING = "loading";
		public static final String TILEUNLOAD = "tileunload";
		public static final String TILELOADSTART = "tileloadstart";
		public static final String TILEERROR = "tileerror";
		public static final String TILELOAD = "tileload";
		public static final String LOAD = "load";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class ImageOverlayEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class PathEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class PolylineEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class PolygonEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class RectangleEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class CircleEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class CircleMakerEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class SVGEvents {
		public static final String UPDATE = "update";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class CanvasEvents {
		public static final String UPDATE = "update";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class LayerGroupEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class FeatureGroupEvents {
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class GeoJsonEvents {
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class GridLayerEvents {
		public static final String LOADING = "loading";
		public static final String TILEUNLOAD = "tileunload";
		public static final String TILELOADSTART = "tileloadstart";
		public static final String TILEERROR = "tileerror";
		public static final String TILELOAD = "tileload";
		public static final String LOAD = "load";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class IconEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class DivIconEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class PosAnimationEvents {
		public static final String START = "start";
		public static final String STEP = "step";
		public static final String END = "end";
	}


	public static class LayerEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class InteractiveLayerEvents {
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class RendererEvents {
		public static final String UPDATE = "update";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class DivOverlayEvents {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

}
