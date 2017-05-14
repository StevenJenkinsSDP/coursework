package factory
import bc.ByteCode
import vm.VirtualMachineParser
import vendor.ProgramParser
import bc.ByteCodeParser
import factory.ProgramParserImpl.InstructionList
import factory.VirtualMachineParserImpl.bc
import vendor.Instruction

/**
  * Created by steven on 01/04/2017..
  */
object VirtualMachineParserImpl extends VirtualMachineParser {

  val v = VirtualMachineFactory.virtualMachine
  val p = VirtualMachineFactory.vendorParser
  val bc = VirtualMachineFactory.byteCodeParser
  val b:Vector[Byte] = Vector.empty

  def parse(file: String): Vector[ByteCode] = {

    //turn the file into an instruction list
    val ins = p.parse(file)

    //turn the instruction list into vector of bytes
    for (i <- ins) {
      val by = bc.bytecode(i.name)
      b:+by
    }
    //turn the vector of bytes into a vector of ByteCode
    parse(b)
  }

  def parse(bc: Vector[Byte]): Vector[ByteCode] = {

    this.bc.parse(b)
  }

  def parseString(str: String): Vector[ByteCode] = {
    //turn the file into an instruction list
    val ins = p.parse(str)

    //turn the instruction list into vector of bytes
    for (i <- ins) {
      val by = bc.bytecode(i.name)
      b:+by
    }
    //turn the vector of bytes into a vector of ByteCode
    bc.parse(b)
  }

}
