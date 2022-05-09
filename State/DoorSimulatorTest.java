package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DoorSimulatorTest {

    @Test
    public void shouldStartOpeningIfAlreadyClosed() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        String result = c1.buttonPressed(ds);

        //then
        Assertions.assertEquals("Otwieranie drzwi...", result);
    }

    @Test
    public void shouldNotOpenIfAlreadyNotClosed() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        c1.sensor1Reached(ds);
        String result = c1.buttonPressed(ds);

        //then
        Assertions.assertNotEquals("Drzwi otwarte", result);
    }


    @Test
    public void shouldOpenIfAlreadyOpening() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        String result = c1.sensor1Reached(ds);
        //then

        Assertions.assertEquals("Drzwi otwarte", result);
    }

    @Test
    public void shouldNotOpenIfAlreadyNotOpening() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        String result = c1.sensor1Reached(ds);

        //then

        Assertions.assertNotEquals("Drzwi otwarte", result);
    }

    @Test
    public void shouldClosingIfAlreadyOpened() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        c1.sensor1Reached(ds);
        String result = c1.timeout(ds);
        //then

        Assertions.assertEquals("Zamykanie drzwi...", result);
    }

    @Test
    public void shouldNotClosingIfAlreadyNotOpened() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        String result = c1.timeout(ds);
        //then

        Assertions.assertNotEquals("Zamykanie drzwi...", result);
    }

    @Test
    public void shouldCloseIfAlreadyClosing() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        c1.sensor1Reached(ds);
        c1.timeout(ds);
        String result = c1.sensor2Reached(ds);
        //then

        Assertions.assertEquals("Drzwi zamknięte", result);
    }

    @Test
    public void shoulNotCloseIfAlreadyNotClosing() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        c1.sensor1Reached(ds);
        String result = c1.sensor2Reached(ds);
        //then

        Assertions.assertNotEquals("Drzwi zamknięte", result);
    }

    @Test
    public void shouldOpeningIfAlreadyClosing() {
        //given
        Client c1 = new Client();
        DoorSimulator ds = new DoorSimulator();

        //when
        c1.buttonPressed(ds);
        c1.sensor1Reached(ds);
        c1.timeout(ds);

        String result = c1.doorline(ds);
        //then

        Assertions.assertEquals("Otwieranie drzwi...", result);
    }
}
