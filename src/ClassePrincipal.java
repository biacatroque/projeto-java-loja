
import java.util.Scanner;

public class ClassePrincipal {
    
    public static void main (String[] args) {
        
        Carro carro = new Carro();
        
        Scanner scan = new Scanner (System.in);
              
        System.out.print("Nome do Carro: ");
        carro.nome = scan.next();
        System.out.println("Nome do Carro é: " + carro.nome);
        
        
        System.out.print("Marca do Carro: ");
        carro.marca = scan.next();
        System.out.println("A Marca do Carro é: " + carro.marca);
      
        
        System.out.print("Cor do Carro: ");
        carro.cor = scan.next();
        System.out.println("A cor do Carro é: " + carro.cor);
        
        
        System.out.print("Fabricacao do Carro: ");
        carro.fabricacao = scan.next();
        System.out.println("A Fabricacao do Carro é: " + carro.fabricacao);
        
        
        System.out.print("Largura do Carro: ");
        carro.largura = scan.next();
        System.out.println("A largura do Carro é: " + carro.largura);
        
        
        System.out.print("Peso do Carro: ");
        carro.peso = scan.next();
        System.out.println("O peso do Carro é: " + carro.peso);
        
        
        System.out.print("Comprimento do Carro é: ");
        carro.comprimento = scan.next();     
        System.out.println("O comprimento do Carro ´é: " + carro.comprimento);
        
        
        System.out.print("Janela do Carro: ");
        carro.janela = scan.next();
        System.out.println("A janela do Carro é: " + carro.janela);
        
        
        System.out.print("Nome do Carro é: " + carro.nome);
        System.out.print("A Marca do Carro é: " + carro.marca);
        System.out.print("A cor do Carro é: " + carro.cor);
        System.out.print("A Fabricacao do Carro é: " + carro.fabricacao);
        System.out.print("O peso do Carro é: " + carro.peso);
        System.out.print("O comprimento do Carro ´é: " + carro.comprimento);
        System.out.print("A janela do Carro é: " + carro.janela);
        System.out.print("O peso do Carro é: " + carro.peso);
        System.out.print("O comprimento do Carro ´é: " + carro.comprimento);
        System.out.print("A janela do Carro é: " + carro.janela);
        
              
        
    }
}
