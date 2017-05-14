package factory

/**
  * Created by steven on 14/05/2017.
  */
object SJTest {

  def main(s:Array[String]): Unit = {

    val p = ProgramParserImpl
    val iv = p.parse("/users/steven/Documents/c/cw-two/programs/p01.vm")

    println(" this is the output of program parser " +iv)

    val b = ByteCodeParserImpl
    val bv = b.changeToByte(iv)

    System.out.println(bv)
    //val bcv = b.parse(bv)

    //val vmp = VirtualMachineParserImpl
    //val v = vmp.parse("/users/steven/Documents/c/cw-two/programs/p01.vm")
    //print(v)

  }

}
