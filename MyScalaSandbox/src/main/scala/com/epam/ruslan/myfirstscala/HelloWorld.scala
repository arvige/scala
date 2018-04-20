//package com.epam.ruslan.myfirstscala

object PrintOptionsOnStart {
  var ruslan:Person = null

  def main(args: Array[String]) {
    if (args.length > 1) {
      val nameAsArg = args(0).substring(1)
      val ageAsArg = args(1).substring(1).toInt
      ruslan = new Person(nameAsArg, ageAsArg)
    }
    else println("! cmd line has less than 2 args")

    println("app cmd line arguments are:")
    for (arg <- args if arg startsWith "-") {
      println("" + (arg substring 1))
    }
    println("---> end of cmd line args printout")

    println(MySampleDate.MySampleDateAsString())
    println(MySampleObject.myMethod())

    if (ruslan != null) ruslan.printMe
  }
}

object MySampleDate {
  def MySampleDateAsString():String = {
    val d = new java.util.Date()
    d.toString()
  }
}

object MySampleObject {
  def myMethod():String = "I'm returned string"
}

class Person (private val Name:String, val Age:Int ) {

  def printMe(): Unit = {
    println("My name is " + Name + ", and I'm " + Age + " years old :)")
  }
}