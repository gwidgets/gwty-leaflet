package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ZoomPanOptions {

	private ZoomPanOptions() {

	}

	@JsProperty
	private Boolean reset = false;
	@JsProperty
	private PanOptions pan = null;
	@JsProperty
	private ZoomOptions zoom = null;
	@JsProperty
	private Boolean animate = true;

	public Boolean getReset() {
		return this.reset;
	}

	public PanOptions getPan() {
		return this.pan;
	}

	public ZoomOptions getZoom() {
		return this.zoom;
	}

	public Boolean getAnimate() {
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