package com.jad.tron;

import lombok.Getter;

@Getter
abstract class AbstractTile implements ITile {
    private final Sprite sprite;
    private final boolean traversable;

    public AbstractTile(final char symbol, final boolean traversable) {
        this.sprite = new Sprite(symbol);
        this.traversable = traversable;
    }

    @Override
    public char getSymbol() {
        return this.sprite.symbol();
    }
}
