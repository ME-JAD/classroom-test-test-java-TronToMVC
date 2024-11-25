package com.jad.tron;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class TextWindow extends JFrame implements ITextDisplay {

    private static final float FONT_SIZE = 6f;
    private final JTextArea textArea = new JTextArea();

    public TextWindow() {
        this("Text window");
    }

    public TextWindow(final String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        final Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(
                    TextWindow.class.getResourceAsStream("/CascadiaMono.ttf"))).deriveFont(TextWindow.FONT_SIZE);
        } catch (final FontFormatException | IOException exception) {
            throw new RuntimeException(exception);
        }
        this.setLayout(new BorderLayout());
        this.textArea.setFont(font);
        this.textArea.setEditable(false);
        this.textArea.setForeground(Color.BLACK);
        this.textArea.setBackground(Color.WHITE);
        final JPanel panel = new JPanel();
        this.add(panel, BorderLayout.CENTER);
        panel.add(this.textArea);

        this.setVisible(true);
    }

    @Override
    public void show(final String screen) {
        this.textArea.setText(screen);
    }

    @Override
    public void close() {
        this.dispose();
    }

    @Override
    public void showInfo(final String info) {
        JOptionPane.showMessageDialog(this, info);
    }
}
