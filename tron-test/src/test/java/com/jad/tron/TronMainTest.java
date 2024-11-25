package com.jad.tron;

import org.junit.jupiter.api.Test;

public class TronMainTest {
    @Test
    public void doAllTests() {
        this.modulesExistTest();
    }

    @Test
    void modulesExistTest() {
        UtilTest.testIfModuleExists(UtilTest.MAIN_NAME);
        UtilTest.testIfModuleExists(UtilTest.CONTROLLER_NAME);
        UtilTest.testIfModuleExists(UtilTest.MODEL_NAME);
        UtilTest.testIfModuleExists(UtilTest.SHARE_NAME);
        UtilTest.testIfModuleExists(UtilTest.VIEW_NAME);
    }
}
