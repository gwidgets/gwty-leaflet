package com.gwidgets.leaflet.test;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Point;
import com.gwidgets.api.leaflet.Projection;

public class ProjectionTest extends GwtyLeafletTestCase {
	
	
	public void testProjection(){
	InjectedLeafletResources.whenReady((e) -> {
			
			  Projection projection = L.Projection.LonLat;
			  
			 Point p =  projection.project(L.latLng(41, 72));
			  
			  
			  LatLng unprojected = projection.unproject(p);
			  
			  assertEquals(String.valueOf(unprojected.lat), "41");
			  assertEquals(String.valueOf(unprojected.lng), "72");
			   
				
				return null;
	});
}

}
