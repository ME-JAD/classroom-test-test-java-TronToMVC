package com.jad.tron;

public interface IPlayer {
    void play();

    String getName();

    void setLightCycle(ILightCycle lightCycle);

    void setGrid(IGrid grid);
}
