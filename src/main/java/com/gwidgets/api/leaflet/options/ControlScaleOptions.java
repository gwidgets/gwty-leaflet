package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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

	@JsOverlay
	public final String getPosition() {
		return this.position;
	}

	@JsOverlay
	public final Number getMaxWidth() {
		return this.maxWidth;
	}

	@JsOverlay
	public final Boolean getMetric() {
		return this.metric;
	}

	@JsOverlay
	public final Boolean getImperial() {
		return this.imperial;
	}

	@JsOverlay
	public final Boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	public static class Builder {

		private String position = "bottomleft";

		private Number maxWidth = 100;

		private Boolean metric = true;

		private Boolean imperial = true;

		private Boolean updateWhenIdle = false;

		public Builder() {

		}

		public Builder position(String position) {
			this.position = position;
			return this;
		}

		public Builder maxWidth(Number maxWidth) {
			this.maxWidth = maxWidth;
			return this;
		}

		public Builder metric(Boolean metric) {
			this.metric = metric;
			return this;
		}

		public Builder imperial(Boolean imperial) {
			this.imperial = imperial;
			return this;
		}

		public Builder updateWhenIdle(Boolean updateWhenIdle) {
			this.updateWhenIdle = updateWhenIdle;
			return this;
		}

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