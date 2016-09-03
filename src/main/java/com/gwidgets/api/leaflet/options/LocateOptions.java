package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class LocateOptions {
	
	   private LocateOptions() {
		
	   }
	
	    @JsProperty
		private Boolean watch = false;
		@JsProperty
		private Boolean setView = false;
		@JsProperty
		private Number maxZoomLocate = Double.POSITIVE_INFINITY;
		@JsProperty
		private Number timeout = 10000;
		@JsProperty
		private Number maximumAge = 0;
		@JsProperty
		private Boolean enableHighAccuracy = false;
		
		
	
	  public Boolean getWatch() {
			return this.watch;
		}



		public Boolean getSetView() {
			return this.setView;
		}



		public Number getMaxZoomLocate() {
			return this.maxZoomLocate;
		}



		public Number getTimeout() {
			return this.timeout;
		}



		public Number getMaximumAge() {
			return this.maximumAge;
		}



		public Boolean getEnableHighAccuracy() {
			return this.enableHighAccuracy;
		}



	public static class Builder {
		

		private Boolean watch = false;
		
		private Boolean setView = false;
		
		private Number maxZoomLocate = Double.POSITIVE_INFINITY;
		
		private Number timeout = 10000;
		
		private Number maximumAge = 0;
		
		private Boolean enableHighAccuracy = false;

		public Builder() {

		}
		
		   
		public Builder watch(Boolean watch){this.watch = watch; return this;}
		
		public Builder setView(Boolean setView){this.setView = setView; return this;}
		
		public Builder maxZoomLocate(Number maxZoomLocate){this.maxZoomLocate = maxZoomLocate; return this;}
		
		public Builder timeout(Number timeout){this.timeout = timeout; return this;}
		
		public Builder maximumAge(Number maximumAge){this.maximumAge = maximumAge; return this;}
		
		public Builder enableHighAccuracy(Boolean enableHighAccuracy){this.enableHighAccuracy = enableHighAccuracy; return this;}
		
		public LocateOptions build(){
			
			LocateOptions options = new LocateOptions();
			options.watch = this.watch;
			options.setView = this.setView;
			options.maxZoomLocate = this.maxZoomLocate;
			options.timeout = this.timeout;
			options.maximumAge = this.maximumAge;
			options.enableHighAccuracy = this.enableHighAccuracy;
			
			return options;
			
			
		}

	}

}
