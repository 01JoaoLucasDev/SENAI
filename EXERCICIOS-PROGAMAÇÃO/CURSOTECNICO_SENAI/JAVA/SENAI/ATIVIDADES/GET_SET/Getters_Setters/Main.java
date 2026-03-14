package Getters_Setters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
       pessoa.setNome("João");
       pessoa.setIdade(17);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
    }
    }

