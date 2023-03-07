package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
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
        
    }
}
    
    
    

