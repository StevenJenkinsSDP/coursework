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
      case 1 => b = new Iconst
      case 2 => b = new Iconst
      case 3 => b = new Iconst
      case 4 => b = new Iconst
      case 5 => b = new Iconst
      case 6 => b = new Iconst
      case 7 => b = new Iconst
      case 8 => b = new Iconst
      case 9 => b = new Iconst
      case 10 => b = new Iconst
      case 11 => b = new Iconst
      case 12 => b = new Iconst
    }
    b
  }
}
