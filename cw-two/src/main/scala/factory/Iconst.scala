package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine
/**
  * Created by steven on 01/04/2017.
  */
class Iconst(val num:Int) extends ByteCode{

  val code: Byte = bytecode("iconst")

  def execute(vm: VirtualMachine): VirtualMachine = {
    vm.push(num)
    vm
  }

}
