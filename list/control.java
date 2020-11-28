package list;

public class control {
	static doublelist obj12=new doublelist();
    void ret(String name,int i,String mail) {
    
    	obj12.CreateNode(name, i, mail);
    
		
	}
  void del(String name) {
        
    	obj12.Delete(name);
    	System.out.println("after dlt");
    	obj12.Display();
		
	}
}
