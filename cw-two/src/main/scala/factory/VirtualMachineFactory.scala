package factory

import bc.{ByteCodeFactory, ByteCodeParser}
import factory.ProgramParserImpl
import vendor.{ProgramParser}
import vendor.Instruction
import vm.{VirtualMachine, VirtualMachineParser}

import scala.io.Source

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {

  def vendorParser: ProgramParser = ProgramParserImpl

  def byteCodeFactory: ByteCodeFactory = ByteCodeFactoryImpl

  def byteCodeParser: ByteCodeParser = ByteCodeParserImpl

  def virtualMachineParser: VirtualMachineParser = VirtualMachineParserImpl

  def virtualMachine: VirtualMachine = new VirtualMachineImpl(null,null)

}
