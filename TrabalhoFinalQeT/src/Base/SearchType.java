package Base;

public enum SearchType {

       LessThan(0),
       LessThanEquals(1),
       Equals(2),
       GreaterThanEquals(3),
       GreaterThan(4);
 
       public int  searchMode;
  
     SearchType(int value)  {
         this.searchMode=value;
        
     }
        
}
