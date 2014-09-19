package com.milkphany.toma.service;

import com.milkphany.toma.model.TamaObjectModel;
import com.milkphany.toma.strategy.HungerStrategy;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:43 PM
 */
public class HungerStrategyImpl implements HungerStrategy {
    @Override
    public double getHungerPossibilityPercentage() {
        return 0.1;
    }

    @Override
    public double getHungerDeathPercentage() {
        return 0.15;
    }

    @Override
    public void hungry(TamaObjectModel objectModel) {
        objectModel.getHealth().loseHealth(getHungerPossibilityPercentage() * objectModel.getHealth().getCalculateHealth());
    }

    @Override
    public String getHungerExpression() {
        return "It is so sad :( oh no why you do this to me :(";
    }
}
