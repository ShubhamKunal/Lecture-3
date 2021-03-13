package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter}

class FileUtils {
  def withFileWriter(fileName: String)(handler: BufferedWriter => Unit): Unit = ???

  def withFileReader(fileName: String)(handler: BufferedReader => String): String = ???
}
