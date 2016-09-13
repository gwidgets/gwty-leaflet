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
 * The Class ZoomPanOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class ZoomPanOptions {

	private ZoomPanOptions() {

	}

	@JsProperty
	private Boolean reset;

	@JsProperty
	private PanOptions pan;

	@JsProperty
	private ZoomOptions zoom;

	@JsProperty
	private Boolean animate;

	/**
	 * Gets whether the map view will be completely reset (without any
	 * animations). </br>
	 * default false
	 * 
	 * @return the reset
	 */
	@JsOverlay
	public final Boolean getReset() {
		return this.reset;
	}

	/**
	 * Gets the options for the panning (without the zoom change) if it occurs.
	 *
	 * @return the pan
	 */
	@JsOverlay
	public final PanOptions getPan() {
		return this.pan;
	}

	/**
	 * Gets the options for the zoom change if it occurs.
	 *
	 * @return the zoom
	 */
	@JsOverlay
	public final ZoomOptions getZoom() {
		return this.zoom;
	}

	/**
	 * An equivalent of passing animate to both zoom and pan options (see below)
	 * </br>
	 * default true
	 * 
	 * @return the animate
	 */
	@JsOverlay
	public final Boolean getAnimate() {
		return this.animate;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		/** The reset. */
		private Boolean reset = false;

		/** The pan. */
		private PanOptions pan = null;

		/** The zoom. */
		private ZoomOptions zoom = null;

		/** The animate. */
		private Boolean animate = true;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * Reset.
		 *
		 * @param reset
		 *            the reset
		 * @return the builder
		 */
		public Builder reset(Boolean reset) {
			this.reset = reset;
			return this;
		}

		/**
		 * Pan.
		 *
		 * @param pan
		 *            the pan
		 * @return the builder
		 */
		public Builder pan(PanOptions pan) {
			this.pan = pan;
			return this;
		}

		/**
		 * Zoom.
		 *
		 * @param zoom
		 *            the zoom
		 * @return the builder
		 */
		public Builder zoom(ZoomOptions zoom) {
			this.zoom = zoom;
			return this;
		}

		/**
		 * Animate.
		 *
		 * @param animate
		 *            the animate
		 * @return the builder
		 */
		public Builder animate(Boolean animate) {
			this.animate = animate;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the zoom pan options
		 */
		public ZoomPanOptions build() {
			ZoomPanOptions options = new ZoomPanOptions();
			options.animate = this.animate;
			options.pan = this.pan;
			options.zoom = this.zoom;
			options.reset = this.reset;

			return options;

		}

	}

}