package factory
import bc.ByteCode
import vm.VirtualMachine

import scala.collection.mutable.ArrayStack
/**
  * Created by steven on 01/04/2017.
  */
case class VirtualMachineImpl(intStack:ArrayStack[Int],bcVector:Vector[ByteCode]) extends VirtualMachine  {

  var vi:VirtualMachine = new VirtualMachineImpl(null,null)

  def execute(bc: Vector[ByteCode]): VirtualMachine ={

   for(b<-bc) {
   vi =  b.execute(vi)
   }
    vi
  }

  def executeOne(bc: Vector[ByteCode]): (Vector[ByteCode], VirtualMachine) = {
    var b = bc(0)
    vi = b.execute(vi)
    (bc,vi)
  }

  def push(value: Int): VirtualMachine = {
    intStack.push(value)
     vi = VirtualMachineImpl(intStack,bcVector)
    vi
  }

  def pop(): (Int, VirtualMachine) = {
    var i = intStack.pop
    (i, vi)
  }

  def state: Vector[Int] ={
    val intV: Vector[Int] = Vector.empty
    for(i<-intStack) {
      intV:+i
    }
    intV

  }

}
