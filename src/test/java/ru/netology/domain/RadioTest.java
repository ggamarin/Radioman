package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void nextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.increaseChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    void previousChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setDesiredChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    //допустим что с пульта можно вводить многозначные номера каналов
    public void nextChannelFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(320);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    //допустим что с пульта можно вводить многозначные номера каналов
    public void previousChannelFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(320);
        radio.decreaseChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    //допустим что с пульта можно вводить многозначные номера каналов
    public void setDesiredChannelAny() {
        Radio radio = new Radio();
        radio.setCurrentChannel(35);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    //допустим что с пульта можно вводить многозначные номера каналов
    public void setDesiredChannelAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-35);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    //допустим что с пульта можно вводить многозначные номера каналов, в том числе и отрицательные
    public void nextChannelFromAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-320);
        radio.increaseChannel();
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    //допустим что с пульта можно вводить многозначные номера каналов, в том числе и отрицательные
    public void previousChannelFromAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-320);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void decreaseVolumeFromAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
}


