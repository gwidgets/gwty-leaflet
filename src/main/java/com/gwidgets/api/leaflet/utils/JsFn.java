package com.gwidgets.api.leaflet.utils;

import jsinterop.annotations.JsFunction;

/**
 * <p>JsFn interface.</p>
 *
 * @author zakaria
 * @version $Id: $Id
 */
@JsFunction
public interface JsFn {

  /**
   * <p>apply.</p>
   *
   * @param arg1 a {@link java.lang.Object} object
   * @return a {@link java.lang.Object} object
   */
  Object apply(Object ... arg1);

}
