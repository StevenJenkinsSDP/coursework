package factory

import vendor.{Instruction, ProgramParser}
import scala.io.Source

/**
  * Created by steven on 01/04/2017.
  */
object ProgramParserImpl extends ProgramParser{

  var instructions:InstructionList = Vector.empty


  def parse(file: String): InstructionList = {
    val lines = Source.fromFile(file).getLines.toArray
    parseLines(lines)
  }

  def parseString(string: String): InstructionList = {
    val s = string.split("\n")
    parseLines(s)
  }

  def parseLines(lines:Array[String]):InstructionList = {
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


}
