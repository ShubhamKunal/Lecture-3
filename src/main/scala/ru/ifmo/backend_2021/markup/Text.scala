package ru.ifmo.backend_2021.markup
import scala.collection.mutable.StringBuilder
import ru.ifmo.backend_2021.fileutils.FileUtils
class Text(text:String = "") extends TT {
  override def toMarkdown(sb: StringBuilder): StringBuilder = sb.append(this.text)

  override def toFile(fileName: String): Unit = {
    var fwObj = new FileUtils()
    def writer(bw: java.io.BufferedWriter): Unit ={
      bw.write(text)
      bw.close()
    }
    fwObj.withFileWriter(fileName)(writer)
  }

}