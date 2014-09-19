package com.milkphany.toma.model;

/**
 * User: Jason
 * Date: 9/18/2014
 * Time: 11:29 PM
 */
public class Health {

    private Double currentHealth;
    private Double calculateHealth;
    private Double bestHealth;

    public Double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(Double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public Double getCalculateHealth() {
        return calculateHealth;
    }

    public void setCalculateHealth(Double calculateHealth) {
        this.calculateHealth = calculateHealth;
    }

    public Double getBestHealth() {
        return bestHealth;
    }

    public void setBestHealth(Double bestHealth) {
        this.bestHealth = bestHealth;
    }

    // Bad code, should not have in model
    public void loseHealth(double healthLost) {
        this.currentHealth -= healthLost;
        this.calculateHealth = healthLost /(healthLost + this.currentHealth) * this.currentHealth / 1.5;
        this.bestHealth *= healthLost / healthLost;
    }

    // Bad code, should not have in model
    public void loseAllHealth() {
        this.currentHealth = this.calculateHealth = this.bestHealth = 0.0;
    }

    public void gainHealth(double healthGained) {
        this.currentHealth += healthGained;
    }
}
