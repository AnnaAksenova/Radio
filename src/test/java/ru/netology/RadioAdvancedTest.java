package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RadioAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "RadioPlus";

        assertNull(radio.getName());
        radio.setName("RadioPlus");
        assertEquals(expected, radio.getName());
    }

    @Test
    public void returnZeroStationAfterMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(9);

        radio.setCurrentRadioNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void returnNineStationAfterMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(0);

        radio.setCurrentRadioNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingOnNextStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(3);

        radio.setCurrentRadioNumber(4);

        int expected = 4;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void switchingOnPreviousStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(9);

        radio.setCurrentRadioNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMoreMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxVolumeLevel(10);
        radio.setMinVolumeLevel(0);
        radio.setCurrentVolumeLevel(9);

        radio.setCurrentVolumeLevel(9);

        int expected = 10;
        int actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);

    }
    @Test
    public void reduceVolumeLessMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxVolumeLevel(10);
        radio.setMinVolumeLevel(0);
        radio.setCurrentVolumeLevel(0);

        radio.setCurrentVolumeLevel(10);

        int expected = 10;
        int actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);

    }
    @Test
    public void choiceWantStation() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "6";

        assertNull(radio.getWantStation());
        radio.setWantStation("6");
     assertEquals(expected, radio.getWantStation());
    }
    }

