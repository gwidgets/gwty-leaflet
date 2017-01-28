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

	public static class Map {
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

	public static class Marker {
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

	public static class Popup {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class Tooltip {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class TileLayer {
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

	public static class TileLayerWMS {
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

	public static class ImageOverlay {
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

	public static class Path {
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

	public static class Polyline {
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

	public static class Polygon {
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

	public static class Rectangle {
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

	public static class Circle {
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

	public static class CircleMaker {
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

	public static class SVG {
		public static final String UPDATE = "update";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class Canvas {
		public static final String UPDATE = "update";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class LayerGroup {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class FeatureGroup {
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class GeoJson {
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class GridLayer {
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

	public static class Icon {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class DivIcon {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class PosAnimation {
		public static final String START = "start";
		public static final String STEP = "step";
		public static final String END = "end";
	}

	public static class Draggable {
		public static final String DOWN = "down";
		public static final String DRAGSTART = "dragstart";
		public static final String PREDRAG = "predrag";
		public static final String DRAG = "drag";
		public static final String DRAGEND = "dragend";
	}

	public static class Layer {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class InteractiveLayer {
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

	public static class Renderer {
		public static final String UPDATE = "update";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

	public static class DivOverlay {
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
		public static final String TOOLTIPOPEN = "tooltipopen";
		public static final String TOOLTIPCLOSE = "tooltipclose";
	}

}
