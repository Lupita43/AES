
public class Aesversion2 {

	public static void main(String[] args) {
		
		String texto = "frases de 16bits";
		System.out.println("El texto es: "+texto);
		
		byte arrayTexto[] =new byte [16];
		for(int i=0; i< texto.length();i++){
			arrayTexto[i]= (byte) texto.charAt(i);
		}

		byte Mtexto[][] = new byte [4][4];
		int i=0;	
		for (int x = 0; x <Mtexto.length; x++) {
	        for (int y = 0; y <Mtexto.length; y++) {
	            Mtexto[x][y] = arrayTexto[i];
	            i++;
	        }
	        
	    }
		
		System.out.println("\nMatriz de texto en decimal");
		for (int x = 0; x <Mtexto.length; x++) {	
	        for (int y = 0; y < Mtexto.length; y++) {
	            System.out.print("|"+ Mtexto[y][x]);
	        }
	        System.out.println("|");
	    }
		
		System.out.println("\nMatriz de texto en hexa");
		for (int x = 0; x <Mtexto.length; x++) {	
	        for (int y = 0; y < Mtexto.length; y++) {
	            
	            System.out.print(String.format("0x%h",Mtexto[y][x])+"|");
	            
	        }
	        System.out.println("");
	    }
		
//-------------    Creacion de los arreglos para la clave    ----------------------------
		String clave = "abcdefghijkhmnlo";
		System.out.println("\nEl texto es: "+clave);
		
		byte arrayClave[] =new byte [16];
		for(i=0; i< clave.length();i++){
			arrayClave[i]= (byte) clave.charAt(i);
		}
		
		byte Mclave[][] = new byte [4][4];
		i=0;	
		for (int x = 0; x <Mclave.length; x++) {
	        for (int y = 0; y <Mclave.length; y++) {
	            Mclave[x][y] = arrayClave[i];
	            i++;
	        }
	        
	    }
		System.out.println("\nMatriz de texto en decimal");
		for (int x = 0; x <Mclave.length; x++) {	
	        for (int y = 0; y < Mclave.length; y++) {
	            System.out.print("|"+ Mclave[y][x]);
	        }
	        System.out.println("|");
	    }
		
		System.out.println("\nMatriz de texto en hexa");
		for (int x = 0; x <Mclave.length; x++) {	
	        for (int y = 0; y < Mclave.length; y++) {
	            
	            System.out.print(String.format("0x%h",Mclave[y][x])+"|");
	            
	        }
	        System.out.println("");
	    }
		
		byte XOR[][] = new byte [4][4];
		
		for (int x = 0; x <4; x++) {	
	        for (int y = 0; y < 4; y++) {
	           XOR[x][y]=(byte) (Mtexto[x][y] ^ Mclave[x][y]);
	        }
	       
	    }
		
		for (int x = 0; x <4; x++) {	
	        for (int y = 0; y < 4; y++) {
	           System.out.print("|"+XOR[x][y]);
	        }
	        System.out.println("|");
	    }
		
		
	}

}
