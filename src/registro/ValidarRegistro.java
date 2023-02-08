package registro;

public class ValidarRegistro {
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	
	
	static boolean ValidarDatos(String edadstr, String DNI, String Nacionalidad) {
		boolean DatoValido = false;
		int edad = Integer.parseInt(edadstr);
			if(edad>=18&&edad<=65) {
				if(Nacionalidad.equals("Española")){
					if(DNI.length()==9) {
						if(isNumeric(DNI.substring(0,8))&&!isNumeric(DNI.substring(8))) {
							DatoValido=true;
						}
					}
				}
			}
		return DatoValido;
	}
	
	
	public static void main(String[] args) {
		String edad = "18";
		String nac = "Española";
		String dni = "12341234A";
		if(ValidarDatos(edad, dni, nac)) {
			System.out.println("Datos Validos");
		}else {
			System.out.println("Datos no Validos");
		}
	}	
	
	
}

