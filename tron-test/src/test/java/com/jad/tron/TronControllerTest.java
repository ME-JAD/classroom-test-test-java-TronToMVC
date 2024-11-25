package com.jad.tron;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TronControllerTest {
    private static final String DEPENDENCY_TREE_FILE = "../tron-controller/target/dependency-tree.txt";
    private static final String DEPENDENCY_PREFIX = "com.jad:";
    private static String DEPENDENCY_TREE;

    @BeforeAll
    static void readDependencyTree() throws IOException {
        TronControllerTest.DEPENDENCY_TREE = new String(Files.readAllBytes(Paths.get(
                TronControllerTest.DEPENDENCY_TREE_FILE)));
    }

    @Test
    public void doAllTests() {
        this.testTronViewDependency();
        this.testTronModelDependency();
        this.testTronMainDependency();
    }

    @Test
    void testTronViewDependency() {
        assertFalse(TronControllerTest.DEPENDENCY_TREE.contains(TronControllerTest.DEPENDENCY_PREFIX + "tron-view"),
                    "Dependency 'tron-view' should not be present");
    }

    @Test
    void testTronModelDependency() {
        assertFalse(TronControllerTest.DEPENDENCY_TREE.contains(TronControllerTest.DEPENDENCY_PREFIX + "tron-model"),
                    "Dependency 'tron-model' should not be present");
    }

    @Test
    void testTronMainDependency() {
        assertFalse(TronControllerTest.DEPENDENCY_TREE.contains(TronControllerTest.DEPENDENCY_PREFIX + "tron-main"),
                    "Dependency 'tron-main' should not be present");
    }
}

