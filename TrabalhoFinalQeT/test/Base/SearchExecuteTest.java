package Base;

import org.junit.Test;
import static org.junit.Assert.*;

public class SearchExecuteTest {
    
    private final int cresc = 1;
    private final int decr = 0;
    
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
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.LessThan,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_less_left() {
        
        ResultType result = SearchExecute.search(getCres(),5,SearchType.LessThan,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_less_centerequals() {
        
        ResultType result = SearchExecute.search(getCres(),15,SearchType.LessThan,cresc);
        
        assertEquals(1, result.getResultIndex().intValue());
        assertEquals(10, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_less_centerdifferent() {
        
        ResultType result = SearchExecute.search(getCres(),17,SearchType.LessThan,cresc);
        
        assertEquals(2, result.getResultIndex().intValue());
        assertEquals(15, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_less_right() {
        
        ResultType result = SearchExecute.search(getCres(),25,SearchType.LessThan,cresc);
        
        assertEquals(3, result.getResultIndex().intValue());
        assertEquals(20, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_less_farright() {
        
        ResultType result = SearchExecute.search(getCres(),30,SearchType.LessThan,cresc);
        
        assertEquals(4, result.getResultIndex().intValue());
        assertEquals(25, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_lessequal_farleft() {
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.LessThanEquals,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_lessequal_left() {
        
        ResultType result = SearchExecute.search(getCres(),5,SearchType.LessThanEquals,cresc);
        
        assertEquals(0, result.getResultIndex().intValue());
        assertEquals(5, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_lessequal_centerequals() {
        
        ResultType result = SearchExecute.search(getCres(),15,SearchType.LessThanEquals,cresc);
        
        assertEquals(2, result.getResultIndex().intValue());
        assertEquals(15, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_lessequal_centerdifferent() {
        
        ResultType result = SearchExecute.search(getCres(),17,SearchType.LessThanEquals,cresc);
        
        assertEquals(2, result.getResultIndex().intValue());
        assertEquals(15, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_lessequal_right() {
        
        ResultType result = SearchExecute.search(getCres(),25,SearchType.LessThanEquals,cresc);
        
        assertEquals(4, result.getResultIndex().intValue());
        assertEquals(25, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_lessequal_farright() {
        
        ResultType result = SearchExecute.search(getCres(),30,SearchType.LessThanEquals,cresc);
        
        assertEquals(4, result.getResultIndex().intValue());
        assertEquals(25, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void cres_equal_farleft() {
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.Equals,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_equal_left() {
        
        ResultType result = SearchExecute.search(getCres(),5,SearchType.Equals,cresc);
        
        assertEquals(0, result.getResultIndex().intValue());
        assertEquals(5, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_equal_centerequals() {
        
        ResultType result = SearchExecute.search(getCres(),15,SearchType.Equals,cresc);
        
        assertEquals(2, result.getResultIndex().intValue());
        assertEquals(15, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_equal_centerdifferent() {
        
        ResultType result = SearchExecute.search(getCres(),17,SearchType.Equals,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_equal_right() {
        
        ResultType result = SearchExecute.search(getCres(),25,SearchType.Equals,cresc);
        
        assertEquals(4, result.getResultIndex().intValue());
        assertEquals(25, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_equal_farright() {
        
        ResultType result = SearchExecute.search(getCres(),30,SearchType.Equals,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_greaterequal_farleft() {
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.GreaterThanEquals,cresc);
        
        assertEquals(0, result.getResultIndex().intValue());
        assertEquals(5, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundGreater,result.getSearchResult());
    }
    
    @Test
    public void cres_greaterequal_left() {
        
        ResultType result = SearchExecute.search(getCres(),5,SearchType.GreaterThanEquals,cresc);
        
        assertEquals(0, result.getResultIndex().intValue());
        assertEquals(5, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_greaterequal_centerequal() {
        
        ResultType result = SearchExecute.search(getCres(),15,SearchType.GreaterThanEquals,cresc);
        
        assertEquals(2, result.getResultIndex().intValue());
        assertEquals(15, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_greaterequal_centerdifferent() {
        
        ResultType result = SearchExecute.search(getCres(),17,SearchType.GreaterThanEquals,cresc);
        
        assertEquals(3, result.getResultIndex().intValue());
        assertEquals(20, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundGreater,result.getSearchResult());
    }
    
    @Test
    public void cres_greaterequal_right() {
        
        ResultType result = SearchExecute.search(getCres(),25,SearchType.GreaterThanEquals,cresc);
        
        assertEquals(4, result.getResultIndex().intValue());
        assertEquals(25, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundExact,result.getSearchResult());
    }
    
    @Test
    public void cres_greaterequal_farright() {
        
        ResultType result = SearchExecute.search(getCres(),30,SearchType.GreaterThanEquals,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void cres_greater_farleft() {
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.GreaterThan,cresc);
        
        assertEquals(0, result.getResultIndex().intValue());
        assertEquals(5, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundGreater,result.getSearchResult());
    }
    
    @Test
    public void cres_greater_left() {
        
        ResultType result = SearchExecute.search(getCres(),5,SearchType.GreaterThan,cresc);
        
        assertEquals(1, result.getResultIndex().intValue());
        assertEquals(10, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundGreater,result.getSearchResult());
    }
    
    @Test
    public void cres_greater_centerequals() {
        
        ResultType result = SearchExecute.search(getCres(),15,SearchType.GreaterThan,cresc);
        
        assertEquals(3, result.getResultIndex().intValue());
        assertEquals(20, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundGreater,result.getSearchResult());
    }
    
    @Test
    public void cres_greater_centerdifferent() {
        
        ResultType result = SearchExecute.search(getCres(),17,SearchType.GreaterThan,cresc);
        
        assertEquals(3, result.getResultIndex().intValue());
        assertEquals(20, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundGreater,result.getSearchResult());
    }
    
    @Test
    public void cres_greater_right() {
        
        ResultType result = SearchExecute.search(getCres(),25,SearchType.GreaterThan,cresc);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    //##########################################################################
    //  DECRESCENT
    //##########################################################################
    
    @Test
    public void decr_less_farleft() {
        
        ResultType result = SearchExecute.search(getDecr(),30,SearchType.LessThan,decr);
        
        assertEquals(0, result.getResultIndex().intValue());
        assertEquals(25, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void decr_less_left() {
        
        ResultType result = SearchExecute.search(getDecr(),25,SearchType.LessThan,decr);
        
        assertEquals(1, result.getResultIndex().intValue());
        assertEquals(20, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void decr_less_centerdifferent() {
        
        ResultType result = SearchExecute.search(getDecr(),17,SearchType.LessThan,decr);
        
        assertEquals(2, result.getResultIndex().intValue());
        assertEquals(15, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void decr_less_centerequals() {
        
        ResultType result = SearchExecute.search(getDecr(),15,SearchType.LessThan,decr);
        
        assertEquals(3, result.getResultIndex().intValue());
        assertEquals(10, result.getResultValue().intValue());
        assertEquals(ResultType.SearchResult.FoundLess,result.getSearchResult());
    }
    
    @Test
    public void decr_less_right() {
        
        ResultType result = SearchExecute.search(getDecr(),5,SearchType.LessThan,decr);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
    
    @Test
    public void decr_less_farright() {
        
        ResultType result = SearchExecute.search(getDecr(),0,SearchType.LessThan,decr);
        
        assertEquals(null, result.getResultIndex());
        assertEquals(null, result.getResultValue());
        assertEquals(ResultType.SearchResult.NotFound,result.getSearchResult());
    }
}
