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
import jsinterop.annotations.JsType;


/**
 * An interface implemented by interaction handlers.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public interface IHandler {

	
	/**
	 * Enables the handler.
	 */
	public void enable();

	
	/**
	 * Disables the handler.
	 */
	public void disable();

	
	
	/**
	 * Returns true if the handler is enabled.
	 *
	 * @return the boolean
	 */
	public Boolean enabled();



}