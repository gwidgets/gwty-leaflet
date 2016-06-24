package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ILayer {

	public void onAdd(Map map);

	public void onRemove(Map map);

}