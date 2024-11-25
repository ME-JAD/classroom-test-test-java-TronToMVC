package com.jad.tron;

import lombok.Getter;

@Getter
public class Grid implements IGrid {
    private final int height;
    private final int width;
    private final ITile[][] tiles;

    public Grid(final int height, final int width) {
        this.height = height;
        this.width = width;
        this.tiles = new AbstractTile[height][width];
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                this.tiles[row][column] = EmptyTile.getINSTANCE();
            }
        }
    }

    @Override
    public boolean isTraversableAt(final Position position) {
        Position wrappedPosition = this.wrapPosition(position);
        return this.tiles[wrappedPosition.y()][wrappedPosition.x()].isTraversable();
    }

    @Override
    public Position wrapPosition(final Position position) {
        int x = (position.x() + this.width) % this.width;
        int y = (position.y() + this.height) % this.height;
        return new Position(x, y);
    }

    @Override
    public void setTileAt(final ITile tile, final Position position) {
        Position wrappedPosition = this.wrapPosition(position);
        this.tiles[wrappedPosition.y()][wrappedPosition.x()] = tile;
    }

    @Override
    public ILightCycle createLightCycle(final char symbol, final Position position, final Direction direction) {
        return new LightCycle(symbol, position, direction, this);
    }

    @Override
    public char getCharAt(final Position position) {
        Position wrappedPosition = this.wrapPosition(position);
        return this.tiles[wrappedPosition.y()][wrappedPosition.x()].getSymbol();
    }
}
