Here is the content you requested in markdown format:

---

## What are the new features introduced in Java 8?
Java 8 introduced features like lambda expressions, functional interfaces, streams, default methods, and method references.

## What is a lambda expression in Java 8? Provide an example.
A lambda expression is an anonymous function that can be used to implement functional interfaces.

Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.forEach(n -> System.out.println(n));
```

## What is a functional interface in Java 8?
A functional interface is an interface that contains only one abstract method. It can be annotated with the `@FunctionalInterface` annotation.

## How can you create a functional interface in Java 8? Provide an example.
Example:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

## What are streams in Java 8? Provide an example of using streams.
Streams are a new abstraction introduced in Java 8 that allow you to process collections of data in a functional way.

Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream().mapToInt(Integer::intValue).sum();
```

## What is the difference between a stream and a collection in Java 8?
A stream is a sequence of elements that can be processed in parallel or sequentially, whereas a collection is a data structure that stores elements.

## What are method references in Java 8? Provide an example.
Method references allow you to refer to methods or constructors without invoking them.

Example:
```java
List<String> names = Arrays.asList("John", "Jane", "Alice");
names.forEach(System.out::println);
```

## What is the default method in Java 8? Provide an example.
A default method is a method defined in an interface with a default implementation.

Example:
```java
interface MyInterface {
    default void myMethod() {
        System.out.println("Default method");
    }
}
```

## What is the use of the Optional class in Java 8? Provide an example.
The Optional class is used to represent a value that may or may not be present.

Example:
```java
Optional<String> optional = Optional.ofNullable(null);
String value = optional.orElse("Default value");
```

## How can you sort a list of objects using Java 8 streams? Provide an example.
Example:
```java
List<Person> people = Arrays.asList(new Person("John"), new Person("Alice"), new Person("Bob"));
List<Person> sortedPeople = people.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
```

## What is the difference between the map() and flatMap() methods in Java 8 streams?
The map() method transforms each element of a stream into another element, while the flatMap() method transforms each element into a stream of elements and then flattens the result.

## How can you find the maximum element in a stream using Java 8? Provide an example.
Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> max = numbers.stream().max(Integer::compare);
```

## What is the purpose of the Collectors class in Java 8? Provide an example.
The Collectors class provides various utility methods to perform mutable reduction operations on streams.

Example:
```java
List<String> names = Arrays.asList("John", "Jane", "Alice");
String concatenatedNames = names.stream().collect(Collectors.joining(", "));
```

## How can you iterate over a map using Java 8 streams? Provide an example.
Example:
```java
Map<String, Integer> map = new HashMap<>();
map.put("John", 30);
map.put("Jane", 25);
map.put("Alice", 35);
map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
```

## What is the purpose of the Predicate interface in Java 8? Provide an example.
The Predicate interface represents a predicate (boolean-valued function) of one argument.

Example:
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
boolean result = isEven.test(4);
```

## How can you convert a list of strings to uppercase using Java 8 streams? Provide an example.
Example:
```java
List<String> strings = Arrays.asList("hello", "world");
List<String> uppercaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
```

## What is the purpose of the Supplier interface in Java 8? Provide an example.
The Supplier interface represents a supplier of results.

Example:
```java
Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
int randomNumber = randomNumberSupplier.get();
```

## How can you remove duplicate elements from a list using Java 8 streams? Provide an example.
Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
```

## What is the purpose of the Function interface in Java 8? Provide an example.
The Function interface represents a function that accepts one argument and produces a result.

Example:
```java
Function<Integer, String> intToString = n -> String.valueOf(n);
String result = intToString.apply(10);
```

## How can you find the average of a list of numbers using Java 8 streams? Provide an example.
Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average();
```

## What is the purpose of the BiFunction interface in Java 8? Provide an example.
The BiFunction interface represents a function that accepts two arguments and produces a result.

Example:
```java
BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
int result = sum.apply(10, 20);
```

## How can you filter elements from a list using Java 8 streams? Provide an example.
Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
```

## What is the purpose of the Comparator interface in Java 8? Provide an example.
The Comparator interface represents a comparison function that can be used to compare objects.

Example:
```java
List<String> names = Arrays.asList("John", "Jane", "Alice");
names.sort(Comparator.comparing(String::length));
```

## How can you find the sum of all elements in a list using Java 8 streams? Provide an example.
Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream().mapToInt(Integer::intValue).sum();
```

## What is the purpose of the Stream API in Java 8? Provide an example.
The Stream API provides a way to process collections of data in a functional way, allowing operations like filtering, mapping, and reducing.

Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
```

These questions and coding samples should help you prepare for a Java 8 interview. Good luck!

---