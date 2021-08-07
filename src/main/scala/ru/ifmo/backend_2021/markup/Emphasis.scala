package ru.ifmo.backend_2021.markup
import ru.ifmo.backend_2021.fileutils.FileUtils

class Emphasis(var list: Array[TT]) extends Text with TT {
  var text = new StringBuilder("")
  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append('*')
    this.list.foreach((t: TT) => t.toMarkdown(sb))
    sb.append('*')
    sb
  }
  override def toFile(fileName: String): Unit = {
    var fwObj = new FileUtils()
    def writer(bw: java.io.BufferedWriter): Unit ={
      bw.write(toMarkdown(text).toString())
      bw.close()
    }
    fwObj.withFileWriter(fileName)(writer)
  }
}