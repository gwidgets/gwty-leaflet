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
 * The Class ControlZoomOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class ControlZoomOptions {

	private ControlZoomOptions() {

	}

	@JsProperty
	private String position;

	@JsProperty
	private String zoomInText;

	@JsProperty
	private String zoomOutText;

	@JsProperty
	private String zoomInTitle;

	@JsProperty
	private String zoomOutTitle;

	/**
	 * Gets the position of the control (one of the map corners).
	 * default "topleft"
	 * 
	 * @return the position
	 */
	@JsOverlay
	public final String getPosition() {
		return this.position;
	}

	/**
	 * Gets The text set on the zoom in button.
	 * default "+"
	 * 
	 * @return the zoomInText
	 */
	@JsOverlay
	public final String getZoomInText() {
		return this.zoomInText;
	}

	/**
	 * Gets The text set on the zoom out button.
	 * default "-"
	 * 
	 * @return the zoomOutText
	 */
	@JsOverlay
	public final String getZoomOutText() {
		return this.zoomOutText;
	}

	/**
	 * Gets The title set on the zoom in button.
	 * default "Zoom in"
	 * 
	 * @return the zoomInTitle
	 */
	@JsOverlay
	public final String getzoomInTitle() {
		return this.zoomInTitle;
	}

	/**
	 * Gets The title set on the zoom out button.
	 * default "Zoom out"
	 * 
	 * @return the zoomOutTitle
	 */
	@JsOverlay
	public final String getzoomOutTitle() {
		return this.zoomOutTitle;
	}

	public static class Builder {

		private String position;

		private String zoomInText;

		private String zoomOutText;

		private String zoomInTitle;

		private String zoomOutTitle;

		public Builder() {

		}

		/**
		 * The position of the control (one of the map corners).
		 * default "topleft"
		 * possible values: "topleft", "topright", "bottomleft", "bottomright"
		 * 
		 * @param position
		 *            the position
		 * @return the builder
		 */
		public Builder position(String position) {

			this.position = position;
			return this;
		}

		/**
		 * The text set on the zoom in button.
		 * default "+"
		 * 
		 * @param zoomInText
		 *            the zoom in text
		 * @return the builder
		 */
		public Builder zoomInText(String zoomInText) {

			this.zoomInText = zoomInText;
			return this;
		}

		/**
		 * The text set on the zoom out button.
		 * default "-"
		 * 
		 * @param zoomOutText
		 *            the zoom out text
		 * @return the builder
		 */
		public Builder zoomOutText(String zoomOutText) {

			this.zoomOutText = zoomOutText;
			return this;
		}

		/**
		 * The title set on the zoom in button.
		 * default "Zoom in"
		 * 
		 * @param zoomInTitle
		 *            the zoom in title
		 * @return the builder
		 */
		public Builder zoomInTitle(String zoomInTitle) {

			this.zoomInTitle = zoomInTitle;
			return this;
		}

		/**
		 * The title set on the zoom out button.
		 * default "Zoom out"
		 * 
		 * @param zoomOutTitle
		 *            the zoom out title
		 * @return the builder
		 */
		public Builder zoomOutTitle(String zoomOutTitle) {

			this.zoomOutTitle = zoomOutTitle;
			return this;
		}

		/**
		 * Builds the ControlZoomOptions new instance
		 *
		 * @return the control zoom options
		 */
		public ControlZoomOptions build() {
			ControlZoomOptions options = new ControlZoomOptions();
			if(this.position != null)
			options.position = this.position;
			if(this.zoomInText != null)
			options.zoomInText = this.zoomInText;
			if(this.zoomOutText != null)
			options.zoomOutText = this.zoomOutText;
			if(this.zoomInTitle != null)
			options.zoomInTitle = this.zoomInTitle;
			if(this.zoomOutTitle != null)
			options.zoomOutTitle = this.zoomOutTitle;
			return options;
		}
	}
}