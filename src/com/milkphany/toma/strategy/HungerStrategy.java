package com.milkphany.toma.strategy;

import com.milkphany.toma.model.TamaObjectModel;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:27 PM
 */
public interface HungerStrategy {

    public double getHungerPossibilityPercentage();
    public double getHungerDeathPercentage();
    public void hungry(TamaObjectModel objectModel);
    public String getHungerExpression();
}
