package ru.ifmo.backend_2021.markup

import java.util
import java.util.List

object test {
  def main(args: Array[String]): Unit = {
    val paragraph = new Paragraph(Array(
      new Strong(Array(
        new Text("1"),
        new Strikeout(Array(
          new Text("2"),
          new Emphasis(Array(
            new Text("3"),
            new Text("4")
          )),
          new Text("5")
        )),
        new Text("6")
      ))
    ))
    println(paragraph.toMarkdown(new StringBuilder).toString())
  }
}
