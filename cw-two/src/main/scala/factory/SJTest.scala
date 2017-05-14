package factory

/**
  * Created by steven on 14/05/2017.
  */
object SJTest {

  def main(s:Array[String]): Unit = {

    val vmf  =VirtualMachineFactory
    val vmp = vmf.virtualMachineParser
    val vm = vmf.virtualMachine

    val byteCodeVector = vmp.parse("/users/steven/Documents/c/cw-two/programs/p03.vm")

    vm.execute(byteCodeVector)

  }

}
