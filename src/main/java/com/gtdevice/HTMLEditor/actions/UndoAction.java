package com.gtdevice.HTMLEditor.actions;

import com.gtdevice.HTMLEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class UndoAction extends AbstractAction {
    private View view;

    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }

    public UndoAction(View view) {
        this.view = view;
    }
}
