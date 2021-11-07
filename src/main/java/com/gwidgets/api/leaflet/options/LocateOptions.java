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
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class LocateOptions {

	private LocateOptions() {

	}

	@JsProperty
	private boolean watch;

	@JsProperty
	private boolean setView;

	@JsProperty
	private double maxZoom;

	@JsProperty
	private double timeout;

	@JsProperty
	private double maximumAge;

	@JsProperty
	private boolean enableHighAccuracy;

	/**
	 * Gets whether continuous watching of location changes (instead of
	 * detecting it once) using W3C watchPosition method is set.
	 * default false
	 *
	 * @return the watch
	 */
	@JsOverlay
	public final boolean getWatch() {
		return this.watch;
	}

	/**
	 * Gets whether If true, automatically sets the map view to the user
	 * location with respect to detection accuracy, or to world view if
	 * geolocation failed.
	 * default false
	 * 
	 * @return the sets the view
	 */
	@JsOverlay
	public final boolean getSetView() {
		return this.setView;
	}

	/**
	 * Gets the maximum zoom for automatic view setting when using `setView`
	 * option.
	 * default infinity
	 * 
	 * @return the max zoom locate
	 */
	@JsOverlay
	public final double getMaxZoom() {
		return this.maxZoom;
	}

	/**
	 * Gets the number of milliseconds to wait for a response from geolocation
	 * before firing a locationerror event.
	 * default 10000
	 * 
	 * @return the timeout
	 */
	@JsOverlay
	public final double getTimeout() {
		return this.timeout;
	}

	/**
	 * Gets the maximum age of detected location. If less than this amount of
	 * milliseconds passed since last geolocation response, locate will return a
	 * cached location.
	 * default 0
	 * 
	 * @return the maximum age
	 */
	@JsOverlay
	public final double getMaximumAge() {
		return this.maximumAge;
	}

	/**
	 * Gets whether high accuracy is enabled, see description in
	 * <a href="http://dev.w3.org/geo/api/spec-source.html#high-accuracy">the
	 * W3C spec </a>.
	 * default false
	 * 
	 * @return the enable high accuracy
	 */
	@JsOverlay
	public final boolean getEnableHighAccuracy() {
		return this.enableHighAccuracy;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private Boolean watch;

		private Boolean setView;

		private Double maxZoom;

		private Double timeout;

		private Double maximumAge;

		private Boolean enableHighAccuracy;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * If true, starts continuous watching of location changes (instead of
		 * detecting it once) using W3C watchPosition method. You can later stop
		 * watching using map.stopLocate() method.
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
		 * failed.
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
		 * option.
		 * default infinity
		 * 
		 * @param maxZoom
		 *            the max zoom locate
		 * @return the builder
		 */
		public Builder maxZoom(double maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		/**
		 * Number of milliseconds to wait for a response from geolocation before
		 * firing a locationerror event.Timeout.
		 * default 10000
		 * 
		 * @param timeout
		 *            the timeout
		 * @return the builder
		 */
		public Builder timeout(double timeout) {
			this.timeout = timeout;
			return this;
		}

		/**
		 * Maximum age of detected location. If less than this amount of
		 * milliseconds passed since last geolocation response, locate will
		 * return a cached location.
		 * default 0
		 * 
		 * @param maximumAge
		 *            the maximum age
		 * @return the builder
		 */
		public Builder maximumAge(double maximumAge) {
			this.maximumAge = maximumAge;
			return this;
		}

		/**
		 * Gets whether high accuracy is enabled, see description in <a href=
		 * "http://dev.w3.org/geo/api/spec-source.html#high-accuracy">the W3C
		 * spec </a>.
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
		 * Builds the LocateOptions new instance
		 * 
		 * @return the locate options
		 */
		public LocateOptions build() {
			LocateOptions options = new LocateOptions();
			if(this.watch != null)
			options.watch = this.watch;
			if(this.setView != null)
			options.setView = this.setView;
			if(this.maxZoom != null)
			options.maxZoom = this.maxZoom;
			if(this.timeout != null)
			options.timeout = this.timeout;
			if(this.maximumAge != null)
			options.maximumAge = this.maximumAge;
			if(this.enableHighAccuracy != null)
			options.enableHighAccuracy = this.enableHighAccuracy;

			return options;
		}
	}
}