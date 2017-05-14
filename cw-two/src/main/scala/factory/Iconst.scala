package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine
/**
  * Created by steven on 01/04/2017.
  */
class Iconst extends ByteCode{

  val code: Byte = bytecode("iconst")
  val num:Byte = 0

  def execute(vm: VirtualMachine): VirtualMachine = {
    vm.push(vm.pop._1)
    vm
  }

}
