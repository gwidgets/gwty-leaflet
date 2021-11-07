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
 * The Class ControlLayersOptions.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ControlLayersOptions {
	

	private ControlLayersOptions(){
		
		
	}

	@JsProperty
	private String position;

	@JsProperty
	private boolean collapsed;

	@JsProperty
	private boolean autoZIndex;
	
	
	/**
	 * Gets the position of the control (one of the map corners).
	 *
	 * default "topright"
	 * 
	 * @return the position
	 */
	@JsOverlay public final String getPosition() {
		return this.position;
	}


	/**
	 * Gets whether the control will be collapsed into an icon and expanded on mouse hover or touch.
	 *
	 * default true
	 * @return the collapsed
	 */
	@JsOverlay public final boolean getCollapsed() {
		return this.collapsed;
	}


	/**
	 * Gets whether the control will assign zIndexes in increasing order to all of its layers so that the order is preserved when switching them on/off.
	 *
	 * default true
	 * @return the auto Z index
	 */
	@JsOverlay public final boolean getAutoZIndex() {
		return this.autoZIndex;
	}


	/**
	 * The Class Builder.
	 */
	public static class Builder {
		

		private String position;

		private Boolean collapsed;

		private Boolean autoZIndex;
		
		
		public Builder(){
			
			
		}
		
		/**
		 * The position of the control (one of the map corners).
		 *
		 * default "topright"
		 *
		 * possible values: "topleft", "topright", "bottomleft", "bottomright" 
		 * @param position the position
		 * @return the builder
		 */
		public Builder position(String position){this.position = position;return this;} 

		/**
		 * If true, the control will be collapsed into an icon and expanded on mouse hover or touch.
		 *
		 * default true
		 * @param collapsed the collapsed
		 * @return the builder
		 */
		public Builder collapsed(Boolean collapsed){this.collapsed = collapsed; return this;} 

		/**
		 * If true, the control will assign zIndexes in increasing order to all of its layers so that the order is preserved when switching them on/off.
		 *
		 * default true
		 * @param autoZIndex the auto Z index
		 * @return the builder
		 */
		public Builder autoZIndex(Boolean autoZIndex){this.autoZIndex = autoZIndex; return this;} 
		
		
		/**
		 * Builds the ControlLayersOptions new instance
		 * 
		 *  
		 * @return the control layers options
		 */
		public ControlLayersOptions build(){
			
			ControlLayersOptions options = new ControlLayersOptions();
			if(this.position != null)
			options.position = this.position;
			if(this.collapsed != null)
			options.collapsed = this.collapsed;
			if(this.autoZIndex != null)
			options.autoZIndex = this.autoZIndex;
			
			return options;
			
		}
		
	}
	

}