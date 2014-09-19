package com.milkphany.toma.model;

import com.milkphany.toma.service.DeathStrategyImpl;
import com.milkphany.toma.service.HungerStrategyImpl;
import com.milkphany.toma.service.SleepStrategyImpl;
import com.milkphany.toma.strategy.DeathStrategy;
import com.milkphany.toma.strategy.HungerStrategy;
import com.milkphany.toma.strategy.SleepStrategy;

public class TamaObjectModel {

    private Age age;
    private Name name;
    private Health health;
    private HungerStrategy hungerStrategy;
    private SleepStrategy sleepStrategy;
    private DeathStrategy deathStrategy;

    public TamaObjectModel() {
        // Dependency injection will make this more versatile
        this.hungerStrategy = new HungerStrategyImpl();
        this.sleepStrategy = new SleepStrategyImpl();
        this.deathStrategy = new DeathStrategyImpl();
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public HungerStrategy getHungerStrategy() {
        return hungerStrategy;
    }

    public void setHungerStrategy(HungerStrategy hungerStrategy) {
        this.hungerStrategy = hungerStrategy;
    }

    public SleepStrategy getSleepStrategy() {
        return sleepStrategy;
    }

    public void setSleepStrategy(SleepStrategy sleepStrategy) {
        this.sleepStrategy = sleepStrategy;
    }

    public DeathStrategy getDeathStrategy() {
        return deathStrategy;
    }

    public void setDeathStrategy(DeathStrategy deathStrategy) {
        this.deathStrategy = deathStrategy;
    }
}
