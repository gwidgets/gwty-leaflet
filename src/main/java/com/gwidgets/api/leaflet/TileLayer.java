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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * Used to load and display tile layers on the map,.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class TileLayer extends GridLayer{

   
	
	

	protected TileLayer() {
		
		
		
	}



	/**
	 * Updates the layer's URL template and redraws it.
	 *
	 * @param urlTemplate the url template
	 * @return the L class
	 */
	@JsMethod
	public native L setUrl(String urlTemplate);

	/**
	 * Returns the HTML element that contains the tiles for this layer.
	 *
	 * @return the container
	 */
	@JsMethod
	public native HTMLElement getContainer();

	//Events



	


}

