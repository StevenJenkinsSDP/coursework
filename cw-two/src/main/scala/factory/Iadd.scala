package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine
/**
  * Created by steven on 01/04/2017.
  */
class Iadd extends ByteCode {

  val code: Byte = 1

  def execute(vm: VirtualMachine): VirtualMachine = {
    vm.push(vm.pop()._1 + vm.pop()._1)
  vm
  }
}
