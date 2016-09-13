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
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class ControlScaleOptions {

	
	private ControlScaleOptions() {

	}


	@JsProperty
	private String position;

	@JsProperty
	private Number maxWidth;

	@JsProperty
	private Boolean metric;

	@JsProperty
	private Boolean imperial;

	@JsProperty
	private Boolean updateWhenIdle;

	/**
	 * Gets the position of the control (one of the map corners)
	 * </br>
	 * default "bottomleft"
	 * @return the position
	 */
	@JsOverlay
	public final String getPosition() {
		return this.position;
	}

	/**
	 * Gets Maximum width of the control in pixels. The width is set dynamically to show round values (e.g. 100, 200, 500).
	 * </br>
	 * default 100
	 * @return the max width
	 */
	@JsOverlay
	public final Number getMaxWidth() {
		return this.maxWidth;
	}

	/**
	 * Gets Whether to show the metric scale line (m/km).
	 * </br>
	 *  default true
	 * @return the metric
	 */
	@JsOverlay
	public final Boolean getMetric() {
		return this.metric;
	}

	/**
	 * Gets Whether to show the imperial scale line (mi/ft).
	 * </br>
	 * default true
	 * @return the imperial
	 */
	@JsOverlay
	public final Boolean getImperial() {
		return this.imperial;
	}

	/**
	 * Gets whether the control is updated on moveend, otherwise it's always up-to-date (updated on move).
	 * </br>
	 * default false
	 * @return the update when idle
	 */
	@JsOverlay
	public final Boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private String position = "bottomleft";

		private Number maxWidth = 100;

		private Boolean metric = true;

		private Boolean imperial = true;

		private Boolean updateWhenIdle = false;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * The position of the control (one of the map corners
		 * </br>
		 * possible values: "topleft", "topright", "bottomleft", "bottomright" 
		 * </br>
		 * @param position the position
		 * @return the builder
		 */
		public Builder position(String position) {
			this.position = position;
			return this;
		}

		/**
		 * Maximum width of the control in pixels. The width is set dynamically to show round values (e.g. 100, 200, 500).
		 * </br>
		 * default 100
		 * @param maxWidth the max width
		 * @return the builder
		 */
		public Builder maxWidth(Number maxWidth) {
			this.maxWidth = maxWidth;
			return this;
		}

		/**
		 * Whether to show the metric scale line (m/km).
		 * </br>
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
		 * </br>
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
		 * </br>
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
			options.position = this.position;
			options.maxWidth = maxWidth;
			options.metric = metric;
			options.imperial = imperial;
			options.updateWhenIdle = updateWhenIdle;

			return options;

		}

	}

}