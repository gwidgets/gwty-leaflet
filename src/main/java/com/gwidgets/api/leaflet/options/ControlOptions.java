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
 * The Class ControlOptions.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ControlOptions {
	

	@JsProperty
	private String position;
	
	
	private ControlOptions(){
		
		
	}

	
	/**
	 * Gets The initial position of the control (one of the map corners).
	 * </br>
	 * default "topright"
	 * @return the position
	 */
	@JsOverlay public final String getPosition() {
		return this.position;
	}


	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
	
		private String position = "topleft";

		
		public Builder() {

		}
		
		/**
		 * The initial position of the control (one of the map corners).
		 * </br> 
		 * default "topright"
		 * </br> 
		 * possible values: "topleft", "topright", "bottomleft", "bottomright" 
		 * @param position the position
		 * @return the builder
		 */
		public Builder position(String position){
			this.position = position;
			return this;
		}
		
		
		/**
		 * Builds the ControlOptions new instance
		 *
		 * @return the control options
		 */
		public ControlOptions build(){
			ControlOptions options = new ControlOptions();
			options.position = position;
			
			return options;
			
		}

	}


	

}