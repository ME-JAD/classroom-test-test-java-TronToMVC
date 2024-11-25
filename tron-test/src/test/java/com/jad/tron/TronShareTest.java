package com.jad.tron;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TronShareTest {
    private static final String DEPENDENCY_TREE_FILE = "../tron-share/target/dependency-tree.txt";
    private static final String DEPENDENCY_PREFIX = "com.jad:";
    private static String DEPENDENCY_TREE;

    @BeforeAll
    static void readDependencyTree() throws IOException {
        TronShareTest.DEPENDENCY_TREE = new String(Files.readAllBytes(Paths.get(TronShareTest.DEPENDENCY_TREE_FILE)));
    }

    @Test
    public void doAllTests() {
        this.testTronMainDependency();
        this.testTronViewDependency();
        this.testTronControllerDependency();
        this.testTronModelDependency();
    }

    @Test
    void testTronMainDependency() {
        assertFalse(TronShareTest.DEPENDENCY_TREE.contains(TronShareTest.DEPENDENCY_PREFIX + "tron-main"),
                    "Dependency 'tron-main' should not be present");
    }

    @Test
    void testTronViewDependency() {
        assertFalse(TronShareTest.DEPENDENCY_TREE.contains(TronShareTest.DEPENDENCY_PREFIX + "tron-view"),
                    "Dependency 'tron-view' should not be present");
    }

    @Test
    void testTronControllerDependency() {
        assertFalse(TronShareTest.DEPENDENCY_TREE.contains(TronShareTest.DEPENDENCY_PREFIX + "tron-controller"),
                    "Dependency 'tron-controller' should not be present");
    }

    @Test
    void testTronModelDependency() {
        assertFalse(TronShareTest.DEPENDENCY_TREE.contains(TronShareTest.DEPENDENCY_PREFIX + "tron-model"),
                    "Dependency 'tron-model' should not be present");
    }
}
