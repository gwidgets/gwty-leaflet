package com.gwidgets.leaflet.test;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.Projection;
import com.gwidgets.api.leaflet.elemental.Function;

public class ProjectionTest extends GwtyLeafletTestCase {
	
	
	public void testProjection(){
	InjectedLeafletResources.whenReady(new Function(){
		public JavaScriptObject call(JavaScriptObject event) {
			
			  Projection projection = L.Projection.LonLat;
			  
			 Point p =  projection.project(L.latLng(41, 72));
			  
			  
			  LatLng unprojected = projection.unproject(p);
			  
			  assertEquals(unprojected.lat.toString(), "41");
			  assertEquals(unprojected.lng.toString(), "72");
			   
				
				return null;
		}
	});
}

}
