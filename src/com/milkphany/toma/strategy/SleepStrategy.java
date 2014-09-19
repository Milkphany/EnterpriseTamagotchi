package com.milkphany.toma.strategy;

import com.milkphany.toma.model.TamaObjectModel;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:27 PM
 */
public interface SleepStrategy {
    public String getSleepExpression();
    public Double getSleepDuration();
    public Double getPercentWakeChance();
    public void sleepy(TamaObjectModel objectModel);
    public void sleeping(TamaObjectModel objectModel);
}
