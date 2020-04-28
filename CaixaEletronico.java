package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        int senha = 1020304;
        int escolha = 0;
        float saldo = 1000;
        float deposito;
        float saque;
        
        
        String cpf = "123.456.789-00";
        String cpfdigitado;
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Seja Bem vindo ao Sistema de Caixa Eletrônico \n");
        
        System.out.print("Digite seu cpf: ");
        cpfdigitado = ler.next();
        
        if(cpf.equals(cpfdigitado)){
            System.out.println("Cpf correto \n");
        }else{
            System.out.println("Cpf incorreto \n");
            
        }
        
        System.out.print("Digite sua senha:");
        senha = ler.nextInt();
        
        
        while(senha != 1020304){
            System.out.println("Senha incorreta \n");
            
            System.out.print("Digite a senha correta:");
            senha = ler.nextInt();
        }
        
        System.out.println("\n");
        
       
       System.out.println("---------------------");         
       System.out.println("1 - Consultar Saldo");
       System.out.println("2 - Fazer depósito");
       System.out.println("3 - Fazer Saque");
       System.out.println("0 - Sair");
       System.out.println("--------------------- \n");         
       
       System.out.println("Qual operação vai efetuar ? ");
       escolha = ler.nextInt();
       
       
       switch(escolha){
           case 1:
               System.out.println("Saldo: R$"+saldo);
               
               break;
               
           case 2:
               System.out.print("Digite um valor para deposito: ");
               deposito = ler.nextInt();
               
               saldo = saldo + deposito;
               
               System.out.println("Seu saldo agora é de R$"+saldo);
               
               break;
           case 3:
               System.out.print("Digite o valor do saque: ");
               saque = ler.nextInt();
               
               saldo = saldo - saque;
               
               System.out.println("Seu saldo é de R$"+saldo);
               
               if(saldo < saque){
                   System.out.print("Voce não possui saldo suficiente");
                   saldo = 0;
                   
                   System.out.println("Seu saldo é de R$"+saldo);
                   
                  
               }
               break;
           case 0:
               System.out.println("Operação Encerrada");
               
       }
           
    }
   
}
