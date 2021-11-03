package com.tdd_com_git;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GarrafaTest {

    private Garrafa garrafa;

    @Test
    public void capacidadeEVolumeInicialTest() {
    int capacidade = 1000;
    int volume = 700;
    garrafa = new Garrafa(capacidade, volume);

    assertEquals(capacidade, garrafa.getCapacidade());
    assertEquals(volume, garrafa.getVolume());
}
}
