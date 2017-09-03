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
	private  double duration;
	
	@JsProperty
	private  double easeLinearity;
	
	@JsProperty
	private  boolean noMoveStart;
	
	

	/**
	 * Gets the duration of animated panning.
	 * </br>
	 * default 0.25
	 * @return the duration
	 */
	@JsOverlay public final double getDuration() {
		return this.duration;
	}




	/**
	 * Gets The curvature factor of panning animation easing (third parameter of the Cubic Bezier curve). 1.0 means linear animation, the less the more bowed the curve.
	 * </br>
	 * default 0.25
	 * @return the ease linearity
	 */
	@JsOverlay public final double getEaseLinearity() {
		return this.easeLinearity;
	}




	/**
	 * Gets whether If true, panning won't fire movestart event on start (used internally for panning inertia).
	 * </br>
	 * default false
	 * @return the no move start
	 */
	@JsOverlay public final boolean getNoMoveStart() {
		return this.noMoveStart;
	}




	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private  Double duration;
		 
		private  Double easeLinearity;
		 
		private  Boolean noMoveStart;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}
		
		 
		/**
		 * Duration of animated panning.
		 * </br>
		 * default 0.25
		 * @param duration the duration
		 * @return the builder
		 */
		public  Builder duration(Double duration){this.duration = duration; return this;}
		 
		/**
		 * The curvature factor of panning animation easing (third parameter of the Cubic Bezier curve). 1.0 means linear animation, the less the more bowed the curve.
		 * </br>
		 * default 0.25
		 * @param easeLinearity the ease linearity
		 * @return the builder
		 */
		public  Builder easeLinearity(Double easeLinearity){this.easeLinearity = easeLinearity; return this;}
		 
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
			if(this.duration != null)
			options.duration = this.duration;
			if(this.easeLinearity != null)
			options.easeLinearity = this.easeLinearity;
			if(this.noMoveStart != null)
			options.noMoveStart = this.noMoveStart;
			
			return options;
		}
	}
}