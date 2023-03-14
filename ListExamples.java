import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(0, s);
      }
    }
    return result;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int i = 0, j = 0;
    for(; i < list1.size() && j < list2.size();) {
      if(list1.get(i).compareTo(list2.get(j)) < 0) {
        result.add(list1.get(i));
        i++;
      }
      else {
        result.add(list2.get(j));
        j++;
      }
    }
    while(i < list1.size()) {
      result.add(list1.get(i));
      i++;
    }
    while(j < list2.size()) {
      result.add(list2.get(j));
      j++;
    }
    return result;
  }


}
