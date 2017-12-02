package Base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchExecuteTest {
    
    private int[] getCres(){
        int[] array = {5,10,15,20,25}; 
        return array;
    }
    
    private int[] getDecr(){
        int[] array = {25,20,15,10,5}; 
        return array;
    }
   
    @Test
    public void cres_less_farleft() {
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.LessThan);
        
        assertEquals(-1, result.getResultIndex());
        assertEquals(-1, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_less_left() {
        
        ResultType result = SearchExecute.search(getCres(),5,SearchType.LessThan);
        
        assertEquals(-1, result.getResultIndex());
        assertEquals(-1, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_less_center() {
        
        ResultType result = SearchExecute.search(getCres(),15,SearchType.LessThan);
        
        assertEquals(1, result.getResultIndex());
        assertEquals(10, result.getResultValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_less_right() {
        
        ResultType result = SearchExecute.search(getCres(),25,SearchType.LessThan);
        
        assertEquals(3, result.getResultIndex());
        assertEquals(20, result.getResultValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_less_farright() {
        
        ResultType result = SearchExecute.search(getCres(),30,SearchType.LessThan);
        
        assertEquals(4, result.getResultIndex());
        assertEquals(25, result.getResultValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
}
