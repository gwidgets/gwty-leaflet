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
 * The Class ImageOverlayOptions.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ImageOverlayOptions {

	private ImageOverlayOptions() {

	}

	@JsProperty
	private double opacity;

	@JsProperty
	private String attribution;

	@JsProperty
	private String alt;

	@JsProperty
	private boolean interactive;

	@JsProperty
	private boolean crossOrigin;

	@JsProperty
	private String pane;

	/**
	 * Gets The opacity of the image overlay.
	 *
	 * @return the opacity
	 */
	@JsOverlay public final double getOpacity() {
		return this.opacity;
	}

	/**
	 * Gets The attribution text of the image overlay. empty by default
	 *
	 * @return the attribution
	 */
	@JsOverlay public final String getAttribution() {
		return this.attribution;
	}

	@JsOverlay  public final String getAlt() {
		return this.alt;
	}

	@JsOverlay  public final boolean getInteractive() {
		return this.interactive;
	}

	@JsOverlay  public final boolean getCrossOrigin() {
		return this.crossOrigin;
	}

	@JsOverlay  public final String getPane() {
		return this.pane;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private Double opacity;

		private String attribution;

		private String alt;

		private Boolean interactive;

		private Boolean crossOrigin;

		private String pane;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * The opacity of the image overlay.
		 *
		 * default 1.0
		 * @param opacity the opacity
		 * @return the builder
		 */
		public Builder opacity(Double opacity){
			this.opacity = opacity;
			return this;
		}

		/**
		 * The attribution text of the image overlay.
		 *
		 * default empty
		 * @param attribution the attribution
		 * @return the builder
		 */
		public Builder attribution(String attribution){
			this.attribution = attribution;
			return this;
		}


		public Builder alt(String alt){this.alt = alt; return this;}

		public Builder interactive(Boolean interactive){this.interactive = interactive; return this;}

		public Builder crossOrigin(Boolean crossOrigin){this.crossOrigin = crossOrigin; return this;}

		public Builder pane(String pane){this.pane = pane; return this;}

		/**
		 * Builds the ImageOverlayOptions instance
		 *
		 * @return the image overlay options
		 */
		public ImageOverlayOptions build(){
			ImageOverlayOptions options = new ImageOverlayOptions();
			if(this.opacity != null)
				options.opacity = this.opacity;
			if(this.attribution != null)
				options.attribution = this.attribution;
			if(this.alt != null)
				options.alt = this.alt;
			if(this.interactive != null)
				options.interactive = this.interactive;
			if(this.crossOrigin != null)
				options.crossOrigin = this.crossOrigin;
			if(this.pane != null)
				options.pane = this.pane;

			return options;
		}
	}
}