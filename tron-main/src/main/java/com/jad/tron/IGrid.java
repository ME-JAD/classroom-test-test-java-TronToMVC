package com.jad.tron;

public interface IGrid extends ICharMatrix {
    static boolean isTraversableAt(IGrid grid, Position position) {
        return grid.isTraversableAt(position);
    }

    boolean isTraversableAt(Position position);

    Position wrapPosition(Position position);

    void setTileAt(ITile tile, Position position);

    ILightCycle createLightCycle(final char symbol, Position position, Direction direction);
}
