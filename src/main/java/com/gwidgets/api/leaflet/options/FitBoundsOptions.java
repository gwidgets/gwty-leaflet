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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;


/**
 * The Class FitBoundsOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class FitBoundsOptions {


	private FitBoundsOptions() {

	}

	@JsProperty
	private Point paddingTopLeft;
	
	@JsProperty
	private Point paddingBottomRight;
	
	@JsProperty
	private Point padding;
	
	@JsProperty
	private Number maxZoom;
	
	/*****************************************
	********************************************/
	@JsProperty
    private Boolean animate;
	/**********************************************
	*********************************************/
    
    /*****************************************
	********************************************/
	@JsProperty
    private Number duration;
	/**********************************************
	*********************************************/
    
    /*****************************************
	********************************************/
	@JsProperty
    private Number easeLinearity;
	/**********************************************
	*********************************************/
    /*****************************************
	********************************************/
	@JsProperty
    private Boolean noMoveStart;
	/**********************************************
	*********************************************/
    

	/**
	 * Gets the maximum possible zoom to use.
	 *
	 * @return the max zoom
	 */
	@JsOverlay
	public final Number getMaxZoom() {
		return this.maxZoom;
	}

	/**
	 * Gets the amount of padding in the top left corner of a map container that shouldn't be accounted for when setting the view to fit bounds. 
	 *
	 * @return the padding top left
	 */
	@JsOverlay
	public final Point getPaddingTopLeft() {
		return this.paddingTopLeft;
	}

	/**
	 * Gets the same for bottom right corner of the map.
	 *
	 * @return the padding bottom right
	 */
	@JsOverlay
	public final Point getPaddingBottomRight() {
		return this.paddingBottomRight;
	}

	/**
	 * Gets the equivalent of setting both top left and bottom right padding to the same value.
	 *
	 * @return the padding
	 */
	@JsOverlay
	public final Point getPadding() {
		return this.padding;
	}

	public final Boolean getAnimate() {
		return this.animate;
	}

	public final Number getDuration() {
		return this.duration;
	}

	public final Number getEaseLinearity() {
		return this.easeLinearity;
	}

	public final Boolean getNoMoveStart() {
		return this.noMoveStart;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private Point paddingTopLeft = L.point(0, 0, true);

		private Point paddingBottomRight = L.point(0, 0, true);

		private Point padding = L.point(0, 0, true);

		private Number maxZoom = null;
		
	    private Boolean animate;

	    private Number duration = 0.25;

	    private Number easeLinearity = 0.25;

	    private Boolean noMoveStart = false;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * Sets the amount of padding in the top left corner of a map container that shouldn't be accounted for when setting the view to fit bounds. Useful if you have some control overlays on the map like a sidebar and you don't want them to obscure objects you're zooming to.
		 * </br>
		 * default [0, 0]
		 * 
		 * @param paddingTopLeft the padding top left
		 * @return the builder
		 */
		public Builder paddingTopLeft(Point paddingTopLeft) {
			this.paddingTopLeft = paddingTopLeft;
			return this;
		}

		/**
		 * The same for bottom right corner of the map.
		 * </br>
		 * default [0, 0]
		 * 
		 * @param paddingBottomRight the padding bottom right
		 * @return the builder
		 */
		public Builder paddingBottomRight(Point paddingBottomRight) {
			this.paddingBottomRight = paddingBottomRight;
			return this;
		}

		/**
		 * Equivalent of setting both top left and bottom right padding to the same value.
		 * </br>
		 * default [0, 0]
		 * 
		 * @param padding the padding
		 * @return the builder
		 */
		public Builder padding(Point padding) {
			this.padding = padding;
			return this;
		}

		/**
		 * The maximum possible zoom to use.
		 * </br>
		 * default null
		 * 
		 * @param maxZoom the max zoom
		 * @return the builder
		 */
		public Builder maxZoom(Number maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}
		
		public Builder animate(Boolean animate){this.animate = animate; return this;}

	    public Builder duration(Number duration){this.duration = duration; return this;}

	    public Builder easeLinearity(Number easeLinearity){this.easeLinearity = easeLinearity; return this;}

	    public Builder noMoveStart(Boolean noMoveStart){this.noMoveStart = noMoveStart; return this;}

		/**
		 * Builds the FitBoundsOptions new instance
		 *
		 * @return the fit bounds options
		 */
		public FitBoundsOptions build() {
			FitBoundsOptions options = new FitBoundsOptions();
			options.paddingTopLeft = this.paddingTopLeft;
			options.paddingBottomRight = this.paddingBottomRight;
			options.padding = this.padding;
			options.maxZoom = this.maxZoom;
		    options.animate = this.animate;
		    options.duration = this.duration;
		    options.easeLinearity = this.easeLinearity;
		    options.noMoveStart = this.noMoveStart;

			return options;

		}

	}

}