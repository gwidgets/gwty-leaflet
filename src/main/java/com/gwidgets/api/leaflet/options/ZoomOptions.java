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
 * The Class ZoomOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ZoomOptions {
	
	
	private ZoomOptions() {
		
	}

	@JsProperty
	private boolean animate;
	
	
	/**
	 * Gets whether zoom animation will happen if the zoom origin is inside the current view. If true, the map will attempt animating zoom disregarding where zoom origin is. Setting false will make it always reset the view completely without animation.
	 *
	 * default true
	 * @return the animate
	 */
	@JsOverlay public final boolean getAnimate() {
		return this.animate;
	}


	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
		
		
		private Boolean animate;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}
		
		/**
		 * zoom animation will happen if the zoom origin is inside the current view. If true, the map will attempt animating zoom disregarding where zoom origin is. Setting false will make it always reset the view completely without animation.
		 *
		 * default true
		 *
		 * @param animate the animate
		 * @return the builder
		 */
		public Builder animate(Boolean animate){
			
			this.animate = animate;
			
			return this;
		}
		
		/**
		 * Builds the ZoomOptions new instance
		 *
		 * @return the zoom options
		 */
		public ZoomOptions build(){
			ZoomOptions options = new ZoomOptions();
			if(this.animate != null)
			options.animate = this.animate;
			
			return options;
		}

	}

}