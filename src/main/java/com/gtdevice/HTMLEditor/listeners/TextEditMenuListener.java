package com.gtdevice.HTMLEditor.listeners;

import com.gtdevice.HTMLEditor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;


public class TextEditMenuListener implements MenuListener {
    private View view;

    @Override
    public void menuSelected(MenuEvent e) {
        JMenu jmenu = (JMenu) e.getSource();
        for (Component c : jmenu.getMenuComponents()) {
            c.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }

    public TextEditMenuListener(View view) {
        this.view = view;
    }
}
