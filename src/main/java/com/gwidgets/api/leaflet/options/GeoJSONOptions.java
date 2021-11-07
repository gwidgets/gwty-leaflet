package com.gwidgets.api.leaflet.options;

import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Layer;
import com.gwidgets.api.leaflet.Marker;

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
   */
  @JsProperty
  public PointToLayerFunction pointToLayer;

  /**
   * Function that will be used to get style options for vector layers created for GeoJSON features.
   *
   */
  @JsProperty
  public StyleFunction style;

  /**
   * Function that will be called on each created feature layer. Useful for attaching events and popups to features.
   *
   */
  @JsProperty
  public OnEachFeatureFunction onEachFeature;

  /**
   * Function that will be used to decide whether to show a feature or not.
   */
  @JsProperty
  public FilterFunction filter;

  /**
   * Function that will be used for converting GeoJSON coordinates to LatLng points (if not specified, coords will be assumed to be WGS84 standard [longitude, latitude] values in degrees).
   */
  @JsProperty
  public CoordsToLatLngFunction coordsToLatLng;

  @JsFunction
  public interface PointToLayerFunction {

    /**
     * Function that will be used for creating layers for GeoJSON points (if not specified, simple markers will be created).
     *
     * @param feature data
     * @param latLng the latlng
     */
    Marker apply(JsObject feature, LatLng latLng);

  }

  @JsFunction
  public interface StyleFunction {

    /**
     * Function that will be used to get style options for vector layers created for GeoJSON features.
     *
     * @param featureData the feature data
     * @return the function
     */
    JsObject apply(JsObject featureData);

  }

  @JsFunction
  public interface OnEachFeatureFunction {

    /**
     * Function that will be called on each created feature layer. Useful for attaching events and popups to features.
     *
     * @param featureData the feature data
     * @param layer the layer
     */
    JsObject apply(JsObject featureData, Layer layer);

  }

  @JsFunction
  public interface FilterFunction {
    /**
     * Function that will be used to decide whether to show a feature or not.
     *
     * @param feature the feature data
     * @param layer the layer
     */
    JsObject apply(JsObject feature, Layer layer);

  }

  @JsFunction
  public interface CoordsToLatLngFunction {

    /**
     * Function that will be used for converting GeoJSON coordinates to LatLng points (if not specified, coords will be assumed to be WGS84 standard [longitude, latitude] values in degrees).
     *
     * @param coords the coords
     * @param layer layer
     */
    LatLng apply(JsObject coords, Layer layer);
  }

}
