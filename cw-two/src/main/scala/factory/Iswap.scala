package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine
/**
  * Created by steven on 01/04/2017.
  */
class Iswap  extends ByteCode{
  val code: Byte = 1

  def execute(vm: VirtualMachine): VirtualMachine = {
    var x = vm.pop._1
    var y = vm.pop._1
    vm.push(y)
    vm.push(x)
    vm
  }
}
