package ru.ifmo.backend_2021.markup

trait Markdown {
  def toMarkdown(sb: StringBuilder): StringBuilder = ???
  def toFile(fName: String) = ???
}

class Paragraph(val elements: Array[Markdown]) extends Markdown

class Strong(val elements: Array[Markdown]) extends Markdown

class Emphasis(val elements: Array[Markdown]) extends Markdown

class Strikeout(val elements: Array[Markdown]) extends Markdown

class Text(text: String) extends Markdown