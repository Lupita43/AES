

public class Aes {

	public static void main(String[] args) {
		
		
		char Mtexto[][] = new char [4][4];
		String Btexto[][] = new String [4][4];
		
		char txt[]= {'p','i','l','d','o','r','a','s','t','h','o','t','h',' ','3','0'};
		
		int i=0;	
		for (int x = 0; x <Mtexto.length; x++) {
	        for (int y = 0; y <Mtexto.length; y++) {
	            Mtexto[x][y] = txt[i];
	            i++;
	        }
	        
	    }
				System.out.println("Matriz de texto original\n");
				for (int x = 0; x <Mtexto.length; x++) {	
			        for (int y = 0; y < Mtexto.length; y++) {
			            System.out.print("|"+ Mtexto[y][x]);
			        }
			        System.out.println("|");
			    }
		
		String b;
		int a;
		String binario[] = new String[16]; 
		for (int z=0; z<16; z++){
			a = txt[z];
			b = Integer.toBinaryString(a);
			binario[z] = b;
			
			
			
			
		}
				
				i=0;
				for (int x = 0; x <Btexto.length; x++) {
			        for (int y = 0; y <Btexto.length; y++) {
			            Btexto[x][y] = binario[i];
			            i++;
			        }
			        
			    }
						System.out.println("Matriz de texto original\n");
						for (int x = 0; x <Btexto.length; x++) {	
					        for (int y = 0; y < Btexto.length; y++) {
					            System.out.print("|"+ Btexto[y][x]);
					        }
					        System.out.println("|");
					    }
		
		
		
		
		}
		
	}

