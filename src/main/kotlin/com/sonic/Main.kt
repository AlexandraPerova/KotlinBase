package com.sonic;

fun main(args: Array<String>) {
    printLn("Hello from Kotlin")

    var value: Int = 5
    var sum: Double = 10.5
    var text: String = "Hello Kotlin"
     if (value > 5) {
         printLn(">5")
     }

     when(value) {
         1 -> {

         }
         5 -> {

         }
         10 -> {

         }
         else -> {

         }
     }
}

fun newClassMassive(args: Array<String>) {
    printIn("Hello from Kotlin")
    //вариант 1
    val arrayInt: Array<Int> = Array<Int>(size: 3) { 150; 200; 300}
    //вариант 2
    val arrayInt2 = Array<Int>(size: 3) { 150; 200; 300}
    //вариант 3
    val arrayInt3 = Array(size: 3) { 150; 200; 300}
    //вариант 4
    val arrayInt4 = Array(size: 1000) {5}
    //вариант 5
    val arrayInt5 = arrayOf(150, 200, 300)
    //вариант 6
    val arrayInt6 = arrayOfNulls<Int>(size: 3)
    //вариант 7
    val arrayInt7 = intArray(size: 3) { 150; 200; 300}
    //вариант 8
    val arrayInt8 = intArrayOf { 150; 200; 3400}
    //вариант 9
    var arrayText = arrayOf("vfdvfd", "vfvdfvfb", "535t4")


    //внизу джава вариант
    int[] arrayInt = new int[3];
    arrayInt[0] = 150;
    arrayInt[1] = 200;
    array[2] = 300;

    int[] arrayIntSec = new int[3];

    String[] arrayTest = new String[3];
    arrayTest[0] = "vfdvfd";
    arrayTest[1] = "vfvdfvfb";
    arrayTest[2] = "fewfwfww";

    for(int i = 0; i < arrayTest.length; i++) {
        System.out.printIn(i + "item = " + arrayText[i]);
    }

}