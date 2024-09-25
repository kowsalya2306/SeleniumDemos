package JavaMap;

public class TreeMap {//null and insertion not possible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//it will give default sorting(ascending order)
       java.util.TreeMap<String, String> treemap = new java.util.TreeMap<String,String>();
       treemap.put(null, null);
       treemap.put("kows", "thiru");
       treemap.put("charu", "thiru");
       treemap.put("mathi", "thiru");
       treemap.put("mohan", "thiru");
     //  treemap.put("key", null);
       //  treemap.put(null, "kows");
       System.out.println(treemap);
       
       treemap.put("thiru", "mohan");
       treemap.put("thiru", "kows");
       System.out.println(treemap);
       
     //  if the keys are same it will override and give the updated value in result
      // try to run the duplicate key the value will override 
       //if it is null key it shows null point exception

	}

}
