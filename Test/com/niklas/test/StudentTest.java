package com.niklas.test;

import com.niklas.jUnit_Inheritence.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// This is out Test Class
class StudentTest {

    @Test
    public void myTest() {

        Student benny = new Student("Benny", 15, true);
        Student frida = null;

        assertEquals(benny.name, "Benny");
        assertNotNull(benny);
    }

}