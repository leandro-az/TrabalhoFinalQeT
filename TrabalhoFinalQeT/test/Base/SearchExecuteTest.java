package Base;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchExecuteTest {
    
    private int[] getCres(){
        int[] array = {1,2,3,4}; 
        return array;
    }
   
    @Test
    public void cres_less_farleft() {
        
        ResultType result = SearchExecute.search(getCres(),0,SearchType.LessThan);
        
        Assert.assertEquals(0, result.getResultIndex().intValue());
    }
    
}
