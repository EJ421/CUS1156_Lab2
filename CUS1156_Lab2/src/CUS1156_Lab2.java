import java.util.ArrayList;

public class CUS1156_Lab2{
	


	
		public static int countUnique(ArrayList<String> list) {
	        int count = 0;
	        
	        for (int i = 0; i < list.size(); i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < i; j++) {
	                if (list.get(i).equals(list.get(j))) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                count++;
	            }
	        }
	        return count;
	    }
		
	    public static void main(String[] args) {
	        ArrayList<String> words = new ArrayList<>();
	        words.add("apple");
	        words.add("orange");
	        words.add("blackboard");
	        words.add("apple");
	        words.add("orange");
	        words.add("sun");
	        words.add("moon");
	    
	        int unique = countUnique(words);
	        System.out.println(words + " has " + unique + " unique words");
	    }
	}