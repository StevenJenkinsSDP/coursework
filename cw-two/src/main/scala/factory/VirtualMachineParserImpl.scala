package factory
import bc.ByteCode
import vm.VirtualMachineParser
import factory.ByteCodeParserImpl.{bytecode, vbyte}
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
    println("ins" +ins.size)
    //turn the instruction list into vector of bytes
    val byteVector = changeToByte(ins)
    println("bytecodevector"+ byteVector.size)
    //turn the vector of bytes into a vector of ByteCode
    bcp.parse(byteVector)
  }

  def parse(bc: Vector[Byte]): Vector[ByteCode] = {

    this.bcp.parse(b)
  }

  def parseString(str: String): Vector[ByteCode] = {
    //turn the file into an instruction list
    val ins = pp.parse(str)

    //turn the instruction list into vector of bytes
    for (i <- ins) {
      val by = bcp.bytecode(i.name)
      b:+by
    }
    //turn the vector of bytes into a vector of ByteCode
    bcp.parse(b)
  }

  def changeToByte(ins: Vector[Instruction]):Vector[Byte] = {
    for (i<-ins) {
      vbyte = vbyte:+ bytecode(i.name)
      for (a<-i.args) {
        vbyte = vbyte:+ a.toByte
      }
    }
    vbyte
  }

}
