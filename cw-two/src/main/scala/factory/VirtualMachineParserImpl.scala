package factory
import bc.ByteCode
import vm.VirtualMachineParser
import factory.ByteCodeParserImpl.{bytecode}
import vendor.Instruction

/**
  * Created by steven on 01/04/2017..
  */
object VirtualMachineParserImpl extends VirtualMachineParser {

  val pp = VirtualMachineFactory.vendorParser
  val bcp = VirtualMachineFactory.byteCodeParser
  val b:Vector[Byte] = Vector.empty

  def parse(file: String): Vector[ByteCode] = {

    //turn the file into an instruction list
    val ins = pp.parse(file)
    //turn the instruction list into vector of bytes
    val byteVector = changeToByte(ins)
    //turn the vector of bytes into a vector of ByteCode

    val bc = bcp.parse(byteVector)
    bc

  }

  def parse(bc: Vector[Byte]): Vector[ByteCode] = {

    bcp.parse(b)
  }

  def parseString(str: String): Vector[ByteCode] = {
    //turn the file into an instruction list
    val ins = pp.parseString(str)
    //turn the instruction list into vector of bytes
    val byteVector = changeToByte(ins)
    //turn the vector of bytes into a vector of ByteCode
    bcp.parse(byteVector)
  }

  def changeToByte(ins: Vector[Instruction]):Vector[Byte] = {
    var vbyte1: Vector[Byte] = Vector.empty
    for (i<-ins) {
      vbyte1 = vbyte1:+ bytecode(i.name)
      for (a<-i.args) {
        vbyte1 = vbyte1:+ a.toByte
      }
    }
    vbyte1
  }

}
