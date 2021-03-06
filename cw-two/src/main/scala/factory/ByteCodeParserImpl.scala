package factory

import bc.{ByteCode, ByteCodeFactory, ByteCodeParser, InvalidBytecodeException}
import vendor.Instruction

import scala.collection.mutable.ArrayBuffer

/**
  * Created by steven on 01/04/2017.
  */
object ByteCodeParserImpl extends ByteCodeParser {

  def parse(bc: Vector[Byte]): Vector[ByteCode] = {
    var bcode:Vector[ByteCode] = Vector.empty
    var vbyte:Vector[Byte] = Vector.empty
    var a: ArrayBuffer[Byte] = new ArrayBuffer
    for (b<-bc) {
      a += b
    }

    var i = 0
    while (i< a.size) {
       if(a(i)== bytecode("iconst")) {
        bcode = bcode:+ByteCodeFactoryImpl.make(a(i),a(i+1).toInt)
        a.remove(i)
        a.remove(i)
      } else {
        bcode = bcode:+ByteCodeFactoryImpl.make(a(i))
        a.remove(i)
      }
    }
    bcode
  }
}
