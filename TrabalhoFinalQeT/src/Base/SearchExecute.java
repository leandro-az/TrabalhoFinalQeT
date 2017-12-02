package Base;


import static Base.ResultType.SearchResult.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class SearchExecute {
    
    private Logger logger = Logger.getLogger(SearchExecute.class.getName());
    public ResultType result ;
    
    public ResultType search(int[] array, int key,SearchType type, int modelOrdenation) {
        
        logger.setLevel(Level.OFF);
        
        logger.info("SEARCHING:"+key+" TYPE:"+ type);
        result = new ResultType(NotFound, null, null);
        switch(type){
            case LessThan:
               logger.info("LESSTHAN");
               searchLessThan(array,key,modelOrdenation);
               logger.info("RESULT:"+result.toString());
               break;
            case LessThanEquals:
                logger.info("LESSTHANEQUALS");
                searchLessThanEquals(array,key,modelOrdenation); 
                break;
            case Equals:
                logger.info("EQUALS");
                searchEquals(array,key);
                break;
            case GreaterThanEquals:
                logger.info("GREATERTHANEQUALS");
               searchGreaterThanEquals(array,key,modelOrdenation);
               break;
            case GreaterThan:
                logger.info("GREATER");
                searchGreaterThan(array,key,modelOrdenation); 
                break;
                
        }
        return result;
    }

    private void searchLessThan(int[] array, int key, int modelOrdenation) {
               
          for (int i = array.length-1 ; i==0 ; i--) {
            if(array[i]<= key){
              result.setSearchResult(FoundLess);
              result.setResultIndex(i);
              result.setResultValue(array[i]); 
              if(modelOrdenation==1)
                        return;
            }
            
          }
            
    }

    private void searchLessThanEquals(int[] array, int key, int modelOrdenation) {
          for (int i = array.length-1 ; i==0 ; i--) {
            if(array[i]<=key){
              result.setSearchResult(FoundLess);
              result.setResultIndex(i);
              result.setResultValue(array[i]);
              if(array[i]==key){
                  result.setSearchResult(FoundExact);
                  return;
              }
              if(modelOrdenation==1)
                        return;       
              
            }
            
          }
    
    }

    private void searchEquals(int[] array, int key) {
         
         for (int i = array.length-1 ; i==0 ; i--) {
            if(array[i]== key){
              result.setSearchResult(FoundExact);
              result.setResultIndex(i);
              result.setResultValue(array[i]);               
            }
            
        }
    }
    
     private void searchGreaterThan(int[] array, int key, int modelOrdenation) {
       for (int i =0; i== array.length-1 ; i++) {
            if(array[i]>= key){
              result.setSearchResult(FoundGreater);
              result.setResultIndex(i);
              result.setResultValue(array[i]);
               if(modelOrdenation==1)
                        return; 
            }
            
          }
    }

    private void searchGreaterThanEquals(int[] array, int key, int modelOrdenation) {
       for (int i =0; i== array.length-1 ; i++) {
            if(array[i]>= key){
              result.setSearchResult(FoundGreater);
              result.setResultIndex(i);
              result.setResultValue(array[i]);
              if(array[i]==key){
                  result.setSearchResult(FoundExact);
                  return;
              }
               if(modelOrdenation==1)
                        return; 
            }
            
          }
    }

   
    
}
