
public class ConversionStringtoBinari {

	public static void main(String[] args) {
	
        String texto = "frases de 16 bits";

        String codigoBinario = "";//guarda el en binario
        for (int i = 0; i < texto.length(); i++) {//recorre el texto ingresado
            char letra = texto.charAt(i);//separa letra a letra
            /* si el binario de la letra es menor a 8 bit entonces se le agrega
             un cero a la izquierda para llenar el bit restante*/
            int aux = Binario((int) (letra)).length();//almacena largo del binario d ela letra debuelta
            for (int j = 0; j < 8; j++) {//recorrido de 8 characteres
                if (aux < 8) {//si el largo del binario es menor a 7 (0-7)entonces
                    codigoBinario = codigoBinario + "0";//agregar 0 a la concadenacion
                    aux++;//aumentar el largo del binario
                }
            }
            /*se concatena el binario de cada letra separado por un espacio. al metodo binario
             se le pasa por parametro el decimal correspondiente a cada letra*/
            codigoBinario = codigoBinario + Binario((int) (letra)) + ",";
            
        }
        
		System.out.println("El texto es: "+ texto);
       //creo un array donde estara mi cadena de texto binario
        String arrayBinario [] = codigoBinario.split(",");
        String Btexto[][] = new String [4][4];
        //lleno mi matriz con el arreglo que tiene el texto binario
        int i=0;
		for (int x = 0; x <Btexto.length; x++) {
	        for (int y = 0; y <Btexto.length; y++) {
	            Btexto[x][y] = arrayBinario[i];
	            i++;
	        }
	        
	    }
		//imprimo la matriz
		System.out.println("Matriz en Binario\n");
		for (int x = 0; x <Btexto.length; x++) {	
	        for (int y = 0; y < Btexto.length; y++) {
	            System.out.print("|"+ Btexto[y][x]);
	        }
	        System.out.println("|");
	    }
        
        
	}
	
	
	
	
	
		//Metodo para convertir mis caracteres a binario
	   private static String Binario(int Decimal) {
	        int R, x = 0;//variables que se implementaran
	        String Binario = ""; //guarda el contenido en codigo binario
	        R = Decimal % 2;//resto del parametro 
	        if (R == 1) {//si el resto es 1
	            while (Decimal > 1) {//si el parametro es mas grande q el resto
	                Decimal /= 2;//entonces decimal se divide en 2 y se guarda en decimal
	                x = Decimal % 2;//x contendra el resto del decimal
	                Binario = String.valueOf(x + Binario);//binario se ira formando de forma correcta y no alreves
	            }
	        } else {//si resto no es 1
	            while (Decimal > 0) {//y decimal es mayor a 0
	                Decimal /= 2;//decimal se divide en 2
	                x = Decimal % 2;//x contendra el resto del decimal resultante
	                Binario = String.valueOf(x + Binario);//se forma el numero en binario de forma correcta
	            }
	        }
	        return String.valueOf(Binario + x);//devuelve el binario resultante mas el ultimo bit
	    }

}
