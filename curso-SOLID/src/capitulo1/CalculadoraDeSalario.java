package capitulo1;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario){
		return funcionario.calcularSalario();
	}

}

//para cada regra de c�lculo de sal�rio, cria-se uma classe exclusiva para aquele c�lculo, assim fica mais f�cil de ler e dar manuten��o para o c�digo, pois as regras de c�lculo ficam mais expl�citas e f�ceis de encontrar.