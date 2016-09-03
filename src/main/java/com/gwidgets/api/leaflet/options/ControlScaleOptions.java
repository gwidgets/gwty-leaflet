package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ControlScaleOptions {
	
	private ControlScaleOptions() {
		
	}



	@JsProperty
	private String position = "bottomleft";

	@JsProperty
	private Number maxWidth = 100;

	@JsProperty
	private Boolean metric = true;

	@JsProperty
	private Boolean imperial = true;

	@JsProperty
	private Boolean updateWhenIdle = false;
	
	
	public String getPosition() {
		return this.position;
	}

	public Number getMaxWidth() {
		return this.maxWidth;
	}

	public Boolean getMetric() {
		return this.metric;
	}

	public Boolean getImperial() {
		return this.imperial;
	}

	public Boolean getUpdateWhenIdle() {
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
		

		public Builder position(String position){this.position = position; return this;} 

		
		public Builder maxWidth(Number maxWidth){this.maxWidth = maxWidth; return this;} 

		
		public Builder metric(Boolean metric){this.metric = metric; return this;} 

		
		public Builder imperial(Boolean imperial){this.imperial = imperial; return this;} 

		
		public Builder updateWhenIdle(Boolean updateWhenIdle){this.updateWhenIdle = updateWhenIdle; return this;}
		
		public ControlScaleOptions build(){
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