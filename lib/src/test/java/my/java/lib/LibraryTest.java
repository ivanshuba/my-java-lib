package my.java.lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testBooleanLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.testBooleanLibraryMethod(), "testBooleanLibraryMethod should return true");
    }

    @Test
    void testStringLibraryMethodReturnsHelloWorld() {
        Library classUnderTest = new Library();
        assertEquals("Hello World!", classUnderTest.testStringLibraryMethod(), "testStringLibraryMethod should return 'Hello World!'");
    }

    @Test
    void testIntLibraryMethodReturns1984() {
        Library classUnderTest = new Library();
        assertEquals(1984, classUnderTest.testIntLibraryMethod(), "testIntLibraryMethod should return 1984");
    }

    @Test
    void testDoubleLibraryMethodReturns1984Point0() {
        Library classUnderTest = new Library();
        assertEquals(1984.0, classUnderTest.testDoubleLibraryMethod(), "testDoubleLibraryMethod should return 1984.0");
    }
}
