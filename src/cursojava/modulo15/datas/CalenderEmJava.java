package cursojava.modulo15.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderEmJava {

	public static void main(String[] args) throws ParseException {
		// TODO Calender

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("11/04/2021");

		Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
		
		/*TODO 
		 * After: se data 1 é menor que data 2
		 * Before: se data 1 é maior que data 2
		 */

		// Se a data 1 é maior que a data 2
		if (dataVencimentoBoleto.after(dataAtualHoje)) {// Posterior ou maior da data atual
			System.out.println("Boleto não vencido");
		} else {
			System.out.println("Boleto vencido - URGETE");
		}

		// Se a data 1 é menor que a data 2
		if (dataVencimentoBoleto.before(dataAtualHoje)) {// Posterior ou maior da data atual
			System.out.println("Boleto vencido - URGETE");
		} else {
			System.out.println("Boleto não vencido");
		}

	}

}
