package pentagonalnumbers;

/**
 *
 * @author ilkiz
 */
public class PentagonalNumbers {

    public static void main(String[] args) {
		System.out.println("Pentagonal Numbers (0-100):");
                for (int n = 1; n <= 100; n++) {
                    if (n%10==0)
                        System.out.println(getPentagonalNumber(n));
                    else
                        System.out.print(getPentagonalNumber(n)+", ");                                        
                }
    }
    
    	public static int getPentagonalNumber(int n) {		
		int pNum=(n*((3*n)-1))/2;
                return pNum;
	}
    
}