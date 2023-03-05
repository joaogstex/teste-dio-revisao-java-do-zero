package edu.anatomiadeclasse.aprender;

import java.util.Locale;
import java.util.Scanner;

public class RevisandoJava {
	
	public static void main(String args[]) {
	
		System.out.println("Eu sou o Goku!");
	
		final String BR = "Brasil";
		
		System.out.println(BR);
		
		// BR = "Brazil"; 
		/*
		 * Variável maiúscula pressupõe ser uma variável final, 
		 * ou seja, não pode sofrer alterações
		 */
		
		//Outros exemplos de valores definidos e imutáveis:
		//double PI = 3.14;
		
		int ESTADOS_BRASILEIRO = 27;
		
		int ANO_2000 = 2000;
		
		//Criação de Variável
		//Tipo NomeBemDefinido = Atribuição
		
		String meuNome = "Gustavo";
		int anoFabricacao = 2022;
		
		//Valor correspondente a tipagem específica
		
		
		//boolean simNao/verdadeiroFalso
		
		boolean verdadeira = true;
		boolean falso = false;
		
		
		//Métodos - estrutura
		//String formatarCep (long cep)
		
		
		/* Chamada de método
		 * 
		 * Criação de método:
		 * 
		 * public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);	
	}
	    Chamada do método no método main:
	    
	    String primeiroNome = "João";
		String segundoNome = "Gustavo";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	
	    Saída: Resultado do método = João Gustavo
		 */
		
		
		//Identação
		//Formatar o código de maneira visualmente agradável
		
		
		/* Inicialização de Pacotes
		 * 
		 * Comercial = Com.
		 * Organizacional = Org.
		 * Opensource = Org. ou opsensource.
		 * 
		 * Nome da empresa: HyperTech
		 * Convenção de aplicabilidade: com.hypertech.(nomeDoProjeto)notification
		 */
		
		//Java Beans - Estruturação de escrita; como expressamos as declarações das variáveis, métodos, etc
		
		//Uma variável deve ser clara e objetiva
		//Uma variável é sempre singular, exceto em arrays ou coleções
		//Idioma único; defina sempre no mesmo idioma
		
		double salarioMedio = 1500.23; //sem abreviações como salMedio
		String email = "aluno@gmail.com"; //sem declarar variável plural com valor singular
		String [] emails = {"aluno@gmail.com", "douglas@gmail.com"}; //variável plural de valor plural pode
		String nome = "Joseph";//variável no idioma padrão
		
		//exemplos de nomenclatura de métodos
		
		//somar (int n1, int n2) {}
		//abrirConexao(){}
		//concluirProcessamento(){}
		//findById(int id){} método em inglês serão vistos mas não são necessários
		//calcularImprimir(){} há algo de errado neste método, ele deveria ter uma única finalidade, afinal ele calcula ou imprime?
		
		/*Tipos e variáveis
		 * Númericos inteiros e decimais
		 * Tipos lógicos
		 * Caracteres
		 * Objetos
		 * Diferença entre variável e constante
		 */
		
		/* int
		 * byte
		 * short
		 * long 
		 * float
		 * double
		 * boolean
		 * char
		 */
		
		//Não são objetos e sim tipos primitivos
		//Não representam referência na memória
		//Armazenados diretamente na memory stack
		
		/* byte idade = 123;
		 * short ano = 2021;
		 * int cep = 21070333; se iniciar com zero talvez tenha que ser outro tipo
		 * long cpf = 98765432109L; mesma regra
		 * float pi = 3.14F;
		 * double salario = 1275.33;
		 */
		
		//Constantes - valores armazenados na memória que não podem ser modificados depois de declarados como final
		//Toda constante deve estar em CAIXA ALTA
		
		final String MEU_NOME = "JUANZITO";
		
		//MEU_NOME = "DOUGLAS"; não pode ser modificado
		
		//estudar classe String
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: \n");
		byte idade = scanner.nextByte();
		
		System.out.println("Informe sua data de nascimento: \n");
		short ano = scanner.nextShort();
		
		System.out.println("Informe o seu nome: ");
		String declararNome = scanner.next();
		
		System.out.println("Informe o valor do seu salário: \n");
		Double salario = Double.parseDouble(scanner.next());
		
		//para ler double é necessário: Double.parseDouble(scanner.nextLine());
		
		System.out.println("Digite o seu cep: \n");
		int cep = scanner.nextInt();
		
		System.out.println("Diga o seu CPF: \n");
		long cpf = scanner.nextLong();
		
		System.out.println("Informe o número de pi porque sim: \n");
		float pi = scanner.nextFloat();
	
		System.out.print(" " + idade + " " + ano + " " + cep + " " + cpf + " " + pi + " " + salario + " " + declararNome);

		/* Operadores
		 * 
		 * Símbolo de atribuição =; definir valor ou sobrescrever valor de uma variável
		 * Ex: int = 22; String = "João"; Date dataNascimennto = new Date(); etc
		 * 
		 * Operadores aritméticos:
		 * (soma) + (subtração) - (multiplicação) * (divisão) / (resto/modulo da divisão) %
		 * 
		 * *o símbolo de + em Strings é utilizado para concatenar
		 * *quando utilizado erronemeante isso pode acontecer:
		 * 
		 * concatenacao = 1 + 1 + 1 + "1"; saída = "31" (isso acontece porque depois de somados os três primeiros 
		 * números 1, ele concatena com o quarto número 1 que é do tipo texto, formando a String "31"
		 * 
		 * concatenacao = 1 + "1" + 1 + "1"; saída = "1111"
		 * 
		 * concatenacao = 1 + "1" + 1 + 1; saída = "1111"
		 * 
		 * concatenacao = "1" + (1 + 1 + 1); saída = "13"
		 * 
		 * Não realiza mais operações matemáticas
		 * 
		 * Operadores unários:
		 * Incrementam, decrementam e invertem valores númericos e booleanos
		 * (+) valor positivo
		 * (-) valor negativo
		 * (++) valor de incremento de valor
		 * (--) valor de decremento de valor
		 * (!) valor lógico de negação
		 * 
		 * int numero = 5; por padrão este valor é positivo, ou seja, +5
		 * 
		 * numero = - numero; o valor se torna negativo
		 * 
		 * numero = numero * - 1; para tornar o valor negativo em positivo
		 * 
		 * numero ++; número = número + 1;
		 * numero --; número = número - 1;
		 * boolean variavel = true;
		 * variavel = !variavel;
		 * *São alocados na memória e o valor para ser mudado precisa sofrer alterações antes da impressão
		 * 
		 * 
		 */
		
		int a, b;
		
		a = 5;
		b = 6;
		//Operadores ternários ?(if) :(else)
		String resultado = a == b ? "verdadeiro" : "falso";
		//Não se limita apenas a String --> int resultado = a == b ? 1 : 0
		System.out.println(" " + resultado);
		
		/*
		 * Agora, considere que você precisa de 
		 * uma estrutura de decisão mais simples, 
		 * apenas para indicar se estamos na 
		 * primeira ou na segunda quinzena de um mês.
		 */
		
		int numeroDias = 5; //valor entre 1 e 30
		System.out.println((numeroDias < 15) ? "Primeira quinzena" : "Segunda quinzena");
		
		/*Operadores relacionais:
		 * == (caso deseje verificar igualdade entre dois valores)
		 * != (verificar diferença entre dois valores)
		 * > (verificar se é maior que outra variável)
		 * >= (verificar se é maior ou igual)
		 * < (verificar se é menor)
		 * <= (verificar se é menor ou igual)
		 * 
		 */
	
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		if(numero1 < numero2) {
			System.out.println("A nossa condição é verdadeira!");
		}
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numeroUm é diferente numeroDois? " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numeroUm é maior que numeroDois? " + simNao);
		
