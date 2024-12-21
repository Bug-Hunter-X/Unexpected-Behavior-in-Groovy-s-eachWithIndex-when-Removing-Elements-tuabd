```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { str, index ->
    println "Element at index $index: $str"
    if (index == 2) {
      list.remove(index) //Error prone line
    }
  }
}

List<String> myList = ['apple', 'banana', 'cherry', 'date']
myMethod(myList)
```