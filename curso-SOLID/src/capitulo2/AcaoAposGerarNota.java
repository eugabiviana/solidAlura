package capitulo2;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal nf);
}

//é importante acoplar as outras classes a uma interface, porque ela é mais estável. O método não muda!