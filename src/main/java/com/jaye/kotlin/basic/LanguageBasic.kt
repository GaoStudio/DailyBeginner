package com.jaye.kotlin.basic

fun main(args:Array<String>){
    println("hello world");
}
fun what(){
    println("kotlin what");
}
fun declareVal(){
    var b = "a";
    b = "c";
}
fun ifelse(){
    var a = if(1==1) true else false;
    println(a);
}
class OperatorDemo{

}
data class Point(val x:Int,val y:Int)
operator fun Point.unaryMinus() = Point(-x,y);