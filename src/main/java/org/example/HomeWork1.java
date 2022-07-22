package main.java.org.example;

import java.util.*;
import java.util.stream.IntStream;

public class HomeWork1 {

    //Problem 1...
    public int getMaxWordOccurrence(String text){

        List<String> sentences;
        List<Integer> sentenceLengths = new ArrayList<>();
        //Here we are converting text to array of sentences, we are replacing . ? ! with _ symbol and then
        //splitting this text into arrays with _ symbol.
        sentences = Arrays.asList(text.replaceAll("[.?!]", "_").split("_"));

        //here we are looping through each sentence and calculating and adding word count in each sentence
        //with the help of splitting each word with " " and getting length
        for (String sentence: sentences) {
            sentenceLengths.add(sentence.trim().split(" ").length);
        }

        //here we are returning the maximum word occurrence in sentence
        return Collections.max(sentenceLengths);
    }

    //Problem 2...
//    @GetMapping("/book/{bookId}")
//    public bookDto getBookByIdWithPathVariable(@PathVariable(value = "bookId") int bookId){
//        return bookService.getBookById(bookId);
//    }
//
//    @GetMapping("/book")
//    public bookDto getBookByIdWithRequestParam(@RequestParam(value = "bookId") int bookId){
//        return bookService.getBookById(bookId);
//    }

    //Problem 3...
//    Find the employeeId of "Charlie" from a map using Java Streams Api.
    public Long findCharlieId(){

        Map<Long, String> employees = Map.of(
                123L, "Alice",
                124L, "Bob",
                125L, "Charlie"
        );

        return employees.entrySet().stream()
                .filter(e -> e.getValue().equals("Charlie"))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    //problem 4...
    public int findEmployeeCount(){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "Sales"),
                new Employee("Eve", "Sales")
        );

        return (int) employees
                .stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .count();
    }

    //problem 5...
    public int calculateSum(){
        return IntStream.rangeClosed(1, 100).sum();
    }

    //problem 6...
    public void bubbleSort() {
        String[] intArray = { "Ajeet", "Steve", "Rick", "Becky", "Mohan"};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i].compareTo(intArray[i + 1]) > 0) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void swap(String[] array, int i, int j) {

        if (i == j) {
            return;
        }

        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //problem 7...
    public void analyzeHierarchy(){

        //This two works fine...
        A ab = new B();
        A ac = new C();

        //it will throw ClassCastException
        C cb = (C) new B();
    }


}
