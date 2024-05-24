//SHIFT + ALT + A > tirar comentário para rodar 1 por vez

//Baby-steps
public static void main (String[] args) {
    String Planeta = "Plutão";
    System.out.println("O planeta é:" + Planeta )
}

/* //Hello clarice
//import java.util.scanner;
Scanner entrada - new Scanner(system.in);
String nomeUsuario = entrada.nextLine();
System.out.print("Olá, bom dia" = nomeUsuario);

//A bit of information
Scanner entrada = new Scanner(system.in);
System.out.print("Informe seu nome:")
String nomeUsuario = entrada.nextLine();
System.out.print("Informe sua idade: ");
int idade = entrada.nextInt();
System.out.print("bom dia" + nomeUsuario + "sua idade é"  + idade);

//Áreas de figura plana
//triângulo
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}

//retângulo
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da largura do retângulo: ");
        double width = scanner.nextDouble();

        System.out.print("Digite o valor da altura do retângulo: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}

//círculo
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}

//quadrado
System.out.print("Informe um lado: ");
double lado = entrada.nextDouble();
double area = lado * lado;
System.out.println("A soma do quadrado é: " + area);

//losango
System.out.print("Informe a diagonal maior: ");
double diagonalMaior = entrada.nextDouble();

System.out.print("Informe a diagonal menor: ");
double diagonalMenor = entrada.nextDouble();

double area = diagonalMaior * diagonalMenor / 2;

System.out.println("Área total é" + area);

//paralelogramo
System.out.println("Calculo da área do paralelogramo");
System.out.print("informe a base: ");
double baseParalelogramo = scanner.nextDouble();
System.out.print("informe a altura: ");
double alturaParlelogramo = scanner.nextDouble();
double areaParalelogaramo = baseParalelogramo * alturaParalelogramo;
System.out.println("A área do paralelogramo é: " + areaParalelogramo);



//positivo, negativo e neutro
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("O número é positivo.");
        } else if (number < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é neutro.");
        }

        scanner.close();
    }
}

//maior de três
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores diferentes:");
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        double value3 = scanner.nextDouble();

        double maxValue = Math.max(value1, Math.max(value2, value3));

        System.out.println("O maior valor é: " + maxValue);

        scanner.close();
    }
}
//maior de quatro (repetido)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quatro valores diferentes:");
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        double value3 = scanner.nextDouble();
        double value4 = scanner.nextDouble();

        double maxValue = value1;

        if (value2 > maxValue) {
            maxValue = value2;
        }
        if (value3 > maxValue) {
            maxValue = value3;
        }
        if (value4 > maxValue) {
            maxValue = value4;
        }

        System.out.println("O maior valor é: " + maxValue);

        scanner.close();
    }
}

//7 - Qual o quê? > soma de dois maiores - sumOfTwoLargest > armazena a soma dos dois maiores valores
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores diferentes:");
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        double value3 = scanner.nextDouble();

        double sumOfTwoLargest;

        if (value1 > value2 && value1 > value3) {
            sumOfTwoLargest = value1;
            sumOfTwoLargest += Math.max(value2, value3);
        } else if (value2 > value1 && value2 > value3) {
            sumOfTwoLargest = value2;
            sumOfTwoLargest += Math.max(value1, value3);
        } else {
            sumOfTwoLargest = value3;
            sumOfTwoLargest += Math.max(value1, value2);
        }

        System.out.println("A soma dos dois maiores valores é: " + sumOfTwoLargest);

        scanner.close();
    }
}

//lê 5 valores
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco valores diferentes:");
        double[] values = new double[5];

        for (int i = 0; i < values.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }

        //dois maiores valores
        double largest1 = Double.MIN_VALUE;
        double largest2 = Double.MIN_VALUE;

        for (double value : values) {
            if (value > largest1) {
                largest2 = largest1;
                largest1 = value;
            } else if (value > largest2) {
                largest2 = value;
            }
        }

        double sumOfTwoLargest = largest1 + largest2;

        System.out.println("A soma dos dois maiores valores é: " + sumOfTwoLargest);

        scanner.close();
    }
}
 
// 8 - enquanto isso > lê 2 valores else 0 e negativo.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores:");

        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();

        //Lógica de 0 ou negativo
        while (value2 <= 0) {
            System.out.println("O segundo valor não pode ser zero ou negativo. Digite um novo valor:");
            value2 = scanner.nextDouble();
        }

        double result = value1 / value2;

        System.out.println("O resultado da divisão de " + value1 + " por " + value2 + " é: " + result);

        scanner.close();
    }
}

// 9 -  Cansar de Digitar > lê 10 valores e calcula a média aritmética
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_VALUES = 10;
        double sum = 0;

        System.out.println("Digite 10 valores:");

        // array para armazenar os valores informados pelo usuário
        double[] values = new double[NUM_VALUES];

        // loop para ler os valores e calcular a soma
        for (int i = 0; i < NUM_VALUES; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
            sum += values[i];
        }

        //média
        double average = sum / NUM_VALUES;

        //números informados
        System.out.println("\nNúmeros informados:");
        for (int i = 0; i < NUM_VALUES; i++) {
            System.out.println(values[i]);
        }

        //média aritmética
        System.out.println("\nMédia aritmética: " + average);

        scanner.close();
    }
}

//10 - lê 4 avaliações e calcula a média do semestre
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_AVALIACOES = 4;
        final double MEDIA_MINIMA_APROVACAO = 6.0;

        System.out.println("Digite as notas das 4 avaliações:");

        double somaNotas = 0;

        // loop para ler as notas das avaliações e calcular a soma das notas
        for (int i = 1; i <= NUM_AVALIACOES; i++) {
            System.out.print("Nota da avaliação " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        // calcula a média do semestre
        double mediaSemestre = somaNotas / NUM_AVALIACOES;

        // verifica se o aluno foi aprovado e exibe a mensagem correspondente
        if (mediaSemestre >= MEDIA_MINIMA_APROVACAO) {
            System.out.println("\nMédia do semestre: " + mediaSemestre);
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("\nMédia do semestre: " + mediaSemestre);
            System.out.println("Infelizmente, você não foi aprovado.");
        }

        scanner.close();
    }
}

//11 - booommm (bomba relógio)
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.print("\rTempo restante: " + i + " segundos");
            Thread.sleep(1000);
        }
        System.out.println("\nEXPLOSÃO!");
    }
}
// 12 - Imprime algoritmos de 1 a 10 de forma crescente
public class Main {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

//13 - de quanto até quanto ?
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros separados por espaço:");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        double media = (num1 + num2) / 2.0;
        System.out.println("A média aritmética é: " + media);

        System.out.println("Os números inteiros entre " + num1 + " e " + num2 + " são:");
        for (int i = num1 + 1; i < num2; i++) System.out.println(i);

        scanner.close();
    }
}

//14 - Passou no teste
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;
        double mediaFinal;
        char resposta;

        do {
            double somaNotas = 0;

            System.out.println("Digite as 6 notas do aluno:");
            for (int i = 1; i <= 6; i++) {
                System.out.print("Nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            mediaFinal = somaNotas / 6;
            System.out.println("Média final: " + mediaFinal);

            if (mediaFinal >= 6.5) {
                alunosAprovados++;
            }

            System.out.print("Calcular a média de outro aluno (S/N)? ");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        scanner.close();
    }
}

// Uma brincadeira sobre altura
public class Main {
    public static void main(String[] args) {
        double alturaAnacleto = 1.50;
        double crescimentoAnacleto = 0.02;
        double alturaFelisberto = 1.10;
        double crescimentoFelisberto = 0.03;
        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
    }
}

// 16 - o voto é secreto
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total de eleitores: ");
        int total = scanner.nextInt();
        int brancos = scanner.nextInt(), validos = scanner.nextInt(), nulos = scanner.nextInt();

        double brancosPerc = brancos * 100.0 / total;
        double validosPerc = validos * 100.0 / total;
        double nulosPerc = nulos * 100.0 / total;

        System.out.printf("Brancos: %.2f%%\nVálidos: %.2f%%\nNulos: %.2f%%\n", brancosPerc, validosPerc, nulosPerc);

        scanner.close();
    }
}

// 17 - custa quanto?
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double impostos = 0.45;

        double custoConsumidor = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);

        System.out.println("O custo final ao consumidor é: R$" + custoConsumidor);

        scanner.close();
    }
}

//18 - a pagar
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioFixo = 5000.00;
        double comissaoFixa = 1000.00;

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();
        System.out.print("Digite o valor total das vendas: R$");
        double valorTotalVendas = scanner.nextDouble();

        double comissao = numCarrosVendidos * comissaoFixa;
        double comissaoPorVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissao + comissaoPorVendas;

        System.out.println("\nDetalhes das vendas:");
        System.out.println("Número de carros vendidos: " + numCarrosVendidos);
        System.out.println("Valor total das vendas: R$" + valorTotalVendas);
        System.out.println("Comissão por carro vendido: R$" + comissao);
        System.out.println("Comissão por vendas (5%): R$" + comissaoPorVendas);

        System.out.println("\nSalário final do vendedor: R$" + salarioFinal);

        scanner.close();
    }
}

//19 - é o que?
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean formaTriangulo = (a < b + c) && (b < a + c) && (c < a + b);

        if (formaTriangulo) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}

// 20 - cpf na nota
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto = scanner.nextLine();
        int quantidade = scanner.nextInt();
        double precoUnitario = scanner.nextDouble();

        double valorVenda = quantidade * precoUnitario;
        double desconto = (quantidade <= 5) ? 0.02 : ((quantidade <= 10) ? 0.03 : 0.05);
        double imposto = valorVenda * 0.20;
        double totalPagar = valorVenda - (valorVenda * desconto) + imposto;

        System.out.println("Recibo:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$" + precoUnitario);
        System.out.println("Valor da venda: R$" + valorVenda);
        System.out.println("Desconto: " + (desconto * 100) + "%");
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Total a pagar: R$" + totalPagar);

        scanner.close();
    }
}

//21 - descanso merecido
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int anoNascimento = scanner.nextInt();
        int anoIngresso = scanner.nextInt();

        int idade = 2024 - anoNascimento;
        int tempoTrabalho = 2024 - anoIngresso;

        boolean requerAposentadoria = (idade >= 65) || (tempoTrabalho >= 30) || (idade >= 60 && tempoTrabalho >= 25);

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        if (requerAposentadoria) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}

// 22 - conta comigo
public class Main {
    public static void main(String[] args) {
        int inicio = 1;
        int fim = 10;
        int primeiroNumero = 1;

        while (primeiroNumero <= 20) {
            System.out.print("(" + primeiroNumero + ", ");
            for (int i = inicio; i <= fim; i++) {
                System.out.print(i + " ");
            }
            System.out.println(")");

            primeiroNumero++;
            inicio = fim + 1;
            fim = inicio + 9;
        }
    }
}

// 23 - não conta comigo
public class Main {
    public static void main(String[] args) {
        int primeiroNumero = 1;

        while (primeiroNumero <= 20) {
            System.out.print("(" + primeiroNumero + ", ");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println(")");
            primeiroNumero++;
        }
    }
}

// 24 - Jornada de trabalho
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: R$");
        double salarioHora = scanner.nextDouble();

        double salarioTotal;
        if (horasTrabalhadas <= 160) {
            salarioTotal = horasTrabalhadas * salarioHora;
        } else {
            double horasExtras = horasTrabalhadas - 160;
            salarioTotal = (160 * salarioHora) + (horasExtras * salarioHora * 1.5);
        }

        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }
}

// 25 - invertendo tudo (isso não é de Deus) :,|
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numeros = new String[12];

        System.out.println("Informe os números:");
        for (int i = 0; i < 12; i++) {
            numeros[i] = scanner.next();
        }

        System.out.println("Saída 1:");
        for (int i = 11; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Saída 2:");
        for (int i = 11; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        for (int i = 0; i < 12; i++) {
            if (i % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        scanner.close();
    }
} */