package com.milkphany.toma.service;

import com.milkphany.toma.model.TamaObjectModel;
import com.milkphany.toma.strategy.DeathStrategy;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:32 PM
 */
public class DeathStrategyImpl implements DeathStrategy {

    @Override
    public double getDeathPossibilityPercentage() {
        return 0.05;
    }

    @Override
    public double getDeathFearPercentage() {
        return 0.3;
    }

    @Override
    public void dying(TamaObjectModel model) {
        model.getHealth().loseHealth(getDeathPossibilityPercentage());
    }

    @Override
    public void dead(TamaObjectModel model) {
        model.getHealth().loseAllHealth();
    }

    @Override
    public String getDeathExpression() {
        return "AHHHHHH x_x";
    }
}
