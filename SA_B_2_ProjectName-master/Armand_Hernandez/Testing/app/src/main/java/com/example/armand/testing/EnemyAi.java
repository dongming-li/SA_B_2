package com.example.armand.testing;

import android.graphics.Point;

/**
 * Created by Armand on 9/18/2017.
 */

public class EnemyAi {
    protected Enemy enemy;

    public EnemyAi(Enemy enemy)
    {
        this.enemy=enemy;
        this.enemy.setEnemyAi(this);
    }

    public void wander(){
        long startTime=System.currentTimeMillis();
        int elapsedTime=(int)(System.currentTimeMillis()-startTime);
//        startTime=System.currentTimeMillis();
        float speed=Constants.SCREEN_HEIGHT/100.0f;
        Point point= new Point(enemy.getLocation());
//        int x=(int)(Math.random()*10);
//        int y=(int)(Math.random()*10);

//        point.set(point.x+(x*((int)(Math.random()*3)-1)),point.y+(y*((int)(Math.random()*3)-1)));
        point.set(point.x+((int)(speed*elapsedTime)*((int)(Math.random()*3)-1)),point.y+((int)(speed*elapsedTime)*((int)(Math.random()*3)-1)));
        enemy.moveTo(point);
    }
    public void linearY(){
        long startTime=System.currentTimeMillis();
        int elapsedTime=(int)(System.currentTimeMillis()-startTime);
//        startTime=System.currentTimeMillis();
        float speed=Constants.SCREEN_HEIGHT/100.0f;
        Point point= new Point(enemy.getLocation());
//        int x=(int)(Math.random()*10);
//        int y=(int)(Math.random()*10);

//        point.set(point.x+(x*((int)(Math.random()*3)-1)),point.y+(y*((int)(Math.random()*3)-1)));
        point.set(point.x+(((int)(Math.random()*3)-1)),point.y+((int)(speed*elapsedTime)*((int)(Math.random()*3)-1)));
        enemy.moveTo(point);
    }
    public void linearX(){
        long startTime=System.currentTimeMillis();
        int elapsedTime=(int)(System.currentTimeMillis()-startTime);
//        startTime=System.currentTimeMillis();
        float speed=Constants.SCREEN_HEIGHT/100.0f;
        Point point= new Point(enemy.getLocation());
//        int x=(int)(Math.random()*10);
//        int y=(int)(Math.random()*10);

//        point.set(point.x+(x*((int)(Math.random()*3)-1)),point.y+(y*((int)(Math.random()*3)-1)));
        point.set(point.x+((int)(speed*elapsedTime)*((int)(Math.random()*3)-1)),point.y+(((int)(Math.random()*3)-1)));
        enemy.moveTo(point);
    }
}
