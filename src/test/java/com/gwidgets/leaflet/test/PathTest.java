package com.gwidgets.leaflet.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.Circle;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Polygon;
import com.gwidgets.api.leaflet.Polyline;
import com.gwidgets.api.leaflet.Rectangle;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.options.CircleOptions;

public class PathTest extends GwtyLeafletTestCase {
	
	
	
	public void testPolyline(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				     
					
					List<LatLng> coordinates = new ArrayList<LatLng>();

					coordinates.add(L.latLng(52.51, 13.37));
					coordinates.add(L.latLng(52.5095, 13.34));
					coordinates.add(L.latLng(52.5053, 13.33));
					coordinates.add(L.latLng(52.5139, 13.34));

					LatLng[] coordinatesArray = (LatLng[]) coordinates.toArray();
					Polyline pol = L.polyline(coordinatesArray, null);
				
					
					assertTrue(pol.getBounds().contains(L.latLng(52.51, 13.37)));
					assertTrue(pol.getBounds().contains(L.latLng(52.5095, 13.34)));
					assertTrue(pol.getBounds().contains(L.latLng(52.5053, 13.33)));
					assertTrue(pol.getBounds().contains(L.latLng(52.5139, 13.34)));
					
					
					return null;
			}
		});
	}
	
	public void testRectangle(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				    
					
					Rectangle rect = L.rectangle(L.latLngBounds(L.latLng(52.5139, 13.34), L.latLng(52.51, 13.37)), null);
					
						
					assertTrue(rect.getBounds().contains(L.latLng(52.5139, 13.34)));
					assertTrue(rect.getBounds().contains(L.latLng(52.51, 13.37)));
					
					return null;
			}
		});
	}
	
	
	public void testCircle(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
			
				CircleOptions circleOptions = new CircleOptions.Builder()
	                    .fillColor("#b35d20")
	                    .color("#f54e02")
	                    .radius(500)
	                     .build();
				
				Circle circ = L.circle(L.latLng(52.51, 13.37), circleOptions);
				
				assertEquals(circ.getRadius(), 500);
				assertTrue(circ.getBounds().contains(L.latLng(52.51, 13.37)));
					
					return null;
			}
		});
	}
	
	
	public void testPolygon(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				
					List<LatLng> coordinates = new ArrayList<LatLng>();

					coordinates.add(L.latLng(52.51, 13.37));
					coordinates.add(L.latLng(52.5095, 13.34));
					coordinates.add(L.latLng(52.5053, 13.33));
					coordinates.add(L.latLng(52.5139, 13.34));

					LatLng[] coordinatesArray = (LatLng[]) coordinates.toArray();
					Polygon polg = L.polygon(coordinatesArray, null);
					
					assertTrue(polg.getBounds().contains(L.latLng(52.51, 13.37)));
					assertTrue(polg.getBounds().contains(L.latLng(52.5095, 13.34)));
					assertTrue(polg.getBounds().contains(L.latLng(52.5053, 13.33)));
					assertTrue(polg.getBounds().contains(L.latLng(52.5139, 13.34)));
					
					
					return null;
			}
		});
	}

}
