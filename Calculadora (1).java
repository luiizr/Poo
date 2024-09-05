import java.util.Scanner;
public class Calculadora {
  Scanner sc = new Scanner(System.in);  
  public int operacao;
  
  public double valor1;
  public double valor2;
  public double resultado;
  public double prox;


  void introducao(){
    System.out.println("Diga qual operação você deseja fazer: " + "\n" + "|1| p/ Soma" + "\n" + "|2| p/ Subtração" + "\n" + "|3| p/ Multiplicação" + "\n" + "|4| p/ Divisão");
    this.operacao = sc.nextInt();
    System.out.println("Digite o primeiro valor: ");
    this.valor1 = sc.nextDouble();
    System.out.println("Digite o segundo valor: ");
    this.valor2 = sc.nextDouble();
  }


  void cont(){
    System.out.println(this.resultado + "\n" + "Diga qual operação fazer agora: " + "\n" + "|1| p/ Soma" + "\n" + "|2| p/ Subtração" + "\n" + "|3| p/ Multiplicação" + "\n" + "|4| p/ Divisão" + "\n" + "|5| p/ Clear");
    this.operacao = sc.nextInt();
    System.out.println("Digite o segundo valor: ");
    this.valor2 = sc.nextDouble();
    this.calculadora();
  }
  
  void subtracao1(){
    resultado = valor1 - valor2;
    }
  
  void soma1(){  
    resultado = valor1 + valor2;
  }

  void multiplicacao1(){
    resultado = valor1 * valor2;
  }

  void divisao1(){
    resultado = valor1 / valor2;
  }

  void result (){
    valor1 = resultado;
    operacao = 0;
    System.out.println("Resultado: " + resultado);
  }
  void calculadora(){
  if (operacao == 2){
    subtracao1();
  }
  if (operacao == 1){
    soma1();
  }
  if (operacao == 3){
    multiplicacao1();
  }
  if (operacao == 4){
    divisao1();
  }
}

  
}