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
public class ResultType {
  public enum SearchResult {
     NotFound,
     FoundExact,
     FoundGreater,
     FoundLess
 }
 private SearchResult searchResult;
 private Integer resultIndex;
 private Integer resultValue;
 
 public ResultType(SearchResult searchResult,Integer resultIndex,Integer resultValue) {
    this.searchResult = searchResult;
    this.resultIndex = resultIndex;
    this.resultValue = resultValue;
 }
}