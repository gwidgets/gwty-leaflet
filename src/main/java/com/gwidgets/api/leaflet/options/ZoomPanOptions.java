package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
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

	@JsOverlay public final Boolean getReset() {
		return this.reset;
	}

	@JsOverlay public final PanOptions getPan() {
		return this.pan;
	}

	@JsOverlay public final ZoomOptions getZoom() {
		return this.zoom;
	}

	@JsOverlay public final Boolean getAnimate() {
		return this.animate;
	}

	public static class Builder {

		private Boolean reset = false;

		private PanOptions pan = null;

		private ZoomOptions zoom = null;

		private Boolean animate = true;

		public Builder() {

		}

		public Builder reset(Boolean reset) {
			this.reset = reset;
			return this;
		}

		public Builder pan(PanOptions pan) {
			this.pan = pan;
			return this;
		}

		public Builder zoom(ZoomOptions zoom) {
			this.zoom = zoom;
			return this;
		}

		public Builder animate(Boolean animate) {
			this.animate = animate;
			return this;
		}
		
		public ZoomPanOptions build(){
			ZoomPanOptions options = new ZoomPanOptions();
			options.animate = this.animate;
			options.pan = this.pan;
			options.zoom = this.zoom;
			options.reset = this.reset;
			
			return options;
			
		}

	}

}