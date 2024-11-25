package com.jad.tron;

import lombok.Getter;
import lombok.Setter;

@Getter
abstract class AbstractPlayer implements IPlayer {
    private final String name;
    @Setter
    private IGrid grid;
    @Setter
    private ILightCycle lightCycle;

    public AbstractPlayer(final String name) {
        this.name = name;
    }
}
