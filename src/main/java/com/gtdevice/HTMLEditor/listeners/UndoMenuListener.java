package com.gtdevice.HTMLEditor.listeners;

import com.gtdevice.HTMLEditor.View;

import javax.swing.*;
import javax.swing.event.MenuListener;

import javax.swing.event.MenuEvent;

/**
 * Created by device on 2/10/17.
 */
public class UndoMenuListener implements MenuListener {
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    @Override
    public void menuSelected(MenuEvent e) {
        if (view.canUndo()) {
            undoMenuItem.setEnabled(true);
        } else
            undoMenuItem.setEnabled(false);
        if (view.canRedo()) {
            redoMenuItem.setEnabled(true);
        } else
            redoMenuItem.setEnabled(false);
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }
}
