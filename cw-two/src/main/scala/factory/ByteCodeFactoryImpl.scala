package factory

import bc.ByteCode
import bc.ByteCodeFactory
/**
  * Created by steven on 01/04/2017..
  */
object ByteCodeFactoryImpl extends ByteCodeFactory{

  def make(byte: Byte, args: Int*): ByteCode = {

    var b:ByteCode = null



    byte match {
      case 1 => b = new Iconst(args(0))
      case 2 => b = new Iadd
      case 3 => b = new Isub
      case 4 => b = new Imul
      case 5 => b = new Idiv
      case 6 => b = new Irem
      case 7 => b = new Ineg
      case 8 => b = new Iinc
      case 9 => b = new Idec
      case 10 => b = new Idup
      case 11 => b = new Iswap
      case 12 => b = new print
    }
    b
  }
}
