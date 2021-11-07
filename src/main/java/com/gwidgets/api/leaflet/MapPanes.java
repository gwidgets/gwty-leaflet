package com.gwidgets.api.leaflet;

import elemental2.dom.HTMLElement;

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
//import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * An object literal (returned by map.getPanes) that contains different map panes that you can use to put your custom overlays in. The difference is mostly in zIndex order that such overlays get.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType
public class MapPanes {
	
	private MapPanes() {
		
	}

	/** Pane that contains all other map panes. */
	@JsProperty
	public HTMLElement	mapPane;
	
	/** Pane for tile layers. */
	@JsProperty
	public HTMLElement	tilePane;
	
	/** Pane that contains all the panes except tile pane. */
	@JsProperty
	public HTMLElement objectsPane;
	
	/** Pane for overlay shadows (e.g. marker shadows). */
	@JsProperty
	public HTMLElement	shadowPane;	
	
	/** Pane for overlays like polylines and polygons. */
	@JsProperty
	public HTMLElement	overlayPane;
	
	/** Pane for marker icons. */
	@JsProperty
	public HTMLElement markerPane;	
	
	/** Pane for popups. */
	@JsProperty
	public HTMLElement popupPane;	

}
