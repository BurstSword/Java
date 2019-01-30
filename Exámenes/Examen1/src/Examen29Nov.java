import java.lang.reflect.Array;

public class Examen29Nov {

    public static void main(String[] args){
    	searchCousins(44,51);
    }

	public static String searchCousins(int x, int y) {
		StringBuilder cousins =  new StringBuilder();
		for(;x<y;y=y-2) {
			cousins.append((isPrime(y))?y+" ":"");
		}
		return cousins.toString();	
	}
	
	static boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
