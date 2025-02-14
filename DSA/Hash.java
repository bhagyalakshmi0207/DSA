import java.util.*;
public class Hash{
    public static void main(String[]args){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        //for Insertion 
        map.put(1,"Bhagya");
        map.put(2,"Rama");
        map.put(3,"Hema");
        map.put(4,"Soma");
        System.out.println(map);
        //Used to access the data 
        System.out.println(map.get(1));
        // to find the total sizse of the hashmap
        System.out.println(map.size());
        System.out.println(map.remove(4));
        if(map.containsKey(2)){
            System.out.println("True");
        }
        //Iteration for the both keys and values with in the hashmap 
        for(Map.Entry m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  

        
    }
}