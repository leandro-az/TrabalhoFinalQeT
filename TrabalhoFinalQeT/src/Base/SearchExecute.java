package Base;


import static Base.ResultType.SearchResult.*;

public final class SearchExecute {
    
    public static ResultType result ;
    
    public static ResultType search(int[] array, int key,SearchType type, int modelOrdenation) {
        result = new ResultType(NotFound, null, null);
        switch(type){
            case LessThan:
               searchLessThan(array,key,modelOrdenation);
               break;
            case LessThanEquals:
                searchLessThanEquals(array,key,modelOrdenation); 
                break;
            case Equals:
                searchEquals(array,key);
                break;
            case GreaterThanEquals:
               searchGreaterThanEquals(array,key,modelOrdenation);
               break;
            case GreaterThan:
                searchGreaterThan(array,key,modelOrdenation); 
                break;
                
        }
        return result;
    }

    private static void searchLessThan(int[] array, int key, int modelOrdenation) {
               
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

    private static void searchLessThanEquals(int[] array, int key, int modelOrdenation) {
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

    private static void searchEquals(int[] array, int key) {
         
         for (int i = array.length-1 ; i==0 ; i--) {
            if(array[i]== key){
              result.setSearchResult(FoundExact);
              result.setResultIndex(i);
              result.setResultValue(array[i]);               
            }
            
        }
    }
    
     private static void searchGreaterThan(int[] array, int key, int modelOrdenation) {
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

    private static void searchGreaterThanEquals(int[] array, int key, int modelOrdenation) {
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
