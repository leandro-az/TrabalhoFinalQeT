package Base;

import static Base.ResultType.SearchResult.*;
import static Base.SearchType.*;

public final class SearchExecute {

    public ResultType search(int[] array, int key, SearchType type, int order) {

        ResultType result = new ResultType(NotFound, null, null);

        for (int i = (array.length - 1) * (1 - order);
                i * (order) + (-1 * (1 - order)) < array.length * (order) + i * (1 - order); //
                i = i + (2 * order) - 1) {

            switch (type) {
                case LessThan:
                    if (array[i] < key) {
                        result.setSearchResult(FoundLess);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                    }
                    break;
                case LessThanEquals:
                    if (array[i] < key) {
                        result.setSearchResult(FoundLess);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                    } else if (array[i] == key) {
                        result.setSearchResult(FoundExact);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                    }
                    break;
                case Equals:
                    if (key == array[i]) {
                        result.setSearchResult(FoundExact);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                        return result;
                    }
                    break;
                case GreaterThanEquals:
                    if (array[i] > key) {
                        result.setSearchResult(FoundGreater);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                        return result;
                    } else if (array[i] == key) {
                        result.setSearchResult(FoundExact);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                        return result;
                    }
                    break;
                case GreaterThan:
                    if (array[i] > key) {
                        result.setSearchResult(FoundGreater);
                        result.setResultIndex(i);
                        result.setResultValue(array[i]);
                        return result;
                    }
                    break;
            }
        }
        return result;
    }
}
