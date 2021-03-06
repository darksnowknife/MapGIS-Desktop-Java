package com.zondy.mapgis.pluginengine.events;

import com.zondy.mapgis.pluginengine.plugin.IDockWindow;

import java.util.EventObject;

/**
 * 创建 DockWindow 事件
 *
 * @author cxy
 * @date 2019/09/16
 */
public class CreateDockWindowEvent extends EventObject {
    private transient IDockWindow dockWindow;

    /**
     * 创建 DockWindow 事件
     *
     * @param source     事件源
     * @param dockWindow DockWindow
     * @throws IllegalArgumentException if source is null.
     */
    public CreateDockWindowEvent(Object source, IDockWindow dockWindow) {
        super(source);
        this.dockWindow = dockWindow;
    }

    /**
     * 获取 DockWindow
     *
     * @return DockWindow
     */
    public IDockWindow getDockWindow() {
        return dockWindow;
    }
}
