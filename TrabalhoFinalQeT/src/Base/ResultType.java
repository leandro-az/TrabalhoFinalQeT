package Base;

public class ResultType {
  public enum SearchResult {
     NotFound,
     FoundExact,
     FoundGreater,
     FoundLess
 }
 private SearchResult searchResult;
 private int resultIndex;
 private int resultValue;
 
  public ResultType(SearchResult searchResult,Integer resultIndex,Integer resultValue) {
    this.searchResult = searchResult;
    this.resultIndex = resultIndex;
    this.resultValue = resultValue;
 }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }

    public int getResultIndex() {
        return resultIndex;
    }

    public void setResultIndex(int resultIndex) {
        this.resultIndex = resultIndex;
    }

    public int getResultValue() {
        return resultValue;
    }

    public void setResultValue(int resultValue) {
        this.resultValue = resultValue;
    }
 

}