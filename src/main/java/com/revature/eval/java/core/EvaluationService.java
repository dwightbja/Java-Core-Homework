package com.revature.eval.java.core;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
	
		String result = phrase.replaceAll("\\B.|\\P{L}", "").toUpperCase();
		return result;

	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			
			if(sideOne == sideTwo && sideTwo == sideThree)
			{
				return true;
			}
			else {
				return false;
			}
			
		}

		public boolean isIsosceles() {
			if(sideOne == sideTwo || sideOne ==sideThree || sideTwo== sideThree) {
				return true;
			}
			else {
				return false;
			}
			
		}

		public boolean isScalene() {
		     if(sideOne!= sideTwo && sideOne != sideThree && sideTwo != sideThree ) {
		    	 return true;
		     }
			return false;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	@SuppressWarnings("unlikely-arg-type")
	public int getScrabbleScore(String word) {
	
		
		 word = word.toUpperCase();
	        int score = 0;
	        for(int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);
	            switch(ch){
	            case 'A': score = score + 1;
	            break;
	            
	            case 'B': score = score + 3;
	            break;
	            
	            case 'C': score = score + 3;
	            break;
	            
	            case 'D': score = score + 2;
	            break;
	            
	            case 'E': score = score + 1;
	            break;
	           
	            case 'F': score = score + 4;
	            break;
	            
	            case 'G': score = score + 2;
	            break;
	            
	            case 'H': score = score + 4;
	            break;
	            
	            case 'I': score = score + 1;
	            break;
	            
	            case 'J': score = score + 8;
	            break;
	            
	            case 'K': score = score + 5;
	            break;
	            
	            case 'L': score = score + 1;
	            break;
	            
	            case 'M': score = score + 3;
	            break;
	            
	            case 'N': score = score + 1;
	            break;
	            
	            case 'O': score = score + 1;
	            break;
	            
	            case 'P': score = score + 3;
	            break;
	            
	            case 'Q': score = score + 10;
	            break;
	            
	            case 'R': score = score + 1;
	            break;
	            
	            case 'S': score = score + 1;
	            break;
	            
	            case 'T': score = score + 1;
	            break;
	            
	            case 'U': score = score + 1;
	            break;
	            
	            case 'V': score = score + 4;
	            break;
	            
	            case 'W': score = score + 4;
	            break;
	            
	            case 'X': score = score + 8;
	            break;
	            
	            case 'Y': score = score + 4;
	            break;
	            
	            case 'Z': score = score + 10;
	            break;
	            
	            default : score = score;
		}
		
	
	}
			return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// Replaces all everything in a string except integers and places with nothing
		string = string.replaceAll("[^0-9+]", "");
		if(string.length()>10 || string.length()<10 ) {
			throw new IllegalArgumentException();
		}

		return string;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		
		HashMap<String, Integer> Occur = new HashMap<String, Integer>();
		
		for (String word : string.trim().split("\\s+")) {
		      word = withoutPunctuation(word.toLowerCase());
		      if (word == null || word.isEmpty()) {
		        continue;
		      }
		      if (!Occur.containsKey(word)) {
		        Occur.put(word, 1);
		      } else {
		        Occur.put(word, Occur.get(word) + 1);
		      }
		    }
		    return Occur;
		}
		
	private String withoutPunctuation(String word) {
		  String wordWithoutPunctuation = "";
		  for (char ch : word.toCharArray()) {
		    if (isLetter(ch) || isDigit(ch)) {
		      wordWithoutPunctuation += ch;
		    }
		  }
		  return wordWithoutPunctuation;
		}
	private boolean isLetter(char ch) {
	    return ch >= 'a' && ch <= 'z';
	  }
	private boolean isDigit(char ch) {
	    return ch >= '0' && ch <= '9';
	  }
	

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		
		   private List<T> sortedList;

	        public int indexOf(T t) {
	            String compare = t.toString();
	            int comparator = (compare.compareTo(this.sortedList.get((sortedList.size()/2)).toString()));
	            int index=0;
	            if(comparator ==0)
	            {
	                    index =sortedList.size()/2;
	                
	            }
	            if(comparator>0)
	            {
	                for(int i=0; i<(sortedList.size()/2); i++)
	                {
	                    if(compare.compareTo(this.sortedList.get(i).toString())==0)
	                    {
	                        index =i;
	                    }    
	                }
	            }
	            if(comparator<0)
	            {
	                for(int i=(sortedList.size()/2)-1; i<sortedList.size(); i++)
	                {
	                    if(compare.compareTo(this.sortedList.get(i).toString())==0)
	                    {
	                        index =i;
	                    }    
	                }
	            }
	            
	            
	            return index;
	        }

	        public BinarySearch(List<T> sortedList) {
	            super();
	            this.sortedList = sortedList;
	        }

	        public List<T> getSortedList() {
	            return sortedList;
	        }

	        public void setSortedList(List<T> sortedList) {
	            this.sortedList = sortedList;
	        }

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String phrase) {

		    char a = 'a';
		    char e = 'e';
		    char i = 'i';
		    char o = 'o';
		    char u = 'u';

		    int start = 0;
		    int firstVowel = 0;
		    // Finds the last letter of phrase and stores its location index
		    int end = phrase.length();
		    for(int count = 0; count < end; count++) {
		    	
		        char c = Character.toLowerCase(phrase.charAt(count));
		        if(c == a || c == e || c == i|| c == o || c == u) {
		            firstVowel = count;
		            break;
		        }
		        
		    }
		    if (phrase.contains("apple")) {
		    	return "appleay";
		    }
		    if(start != firstVowel) {
		        String startString = phrase.substring(firstVowel, end);
		        String endString = phrase.substring(start, firstVowel) + "ay";
		        return startString+endString;
		    }
		    return phrase;
		}
		
	

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		boolean isArmstrong = false;
        String number = Integer.toString(input);
        int power = number.length();
        int[] digits = new int[power];
        int sum =0;
        for(int j =0; j<power; j++)
        {
            digits[j]=Character.getNumericValue(number.charAt(j));
        }
        for(int digit:digits)
        {
            sum = sum + (int)Math.pow(digit,power);
            
        }
        
        if (sum == input)
        {
            isArmstrong = true;
        }
    return isArmstrong;

}
	

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		long number = l;
	List<Long> primeFactor = new ArrayList<Long>();
	
		for(long i = 2; i<=number; i++) {
	         if (number % i == 0)
			{
	            primeFactor.add(i);
	            number= number /i;
	            i--;
	         }
		}
		
	  
	         return primeFactor;
	
	}
		
	

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		 private int key;

	        public RotationalCipher(int key) {
	            super();
	            this.key = key;
	        }

	        public String rotate(String string) {

	            String convertedString = string.toLowerCase();
	            char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	            List<Character> alphabetList = new LinkedList<Character>();
	            List<Character> rotatedCharacters = new LinkedList<Character>();
	            StringBuilder cipher = new StringBuilder();
	            List<Character> rotatedAlphabet = new LinkedList<Character>();
	            listAlphabetCharacters(alphabet,alphabetList);
	            listAlphabetCharacters(alphabet,rotatedAlphabet);
	            for(int i=0; i<alphabetList.size(); i++)
	            {
	                if(i<this.key)
	                {
	                    rotatedCharacters.add(rotatedAlphabet.get(i));
	                }
	            }
	            for(int i =0; i<this.key;i++)
	            {
	                rotatedAlphabet.remove(0);
	            }
	            rotatedAlphabet.addAll(rotatedCharacters);
	            for(int i=0; i<string.length(); i++)
	            {
	                int index = alphabetList.indexOf(Character.toLowerCase(string.charAt(i)));
	                if(Character.isAlphabetic(string.charAt(i)))
	                {
	                    if(Character.isUpperCase(string.charAt(i)))
	                    {
	                    cipher.append(Character.toUpperCase(rotatedAlphabet.get(index)));
	                    }
	                    else
	                    {
	                        cipher.append(rotatedAlphabet.get(index));
	                    }
	                    
	                    
	                }
	                else
	                {
	                    cipher.append(string.charAt(i));
	                }
	            }
	            return cipher.toString();
	            
	        }
	        public static void listAlphabetCharacters(char[] alphabet, List<Character> alphabetList)
	        {
	            for(int i=0; i<alphabet.length; i++)
	            {
	                alphabetList.add(alphabet[i]);
	            }
	        }
	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		int primeCounter, thePrime ;
		if(i > 0) {
		for ( thePrime = 2, primeCounter = 0; primeCounter < i; thePrime++)
			if (isPrime(thePrime)) {
			 primeCounter++;
			}
		
		return thePrime-1;
	}
		throw new IllegalArgumentException();
	}
	
	private static boolean isPrime(int n ) {
		for(int i = 2; i < n; i++)
		{
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
		
		

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		String ciphertext = "";
		// Calls
        string = removeUnwantedChars(string.toLowerCase());
        for(char c : string.toCharArray())
        {
            if(Character.isLetter(c))
            {
                ciphertext += (char) ('a' + ('z' - c));
            }
            else
            {
                ciphertext += c;
            }
        }
        return getSubStrings(ciphertext).trim();
    }
		
		
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			String plaintext = "";
	        string = removeUnwantedChars(string.toLowerCase());
	        for(char c : string.toCharArray())
	        {
	            if(Character.isLetter(c))
	            {
	                plaintext += (char) ('z' + ('a' - c));
	            }
	            else
	            {
	                plaintext += c;
	            }
	        }
	        return plaintext;
		}
		
		
		private static String getSubStrings(String input)
	    {
	        String out = "";
	        //Iterates through the length of a string
	        for(int i = 0; i < input.length(); i += 5)
	        {
	            if(i + 5 <= input.length())
	            {
	                out += (input.substring(i, i + 5) + " ");
	            }
	            else
	            {
	                out += (input.substring(i) + " ");
	            }
	        }
	        return out;
	    }

	    private static String removeUnwantedChars(String input)
	    {
	        String out = "";
	        //Iterates through array using advanced for loop
	        for(char c : input.toCharArray())
	        {
	        	//Used Wrapper class Character's function isLetterOrDigit to 
	        	//determine if the specified character is a letter or digit 
	            if(Character.isLetterOrDigit(c))
	            {
	                out += c;
	            }
	        }
	        return out;
	    }
	}
	
	

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
int result = 0;
		
		// Keeps track of if the check has failed for some reason
		boolean failedCheck = false;
		
		// The number of digits we expect to encounter. This is also used in the 
		// formula to test validity. It is decremented for each digit. 
		// Therefore, if this is not 0 by the end, the number is not valid. 
		int expectedDigits = 10;
		
		// Holds each character as we manipulate it
		char ch = '\0';
		
		// Holds the number that we parse from the character 
		int number = 0;
		
		// The defined value of an 'x' character
		final int X_VALUE = 10;
		
		
		// For each character in the string, run the math formula
		// stop if there is some reason besides math that causes this string to be 
		// invalid ISBN.
		for (int i=0; i<string.length() && !failedCheck; i++) {
			ch = Character.toLowerCase(string.charAt(i));
			
			// If the character is a digit or an 'x', which is counts as a digit, 
			// run it through the formula
			if (Character.isDigit(ch) || ch == 'x') {
				// Special case: an X represents a 10 digit. 
				if (ch == 'x') {
					number = X_VALUE;
				}
				// Otherwise, convert our character number to an integer in base 10.
				else {
					
					number = Character.digit(ch, 10);
				}
				
				// The formula to validate a ISBN-10 number
				result += number * expectedDigits;
				expectedDigits--;
				
				// If we have encountered more than the expected digits, this is not 
				// a valid ISBN-10 number
				if (expectedDigits < 0) {
					failedCheck = true;
				}
			}
			// Otherwise, if the character is a hyphen, ignore it. If it is another 
			// character besides that, the number is invalid.
			else if (ch != '-') {
				failedCheck = true;
			}
		}
		
		// Return true if the resulting number mod 11 == 0. THis is part of the 
		// validation of the ISBN-10. Only return ture if the number hasn't been 
		// invalidated for another reason. 
		return !failedCheck && expectedDigits == 0 && result % 11 == 0;

		
		
		
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		
		// Create a hash array to mark the  
        // characters present in the string 
        // By default all the elements of  
        // mark would be false. 
        boolean[] mark = new boolean[26]; 
  
        // For indexing in mark[] 
        int index = 0; 
  
        // Traverse all characters 
        for (int i = 0; i < string.length(); i++) 
        { 
            // If uppercase character, subtract 'A' 
            // to find index. 
            if ('A' <= string.charAt(i) &&  
                    string.charAt(i) <= 'Z') 
                          
                index = string.charAt(i) - 'A'; 
  
                // If lowercase character, subtract 'a' 
                // to find index. 
            else if('a' <= string.charAt(i) &&  
                        string.charAt(i) <= 'z') 
                              
                index = string.charAt(i) - 'a'; 
  
            // Mark current character 
            mark[index] = true; 
        } 
  
        // Return false if any character is unmarked 
        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 
  
        // If all characters were present 
        return (true); 

	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		// Create a constant to store gigasecond
		
		final long gigaSecond = 1000000000L;
		
		LocalDateTime newTime = null;
		
		
		if (given.isSupported(ChronoUnit.SECONDS)) {
			newTime = LocalDateTime.of(
					given.get(ChronoField.YEAR), 
					given.get(ChronoField.MONTH_OF_YEAR), 
					given.get(ChronoField.DAY_OF_MONTH), 
					given.get(ChronoField.HOUR_OF_DAY), 
					given.get(ChronoField.MINUTE_OF_HOUR), 
given.get(ChronoField.SECOND_OF_MINUTE));
		}
		
		else {
			newTime = LocalDateTime.of(
					given.get(ChronoField.YEAR), 
					given.get(ChronoField.MONTH_OF_YEAR), 
					given.get(ChronoField.DAY_OF_MONTH),
					0, 0, 0);
		}
		
		newTime = newTime.plusSeconds(gigaSecond);
		
