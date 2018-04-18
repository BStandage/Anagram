public class Anagram {
	
	public static boolean anagram(String s1, String s2){
		int product1 = 1, product2 = 1;
		// first 26 prime numbers
		int [] primes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
		
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();

		// computes the product of the prime representations of the characters within s1
		for(int i = 0; i <= s1.length() - 1; i++){
			if(s1.charAt(i) != ' '){
				// In order to find what position in the alphabet each character is, I subtract 'A' from each character within s1
				product1 *= primes[s1.charAt(i) - 'A'];
			}
		}
		
		// computes the product of the prime representations of the characters within s2
		for(int i = 0; i <= s2.length() - 1; i++){
			if(s2.charAt(i) != ' '){
				// In order to find what position in the alphabet each character is, I subtract 'A' from each character within s2
				product2 *= primes[s2.charAt(i) - 'A'];
			}
		}

		// if the two products are equal, then it is mathematically guaranteed that the two strings contain the same characters.
		if(product1 == product2){
			return true;
	    }	
		else{
			return false;
		}
	}


	   public static void main(String [] args) {
		   Anagram test = new Anagram();

		   System.out.println(test.anagram("rat", "tar"));
		   System.out.println(test.anagram("wow", "mom"));
		   System.out.println(test.anagram("doctor who", "torchwood"));
		   System.out.println(test.anagram("zzzzz", "zzazz"));
		   System.out.println(test.anagram("sublet", "subtle"));
	   }
}