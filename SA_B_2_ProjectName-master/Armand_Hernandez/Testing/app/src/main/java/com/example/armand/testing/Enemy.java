package com.example.armand.testing;



import android.graphics.Point;

public class Enemy extends Character {

    private EnemyAi ai;

    public Enemy(double health, double shotSpeed, double shotDamage, int shotSize, int range, Point location, String name) {
        super(health, shotSpeed, shotDamage, shotSize, range, location, name);
    }

    public Enemy(){
        super(100, 2, 20, 30, 800, new Point(Constants.SCREEN_WIDTH/2, Constants.SCREEN_HEIGHT/2), "Knight");
        ai=new EnemyAi(this);
    }

    public void setEnemyAi(EnemyAi ai){this.ai=ai;}

    @Override
    public void update() {
        ai.wander();

    }

}