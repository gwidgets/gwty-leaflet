package com.gwidgets.api.leaflet.events;

public class EventTypes {

	private EventTypes() {
		
	}
	
	
	public static class Map{
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEUP = "mouseup";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String MOUSEMOVE = "mousemove";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String FOCUS = "focus";
		public static final String BLUR = "blur";
		public static final String PRECLICK = "preclick";
		public static final String LOAD = "UNLOAD";
		public static final String VIEWRESET = "viewreset";
		public static final String MOVESTART = "movestart";
		public static final String MOVE = "move";
		public static final String MOVEEND = "moveend";
		public static final String DRAGSTART = "dragstart";
		public static final String DRAG = "drag";
		public static final String DRAGEND = "dragend";
		public static final String ZOOMSTART = "zoomstart";
		public static final String ZOOMEND = "zoomend";
		public static final String ZOOMLEVELSCHANGE = "zoomlevelschange";
		public static final String RESIZE = "resize";
		public static final String AUTOPANSTART = "autopanstart";
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
		public static final String BASELAYERCHANGE = "baselayerchange";
		public static final String OVERLAYADD = "overlayadd";
		public static final String OVERLAYREMOVE = "overlayremove";
		public static final String LOCATIONFOUND = "locationfound";
		public static final String LOCATIONERROR = "locationerror";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
	}
	
	public static class Marker{
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEDOWN = "mousedown";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String MOVE = "move";
		public static final String DRAGSTART = "dragstart";
		public static final String DRAG = "drag";
		public static final String DRAGEND = "dragend";
		public static final String ADD = "add";
		public static final String REMOVE = "remove";
		public static final String POPUPOPEN = "popupopen";
		public static final String POPUPCLOSE = "popupclose";
	}
	
	public static class TileLayer{
		public static final String LOADING = "loading";
		public static final String LOAD = "load";
		public static final String TILELOADSTART = "tileloadstart";
		public static final String TILELOAD = "tileload";
		public static final String TILEUNLOAD = "tileunload";
		public static final String TILEERROR = "tileerror";
	}
	
	public static class Path{
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
	}
	
	public static class FeatureGroup{
		public static final String CLICK = "click";
		public static final String DBLCLICK = "dblclick";
		public static final String MOUSEOVER = "mouseover";
		public static final String MOUSEOUT = "mouseout";
		public static final String MOUSEMOVE = "mousemove";
		public static final String CONTEXTMENU = "contextmenu";
		public static final String LAYERADD = "layeradd";
		public static final String LAYERREMOVE = "layerremove";
	}
	
	public static class ControlLayers{
		public static final String BASELAYERCHANGE = "baselayerchange";
		public static final String OVERLAYADD = "overlayadd";
		public static final String OVERLAYREMOVE = "overlayremove";
	}
	
	public static class PosAnimation {
		public static final String START = "start";
		public static final String STEP = "step";
		public static final String END = "end";
	}


}
