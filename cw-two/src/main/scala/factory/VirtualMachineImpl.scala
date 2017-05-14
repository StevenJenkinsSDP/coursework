package factory
import bc.ByteCode
import vm.VirtualMachine

import scala.collection.mutable
import scala.collection.mutable.ArrayStack
/**
  * Created by steven on 01/04/2017.
  */
class VirtualMachineImpl extends VirtualMachine  {


  val intStack:ArrayStack[Int] = new mutable.ArrayStack[Int]


  def execute(bc: Vector[ByteCode]): VirtualMachine = {
    for (b <- bc) {
      val v = b.execute(this)
    }
    this
  }

  def executeOne(bc: Vector[ByteCode]): (Vector[ByteCode], VirtualMachine) = {
    var b = bc(0)
    b.execute(this)
    (bc,this)
  }

  def push(value: Int): VirtualMachine = {
    intStack.push(value)
     this
  }

  def pop(): (Int, VirtualMachine) = {
    var i = intStack.pop
    (i, this)
  }

  def state: Vector[Int] ={
    val intV: Vector[Int] = Vector.empty
    for(i<-intStack) {
      intV:+i
    }
    intV

  }

}