		String nomeUm = "GLEYSON";
		String nomeDois = new String ("GLEYSON");
		//resultado = false; são dois objetos diferentes alocados na memória
		System.out.println(nomeUm.equals(nomeDois));
		//método equals compara conteúdos; utilizar para objetos
		
		
		/*Operadores Lógicos:
		 * 
		 * && (Operador lógico "E")
		 * || (Operador lógico "Ou")
		 * 
		 */
		
		boolean condicao1 = true;
		
		boolean condicao2 = false;
		
		if(condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras!");
		}
		
		System.out.println("fim"); //irá imprimir fim pois não é verdadeira
		
		if(condicao1 || condicao2){
			System.out.println("Uma condição é verdadeira");
		}
		
		//o && valida as duas condições, e o || verifica se alguma das condições é verdadeira
		
		//o valor booleano também funciona em declarações relacionais
		if(condicao1 && (7 > 4)) {
			System.out.println("Ambas são verdadeiras");
		}
		
		
		/* Métodos
		 * Todas as ações das aplicações são consideradas métodos
		 * Correspondem em funções ou sub-rotinas dentro de nossas classes
		 * *Deve ser nomeado como verbo
		 * *Seguir o padrão camelCase
		 * *Qual a proposta principal do método?
		 * *Qual o tipo de retorno esperado após execução do método?
		 * *Caso o método nnão retorne valor, será representado pela palavra-chhave void
		 * *Quais o parâmetros necessários para execução do método? --> se o método for um método de soma, os parâmetros serão parâmetros númericos como inteiros, etc
		 * *O método possui o risco de apresentar exceções
		 * *O método será visível a toda aplicação, somente em mesmo pacottes, através de herança ou a nível a própria classe
		 * 
		 * public double somar(int num1, int num2) {
		 * Logica - Finalidade do método
		 * return...;
		 * }
		 * 
		 * public void imprimir(String texto){
		 * Logica - Finalidade do método
		 * Aqui não precisa do return
		 * Poirs não será retornado nenhum valor
		 *}
		 * 
		 * throws Exception : indica que o método ao ser utilizado irá gerar uma exceção
		 * public double dividir(int dividendo, int divisor) throws Exception
		 * 
		 * private void metodoPrivado(){}
		 * não pode ser visto por outras classes
		 * 
		 * public void gravarCliente(String nome, String cpf, Integer cep){
		 * este método tem a finalidade de gravar informações de um cliente
		 * por que não criar um objeto cliente e passar como parâmetro?
		 * veja abaixo
		 * 
		 * public void gravarCliente(Cliente cliente){}
		 * ou
		 * public void gravar(Cliente cliente){}
		 *
		 * 
		 * 
		 */
		
