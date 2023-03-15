import javax.swing.JOptionPane;
    
public class Principal {

	public static void main(String[] args) {
		
		//String opcion = (JOptionPane.showInputDialog(null, "Selecciona la opción deseada:", "CONVERSOR UNIVERSAL", 
		//				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de monedas", "Conversor de temperatura", 
		//				"Conversor de medidas de longitud", "Conversor de medidas de volumen"}, "Seleccionaxx")).toString();
		
		String opciones[] = {"Conversor de monedas", "Conversor de temperatura", "Conversor de longitudes", "Conversor de volumenes"};
		
		String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la opción deseada:", "Conversor Universal",
				JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
				
		JOptionPane.showMessageDialog(null, "Seleccionaste: " +opcion, "Conversor Universal", JOptionPane.PLAIN_MESSAGE);
		
	}
	
}
