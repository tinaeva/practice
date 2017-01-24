import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	Anagrams(){
		System.out.println("I don't have arguments.");
	}
	Anagrams(int i){
		this();
		System.out.println("I have argument " + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams aaa = new Anagrams(10);
		String[] strs = {"lint", "intl", "inlt", "code","ab", "ba", "cd", "dc", "e"};
		System.out.println(groupAnagrams(strs));
		
		
	}
	
	
	public static List<String> groupAnagrams(String[] strs) {
        // write your code here
        List<String> result = new ArrayList<String>();
        
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        
        for(String str: strs) {
            char[] arr = new char[26];
            for(int i=0;i<str.length();i++) {
                arr[str.charAt(i) - 'a']++;
                
            }
            String sn = new String(arr);
            
            if(map.containsKey(sn)) {
            	if(map.get(sn).size()==1) {
                	result.add(map.get(sn).get(0));
                }
                map.get(sn).add(str);                
                result.add(str);
            } else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(sn,al);
            }
            
        }
        
        return result;   
        
    }
}
