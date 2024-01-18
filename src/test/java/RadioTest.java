import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testSetCurrentStationBeforeZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(-7);
        radio.setCurrentStation(7);

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testSetCurrentStationMoreNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(16);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextStationReturnZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevStationReturnNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testIncreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(40);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 41;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testIncreaseVolumeMoreHundred(){
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testDecreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(40);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 39;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testDecreaseVolumeBelowZero(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(40);
        int actual = radio.getCurrentVolume();
        int expected = 40;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeMore() {
        Radio radio = new Radio();

        radio.setCurrentVolume(140);
        radio.setCurrentVolume(40);
        int actual = radio.getCurrentVolume();
        int expected = 40;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSetVolumeBelow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);
        radio.setCurrentVolume(40);
        int actual = radio.getCurrentVolume();
        int expected = 40;

        Assertions.assertEquals(expected, actual);
    }









}