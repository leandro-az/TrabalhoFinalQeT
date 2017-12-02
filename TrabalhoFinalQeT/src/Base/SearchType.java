/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

/**
 *
 * @author leandroall
 */
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
