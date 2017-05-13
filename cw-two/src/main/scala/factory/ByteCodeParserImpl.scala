package factory

import bc.ByteCode
import bc.ByteCodeParser
import bc.ByteCodeFactory

/**
  * Created by steven on 01/04/2017.
  */
object ByteCodeParserImpl extends ByteCodeParser{
  var bcode:Vector[ByteCode] = Vector.empty
  def parse(bc: Vector[Byte]): Vector[ByteCode] = {
    for(b<- bc) {
      bcode:+ ByteCodeFactoryImpl.make(b)
    }
    bcode
  }
}
