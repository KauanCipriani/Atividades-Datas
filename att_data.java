package aula0404;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class att_data {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance();
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH);
		int ano = hoje.get(Calendar.YEAR);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int min = hoje.get(Calendar.MINUTE);
		int sem = hoje.get(Calendar.DAY_OF_WEEK);
		
		Date data1 = new Date();
		Locale.setDefault(new Locale("pt", "BR"));
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);

		System.out.printf("Hoje é " + df4.format(data1) + " e agr são %d horas e %d minutos", hora, min );

	}

}
