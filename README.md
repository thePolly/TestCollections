# TestCollections

 Stream operations can have one of two following types:

1. Intermidiate
2. Terminal

### Intermidiate
Some of the examples: 
1. filter
2. map
3. limit

### Terminal
Some of the examples: 
1. forEach
2. reduce
3. collect
4. min max count
5. anyMatch allMatch noneMatch

### Creating stream
1. Out of list
```
list.stream()
```
2. via agruments 
```
Stream<Integer> stream = Stream.of(1,2);
```
### Generating stream
can be generated via Stream.generate()
```
Stream.generate(new Random()::nextInt) 
    .limit(10).forEach(System.out::println);  
```
### Consumer
Accepts, doesnt return
mostly used for printing out 

### Function 
Accepts and returns

### Supplier 
Doesnt accepts, returns
