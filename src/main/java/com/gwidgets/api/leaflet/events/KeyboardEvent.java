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

import com.gwidgets.api.leaflet.elemental.DOMKeyboardEvent;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;



/**
 * The Class KeyboardEvent.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, name="Object", namespace=jsinterop.annotations.JsPackage.GLOBAL)
public class KeyboardEvent extends Event {
	

	protected KeyboardEvent() {}

	/**
	 * The original Dom KeyboardEvent that triggered this Leaflet event. 
	 *
	 * @return the popup
	 */
	@JsProperty
	public final native DOMKeyboardEvent getOriginalEvent();

}
