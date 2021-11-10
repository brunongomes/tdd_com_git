package com.tdd_com_git;

public class Garrafa {
    
    private int capacidade;
    private int volume;

    public Garrafa(int capacidade, int volume){
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade não pode ser negativa ou zero.");
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
}
