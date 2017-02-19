package com.gtdevice.HTMLEditor.listeners;

import com.gtdevice.HTMLEditor.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TabbedPaneChangeListener implements ChangeListener {

    private final View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
