package factory

import bc.ByteCode
import bc.ByteCodeParser
import bc.ByteCodeFactory
import vendor.Instruction

/**
  * Created by steven on 01/04/2017.
  */
object ByteCodeParserImpl extends ByteCodeParser{

  var bcode:Vector[ByteCode] = Vector.empty
  var vbyte:Vector[Byte] = Vector.empty

  def changeToByte(ins: Vector[Instruction]):Vector[Byte] = {
    for (i<-ins) {
      println(bytecode(i.name))
     vbyte = vbyte:+ bytecode(i.name)
      println (vbyte)
      for (a<-i.args) {
        vbyte = vbyte:+ a.toByte
      }
    }
    vbyte
  }

  def parse(bc: Vector[Byte]): Vector[ByteCode] = {
    for(b<- bc) {
      bcode:+ ByteCodeFactoryImpl.make(b)
    }
    bcode
  }
}
