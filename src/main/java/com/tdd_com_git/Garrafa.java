package com.tdd_com_git;

public class Garrafa {
    
    private int capacidade;
    private int volume;

    public Garrafa(int capacidade, int volume){
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade não pode ser negativa ou zero.");
        }

        if (volume < 0) {
            throw new IllegalArgumentException("Volume não pode ser negativo.");
        }

        if (volume > capacidade) {
            throw new IllegalArgumentException("Volume não pode ser maior que a capacidade.");
        }

        this.capacidade = capacidade; 
        this.volume = volume; 
    }

    public int getCapacidade(){
        return capacidade;
    }

    public int getVolume(){
        return volume;
    }

    void abasteca(int qtdeAbastecimento) {
        if (qtdeAbastecimento <= 0) {
            throw new IllegalArgumentException("Não é possível abastecer quantidade negativa.");
        }
        this.volume += qtdeAbastecimento;
    }
}
