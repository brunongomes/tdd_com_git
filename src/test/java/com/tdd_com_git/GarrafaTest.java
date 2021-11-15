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

@Test(expected = IllegalArgumentException.class)
    public void tentaConstruirGarrafaComCapacidadeZeroTest() {
        int capacidadeZero = 0;
        int volume = 150;

        Garrafa garrafa = new Garrafa(capacidadeZero, volume);
        fail("Você não pode criar uma garrafa com capacidade zero.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaConstruirGarrafaComVolumeNegativoTest() {
        int capacidade = 1000;
        int volumeNegativo = -150;

        Garrafa garrafa = new Garrafa(capacidade, volumeNegativo);
        fail("Você não pode criar uma garrafa com volume negativo.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaConstruirGarrafaComVolumeZeroTest() {
        int capacidade = 1000;
        int volumeZero = 0;

        Garrafa garrafa = new Garrafa(capacidade, volumeZero);
        assertEquals(volumeZero, garrafa.getVolume());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaCriarUmaGarrafaComMaisVolumeQueCapacidade() {
        new Garrafa(100, 1000);
        fail("Você não pode criar uma garrafa com volume maior que capacidade.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaCriarUmaGarrafaComMaisVolumeIgualACapacidade() {
        int capacidade, volume;
        capacidade = volume = 1000;
        Garrafa garrafa = new Garrafa(1000, 1000);

        assertEquals(garrafa.getVolume(), garrafa.getCapacidade());
    }

    @Test
    public void abasteceUmVolume() {
        int capacidade = 1000;
        int volume = 700;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeAbastecimento = 100;
        garrafa.abasteca(qtdeAbastecimento);

        assertEquals(volume + qtdeAbastecimento, garrafa.getVolume());
    }

    @Test
    public void abasteceUmVolume2() {
        int capacidade = 500;
        int volume = 100;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeAbastecimento = 300;
        garrafa.abasteca(qtdeAbastecimento);

        assertEquals(volume + qtdeAbastecimento, garrafa.getVolume());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaAbasteceUmValorNegativo() {
        int capacidade = 500;
        int volume = 100;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeAbastecimento = -100;
        garrafa.abasteca(qtdeAbastecimento);

        fail("Você não pode abastecer um valor negativo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaAbasteceUmValorZero() {
        int capacidade = 500;
        int volume = 100;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeAbastecimento = 0;
        garrafa.abasteca(qtdeAbastecimento);

        fail("Você não pode abastecer um valor zero.");
    }

    @Test
    public void verificaPorcentagemTest() {
        int capacidade = 100;
        int volume = 90;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(90, garrafa.getPorcentagem());
    }

    @Test
    public void verificaPorcentagem2Test() {
        int capacidade = 100;
        int volume = 75;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(75, garrafa.getPorcentagem());
    }

    @Test
    public void verificaPorcentagem3Test() {
        int capacidade = 389;
        int volume = 50;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(12, garrafa.getPorcentagem());
    }

    @Test
    public void verificaSeAGarrafaEstaCheiaTest() {
        int capacidade = 100;
        int volume = 90;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.CHEIA, garrafa.getSituacao());
    }

    @Test
    public void verificaSeAGarrafaEstaCheia2Test() {
        int capacidade = 100;
        int volume = 71;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.CHEIA, garrafa.getSituacao());
    }

    @Test
    public void verificaSeAGarrafaEstaMeioCheiaTest() {
        int capacidade = 100;
        int volume = 60;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.MEIO_CHEIA, garrafa.getSituacao());
    }

    @Test
    public void verificaSeAGarrafaEstaMeioCheia2Test() {
        int capacidade = 100;
        int volume = 50;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.MEIO_CHEIA, garrafa.getSituacao());
    }

    @Test
    public void verificaSeAGarrafaEstAcabandoTest() {
        int capacidade = 100;
        int volume = 40;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.ACABANDO, garrafa.getSituacao());
    }

    @Test
    public void verificaSeAGarrafaPodeFazerMaisCafe() {
        int capacidade = 100;
        int volume = 20;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.FAZER_MAIS, garrafa.getSituacao());
    }

    @Test
    public void verificaSeAGarrafaAcabouCafe() {
        int capacidade = 100;
        int volume = 5;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        assertEquals(Garrafa.ACABOU, garrafa.getSituacao());
    }

    @Test
    public void retiraUmVolume() {
        int capacidade = 500;
        int volume = 300;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeRetirar = 200;
        garrafa.retira(qtdeRetirar);

        assertEquals(volume + qtdeRetirar, garrafa.getVolume());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaRetirarUmValorNegativo() {
        int capacidade = 500;
        int volume = 100;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeRetirar = -100;
        garrafa.retira(qtdeRetirar);

        fail("Você não pode retirar um valor negativo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tentaRetirarUmValorZero() {
        int capacidade = 500;
        int volume = 100;
        Garrafa garrafa = new Garrafa(capacidade, volume);

        int qtdeRetirar = 0;
        garrafa.retira(qtdeRetirar);

        fail("Você não pode retirar um valor zero.");
    }
}
