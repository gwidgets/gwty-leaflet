package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface IControl {

	public HTMLElement onAdd(Map map);

	public void onRemove(Map map);

}