package com.tdd_com_git;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.fail;

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

   @Test
   public void capacidadeEVolumeInicial2Test() {
      int capacidade = 900;
      int volume = 200;
      garrafa = new Garrafa(capacidade, volume);

      assertEquals(capacidade, garrafa.getCapacidade());
      assertEquals(volume, garrafa.getVolume());
   }

   @Test(expected = IllegalArgumentException.class)
   public void tentaConstuirGarrafaComCapacidadeNegativaTest() {
      int capacidadeNegativa = -750;
      int volume = 150;

      garrafa = new Garrafa(capacidadeNegativa, volume);
      fail("Você não pode criar uma garrafa com capacidade negativa.");
   }
}
