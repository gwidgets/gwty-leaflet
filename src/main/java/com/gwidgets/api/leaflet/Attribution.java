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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * The attribution control allows you to display attribution data in a small text box on a map. It is put on the map by default unless you set its attributionControl option to false, and it fetches attribution texts from layers with getAttribution method automatically.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class Attribution extends Control{
	
	
	

	private Attribution() {
		
	}

	/**
	 * Sets the text before the attributions.
	 *
	 * @param prefix the prefix
	 * @return the L class
	 */
	@JsMethod
	public native L setPrefix(String prefix);

	/**
	 * Adds an attribution text
	 *
	 * @param text the text
	 * @return the L class
	 */
	@JsMethod
	public native L addAttribution(String text);

	/**
	 * Removes an attribution text.
	 *
	 * @param text the text
	 * @return the L class
	 */
	@JsMethod
	public native L removeAttribution(String text);

}
