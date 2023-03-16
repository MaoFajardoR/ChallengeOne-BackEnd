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
		
		try {
			opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la opción deseada:", "Conversor", 
					JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
			switch (opcion) {
				case "Conversor de monedas": 
					String moneda = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero:", "Conversor de monedas",
						JOptionPane.DEFAULT_OPTION, null, monedas, monedas[0]);
					convertir(moneda);
					break;
				case "Conversor de temperatura": 
					String escala = (String) JOptionPane.showInputDialog(null, "Elije la escala a la que deseas convertir la temperatura:", "Conversor de temperaturas",
						JOptionPane.DEFAULT_OPTION, null, escalas, escalas[0]);
					JOptionPane.showMessageDialog(null, "Seleccionaste: " +escala, "Conversor de temperaturas", JOptionPane.PLAIN_MESSAGE);
					convertir(escala);
					break;
				default:
					JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
			}
		} catch (NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
		}
	}
	
	public static void convertir(String tipoConversion) {
		
		double numero = 0.0;
		double conversion = 0.0;
		double tasaCambio = 1.0;
		String monedaOrigen = "";
		String monedaDestino = "";
		
		switch (tipoConversion) {
			case "De pesos a dólares americanos": 
				tasaCambio /= 4900;
				monedaOrigen = "COP$";
				monedaDestino = "USD$";
				break;
			case "De pesos a euros": 
				tasaCambio /= 5500;
				monedaOrigen = "COP$";
				monedaDestino = "EUR$";
				break;
			case "De pesos a libras esterlinas": 
				tasaCambio /= 6300;
				monedaOrigen = "COP$";
				monedaDestino = "GBP$";
				break;
			case "De pesos a yenes": 
				tasaCambio /= 1500;
				monedaOrigen = "COP$";
				monedaDestino = "JPY$";
				break;
			case "De pesos a won coreano": 
				tasaCambio /= 2000;
				monedaOrigen = "COP$";
				monedaDestino = "KRW$";
				break;
			case "De dólares americanos a pesos": 
				tasaCambio = 4900;
				monedaOrigen = "USD$";
				monedaDestino = "COP$";
				break;
			case "De euros a pesos": 
				tasaCambio = 5500;
				monedaOrigen = "EUR$";
				monedaDestino = "COP$";
				break;
			case "De libras esterlinas a pesos": 
				tasaCambio = 6300;
				monedaOrigen = "GBP$";
				monedaDestino = "COP$";
				break;
			case "De yenes a pesos": 
				tasaCambio = 1500;
				monedaOrigen = "JPY$";
				monedaDestino = "COP$";
				break;
			case "De won coreano a pesos": 
				tasaCambio = 2000;
				monedaOrigen = "KRW$";
				monedaDestino = "COP$";
				break;
		}
		
		try {
			numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir:"));
			conversion = numero * tasaCambio;
			JOptionPane.showMessageDialog(null, monedaOrigen + numero + " equivalen a " + monedaDestino + conversion, "Conversor de monedas", JOptionPane.PLAIN_MESSAGE);
		} 
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "¡Solo debes digitar números. ", "Conversor de monedas", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
}
