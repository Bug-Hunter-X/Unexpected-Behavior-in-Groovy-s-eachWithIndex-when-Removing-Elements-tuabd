# Groovy eachWithIndex Bug
This example demonstrates a potential issue when using `eachWithIndex` to iterate and modify a list in Groovy.  Modifying the list during iteration using `remove()` can lead to unexpected behavior due to index shifts. 

The `bug.groovy` file contains code that illustrates this problem. The solution (`bugSolution.groovy`) provides safer alternatives for handling such scenarios.