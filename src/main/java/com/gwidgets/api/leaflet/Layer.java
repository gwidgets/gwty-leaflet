package com.gwidgets.api.leaflet;

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

import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsType;

/**
 * Represents an object attached to a particular location (or a set of locations) on a map. Implemented by tile layers, markers, popups, image overlays, vector layers and layer groups.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public interface Layer {

	

	/**
	 * Binds a popup to the layer with the passed content and sets up the neccessary event listeners.
	 *
	 * @param content the element on which to binds the pop up
	 * @param options the popup options
	 * @return the L class
	 */

public  L bindPopup(HTMLElement content, PopupOptions options);	

/*** Binds a popup to the layer with the passed content and sets up the neccessary event listeners.
	 *
	 * @param id the id of the element
	 * @param options the popup options
	 * @return the L class
	 */

public  L bindPopup(String id, PopupOptions options);

/*** Removes the popup previously bound with bindPopup.
	 *
	 * @return the L class
	 */

public  L unbindPopup();



/*** Opens the bound popup at the specificed latlng or at the default popup anchor if no latlng is passed.
	 *
	 * @param latlng the latlng where to open the pop up
	 * @return the L class
	 */

public  L openPopup(LatLng latlng);


/*** Closes the popup bound to this layer if it is open.
	 *
	 * @return the L class
	 */

public  L closePopup();


/*** Opens or closes the popup bound to this layer depending on its current state.
	 *
	 * @return the L class
	 */

public  L togglePopup();

/*** Returns true if the popup bound to this layer is currently open.
*
* @return true if pop up is open false if closed 
	 */

public  boolean isPopupOpen();

/*** Sets the content of the popup bound to this layer.
** @param content content of the popup as a String
* @return the L class
	 */

public  L setPopupContent(String content);	

/*** Sets the content of the popup bound to this layer.
** @param content content of the popup as a HTMLElement
* @return the L class
	 */

public  L setPopupContent(HTMLElement content);	


/*** Sets the content of the popup bound to this layer.
** @param content content of the popup as a Popup Object
* @return the L class
	 */

public  L setPopupContent(Popup content);	

/*** Returns the popup bound to this layer.
* @return Popup the Pop bound to this layer.
	 */

public  Popup getPopup();	


/**
 * Binds a tooltip to the layer with the passed *content and sets up the neccessary event listeners. If a Function is passed it will receive the layer as the first argument and should return a String or HTMLElement.
 *
 * @param content the tooltip content as a string
 * @param options the options object of this tooltip
 * @return the L class
 */

public  L bindTooltip(String content, TooltipOptions options);	

/**
 * Binds a tooltip to the layer with the passed *content and sets up the neccessary event listeners. If a Function is passed it will receive the layer as the first argument and should return a String or HTMLElement.
 *
 * @param content the tooltip content as a HTMLElement object
 * @param options the options object of this tooltip
 * @return the L class
 */

public  L bindTooltip(HTMLElement content, TooltipOptions options);

/**
 * Binds a tooltip to the layer with the passed content and sets up the neccessary event listeners. If a Function is passed it will receive the layer as the first argument and should return a String or HTMLElement.
 *
 * @param content the tooltip content as a ToolTip object
 * @param options the options object of this tooltip
 * @return the L class
 */

public  L bindTooltip(Tooltip content, TooltipOptions options);	


/**
 * Removes the tooltip previously bound with *bindTooltip.
 *
 * @return the L class
 */

public  L unbindTooltip();	


/**
 * Opens the bound tooltip at the specificed latlng or at the default tooltip anchor if no latlng is passed.
 *
 * @param latlng the latlng where the tooltip is opened
 * @return the L class
 */

public  L openTooltip(LatLng latlng);	

/**
 * Closes the tooltip bound to this layer if it is open.
 *
 * @return the L class
 */

public  L closeTooltip();	

/**
 * Opens or closes the tooltip bound to this layer depending on its current state.
 *
 * @return the L class
 */

public  L toggleTooltip();	

/**
 * Returns true if the tooltip bound to this layer is currently open.
 *
 * @return boolean true if tooltip is open, false otherwise
 */

public  boolean isTooltipOpen();	


/**
 * Sets the content of the tooltip bound to this layer.
 *
 * @param content the content of the tooltip as a string
 * @return the L class
 */

public  L setTooltipContent(String content);	

/**
 * Sets the content of the tooltip bound to this layer.
 *
 * @param content the content of the tooltip as a HTMLELement object
 * @return the L class
 */

public  L setTooltipContent(HTMLElement content);


/**
 * Sets the content of the tooltip bound to this layer.
 *
 * @param content the content of the tooltip as a Tooltip object
 * @return the L class
 */

public  L setTooltipContent(Tooltip content);	


/**
 * Returns the tooltip bound to this layer.
 *
 * @return ToolTip the tooltip
 */

public  Tooltip getTooltip();	

/** Adds the tooltip to the given map
* @param map the map object to which to add this toolltip
* @return the L class
	 */

public  L addTo(Map map);


/** Removes the tooltip from the map it is currently active on.
* @return the L class
	 */
public  L remove();		


/** Removes the tooltip from the given map
* @param map the map object from which to remove this toolltip
* @return the L class
	 */
public  L removeFrom(Map map);	


/** Returns the HTMLElement representing the named pane on the map. If name is omitted, returns the pane for this layer.
* @param name the map object from which to remove this toolltip
* @return HTMLElement the element
	 */
public  HTMLElement getPane(String name);


}