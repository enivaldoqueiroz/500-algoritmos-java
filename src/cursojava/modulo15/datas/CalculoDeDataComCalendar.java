package cursojava.modulo15.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.text.SimpleAttributeSet;

public class CalculoDeDataComCalendar {

	public static void main(String[] args) throws ParseException {
		// TODO 
		
		Calendar calendar = Calendar.getInstance();//Pegar a data atual
		
		//Simular que data vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(calendar.DAY_OF_MONTH, 1);//Data de hoje mais 90 dias
		
		System.out.println("Somando o mês : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.MONTH, 1);
		
		System.out.println("Somando o mês : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.YEAR, 1);
		
		System.out.println("Somando o mês : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

	}

}
