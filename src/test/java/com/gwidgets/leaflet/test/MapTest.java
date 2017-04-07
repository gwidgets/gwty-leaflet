package com.gwidgets.leaflet.test;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Map;
import com.gwidgets.api.leaflet.elemental.Document;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.MapOptions;

public class MapTest extends GwtyLeafletTestCase {
	
	
	
	public void testMapCreateWithId(){
		
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
			    HTMLElement div = Document.createElement("div");
			    div.id = "test";
			    Document.getBody().appendChild(div);
			    
				Map map = L.map("test", null);
				assertNotNull(map);
				return null;
			}
		});
	}
	
	
	
	public void testMapCreateWithHTMLElement(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				HTMLElement mapContainer = Document.createElement("div");
	            Map map = L.map(mapContainer, null);
				assertNotNull(map);
				return null;
			}
		});
	}
	
	public void testMapRemove(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				 HTMLElement div = Document.createElement("div");
				    div.id = "test5";
				    Document.getBody().appendChild(div);
				      MapOptions options = new MapOptions.Builder(L.latLng(52.51, 13.40), 12.0, 7.0).maxZoom(20.0).build();
					Map map = L.map("test5", options);

					assertNotNull(map);
					map.remove();
				
					
					return null;
			}
		});
	}
	
	
	public void testMapView(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				     HTMLElement div = Document.createElement("div");
				    div.id = "test2";
				    Document.getBody().appendChild(div);
				    
					Map map = L.map("test2", null);
					map.setView(L.latLng(52.51, 13.40), 12.0, null);
					assertNotNull(map);
					assertEquals(map.getCenter().lat, 52.51);
					assertEquals(map.getCenter().lng, 13.40);
					
					
					
					return null;
			}
		});
	}
	
	public void testMapZoom(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				 HTMLElement div = Document.createElement("div");
				    div.id = "test3";
				    Document.getBody().appendChild(div);
				      MapOptions options = new MapOptions.Builder(L.latLng(52.51, 13.40), 12.0, 7.0).dragging(true).maxZoom(20.0).build();
					Map map = L.map("test3", options);
					
					assertNotNull(map);
					assertEquals(String.valueOf(map.getZoom()), "12");
				    assertEquals(String.valueOf(map.getMinZoom()), "7");
     				assertEquals(String.valueOf(map.getMaxZoom()), "20");
     				
     				//Zoom In method has weird behavior *** Fails
     				
     				
     				map.zoomOut(5.0, null);
     				assertEquals("7", map.getZoom().toString());
					
					return null;
			}
		});
	}
	
	  public void testMapPan(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				 HTMLElement div = Document.createElement("div");
				    div.id = "test4";
				    Document.getBody().appendChild(div);
				      MapOptions options = new MapOptions.Builder(L.latLng(52.51, 13.40), 12.0, 7.0).maxZoom(20.0).build();
					Map map = L.map("test4", options);

					assertNotNull(map);
					map.panTo(L.latLng(51.51, 13.80), null);
					assertEquals(map.getCenter().lat, 51.51);
					assertEquals(map.getCenter().lng, 13.80);
					
					
				
					
					return null;
			}
		});
	}
}