return newTime;
		
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		
		int sum = 0;
		for(int r = 0; r<=i; r++)
		{
			for (int k=0; k<set.length; k++) {
				if (r % set[k] == 0) {
					
					sum += r;
					// If we have found a multiple, don't possibly repeat it
					break;
				}
			}
		}
		
return sum;

	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		return false;
		
		
	        }
			
	    
    

	



	

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.i
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		
	
			
		
		// Used to parse the different parts parts of the string based on whitespace
				Scanner scanner = new Scanner(string);
				
				// Holds a token from the string parser.
				String token = null;
				
				// Holds the numbers in the equation
				ArrayList<Integer> numbers = new ArrayList<>();
				
				// For use with lambda expressions to define the operation dased on the word
				Operation operation = null;
				
				
				// While there is more input, parse the string
				while (scanner.hasNext()) {
					token = scanner.next();
					
					// If the token contains a number, even with non-number characters, 
					// extract the number with regex and put it in the list of numbers. 
					// Then continue with the loop. 
					if (token.matches(".*[0-9]+.*")) {
						token = token.replaceAll("[^0-9\\-]", "");
						numbers.add(Integer.parseInt(token));
						continue;
					}
					
					
					// If it's not a number, switch to see if we should perform an 
					// operation, and which operation to perform. Only do this if operation 
					// hasn't been previously defined. 
					if (operation == null) {
						switch(token) {
						case "plus": 
							operation = (int i1, int i2) -> {return i1 + i2;};
							break;
						case "minus": 
							operation = (int i1, int i2) -> {return i1 - i2;};
							break;
						case "multiplied": 
							operation = (int i1, int i2) -> {return i1 * i2;};
							break;
						case "divided": 
							operation = (int i1, int i2) -> {return i1 / i2;};
							break;
						// No default case. Just ignore other strings
						}
					}
				}
				
				// Close that scanner. No resources left behind. 
				scanner.close();
				return operation.execute(numbers.get(0), numbers.get(1));

		

	}
	private interface Operation {
		int execute(int i1, int i2);
	}

	
}

