package crud;

import java.util.Arrays;
import java.util.Scanner;

public class Crud {

    public static void main(String[] args) {
        Scanner selecionar = new Scanner(System.in);

        int escolher;
        int contador = 0;
        int tamanho = 4;
        int[] vetor1 = new int[tamanho];
        int[] vetorPreço = new int[tamanho];
        int[] vetorQuan = new int[tamanho];
        String[] vetorNome = new String[tamanho];

        do {

            //inicio de sistema
            System.out.println("====================");
            System.out.println("1. Adicionar produto");
            System.out.println("2. remover produto");
            System.out.println("3. Atualizar informacoes de produto");
            System.out.println("4. visualizar produtos");
            System.out.println("5. calcular o valor total do estoque");
            System.out.println("0. Sair");
            System.out.println("====================");
            escolher = selecionar.nextInt();
            System.out.println("====================");

            switch (escolher) {
                case 1:
                    //adicionar
                    for (int i = contador; i < tamanho; i++) {
                        System.out.println("Qual o nome do produto?");
                        selecionar.nextLine();
                        vetorNome[i] = selecionar.nextLine();
                        System.out.println("Qual seu preço?");
                        vetorPreço[i] = selecionar.nextInt();
                        System.out.println("Qual a quantidade?");
                        vetorQuan[i] = selecionar.nextInt();
                        System.out.println("====================");
                        System.out.println("Ficha de produto");
                        System.out.println("Nome: " + Arrays.toString(vetorNome));
                        System.out.println("Preço: " + Arrays.toString(vetorPreço));
                        System.out.println("Quantidade: " + Arrays.toString(vetorQuan));

                        contador++;

                        break;
                    }

                    break;

                case 2:
                    //remover
                    int contadorR;
                    System.out.println("Deseja remover qual produto?");
                    contadorR = selecionar.nextInt();

                    vetorNome[contadorR] = "0";
                    vetorPreço[contadorR] = 0;
                    vetorQuan[contadorR] = 0;

                    System.out.println("Removido com sucesso!!");

                    break;

                case 3:
                    //atulizar produto
                    int contadorA;
                    System.out.println("Qual produto deseja refazer?");
                    contadorA = selecionar.nextInt();
                    System.out.println("Produto " + contadorA);
                    for (int i = contadorA; i < tamanho; i++) {

                        System.out.println("Novo nome: ");
                        selecionar.nextLine();
                        vetorNome[contadorA] = selecionar.nextLine();
                        System.out.println("Novo preço:");
                        vetorPreço[contadorA] = selecionar.nextInt();
                        System.out.println("Nova quantidade:");
                        vetorQuan[contadorA] = selecionar.nextInt();

                        break;

                    }

                    break;

                case 4:
                    //visualizar produtos

                    System.out.println("Aqui estao seus produtos...");

                    System.out.println("Nome: " + Arrays.toString(vetorNome));
                    System.out.println("Preço: " + Arrays.toString(vetorPreço));
                    System.out.println("Quantidade: " + Arrays.toString(vetorQuan));

                    break;

                case 5:
                    //total

                    break;

            }

        } while (escolher != 0);

    }

}