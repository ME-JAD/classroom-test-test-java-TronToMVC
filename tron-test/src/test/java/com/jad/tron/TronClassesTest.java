package com.jad.tron;

import org.junit.jupiter.api.Test;

public class TronClassesTest {

    @Test
    public void doAllTests() {
        this.wellPlacedDirectionTest();
        this.wellPlacedAbstractPlayerTest();
        this.wellPlacedAbstractTileTest();
        this.wellPlacedAIPlayerTest();
        this.wellPlacedEmptyTileTest();
        this.wellPlacedGridTest();
        this.wellPlacedICharMatrixTest();
        this.wellPlacedIGridTest();
        this.wellPlacedILightCycleTest();
        this.wellPlacedIPlayerTest();
        this.wellPlacedIRendererTest();
        this.wellPlacedITileTest();
        this.wellPlacedITronGameTest();
        this.wellPlacedLightCycleTest();
        this.wellPlacedPositionTest();
        this.wellPlacedRendererTest();
        this.wellPlacedSpriteTest();
        this.wellPlacedTextWindowTest();
        this.wellPlacedTronGameTest();
        this.wellPlacedTronMainTest();
    }

    @Test
    void wellPlacedDirectionTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.Direction", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedAbstractPlayerTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.AbstractPlayer", UtilTest.MODEL_NAME);
    }

    @Test
    void wellPlacedAbstractTileTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.AbstractTile", UtilTest.MODEL_NAME);
    }

    @Test
    void wellPlacedAIPlayerTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.AIPlayer", UtilTest.MODEL_NAME);
    }

    @Test
    void wellPlacedEmptyTileTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.EmptyTile", UtilTest.MODEL_NAME);
    }

    @Test
    public void wellPlacedGridTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.Grid", UtilTest.MODEL_NAME);
    }

    @Test
    void wellPlacedICharMatrixTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.ICharMatrix", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedIGridTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.IGrid", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedILightCycleTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.ILightCycle", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedIPlayerTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.IPlayer", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedIRendererTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.IRenderer", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedITileTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.ITile", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedITronGameTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.ITronGame", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedLightCycleTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.LightCycle", UtilTest.MODEL_NAME);
    }

    @Test
    void wellPlacedPositionTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.Position", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedRendererTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.Renderer", UtilTest.VIEW_NAME);
    }

    @Test
    void wellPlacedSpriteTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.Sprite", UtilTest.SHARE_NAME);
    }

    @Test
    void wellPlacedTextWindowTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.TextWindow", UtilTest.VIEW_NAME);
    }

    @Test
    void wellPlacedTronGameTest() {
        UtilTest.testIfClassExistsInModule("com.jad.tron.TronGame", UtilTest.CONTROLLER_NAME);
    }

    @Test
    void wellPlacedTronMainTest() {
        UtilTest.testIfClassExistsInModule("com.jad.TronMain", UtilTest.MAIN_NAME);
    }
}
