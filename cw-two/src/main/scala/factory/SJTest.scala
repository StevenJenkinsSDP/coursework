package factory

/**
  * Created by steven on 14/05/2017.
  */
object SJTest {

  def main(s:Array[String]): Unit = {

    val vmf  =VirtualMachineFactory
    val vmp = vmf.virtualMachineParser
    val vm = vmf.virtualMachine
    val b = vmf.byteCodeParser
    val pp = vmf.vendorParser


    //val v = pp.parse("/users/steven/Documents/c/cw-two/programs/p01.vm")

   // val x = vmp.changeToByte(v)

    //val p = vmp.parseString("iconst 4\niconst 5\niadd\nprint")

    val s = if (!b.names.contains("ine")) "true" else "false"
    println(s)
    println(b.names)




  }

}
