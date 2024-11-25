package com.jad.tron;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TronGame implements ITronGame {
    static final char LIGHT_CYCLE_SYMBOL = 'O';
    private final IRenderer renderer;
    private final IGrid grid;
    private final List<IPlayer> players = new ArrayList<>();
    private final List<ILightCycle> lightCycles = new ArrayList<>();
    private boolean running = true;

    public TronGame(final IGrid grid, final IRenderer renderer) {
        this.grid = grid;
        this.renderer = renderer;
        this.renderer.setMatrix(grid);
    }

    @Override
    public void start() {
        while (this.running) {
            this.renderer.render();
            this.players.forEach(IPlayer::play);
            this.lightCycles.forEach(ILightCycle::move);
            this.running &= this.lightCycles.stream().anyMatch(ILightCycle::isAlive);
        }
        this.renderer.showInfo("All players are dead!");
        this.renderer.close();
    }

    @Override
    public void addPlayer(final IPlayer player) {
        this.players.add(player);
        player.setGrid(this.grid);
        Position randomPosition = new Position(new Random().nextInt(this.grid.getWidth()),
                                               new Random().nextInt(this.grid.getHeight()));
        Direction randomDirection = Direction.getRandom();
        ILightCycle lightCycle = this.grid.createLightCycle(TronGame.LIGHT_CYCLE_SYMBOL,
                                                            randomPosition,
                                                            randomDirection);
        player.setLightCycle(lightCycle);
        this.lightCycles.add(lightCycle);
    }
}
