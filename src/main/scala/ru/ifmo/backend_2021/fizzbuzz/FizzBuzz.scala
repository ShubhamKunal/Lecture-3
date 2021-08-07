package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  def main(args:Array[String]): Unit ={
    val fizzBuzz = new FizzBuzz()
    fizzBuzz.flexibleFizzBuzz(s => {})
  }
  def flexibleFizzBuzz(func:String => Unit):Unit ={
    for (counter<-Range(1,101)){
      if(counter%3==0&&counter%5==0){
        func("FizzBuzz")
      }
      else if(counter%5==0){
        func("Buzz")
      }
      else if(counter%3==0) {
        func("Fizz")
      }
      else{
        func(counter.toString)
      }
    }
  }
}
