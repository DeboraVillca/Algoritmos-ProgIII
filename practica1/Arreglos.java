
public class Arreglos {
	int Array[];
	
	public Arreglos(int[] arr){
		this.Array=arr;
		
		
	}
	void imprimir(){
	for (int k = 0; k < this.Array.length; k++) {
		System.out.print(this.Array[k]+",");		
	}
	}
	static boolean esSinRepetidos(int[] arr){
		int rep=0;
		for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr.length;j++) {
					if (arr[i]==arr[j])
						rep++;
					}
			
		}
		if(rep>arr.length)
			return false;
		else
			return true;
		}
	static int [] pegar(int[] arr, int [] arr2){
		int[] nuevo = new int[arr.length + arr2.length];
			for (int i = 0; i < arr.length; i++) {
			nuevo[i] = arr[i];	
			}
				for (int i = 0 ; i < arr2.length; i++) {
					nuevo[arr.length+i] = arr2[i];
				}
		return nuevo;
		
	}
	static int [] agregarAlFinal(int[] arr, int elem){
		int[] nuevo = new int[arr.length+1];
			for(int i=0;i<arr.length;i++){
				nuevo[i]=arr[i];
			}
		nuevo[arr.length]=elem;
		return nuevo;
		
	}
	
	 static void invertir(int[] arr) {
		 for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+",");
		 }
		 
	 }

	public int[] getArray() {
		return Array;
	}
	public void setArray(int[] array) {
		Array = array;
	}
	
	


}
