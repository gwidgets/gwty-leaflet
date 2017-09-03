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
package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * The Class ControlAttributionOptions.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ControlAttributionOptions {
	
	
	private ControlAttributionOptions(){
		
		
	}

	@JsProperty
	private String position;

	@JsProperty
	private String prefix;
	
	/**
	 * Gets the position of the control (one of the map corners). See class constants for possible values
	 * </br>
	 *default "bottomright"
	 * @return the position
	 */
	@JsOverlay public final String getPosition() {
		return this.position;
	}

	/**
	 * Gets the prefix: The HTML text shown before the attributions. Pass false to disable.
	 * </br>
	 * default "lealflet"
	 * @return the prefix
	 */
	@JsOverlay public final String getPrefix() {
		return this.prefix;
	}

	/**
	 * The options Builder.
	 */
	public static class Builder{
		

		private String position;

		private String prefix;
		
		/**
		 * Instantiates a new builder.
		 */
		public Builder(){
			
			
		}
		
		
		/**
		 * The position of the control (one of the map corners).
		 * </br>
		 * default "bottomright"
		 * </br>
		 * possible values: "topleft", "topright", "bottomleft", "bottomright"
		 *
		 * @param position the position
		 * @return the builder
		 */
		public Builder position(String position){
			this.position = position;
			return this;
		}
		
		/**
		 * The HTML text shown before the attributions. Pass false to disable.
		 * </br>
		 * default "Leaflet"
		 * @param prefix the prefix
		 * @return the builder
		 */
		public Builder prefix(String prefix){
			this.prefix = prefix;
			return this;
		}
		
		/**
		 * Builds a new ControlAttributionOptions instance
		 *
		 * @return the control attribution options
		 */
		public ControlAttributionOptions build(){
			
			ControlAttributionOptions options = new ControlAttributionOptions();
			if(this.position != null)
			options.position = this.position;
			if(this.prefix != null)
			options.prefix = this.prefix;
			
			return options;
		}
	}
}