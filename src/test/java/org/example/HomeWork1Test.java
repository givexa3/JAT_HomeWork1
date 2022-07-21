package test.java.org.example;

import main.java.org.example.HomeWork1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Test {

    private final HomeWork1 hw;

    public HomeWork1Test() {
        this.hw = new HomeWork1();
    }

    @Test
    void getMaxWordOccurrence() {

        String text = "We are the best test coders. Give us a try? !";

        assertEquals(6, hw.getMaxWordOccurrence(text));
    }

    @Test
    void findBookById(){
        //Since this is not spring boot application
        //I could not write test for it
        //please look at my implementation in HomeWork1 class
        //it is commented out and explained
    }

    @Test
    void findCharlieId(){
        assertEquals(125L, hw.findCharlieId());
    }

    @Test
    void findEmployeeCount(){
        assertEquals(2, hw.findEmployeeCount());
    }

    @Test
    void calculateSum(){
        assertEquals(5050, hw.calculateSum());
    }

    @Test
    void bubbleSort(){
        hw.bubbleSort();
    }

    @Test
    void analyzeHierarchy(){
        ClassCastException exception = assertThrows(ClassCastException.class, hw::analyzeHierarchy);
        assertEquals("class java.lang.ClassCastException", exception.getClass().toString());
    }

}