package oops.assign

class Person(val name: String, val age: Int) extends Ordered[Person] {
  //Here we defined a class person which extends a trait ordered
  // now doing comparison
  def compare(that: Person): Int = {

    if (that.name.equals(this.name))
    {
      //Since name is same so comparing on basis of age
      this.age - that.age
    }
    //if name is different then comparing on its length
    else
    {
      this.name.length.compare(that.name.length)
    }
  }
}

object Person {

  def main(args: Array[String]): Unit = {

    //Here we have used two test cases
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    println(personOne < personTwo)

    val person_one = new Person("TestAgain", 24)
    val person_two = new Person("Test", 25)
    println(person_one < person_two)

  }
}
