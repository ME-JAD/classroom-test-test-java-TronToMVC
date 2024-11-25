package com.jad.tron;

public class Renderer implements IRenderer {
    private final ITextDisplay display;
    private ICharMatrix matrix = null;

    public Renderer() {
        this.display = new TextWindow();
    }

    @Override
    public void setMatrix(final ICharMatrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void render() {
        final StringBuilder sb = new StringBuilder();
        for (int row = 0; row < this.matrix.getHeight(); row++) {
            for (int column = 0; column < this.matrix.getWidth(); column++) {
                sb.append(this.matrix.getCharAt(new Position(column, row)));
            }
            sb.append("\n");
        }
        this.display.show(sb.toString());
    }

    @Override
    public void close() {
        this.display.close();
    }

    @Override
    public void showInfo(final String info) {
        this.display.showInfo(info);
    }
}
