package factory

import vendor.{Instruction, ProgramParser}
import scala.io.Source

/**
  * Created by steven on 01/04/2017.
  */
object ProgramParserImpl extends ProgramParser{

  var instructions:InstructionList = Vector.empty
  val filePath = "/Users/steven/Documents/coursework/cw-two/programs/"

  def parse(file: String): InstructionList = {
    val filePath = "/Users/steven/Documents/coursework/cw-two/programs/"
    val fileName = filePath+file
    val lines = Source.fromFile(fileName).getLines

    for(line<- lines) {
      var splitLine = line.split(" ")
      var byte: String = splitLine(0)
      var argV:Vector[Int] = Vector.empty
      var inst:Instruction = null
      if (splitLine.size > 1) {
        var i = splitLine(1).toInt
        argV = argV:+i
      }
      inst = new Instruction(byte,argV)
      instructions = instructions:+inst
    }
    instructions
  }

  def parseString(string: String): InstructionList = {
    instructions
  }

}
