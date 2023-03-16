import javax.swing.JOptionPane;
    
public class Principal {

	public static void main(String[] args) {
		
		String opciones[] = {
			"Conversor de monedas", 
			"Conversor de temperatura" 
		};
		
		String monedas[] = {
			"De pesos a dólares americanos", 
			"De pesos a euros", 
			"De pesos a libras esterlinas",
			"De pesos a yenes", 
			"De pesos a won coreano", 
			"De dólares americanos a pesos", 
			"De euros a pesos", 
			"De libras esterlinas a pesos", 
			"De yenes a pesos", 
			"De won coreano a pesos"
		};
		
		String escalas[] = {
			"De Celsius a Fahrenheit",
			"De Celsius a Kelvin",
			"De Fahrenheit a Celsius",
			"De Fahrenheit a Kelvin",
			"De Kelvin a Celsius",
			"De Kelvin a Fahrenheit",
		};
		
		String opcion = "";
		int continuar = 0;
		
		while (continuar == 0) {
			try {
				opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la opción deseada:", "Conversor", 
						JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
				switch (opcion) {
					case "Conversor de monedas": 
						String moneda = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero:", "Conversor de monedas",
							JOptionPane.DEFAULT_OPTION, null, monedas, monedas[0]);
						convertirMonedas(moneda);
						break;
					case "Conversor de temperatura": 
						String escala = (String) JOptionPane.showInputDialog(null, "Elije la escala a la que deseas convertir la temperatura:", "Conversor de temperaturas",
							JOptionPane.DEFAULT_OPTION, null, escalas, escalas[0]);
						convertirTemperaturas(escala);
						break;
					default:
						JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
				}
			} catch (NullPointerException npe) {
				JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
			}
			continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?");
		}
		JOptionPane.showMessageDialog(null, "Programa Finalizado");
	}
	
	public static void convertirMonedas(String opcionesConversion) {
		
		double numero = 0.0;
		double conversion = 0.0;
		double tasaCambio = 1.0;
		String origen = "";
		String destino = "";
		
		switch (opcionesConversion) {
			case "De pesos a dólares americanos": 
				tasaCambio /= 4868.13;
				origen = "COP$";
				destino = "USD$";
				break;
			case "De pesos a euros": 
				tasaCambio /= 5169.53;
				origen = "COP$";
				destino = "EUR$";
				break;
			case "De pesos a libras esterlinas": 
				tasaCambio /= 5893.55;
				origen = "COP$";
				destino = "GBP$";
				break;
			case "De pesos a yenes": 
				tasaCambio /= 36.60;
				origen = "COP$";
				destino = "JPY$";
				break;
			case "De pesos a won coreano": 
				tasaCambio /= 3.73;
				origen = "COP$";
				destino = "KRW$";
				break;
			case "De dólares americanos a pesos": 
				tasaCambio = 4868.13;
				origen = "USD$";
				destino = "COP$";
				break;
			case "De euros a pesos": 
				tasaCambio = 5169.53;
				origen = "EUR$";
				destino = "COP$";
				break;
			case "De libras esterlinas a pesos": 
				tasaCambio = 5893.55;
				origen = "GBP$";
				destino = "COP$";
				break;
			case "De yenes a pesos": 
				tasaCambio = 36.60;
				origen = "JPY$";
				destino = "COP$";
				break;
			case "De won coreano a pesos": 
				tasaCambio = 3.73;
				origen = "KRW$";
				destino = "COP$";
				break;
			case "De Celsius a Fahrenheit": 
				origen = "°C ";
				destino = "°F ";
				break;
		}
		
		try {
			numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir:"));
			conversion = numero * tasaCambio;
			JOptionPane.showMessageDialog(null, origen + numero + " equivalen a " + destino + conversion, "Resultado conversión", JOptionPane.PLAIN_MESSAGE);
		} 
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "¡Solo debes digitar números. ", "Conversor", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public static void convertirTemperaturas(String opcionesConversion) {
		
		double numero = 0.0;
		double conversion = 0.0;
		String origen = "";
		String destino = "";
		
		try {
			numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir:"));

			switch (opcionesConversion) {
				case "De Celsius a Fahrenheit": 
					conversion = numero * 1.8 +32;
					origen = "°C";
					destino = "°F";
					break;
				case "De Celsius a Kelvin": 
					conversion = numero + 273.15;
					origen = "°C";
					destino = "°K";
					break;
				case "De Fahrenheit a Celsius":
					conversion = (numero -32) / 1.8;
					origen = "°F";
					destino ="°C";
					break;
				case "De Fahrenheit a Kelvin":
					conversion = (numero - 32) / 1.8 + 273.15;
					origen = "°F";
					destino ="°K";
					break;
				case "De Kelvin a Celsius": 
					conversion = numero - 273.15;
					origen = "°K";
					destino = "°C";
					break;
				case "De Kelvin a Fahrenheit":
					conversion = (numero - 273.15) * 1.8 + 32;
					origen = "°K";
					destino ="°F";
					break;
			}
		JOptionPane.showMessageDialog(null, numero + origen + " equivalen a " + conversion + destino, "Resultado conversión", JOptionPane.PLAIN_MESSAGE);
		} 
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "¡Solo debes digitar números. ", "Conversor", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
