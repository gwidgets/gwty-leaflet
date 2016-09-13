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
 * The Class LocateOptions.
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class LocateOptions {

	private LocateOptions() {

	}

	@JsProperty
	private Boolean watch;

	@JsProperty
	private Boolean setView;

	@JsProperty
	private Number maxZoom;

	@JsProperty
	private Number timeout;

	@JsProperty
	private Number maximumAge;

	@JsProperty
	private Boolean enableHighAccuracy;

	/**
	 * Gets whether continuous watching of location changes (instead of
	 * detecting it once) using W3C watchPosition method is set. </br>
	 * default false
	 *
	 * @return the watch
	 */
	@JsOverlay
	public final Boolean getWatch() {
		return this.watch;
	}

	/**
	 * Gets whether If true, automatically sets the map view to the user
	 * location with respect to detection accuracy, or to world view if
	 * geolocation failed. </br>
	 * default false
	 * 
	 * @return the sets the view
	 */
	@JsOverlay
	public final Boolean getSetView() {
		return this.setView;
	}

	/**
	 * Gets the maximum zoom for automatic view setting when using `setView`
	 * option. </br>
	 * default infinity
	 * 
	 * @return the max zoom locate
	 */
	@JsOverlay
	public final Number getMaxZoom() {
		return this.maxZoom;
	}

	/**
	 * Gets the number of milliseconds to wait for a response from geolocation
	 * before firing a locationerror event. </br>
	 * default 10000
	 * 
	 * @return the timeout
	 */
	@JsOverlay
	public final Number getTimeout() {
		return this.timeout;
	}

	/**
	 * Gets the maximum age of detected location. If less than this amount of
	 * milliseconds passed since last geolocation response, locate will return a
	 * cached location. </br>
	 * default 0
	 * 
	 * @return the maximum age
	 */
	@JsOverlay
	public final Number getMaximumAge() {
		return this.maximumAge;
	}

	/**
	 * Gets whether high accuracy is enabled, see description in
	 * <a href="http://dev.w3.org/geo/api/spec-source.html#high-accuracy">the
	 * W3C spec </a>. </br>
	 * default false
	 * 
	 * @return the enable high accuracy
	 */
	@JsOverlay
	public final Boolean getEnableHighAccuracy() {
		return this.enableHighAccuracy;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private Boolean watch = false;

		private Boolean setView = false;

		private Number maxZoom = Double.POSITIVE_INFINITY;

		private Number timeout = 10000;

		private Number maximumAge = 0;

		private Boolean enableHighAccuracy = false;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * If true, starts continuous watching of location changes (instead of
		 * detecting it once) using W3C watchPosition method. You can later stop
		 * watching using map.stopLocate() method. </br>
		 * default false
		 * 
		 * @param watch
		 *            the watch
		 * @return the builder
		 */
		public Builder watch(Boolean watch) {
			this.watch = watch;
			return this;
		}

		/**
		 * If true, automatically sets the map view to the user location with
		 * respect to detection accuracy, or to world view if geolocation
		 * failed. </br>
		 * default false
		 * 
		 * @param setView
		 *            the set view
		 * @return the builder
		 */
		public Builder setView(Boolean setView) {
			this.setView = setView;
			return this;
		}

		/**
		 * The maximum zoom for automatic view setting when using `setView`
		 * option. </br>
		 * default infinity
		 * 
		 * @param maxZoomLocate
		 *            the max zoom locate
		 * @return the builder
		 */
		public Builder maxZoom(Number maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		/**
		 * Number of milliseconds to wait for a response from geolocation before
		 * firing a locationerror event.Timeout. </br>
		 * default 10000
		 * 
		 * @param timeout
		 *            the timeout
		 * @return the builder
		 */
		public Builder timeout(Number timeout) {
			this.timeout = timeout;
			return this;
		}

		/**
		 * Maximum age of detected location. If less than this amount of
		 * milliseconds passed since last geolocation response, locate will
		 * return a cached location. </br>
		 * default 0
		 * 
		 * @param maximumAge
		 *            the maximum age
		 * @return the builder
		 */
		public Builder maximumAge(Number maximumAge) {
			this.maximumAge = maximumAge;
			return this;
		}

		/**
		 * Gets whether high accuracy is enabled, see description in <a href=
		 * "http://dev.w3.org/geo/api/spec-source.html#high-accuracy">the W3C
		 * spec </a>. </br>
		 * default false
		 * 
		 * @param enableHighAccuracy
		 *            the enable high accuracy
		 * @return the builder
		 */
		public Builder enableHighAccuracy(Boolean enableHighAccuracy) {
			this.enableHighAccuracy = enableHighAccuracy;
			return this;
		}

		/**
		 * Builds the LocateOptions new instance </br>
		 * 
		 * @return the locate options
		 */
		public LocateOptions build() {

			LocateOptions options = new LocateOptions();
			options.watch = this.watch;
			options.setView = this.setView;
			options.maxZoom = this.maxZoom;
			options.timeout = this.timeout;
			options.maximumAge = this.maximumAge;
			options.enableHighAccuracy = this.enableHighAccuracy;

			return options;

		}

	}

}
