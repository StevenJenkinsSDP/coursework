package factory

/**
  * Created by steven on 14/05/2017.
  */
object SJTest {

  def main(s:Array[String]): Unit = {

    val p = ProgramParserImpl
   // val ins = p.parse("/users/steven/Documents/c/cw-two/programs/p01.vm")

    //println(" this is the output of program parser " + ins)

    val vb = VirtualMachineParserImpl
    val vc = vb.parse("/users/steven/Documents/c/cw-two/programs/p01.vm")
    println(vc.size)

    for(v<-vc) {
      println(v.toString)
    }


    //val vmp = VirtualMachineParserImpl
    //val v = vmp.parse("/users/steven/Documents/c/cw-two/programs/p01.vm")
    //print(v)

  }

}
