package com.gwidgets.api.leaflet.options;
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
import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * The Class ControlScaleOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class ControlScaleOptions {
	
	private ControlScaleOptions() {

	}

	@JsProperty
	private String position;

	@JsProperty
	private double maxWidth;

	@JsProperty
	private boolean metric;

	@JsProperty
	private boolean imperial;

	@JsProperty
	private boolean updateWhenIdle;

	/**
	 * Gets the position of the control (one of the map corners)
	 *
	 * default "bottomleft"
	 * @return the position
	 */
	@JsOverlay
	public final String getPosition() {
		return this.position;
	}

	/**
	 * Gets Maximum width of the control in pixels. The width is set dynamically to show round values (e.g. 100, 200, 500).
	 *
	 * default 100
	 * @return the max width
	 */
	@JsOverlay
	public final double getMaxWidth() {
		return this.maxWidth;
	}

	/**
	 * Gets Whether to show the metric scale line (m/km).
	 *
	 *  default true
	 * @return the metric
	 */
	@JsOverlay
	public final boolean getMetric() {
		return this.metric;
	}

	/**
	 * Gets Whether to show the imperial scale line (mi/ft).
	 *
	 * default true
	 * @return the imperial
	 */
	@JsOverlay
	public final boolean getImperial() {
		return this.imperial;
	}

	/**
	 * Gets whether the control is updated on moveend, otherwise it's always up-to-date (updated on move).
	 *
	 * default false
	 * @return the update when idle
	 */
	@JsOverlay
	public final boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private String position;

		private Double maxWidth;

		private Boolean metric;

		private Boolean imperial;

		private Boolean updateWhenIdle;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * The position of the control (one of the map corners
		 *
		 * possible values: "topleft", "topright", "bottomleft", "bottomright" 
		 *
		 * @param position the position
		 * @return the builder
		 */
		public Builder position(String position) {
			this.position = position;
			return this;
		}

		/**
		 * Maximum width of the control in pixels. The width is set dynamically to show round values (e.g. 100, 200, 500).
		 *
		 * default 100
		 * @param maxWidth the max width
		 * @return the builder
		 */
		public Builder maxWidth(Double maxWidth) {
			this.maxWidth = maxWidth;
			return this;
		}

		/**
		 * Whether to show the metric scale line (m/km).
		 *
		 * default true
		 * @param metric the metric
		 * @return the builder
		 */
		public Builder metric(Boolean metric) {
			this.metric = metric;
			return this;
		}

		/**
		 * Whether to show the imperial scale line (mi/ft).
		 *
		 * default true
		 * @param imperial the imperial
		 * @return the builder
		 */
		public Builder imperial(Boolean imperial) {
			this.imperial = imperial;
			return this;
		}

		/**
		 * If true, the control is updated on moveend, otherwise it's always up-to-date (updated on move).
		 *
		 * default false
		 * @param updateWhenIdle the update when idle
		 * @return the builder
		 */
		public Builder updateWhenIdle(Boolean updateWhenIdle) {
			this.updateWhenIdle = updateWhenIdle;
			return this;
		}

		/**
		 * Builds the ControlScaleOptions new instance
		 *
		 * @return the control scale options
		 */
		public ControlScaleOptions build() {
			ControlScaleOptions options = new ControlScaleOptions();
			if(this.position != null)
			options.position = this.position;
			if(this.maxWidth != null)
			options.maxWidth = this.maxWidth;
			if(this.metric != null)
			options.metric = this.metric;
			if(this.imperial != null)
			options.imperial = this.imperial;
			if(this.updateWhenIdle != null)
			options.updateWhenIdle = this.updateWhenIdle;

			return options;
		}
	}
}