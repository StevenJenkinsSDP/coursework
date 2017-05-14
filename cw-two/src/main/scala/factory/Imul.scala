package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine

/**
  * Created by steven on 01/04/2017.
  */
class Imul  extends ByteCode{

  val code: Byte = bytecode("imul")

  def execute(vm: VirtualMachine): VirtualMachine = {
    vm.push(vm.pop()._1 * vm.pop()._1)
    vm
  }
}
