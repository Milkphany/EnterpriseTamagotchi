package com.milkphany.toma.strategy;

import com.milkphany.toma.model.TamaObjectModel;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:27 PM
 */
public interface DeathStrategy {

    public double getDeathPossibilityPercentage();
    public double getDeathFearPercentage();
    public void dying(TamaObjectModel model);
    public void dead(TamaObjectModel model);
    public String getDeathExpression();
}
