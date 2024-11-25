package com.jad.tron;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TronViewTest {
    private static final String DEPENDENCY_TREE_FILE = "../tron-view/target/dependency-tree.txt";
    private static final String DEPENDENCY_PREFIX = "com.jad:";
    private static String DEPENDENCY_TREE;

    @BeforeAll
    static void readDependencyTree() throws IOException {
        TronViewTest.DEPENDENCY_TREE = new String(Files.readAllBytes(Paths.get(TronViewTest.DEPENDENCY_TREE_FILE)));
    }

    @Test
    public void doAllTests() {
        this.testTronMainDependency();
        this.testTronModelDependency();
        this.testTronControllerDependency();
    }

    @Test
    void testTronMainDependency() {
        assertFalse(TronViewTest.DEPENDENCY_TREE.contains(TronViewTest.DEPENDENCY_PREFIX + "tron-main"),
                    "Dependency 'tron-main' should not be present");
    }

    @Test
    void testTronModelDependency() {
        assertFalse(TronViewTest.DEPENDENCY_TREE.contains(TronViewTest.DEPENDENCY_PREFIX + "tron-model"),
                    "Dependency 'tron-model' should not be present");
    }

    @Test
    void testTronControllerDependency() {
        assertFalse(TronViewTest.DEPENDENCY_TREE.contains(TronViewTest.DEPENDENCY_PREFIX + "tron-controller"),
                    "Dependency 'tron-controller' should not be present");
    }
}

