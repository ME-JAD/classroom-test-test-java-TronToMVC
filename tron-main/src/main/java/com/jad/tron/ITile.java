package com.jad.tron;

public interface ITile {
    Sprite getSprite();

    boolean isTraversable();

    char getSymbol();
}
