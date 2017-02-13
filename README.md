## Overview

gwty-leaflet is wrapper for the famous maps javascript library [Leaflet](http://leafletjs.com/). gwty-leaflet is based on JsInterop and allows using Leaflet from your GWT application exactly the same way as from a javascript script with a slight advantage: static typing. It was partially generated automatically from Leaflet docs.


##Dependency 


```xml
                     <dependency>
                        <groupId>com.gwidgets</groupId>
                        <artifactId>gwty-leaflet</artifactId>
                        <version>{version}</version>
                     </dependency>
```

If you are using a snaphost version, then you need to include the snapshot repository: 

```xml
<repositories>
		<repository>
			<id>snapshots</id>
			<url>https://oss.sonatype.org/content/repositories/snapshots/</url>
			<releases>
				<enabled>false</enabled>
			</releases>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
	</repositories>
```

Also, do not forget to include gwty-leaflet in your .gwt.xml module definition file: 

```xml
 <inherits name='com.gwidgets.api.GwtyLeaflet' />
                  
```
##Versions

- 0.5-rc1: latest version, compatible with leaflet 1.0 and 1.0.1
- 0.4: compatible with leaflet 0.7


##Leaflet javascript files:

As in any JsInterop wrapper, you need to refer to the Javascript files from your .html app file. You can either download the Js files from [Leaflet website](http://leafletjs.com/download.html), or refer to them directly using their cdn (there are performance implications off course!).

```html
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.0.0/dist/leaflet.css" />
<script src="https://unpkg.com/leaflet@1.0.0/dist/leaflet.js"></script>
```

Starting from the version 0.5, a new feature has been added to allow adding leaflet resource files dynamically from the code instead of including them manually in the .html: 

```java
LeafletResources.whenReady(
        e -> 
                 {
      MapOptions options = new MapOptions.Builder(L.latLng(52.51, 13.40), 12, 12).dragging(false).build();
    final Map map = L.map("map", options);
    GWT.log(options.getZoom()+"");
    L.tileLayer(MAP_URL, null).addTo(map);
     return null;
    });
```

This will automatically inject the leaflet .js and .css, and execute the code inside when they are loaded. 

##Initializing objects

All objects initializations are done through the L class. gwty-leaflet provides all factory methods of Leaflet. For example:

```java
//equivalent to new Map(...)
Map map = L.map("map", new MapOptions.Builder().build());

//equivalent to new Circle(...)
Circle circle = L.circle(L.latLng(51.508, 11), 200, options);

```
For more information about Leaflet objects creational patterns, you can refer to [Leaflet's official documentation](http://leafletjs.com/reference.html).  

## Options

As specified by Leaflet documentation, the creation of some objects requires a set of options. gwty-leaflet provides all the options with their respective default values as [Objects](https://github.com/gwidgets/gwty-leaflet/tree/master/src/main/java/com/gwidgets/api/leaflet/options) annotated with @JsType. As of version 0.4, options builders were introduced to help in the creation of option Objects and enforce fields validations. Several options have required fields, and using builders help the developer distinguish between required and optional fields. 

Before version 0.4: 
```java
              PathOptions options = new PathOptions();
                options.fillColor = "#fff";
                options.opacity = 1;

                //...

                L.circle(L.latLng(51.508, 11), 200, options).addTo(map);
```

After version 0.4: 

```java
              PathOptions options = new PathOptions.Builder()
                                     .fillColor("#fff")
                                     .opacity(1)
                                      .build();

                //...

                L.circle(L.latLng(51.508, 11), 200, options).addTo(map);
```

For more informations about the available options for each objects, and their utility. You can refer to the original leaflet documentation. 

## Example

To create a map in a div with an id="map", we can do something like: 
```java
                
                L.map("map", new MapOptions.Builder().build()).setView(L.latLng(51.505, -0.09), 12, new ZoomPanOptions.Builder().build());

```


## Events

Events are available only in some objects. Events can be handled throught the following methods: clearAllEventListeners(), on(String type, Function fn), once(String type, Function fn), off(String type, Function fn), fire(String type). 

For defining actions, events needs to be supplied with an abstract callback function that needs to be implemented by the developer. The below example will dipslay a pop up on each map click: 

```java
map.on(EventTypes.Map.CLICK, new Function(){
                        @Override
                        public JavaScriptObject call(JavaScriptObject event) {

                                MouseEvent msEvent = event.cast();
                                
                                map.openPopup("hello", msEvent.getLatlng(), new PopupOptions.Builder().build());
                                return null;
                        }
                        
                });
```

Event Objects that the event object can be cast to are (depending on the usage): 

- DragEndEvent
- ErrorEvent
- GeoJSONEvent
- KeyboardEvent
- LayersControlEvent
- LayerEvent
- LocationEvent
- MouseEvent
- PopupEvent
- ResizeEvent
- TileErrorEvent
- TileEvent
- TooltipEvent

All events objects extend [JavaScriptObject](http://www.gwtproject.org/javadoc/latest/com/google/gwt/core/client/JavaScriptObject.html), so they can be converted from/to a JavaScriptObject using cast() method.

Events are executed following the order of registration. 

Events are explained in details in Leaflet's documentation. 

## Events types constants

There is a long list of available events for some objects, and the developer may not know what events are available for the object they are using. The [EventType](https://github.com/gwidgets/gwty-leaflet/blob/master/src/main/java/com/gwidgets/api/leaflet/events/EventTypes.java) class contains a list of subclasses which contains the available events types constants. The event type can be accessed in static a way like: EventTypes.{object name}Events.{event type name}. For example, to register the loading event on a TileLayer : 

```java
tile.on(EventTypes.TileLayer.LOADING, new Function(){
                        @Override
                        public JavaScriptObject call(JavaScriptObject event) {

                               //cast raw event object
                               TileEvent tileEvent = event.cast();
                               //Do something
                               
                                return null;
                        }
                        
                });
```

Here is a list of the events that can be registred for objects that can handle events:

<div>
<table id="archetypes">
<thead style="font-weight:800;"> 
 <th>Object</th>
 <th>Available Events</th>
</thead>
<tbody>
<tr>
<td>
DivOverlayEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
RendererEvents
</td>
<td>
update, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
InteractiveLayerEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
LayerEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
PosAnimationEvents
</td>
<td>
start, step, end</td>
</tr>
<tr>
<td>
DivIconEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
IconEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
GridLayerEvents
</td>
<td>
loading, tileunload, tileloadstart, tileerror, tileload, load, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
GeoJsonEvents
</td>
<td>
layeradd, layerremove, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
FeatureGroupEvents
</td>
<td>
layeradd, layerremove, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
LayerGroupEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
CanvasEvents
</td>
<td>
update, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
SVGEvents
</td>
<td>
update, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
CircleMakerEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
CircleEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
RectangleEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
PolygonEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
PolylineEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
PathEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
ImageOverlayEvents
</td>
<td>
click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
TileLayerWMSEvents
</td>
<td>
loading, tileunload, tileloadstart, tileerror, tileload, load, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
TileLayerEvents
</td>
<td>
loading, tileunload, tileloadstart, tileerror, tileload, load, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
TooltipEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
PopupEvents
</td>
<td>
add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
MarkerEvents
</td>
<td>
move, dragstart, movestart, drag, dragend, moveend, click, dblclick, mousedown, mouseover, mouseout, contextmenu, add, remove, popupopen, popupclose, tooltipopen, tooltipclose</td>
</tr>
<tr>
<td>
MapEvents
</td>
<td>
baselayerchange, overlayadd, overlayremove, layeradd, layerremove, zoomlevelschange, resize, unload, viewreset, load, zoomstart, movestart, zoom, move, zoomend, moveend, popupopen, popupclose, autopanstart, tooltipopen, tooltipclose, click, dblclick, mousedown, mouseup, mouseover, mouseout, mousemove, contextmenu, keypress, preclick, zoomanim, locationerror, locationfound</td>
</tr>
</tbody>

</table>
</div>


## Javadoc :

version 0.5-rc1: https://gwidgets.github.io/gwty-leaflet/javadoc/0.5/doc/
version 0.4: https://gwidgets.github.io/gwty-leaflet/javadoc/0.5/doc/

## GWT version:

As of the 0.5 version, gwty-leaflet is compiled using GWT 2.8.0. 


