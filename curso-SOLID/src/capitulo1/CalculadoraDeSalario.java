package capitulo1;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario){
		return funcionario.calcularSalario();
	}

}

//para cada regra de cálculo de salário, cria-se uma classe exclusiva para aquele cálculo, assim fica mais fácil de ler e dar manutenção para o código, pois as regras de cálculo ficam mais explícitas e fáceis de encontrar.