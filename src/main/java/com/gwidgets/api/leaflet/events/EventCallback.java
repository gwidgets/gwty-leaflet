package com.gwidgets.api.leaflet.events;

import jsinterop.annotations.JsFunction;

/**
 * Created by zakaria on 7/2/2017.
 *
 * @author zakaria
 * @version $Id: $Id
 */
@JsFunction
public interface EventCallback<T extends Event> {

    /**
     * <p>call.</p>
     *
     * @param event a T object
     */
    void call(T event);
}
