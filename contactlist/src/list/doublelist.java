package list;

public class doublelist {
    Node Start = null;
    public void CreateNode(String name, int cont_n0, String email)
    {
        Node temp = new Node();
        temp.name = name;
        temp.cont_n0 = cont_n0;
        temp.email = email;
        if (Start == null)   Start = temp;
        else
        {
            Node q = Start;
            while (q.Next != null)  q = q.Next;
            q.Next = temp;
            temp.Prev = q;
        }
    }
    public void Display()
    {
        Node q = this.Start;
        while (q != null)
        {
            System.out.println(q.name);
            System.out.println(q.cont_n0);
            System.out.println(q.email);
            q = q.Next;
        }
        System.out.println();
        System.out.println();
    }
    public void Delete(String name)
    {
    Start=this.Start;
      	if (Start==null){
    		System.out.println("empty list");
    	}
      
        if (Start.name.equals(name))
        {System.out.println("i was here");
            Start = Start.Next;
            return;
        }
        else {
        	
        Node q = Start;
        while (q.Next != null)
        {
        	System.out.println(name + "deleted");
            if (q.Next.name.equals(name))
            {
                q.Next = q.Next.Next; 
                return;
            }
            q = q.Next;
        }}
        
    }
	public int length()
	{
		if(Start==null) return 0;
		Node n=Start;
		int l=1;
		while(n.Next!=null)
		{
			l++;
			n=n.Next;
		}
		return l;
	}
    public void del(String name)
    {
        Node Start=new Node();
        Start=this.Start;
        
    	Node tmp,q;
    	if(Start.name.equals(name))
    	{
    		tmp=Start;
    		Start=Start.Next;	/*first element deleted*/
    	Start.Prev=null;
                    //delete(tmp);
    		return;
    	}
    	q=Start;
    	while(q.Next.Next!=null)
    	{
    		if(q.Next.name.equals(name))	       /*element deleted in between*/
    		{
    			tmp=q.Next;
    			q.Next=tmp.Next;
                            tmp.Next.Prev=q;
    			//free(tmp);
    			return;
    		}
    		q=q.Next;
    	}
    	if(q.Next.name.equals(name))		/*last one deleted*/
    	{
    		tmp=q.Next;
    		
    		q.Next=null;
    		return;
    	}
    	System.out.println("Element "+name+" not found");
    }
	public String[][] getData() {
		String [][] data= new String[length()][3];
		Node n=Start;
		for(int i=0;i<length();i++)
		{
			data[i][0]=n.name;
			data[i][1]=""+n.cont_n0;
			data[i][2]=n.email;
			n=n.Next;
		}
		return data;
	}
	Node search(String name) {
		Node q=this.Start;
		if(Start.name.equalsIgnoreCase(name)) {
			return Start;
		}
		else {
			while(q.Next!=null) {
				if(q.name.equalsIgnoreCase(name)) {
					return q;
				}
				q=q.Next;
			}
		}
		if(q.name.equalsIgnoreCase(name)) {
			return q;
		}
		return null;
		
	}

    }
    
    

