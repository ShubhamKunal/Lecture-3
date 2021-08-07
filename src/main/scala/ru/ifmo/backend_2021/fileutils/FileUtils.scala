package ru.ifmo.backend_2021.fileutils
import java.io._
class FileUtils {
  def withFileReader(name:String)( func: java.io.BufferedReader => String):Unit={
    val fr = new FileReader(name)
    val br = new BufferedReader(fr)
    try  {
      func(br)
    } finally {
      br.close()
      fr.close()
    }
  }
  def withFileWriter(name:String)( func: java.io.BufferedWriter => Unit):Unit={
    val fw = new FileWriter(name)
    val bw = new BufferedWriter(fw)
    try  {
      func(bw)
    } finally {
      bw.close()
      bw.close()
    }
  }

}
