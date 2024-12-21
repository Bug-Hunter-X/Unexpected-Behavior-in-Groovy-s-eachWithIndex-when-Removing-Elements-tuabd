```groovy
def myMethod(List<String> list) {
  //Using copy to avoid ConcurrentModificationException
  List<String> copyList = new ArrayList<>(list);
  copyList.eachWithIndex { str, index ->
    println "Element at index $index: $str"
    if (index == 2) {
        list.remove(str); //remove by value
    }
  }
}

List<String> myList = ['apple', 'banana', 'cherry', 'date']
myMethod(myList)

//Or use iterator to remove elements safely

def myMethod2(List<String> list) {
  Iterator<String> iterator = list.iterator();
  int index = 0;
  while (iterator.hasNext()) {
    String str = iterator.next();
    println "Element at index $index: $str"
    if (index == 2) {
      iterator.remove();
    }
    index++;
  }
}
myList = ['apple', 'banana', 'cherry', 'date']
myMethod2(myList) 
```