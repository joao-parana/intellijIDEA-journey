package br.cefet_rj

import scala.collection.mutable.ListBuffer
/**
 * Hello world!
 *
 */
object App extends App {
  println( """Listas Mutáveis""" )
  // baseado no exemplo do Alvin Alexander
  // http://alvinalexander.com/scala/how-add-elements-to-a-list-in-scala-listbuffer-immutable
  var fruits = new ListBuffer[String]()
  fruits += "Apple"
  fruits += "Banana"
  fruits += "Orange"
  val fruitsList = fruits.toList
  println( "fruitsList: " + fruitsList)
  fruitsList.foreach(println)
  // Clausura
  var counter = 1
  fruitsList.foreach( (f) => {
    println(counter.toString + " fruit: " + f) ; counter = counter + 1
  } )
}





