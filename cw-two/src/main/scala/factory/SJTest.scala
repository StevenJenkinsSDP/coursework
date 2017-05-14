package factory

/**
  * Created by steven on 14/05/2017.
  */
object SJTest {

  def main(s:Array[String]): Unit = {

    val iconst = new Iconst
    println(iconst.bytecode)

    println(iconst.bytecode("iinc"))
  }

}
