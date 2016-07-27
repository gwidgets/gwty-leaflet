## Overview

gwty-leaflet is wrapper for the famous maps javascript library [Leaflet](http://leafletjs.com/). gwty-leaflet is based on JsInterop and allows using Leaflet from your GWT application exactly the same way as from a javascript script with a slight advantage: static typing. It was partially generated automatically from Leaflet docs.


##Dependency 

```xml
                     <dependency>
                        <groupId>com.gwidgets</groupId>
                        <artifactId>gwty-leaflet</artifactId>
                        <version>0.2</version>
                     </dependency>
```


Also, do not forget to include gwty-leaflet in your .gwt.xml module definition file: 

```xml
 <inherits name='com.gwidgets.api.GwtyLeaflet' />
                  
```

##Leaflet javascript files:

As in any JsInterop wrapper, you need to refer to Js leaflet from your .html app file. You can either download the Js files from [Leaflet website](http://leafletjs.com/download.html), or refer to them directly using their cdn (there are performance implications off course!).

```html
<link rel="stylesheet" href="https://npmcdn.com/leaflet@1.0.0-rc.2/dist/leaflet.css" />
<script src="https://npmcdn.com/leaflet@1.0.0-rc.2/dist/leaflet.js"></script> 
```


##Initializing objects

All objects initializations are done through the L class. gwty-leaflet provides all factory methods of Leaflet. For example:

```java
//equivalent to new Map(...)
Map map = L.map("map", new MapOptions());

//equivalent to new Circle(...)
Circle circle = L.circle(L.latLng(51.508, 11), 200, options);

```
Trying to create a Leaflet object directly using the new operator will result in an error. For more information about Leaflet objects creational patterns, you can refer to [Leaflet's official documentation](http://leafletjs.com/reference.html).  

## Options

As specified by Leaflet documentation, the creations of some objects requires a set of options. gwty-leaflet provides all the options with their respective default values. You can override the default values simply by changing the values of fields: 

```java
              PathOptions options = new PathOptions();
                options.fillColor = "#fff";
                options.opacity = 1;

                //...

                L.circle(L.latLng(51.508, 11), 200, options).addTo(map);
```

For more informations about the available options for each objects, and their utility. You can refer to the original leaflet documentation. 

## Example

To create a map in a div with an id="map", we can do something like: 
```java
                
                L.map("map", new MapOptions()).setView(L.latLng(51.505, -0.09), 12, new ZoomPanOptions());;

```


## Events

Events are available only in some objects. Events can be handled throught the following methods: clearAllEventListeners(), on(String type, Function fn), once(String type, Function fn), off(String type, Function fn), fire(String type). 

For defining actions, events needs to be supplied with an abstract callback function that needs to be implemented by the developer. The below example will dipslay a pop up on each map click: 

```java
map.on("click", new Function(){
                        @Override
                        public JavaScriptObject call(JavaScriptObject event) {

                                MouseEvent msEvent = event.cast();
                                
                                map.openPopup("hello", L.latLng(51.508, 11), new PopupOptions());
                                return null;
                        }
                        
                });
```

Event Objects that the event object can be cast to are (depending on the usage): 

- ErrorEvent
- GeoJSONEvent
- LayerControlEvent
- LayerEvent
- LocationEvent
- MouseEvent
- PopupEvent
- ResizeEvent
- TileEvent

All events objects extend [JavaScriptObject](http://www.gwtproject.org/javadoc/latest/com/google/gwt/core/client/JavaScriptObject.html), so they can be converted to a JavaScriptObject using cast() method.

Events are explained in details Leaflet's documentation. 

## GWT version:

gwty-leaflet is compiled using GWT 2.8.0-SNAPSHOT. 

