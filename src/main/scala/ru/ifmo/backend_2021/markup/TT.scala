package ru.ifmo.backend_2021.markup {

  trait TT {
    def toMarkdown(sb: StringBuilder): StringBuilder
    def toFile(fileName: String): Unit
  }
}