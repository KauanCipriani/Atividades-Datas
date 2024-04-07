package aula0404;

import java.time.LocalDate;
import java.time.Period;

public class att2_data {

	public static void main(String[] args) {
		contaTempo(04, 01, 2026);
	}

	public static void contaTempo(int dia, int mês, int ano) {

		LocalDate dataAtual = LocalDate.now();

		LocalDate dataDestino = LocalDate.of(ano, mês, dia);

		if (dataDestino.isBefore(dataAtual)) {
			System.out.println("Essa data já passou.");
			return;
		}

		Period período = Period.between(dataAtual, dataDestino);

		System.out.printf("Faltam %d ano(s), %d mese(s) e %d dia(s) para a data %02d/%02d/%04d.%n", período.getYears(),
				período.getMonths(), período.getDays(), dia, mês, ano);
	}

}
