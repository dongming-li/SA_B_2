package com.example.armand.testing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public abstract class Character implements GameObject {

    private double health;
    private double shotSpeed;
    private double shotDamage;
    private int shotSize;
    private int range;
    private double moveSpeed;
    private boolean isAlive;
    private Point location;
    private Bitmap image;
    private Bitmap shotImage;
    private String name;
    private long lastShot;
    private Rect rect;



    public Character(double health, double shotSpeed, double shotDamage, int shotSize, int range, Point location, String name) {

        this.health = health;
        this.shotSpeed = shotSpeed;
        this.shotDamage = shotDamage;
        this.shotSize = shotSize;
        this.range = range;
        this.location = location;
        this.name = name;
        this.moveSpeed = 30;
        doRect();
    }

    public double getMoveSpeed(){
        return moveSpeed;
    }

    public void moveTo(Point p){
        if(p.x > Constants.SCREEN_HEIGHT)
            p = new Point(Constants.SCREEN_HEIGHT,p.y);
        else if(p.x < 0)
            p = new Point(0,p.y);
        if(p.y > Constants.SCREEN_WIDTH)
            p = new Point(p.x,Constants.SCREEN_WIDTH);
        else if(p.y < 0)
            p = new Point(p.x,0);

        location = new Point(p);
        doRect();
    }

    private void doRect(){
        rect = new Rect(location.x-50,location.y-50,location.x+50,location.y+50);
    }

    public Rect getRect(){
        return rect;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public double getHealth(){
        return health;
    }

    public double getShotSpeed(){
        return shotSpeed;
    }

    public double getShotDamage(){
        return shotDamage;
    }

    public double getShotSize(){
        return shotSize;
    }

    public int getRange(){
        return range;
    }

    public Point getLocation(){
        return location;
    }
/*
    public Bitmap getImage(){
        return image;
    }*/

    public String getName(){
        return name;
    }

    /**
     * Deals damage to the character
     * @param damage how much damage to deal to character
     * @return if the damage killed the character
     */
    public boolean hit(int damage){
        health -= damage;

        if (health <= 0) {
            health = 0;
            isAlive = false;
        }

        return !isAlive;
    }



    @Override
    public void draw(Canvas c) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        c.drawRect(rect,paint);
    }

    @Override
    public void update() {

    }

}
