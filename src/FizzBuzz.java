//Marcelo Aceituno R
//Full Stack JAVA 0034
public class FizzBuzz {

	public String fizzBuzz(int numero) {
		
		  String retorno="";

		  if(numero%3==0 && numero%5==0)
		  {
			  retorno ="FIZZBUZZ - Su numero: "+numero+" ,es divisible por 3 y por 5";
		  }

		  else if(numero%3==0)
		  {
		     
		      retorno ="FIZZ - Su numero: "+numero+" ,es divisible por 3";
		  }
		  else if(numero%5==0)
		  {
		      
		      retorno ="BUZZ - Su numero: "+numero+" ,es divisible por 5";
		  }
		  else{
		      retorno += numero;
		  }
		  
	        return retorno;
	    }

}