		//Revisar as 52 palavras reservadas do java
		
		//Estudar documentação Java
		
		//Javadocs
		//Javadoc API
		
		
		//Terminal e Argumentos
		//Pasta bin
		//Nela estarão os programas disponíveis para execução em bytecode
		
		/*
		 * cd+ Cola o path do diretório da classe
		 * cd+ bin
		 * dir para verificar
		 * java nomeDaClasses
		 */
		
		/*
		 * String nome = args[0];
		String sobrenome = args[1];
		int idade = Integer.valueOf(args[2]);
		double altura = Double.valueOf(args[3]);
		
		System.out.println("Olá, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos.");
		System.out.println("Minha altura é " + altura + "cm.");
		
		 * java AboutMe JOAO (NOME) TEIXEIRA (SOBRENOME) 19 (IDADE)  1.80 (ALTURA)
		 * irá imprimir no terminal os system.outs
		 *
		 */
		
		/* import java.util.Locale;
		 * Scanner scanner = new Scanner(System.in).useLocale(Locale.US); usa a conveção de valores decimais americanos
		 * 
		 */
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o seu nome: ");
		String seuNome = scan.next();
		
		System.out.println("Informe o seu salario: ");
		double seuSalario = scan.nextDouble();
		
		System.out.println(" " + seuNome + " " + seuSalario);
		
		
		//Media total de um aluno
		
	    Scanner sc = new Scanner(System.in);
	    
	    double notaUm;
	    double notaDois;
	    double notaTres;
	    
	    System.out.println("Informe a primeira nota: ");
	    notaUm = sc.nextDouble();
	    
	    System.out.println("Informe a segunda nota: ");
	    notaDois = sc.nextDouble();
	    
	    System.out.println("Informe a terceira nota: ");
	    notaTres = sc.nextDouble();
	    
	    double mediaTotal = notaUm * notaDois * notaTres/3;
	    
	    if(mediaTotal < 6) {
	    	System.out.println("Média Total inferior a 6. Terá que fazer prova final.");
	    }else if(mediaTotal > 6) {
	    	System.out.println("Média Total superior a 6. Parabéns, não precisará de prova final.");
	    }else {
	    	System.out.println("Média Total 6. Na média. Não precisará de prova final.");
	    }
	    
		System.out.println("Fim da condição.");
		
		
		
		//Fatorial de um número
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scn.nextInt();
		
		int total = 1;
		for(int i = n; i >= 1; i--) {
			total *= i;
		}
		
		System.out.println(total);
	}
	
	public static int getFatorial(int valor) {
		
		if(valor <= 1) {
			return valor;
		}else {
			return valor*getFatorial(valor-1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
