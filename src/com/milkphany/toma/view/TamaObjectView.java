package com.milkphany.toma.view;

import com.milkphany.toma.model.TamaObjectModel;
import com.milkphany.toma.service.TamaActionConsole;
import com.milkphany.toma.strategy.TamaAction;

import javax.swing.*;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:38 PM
 */
public class TamaObjectView {

    private TamaObjectModel model;
    private TamaAction action;

    public TamaObjectView() {
        // Dependency injection will make this more versatile
        this.model = new TamaObjectModel();
        this.action = new TamaActionConsole(this.model);

        // If there is more time write some tests and like make it work lol
        // Also should start a platform class where it simulates runs and interactions
        action.expressDeath();
        action.expressHunger();
        action.expressSleepy();
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TamaObjectView();
            }
        });
    }
}
