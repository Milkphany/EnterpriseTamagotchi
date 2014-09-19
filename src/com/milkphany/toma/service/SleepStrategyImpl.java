package com.milkphany.toma.service;

import com.milkphany.toma.model.TamaObjectModel;
import com.milkphany.toma.strategy.SleepStrategy;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:55 PM
 */
public class SleepStrategyImpl implements SleepStrategy {
    @Override
    public String getSleepExpression() {
        return "Oh So sleepy :(";
    }

    @Override
    public Double getSleepDuration() {
        return 1.115;
    }

    @Override
    public Double getPercentWakeChance() {
        return 0.15;
    }

    @Override
    public void sleepy(TamaObjectModel objectModel) {
        objectModel.getHealth().loseHealth(getPercentWakeChance() * getSleepDuration());
    }

    @Override
    public void sleeping(TamaObjectModel objectModel) {
        objectModel.getHealth().gainHealth(getPercentWakeChance() * getSleepDuration());
    }

}
