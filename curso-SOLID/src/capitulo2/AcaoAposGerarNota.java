package capitulo2;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal nf);
}

//� importante acoplar as outras classes a uma interface, porque ela � mais est�vel. O m�todo n�o muda!