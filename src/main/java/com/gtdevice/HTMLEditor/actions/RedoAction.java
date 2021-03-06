package com.gtdevice.HTMLEditor.actions;

import com.gtdevice.HTMLEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    private View view;

    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }

    public RedoAction(View view) {
        this.view = view;
    }
}
