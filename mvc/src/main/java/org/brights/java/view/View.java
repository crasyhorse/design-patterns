package org.brights.java.view;

import java.util.HashMap;
import java.util.Map;

public class View {

    private Map<Integer, IView> views;

    public View() {
        views = new HashMap<>();
    }

    public void subscribe(Integer index, IView view) {
        views.put(index, view);
    }

    public void unsubscribe(Integer index) {
        views.remove(index);
    }

    public IView update(Integer index) {
        return views.get(index);
    }
}
