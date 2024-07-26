package loops;

public class FindHfcOclidAlgorithm {
	
	public static void main(String[] args) {
		
		int number1 =12;
		int number2=16;
		int remainder=0;
		int ebob=0;
		
		// number1'in küçük olduğu durumlar için her zaman number1'i büyük sayı olarak al
		
		if (number1 < number2) {
			int temp= number1;
			number1=number2;
			number2=temp;
		}
		
		if(number1>number2) {
			do
			{
				remainder =number1 % number2;
				if(remainder==0)  
				{
					ebob=number2;
				}
				
				else {
					number1 =number2;
					number2=remainder;
				}
			
		}while(remainder !=0);
		
			System.out.printf("ebob: %d", ebob);
		}
	}
			}
		
	
	

