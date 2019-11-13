package com.jaye.features;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Student{
    String name;
    int  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Classes{
    String name;
    List<Student> studentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
public class Java8Features {
    List<Classes> classesList = new ArrayList<>();

    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        strings.stream().forEach(System.out::println);
//
//        List<Integer> integers = Arrays.asList(1, 2,3, 4, 5);
//        integers =  integers.stream().map(integer -> integer*2).collect(toList());
        //integers.stream().flatMap();
        List<String> words = Arrays.asList("Hello","world","Java","Stream");
        Double i =   words.stream()
                .limit(3)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.averagingInt((item)->2));
               // .collect(Collectors.collectingAndThen(toList(),(item)->{ System.out.println(item);Collections.sort(item); return item;}));
       System.out.println(i);
    }
}
