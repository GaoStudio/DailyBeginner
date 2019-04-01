package com.jaye.collection;

import javax.lang.model.util.ElementScanner6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-13 11:49
 * Email: gaoweivf@aliyun.com
 * Description:
 **/
class ForeachDemo<T> implements Iterable{
    private List<T> list;
    public ForeachDemo(List<T> list){
        this.list = list;
    }
    @Override
    public Iterator iterator(){
        return list.iterator();
    }
}
public class CollectionMain {
    static final int MAXIMUM_CAPACITY = 1 << 30;
    public static void main(String[] args) {
        //CollectionMain.ArrayList();
        //CollectionMain.LinkList();。
        //10000>>>3 =
       /* System.out.println(-16>>>1);
        System.out.println(-16>>>2);*/
       // CollectionMain.HashMap();
        //System.out.println(tableSizeFor(16));
        //System.out.println(8|2);
        //CollectionMain.Set();
        //CollectionMain.Vector();
        //CollectionMain.Foreach();
        //CollectionMain.Test();
        //System.out.println(tryCatch()+"");
        testInteger();
    }

//    public String add(List<String> strings){
//        return "";
//    }
    private class ScanName extends ElementScanner6{

    };
    public static void testInteger(){
        int temp = 200;
        int intA = 200;
        Integer a = temp;
        Integer b = temp;
        Integer c = new Integer(temp);
        Integer d =new Integer( temp);
        System.out.println(intA==b);
        System.out.println(a.equals(intA));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a==d);
        System.out.println(a.equals(d));
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
    public static int add(List<Integer> integers){
       final int a = 1;
        boolean b = false;
        char c = 1;
        //a = 2;
        return 1;
    }
    public static int tryCatch(){
        int i = 0;
        try{
            i = 1;
            //return  i;
        }catch (Exception e){
            i = 2;
            return i;
        }finally {
            i =3 ;

        }
        return i;
    }
    static final int tableSizeFor(int cap) {
        int n = cap ;
       /* n |= n >>> 1;*/
        n = 1 | n >>> 3;
       /* n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;*/
        return n;
    }

    public static void Test(){
        //Object[] objs = new String[10];
        //System.out.println(Object[].class);
        //System.out.println(objs.getClass());
    }
    public static void HashMap(){
        HashMap hashMap = new HashMap(0);
        hashMap.put("A","ABCD");
        hashMap.put("B","BACD");
        hashMap.put("C","CABD");
        hashMap.put("D","DABC");
        hashMap.putIfAbsent("D","ABCD");

        System.out.println(hashMap.entrySet().size());
        System.out.println(hashMap.get("D"));
        //HashMap.
    }
    //List
    public static void ArrayList(){

        List<String> arrayList = Arrays.asList("AAA","BBB");
        Object[] objects =  arrayList.toArray();
        //Arrays.asList("CCC");
        System.out.println(objects.getClass());
       // Collections.sort(arrayList,new );
    }
    public static void LinkList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(null);
        linkedList.add(null);
        System.out.println(linkedList.size());
    }
    public static void Foreach(){
        ForeachDemo foreachDemo = new ForeachDemo(Arrays.asList("A","B","C","D"));
        for (Object o:foreachDemo) {
            System.out.println("foreach"+ o.toString());
        }
    }
    public static void Vector(){
        Vector vector = new Vector();
        vector.add("AAA");
        vector.add("BBB");
        vector.add("CCC");
        vector.add("DDD");
        vector.add(4,"EEE");
        //List list = vector.subList(1,vector.size());
        //list.add("EEE");
       /* Iterator iterator = vector.iterator();
        if(iterator.hasNext()){
            System.out.println("next:::"+iterator.next().toString());
        }
        iterator.forEachRemaining(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println( o.toString());
            }
        });*/
       /* for (Object s:vector) {
            System.out.println("foreach"+ s.toString());
        }*/
      /* vector.removeIf(new Predicate() {
           @Override
           public boolean test(Object o) {
               return o.equals("AAA");
           }
       });
       vector.replaceAll(new UnaryOperator() {
           @Override
           public Object apply(Object o) {
               return o="VVV";
           }
       });
        vector.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println( o.toString());
            }
        });*/
      /*  Spliterator spliteratorSource = vector.spliterator();
        Spliterator spliteratorSplit = spliteratorSource.trySplit();
        System.out.println(spliteratorSource.hasCharacteristics(Spliterator.SIZED));
        spliteratorSource.forEachRemaining(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println( o.toString());
            }
        });*/
        System.out.println( vector.toString());
    }
    public static void Set(){
        Set hashSet = new HashSet();
        Set treeSet = new TreeSet();
        Set linkedHashSet = new LinkedHashSet();
        hashSet.add("AAA");
        hashSet.add("DDD");
        hashSet.add("CCC");
        hashSet.add("BBB");
        treeSet.add("AAA");
        treeSet.add("DDD");
        treeSet.add("CCC");
        treeSet.add("BBB");
        linkedHashSet.add("AAA");
        linkedHashSet.add("DDD");
        linkedHashSet.add("CCC");
        linkedHashSet.add("BBB");
        printlnList(hashSet);
        printlnList(treeSet);
        printlnList(linkedHashSet);

    }
    public static void printlnList(Collection collection){
        for (Object o:collection) {
            System.out.print( o.toString()+",");
        }
        System.out.println();
    }
    public void Serialize(){
        ForeachDemo foreachDemo = new ForeachDemo(Arrays.asList("A","B","C","D"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
            oos.writeObject(foreachDemo);
            byte[] yte =byteArrayOutputStream.toByteArray();
            //Byte[] B = new Byte[10];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
