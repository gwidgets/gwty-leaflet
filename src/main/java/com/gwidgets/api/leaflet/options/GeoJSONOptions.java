package com.gwidgets.api.leaflet.options;

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Layer;
import com.gwidgets.api.leaflet.Marker;
import com.gwidgets.api.leaflet.utils.JsFn;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * The Interface GeoJSONOptions.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class GeoJSONOptions {

  @JsProperty
  String attribution;

  @JsProperty
  String pane;


  /**
   * By default the layer will be added to the map's overlay pane. Overriding this option will cause the layer to be placed on another pane by default.
   *
   * @return the attribution
   */
  @JsOverlay
  public final String getAttribution() {
    return this.attribution;
  }

  /**
   * String to be shown in the attribution control, describes the layer data, e.g. "© Mapbox".
   *
   * @return the attribution
   */
  @JsOverlay public final String getPane() {
    return this.pane;
  }

  /**
   * Function that will be used for creating layers for GeoJSON points (if not specified, simple markers will be created).
   *
   * @param featureData the feature data
   * @param latlng the latlng
   * @return the function
   */
  @JsProperty
  public PointToLayerFunction pointToLayer;

  /**
   * Function that will be used to get style options for vector layers created for GeoJSON features.
   *
   * @param featureData the feature data
   * @return the function
   */
  @JsProperty
  public StyleFunction style;

  /**
   * Function that will be called on each created feature layer. Useful for attaching events and popups to features.
   *
   * @param featureData the feature data
   * @param layer the layer
   * @return the function
   */
  @JsProperty
  public OnEachFeatureFunction onEachFeature;

  /**
   * Function that will be used to decide whether to show a feature or not.
   *
   * @param featureData the feature data
   * @param layer the layer
   * @return the function
   */
  @JsProperty
  public FilterFunction filter;

  /**
   * Function that will be used for converting GeoJSON coordinates to LatLng points (if not specified, coords will be assumed to be WGS84 standard [longitude, latitude] values in degrees).
   *
   * @param coords the coords
   * @return the function
   */
  @JsProperty
  public CoordsToLatLngFunction coordsToLatLng;

  @JsFunction
  public interface PointToLayerFunction {

    Marker apply(JsObject feature, LatLng latLng);

  }

  @JsFunction
  public interface StyleFunction {

    JsObject apply(JsObject feature);

  }

  @JsFunction
  public interface OnEachFeatureFunction {

    JsObject apply(JsObject feature, Layer layer);

  }

  @JsFunction
  public interface FilterFunction {

    JsObject apply(JsObject feature, Layer layer);

  }

  @JsFunction
  public interface CoordsToLatLngFunction {
    LatLng apply(JsObject feature, Layer layer);
  }

}
