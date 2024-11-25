package com.jad.tron;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TronModelTest {
    private static final String DEPENDENCY_TREE_FILE = "../tron-model/target/dependency-tree.txt";
    private static final String DEPENDENCY_PREFIX = "com.jad:";
    private static String DEPENDENCY_TREE;

    @BeforeAll
    static void readDependencyTree() throws IOException {
        TronModelTest.DEPENDENCY_TREE = new String(Files.readAllBytes(Paths.get(TronModelTest.DEPENDENCY_TREE_FILE)));
    }

    @Test
    public void doAllTests() {
        this.testTronControllerDependency();
        this.testTronMainDependency();
        this.testTronViewDependency();
    }

    @Test
    void testTronControllerDependency() {
        assertFalse(TronModelTest.DEPENDENCY_TREE.contains(TronModelTest.DEPENDENCY_PREFIX + "tron-controller"),
                    "Dependency 'tron-controller' should not be present");
    }

    @Test
    void testTronMainDependency() {
        assertFalse(TronModelTest.DEPENDENCY_TREE.contains(TronModelTest.DEPENDENCY_PREFIX + "tron-main"),
                    "Dependency 'tron-main' should not be present");
    }

    @Test
    void testTronViewDependency() {
        assertFalse(TronModelTest.DEPENDENCY_TREE.contains(TronModelTest.DEPENDENCY_PREFIX + "tron-view"),
                    "Dependency 'tron-view' should not be present");
    }
}

