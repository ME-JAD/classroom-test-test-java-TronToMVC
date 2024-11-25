package com.jad.tron;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public enum UtilTest {
    ;

    static final String CONTROLLER_NAME = "tron-controller";
    static final String MAIN_NAME = "tron-main";
    static final String MODEL_NAME = "tron-model";
    static final String SHARE_NAME = "tron-share";
    static final String VIEW_NAME = "tron-view";

    static void testIfModuleExists(String moduleName) {
        String modulePath = UtilTest.getModulePath(moduleName);
        assertTrue(Files.exists(Paths.get(modulePath)), "Module " + moduleName + " does not exist");
    }

    private static String getModulePath(String moduleName) {
        return "../" + moduleName.replace('.', '/');
    }

    static void testIfClassExistsInModule(String className, String moduleName) {
        String modulePath = UtilTest.getModulePath(moduleName);
        String classPath = UtilTest.getClassPathInModule(className, moduleName);
        assertTrue(Files.exists(Paths.get(classPath)), "Class " + className + " is misplaced");
    }

    private static String getClassPathInModule(String className, String moduleName) {
        return UtilTest.getModulePath(moduleName) + "/target/classes/" + className.replace('.', '/') + ".class";
    }
}
