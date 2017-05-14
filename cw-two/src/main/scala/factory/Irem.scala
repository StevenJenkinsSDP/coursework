package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine

/**
  * Created by steven on 01/04/2017.
  */
class Irem  extends ByteCode{

  val code: Byte = bytecode("irem")

  def execute(vm: VirtualMachine): VirtualMachine = {
    vm.push(vm.pop()._1 % vm.pop()._1)
    vm
  }
}
