package factory
import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine
/**
  * Created by steven on 01/04/2017.
  */
class print  extends ByteCode{

  val code: Byte = bytecode("iprint")

  def execute(vm: VirtualMachine): VirtualMachine = {
    print(vm.pop()._1)
    vm
  }
}
