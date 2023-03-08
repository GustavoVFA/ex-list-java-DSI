package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /* Scanner grava = new Scanner(System.in);
       int valor;
        System.out.println("Digite um valor");
        valor = grava.nextInt();
        
        if(valor <= 10){
            System.out.println("Valor menor ou igual a dez");
        }else{
            System.out.println("Valor maior que dez"); 
        } 
          
        int idade;
        System.out.println("Digite sua idade");
        idade = grava.nextInt();
        
        if(idade <= 0){
            System.out.println("Idade Inválida");
        }
        else if(idade <= 10){
            System.out.println("Categoria Infantil");
        }
        else if(idade <= 14){
            System.out.println("Categoria Infanto-Juvenil");
        }
        else if(idade <= 17){
            System.out.println("Categoria Pré-Adolescente");
        }else{
            System.out.println("Categoria Adulto");
        }
        */
    
        Scanner grava = new Scanner(System.in);
        
        int escolha; 
        System.out.println("Digite a opção desejada \n"
                + "[1] - Inclusão \n"
                + "[2] - Alteração \n"
                + "[3] - Exclusão \n"
                + "[4] - Sair");
        
        escolha = grava.nextInt();
        String nCPF, nRg, cod;
        if(escolha == 1){
            System.out.println("Informe CPF: ");
            nCPF = grava.next();
            System.out.println("Informe RG: ");
            nRg = grava.next();
            System.out.println("Informe Codigo: ");
            cod = grava.next();
            System.out.println("Cadastro realizado com sucesso");
        }
        else if(escolha == 2){
            System.out.println("Registro alterado co sucesso");
        }
        else if(escolha == 3){
            System.out.println("Registro Excluido co sucesso");
        }
        else if(escolha == 4){
            System.out.println("Saindo do Sistema");
        }
         
        int esc;
        double valor, valor1;
        String msg;
        System.out.println("Digite a opção desejada \n"
                + "[1] - veja a mensagem \n"
                + "[2] - tire 10% do valor desejado \n"
                + "[3] - sair \n");
        esc = grava.nextInt();
           if(esc == 1){
               System.out.println("digite a mensagem");
               msg = grava.next();
               System.out.println(msg);
        }
           else if(esc == 2){
               System.out.println("digite o valor desejado: ");
               valor = grava.nextDouble();
               System.out.println("10% de "+ valor+ " é:"+ valor*0.1);
               valor1 = valor - (valor*0.1);
               System.out.println("o valor sem 10% é: " + valor1);
           }
           else if(esc == 3){
               System.out.println("Saindo do Sistema");
           }
    }    
}
    
    
    

