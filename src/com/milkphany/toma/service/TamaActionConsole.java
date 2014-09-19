package com.milkphany.toma.service;

import com.milkphany.toma.model.TamaObjectModel;
import com.milkphany.toma.strategy.TamaAction;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:39 PM
 */
public class TamaActionConsole implements TamaAction {

    private TamaObjectModel objectModel;

    // Dependency injection will make this more versatile
    public TamaActionConsole(TamaObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    @Override
    public void expressDeath() {
        System.out.println("Today is a sad day " + objectModel.getDeathStrategy().getDeathExpression());
    }

    @Override
    public void expressSleepy() {
        System.out.println("You're okay sometimes, othertimes... " + objectModel.getSleepStrategy().getSleepExpression() );
    }

    @Override
    public void expressHunger() {
        System.out.println("Today is a sad day " + objectModel.getHungerStrategy().getHungerExpression());
    }
}
