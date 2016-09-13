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
 * The Class PanOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PanOptions {
	

	private PanOptions() {
		
	}

    @JsProperty
	private  Boolean animate;
	
	@JsProperty
	private  Number duration;
	
	@JsProperty
	private  Number easeLinearity;
	
	@JsProperty
	private  Boolean noMoveStart;
	
	
	/**
	 * Gets whether panning will always be animated if possible
	 * </br>
	 * @return the animate
	 */
	@JsOverlay public final Boolean getAnimate() {
		return this.animate;
	}




	/**
	 * Gets the duration of animated panning.
	 * </br>
	 * default 0.25
	 * @return the duration
	 */
	@JsOverlay public final Number getDuration() {
		return this.duration;
	}




	/**
	 * Gets The curvature factor of panning animation easing (third parameter of the Cubic Bezier curve). 1.0 means linear animation, the less the more bowed the curve.
	 * </br>
	 * default 0.25
	 * @return the ease linearity
	 */
	@JsOverlay public final Number getEaseLinearity() {
		return this.easeLinearity;
	}




	/**
	 * Gets whether If true, panning won't fire movestart event on start (used internally for panning inertia).
	 * </br>
	 * default false
	 * @return the no move start
	 */
	@JsOverlay public final Boolean getNoMoveStart() {
		return this.noMoveStart;
	}




	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
		private  Boolean animate = true;
		 
		private  Number duration = 0.25;
		 
		private  Number easeLinearity = 0.25;
		 
		private  Boolean noMoveStart = false;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}
		
		/**
		 * If true, panning will always be animated if possible. If false, it will not animate panning, either resetting the map view if panning more than a screen away, or just setting a new offset for the map pane (except for `panBy` which always does the latter).
		 * </br>
		 * @param animate the animate
		 * @return the builder
		 */
		public  Builder animate(Boolean animate){this.animate = animate; return this;}
		 
		/**
		 * Duration of animated panning.
		 * </br>
		 * default 0.25
		 * @param duration the duration
		 * @return the builder
		 */
		public  Builder duration(Number duration){this.duration = duration; return this;}
		 
		/**
		 * The curvature factor of panning animation easing (third parameter of the Cubic Bezier curve). 1.0 means linear animation, the less the more bowed the curve.
		 * </br>
		 * default 0.25
		 * @param easeLinearity the ease linearity
		 * @return the builder
		 */
		public  Builder easeLinearity(Number easeLinearity){this.easeLinearity = easeLinearity; return this;}
		 
		/**
		 * If true, panning won't fire movestart event on start (used internally for panning inertia).
		 * </br>
		 * default false
		 * @param noMoveStart the no move start
		 * @return the builder
		 */
		public  Builder noMoveStart(Boolean noMoveStart){this.noMoveStart = noMoveStart; return this;}
		
		
		/**
		 * Builds the PanOptions new instance
		 *
		 * @return the pan options
		 */
		public PanOptions build(){
			PanOptions options = new PanOptions();
			options.animate = this.animate;
			options.duration = this.duration;
			options.easeLinearity = this.easeLinearity;
			options.noMoveStart = this.noMoveStart;
			
			return options;
		}

	}

}