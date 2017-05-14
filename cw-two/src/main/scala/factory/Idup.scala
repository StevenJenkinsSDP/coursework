package factory

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by steven on 01/04/2017.
  */
class Idup  extends ByteCode{

  val code: Byte = bytecode("idup")

  def execute(vm: VirtualMachine): VirtualMachine = {
    var x = vm.pop()._1
    vm.push(x)
    vm.push(x)
    vm
  }
}
