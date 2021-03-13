import TestConstants.{FIZZ_BUZZ_RESULT, MARKUP_DEPTH_7_TEST_RESULT, MARKUP_EXAMPLE_TEST_RESULT}
import org.scalatest.funsuite.AnyFunSuite
import ru.ifmo.backend_2021.fileutils._
import ru.ifmo.backend_2021.fizzbuzz._
import ru.ifmo.backend_2021.markup._

import java.io.File

class FileUtilsTest extends AnyFunSuite{
  def cleanUp(fileName: String): Boolean = {
    new File(fileName).delete()
  }

  test("Hello world") {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter("Hello.txt") { writer =>
      writer.write("Hello\n"); writer.write("World!")
    }
    val result = fileUtils.withFileReader("Hello.txt") { reader =>
      reader.readLine() + "\n" + reader.readLine()
    }
    assert(result == "Hello\nWorld!")
    assert(cleanUp("Hello.txt"))
  }

  test("fizz buzz") {
    val fileUtils = new FileUtils()
    val fizzBuzz = new FizzBuzz()
    fileUtils.withFileWriter("FizzBuzz.txt") { writer =>
      fizzBuzz.flexibleFizzBuzz(s => writer.write(s"$s\n"))
    }
    val result = fileUtils.withFileReader("FizzBuzz.txt") { reader =>
      reader.lines().reduce((a, b) => s"$a\n$b").get()
    }
    assert((result + "\n") == FIZZ_BUZZ_RESULT)
    assert(cleanUp("FizzBuzz.txt"))
  }

  test("markup example") {
    val fileUtils = new FileUtils()
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
    paragraph.toFile("Markup.txt")
    val result = fileUtils.withFileReader("Markup.txt") { reader =>
      reader.lines().reduce((a, b) => s"$a\n$b").get()
    }
    assert(result == MARKUP_EXAMPLE_TEST_RESULT)
    assert(cleanUp("Markup.txt"))
  }

  test("markup 7") {
    val fileUtils = new FileUtils()
    val tree = new Paragraph(Array(new Strikeout(Array(new Paragraph(Array(new Emphasis(Array(new Text("zyy"),new Text("vxt"),new Strikeout(Array(new Paragraph(Array(new Text("bdv"))),new Text("jrm"),new Paragraph(Array(new Strong(Array(new Strong(Array(new Text("inl"))))),new Strong(Array(new Paragraph(Array(new Text("ysp"))))))))),new Strikeout(Array(new Strong(Array(new Strong(Array(new Strong(Array(new Text("aaw"))))))),new Strong(Array(new Paragraph(Array(new Paragraph(Array(new Text("elq"))))),new Strikeout(Array(new Strikeout(Array(new Text("dks"))))))),new Paragraph(Array(new Paragraph(Array(new Strikeout(Array(new Text("mrw"))))),new Emphasis(Array(new Strikeout(Array(new Text("kud"))))))))))),new Paragraph(Array(new Strikeout(Array(new Strikeout(Array(new Emphasis(Array(new Strong(Array(new Text("kst"))))))))),new Emphasis(Array(new Text("frp"),new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Text("gyt"))))),new Strong(Array(new Emphasis(Array(new Text("tga"))))))))),new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Text("vla"))))),new Paragraph(Array(new Paragraph(Array(new Text("xnd"))))))))),new Strong(Array(new Emphasis(Array(new Paragraph(Array(new Emphasis(Array(new Text("yuq"))))))),new Text("crw"),new Paragraph(Array(new Text("lho"),new Strong(Array(new Strong(Array(new Text("ywq"))))))))))))),new Strikeout(Array(new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Strikeout(Array(new Strikeout(Array(new Text("uvt"))))))),new Strong(Array(new Text("ioa"))))),new Emphasis(Array(new Emphasis(Array(new Paragraph(Array(new Strikeout(Array(new Text("mfm"))))),new Emphasis(Array(new Text("shk"))))),new Strikeout(Array(new Paragraph(Array(new Strikeout(Array(new Text("frp"))))))),new Strikeout(Array(new Text("vgd"))))))))),new Paragraph(Array(new Emphasis(Array(new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Emphasis(Array(new Text("jzb"))))))),new Emphasis(Array(new Paragraph(Array(new Strong(Array(new Text("jez"))))))),new Text("tzf"))),new Paragraph(Array(new Text("dbk"),new Paragraph(Array(new Strong(Array(new Strikeout(Array(new Text("uzs"))))),new Text("kok"))))),new Emphasis(Array(new Strong(Array(new Strikeout(Array(new Strikeout(Array(new Text("ygr"))))),new Paragraph(Array(new Text("xip"))))),new Strikeout(Array(new Paragraph(Array(new Strikeout(Array(new Text("chq"))))))),new Strong(Array(new Text("yqz"))))))),new Strong(Array(new Text("blq"))),new Strong(Array(new Paragraph(Array(new Strikeout(Array(new Paragraph(Array(new Text("ptz"))),new Text("tru"))),new Strong(Array(new Strikeout(Array(new Paragraph(Array(new Text("bzu"))))),new Text("bgn"))),new Emphasis(Array(new Paragraph(Array(new Emphasis(Array(new Text("maw"))))))))))),new Strikeout(Array(new Strong(Array(new Strong(Array(new Paragraph(Array(new Paragraph(Array(new Text("quu"))))))),new Emphasis(Array(new Strikeout(Array(new Strong(Array(new Text("osw"))))),new Paragraph(Array(new Strong(Array(new Text("yfd"))))))),new Emphasis(Array(new Strong(Array(new Emphasis(Array(new Text("oiz"))))),new Emphasis(Array(new Strikeout(Array(new Text("fth"))))))))),new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Text("rvs"))))))),new Strong(Array(new Strong(Array(new Text("wwi"))),new Strong(Array(new Strikeout(Array(new Text("odr"))))))))))),new Paragraph(Array(new Text("fji"),new Strong(Array(new Paragraph(Array(new Emphasis(Array(new Emphasis(Array(new Text("cch"))))))),new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Text("mjp"))))))))),new Emphasis(Array(new Text("hmy"),new Strikeout(Array(new Strong(Array(new Strikeout(Array(new Text("zzg"))))),new Text("thh"))))))))),new Text("frj"),new Text("qdu"))),new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Strong(Array(new Paragraph(Array(new Paragraph(Array(new Emphasis(Array(new Text("dro"))))))))),new Strong(Array(new Emphasis(Array(new Strikeout(Array(new Paragraph(Array(new Text("jlw"))))),new Strong(Array(new Emphasis(Array(new Text("dzq"))))))))),new Paragraph(Array(new Strikeout(Array(new Paragraph(Array(new Emphasis(Array(new Text("tcf"))))))),new Paragraph(Array(new Emphasis(Array(new Text("qwc"))),new Strong(Array(new Strikeout(Array(new Text("gok"))))))))))),new Text("sxx"),new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Paragraph(Array(new Paragraph(Array(new Text("ruj"))))))))))))),new Paragraph(Array(new Strong(Array(new Text("dgj"),new Emphasis(Array(new Strong(Array(new Emphasis(Array(new Strikeout(Array(new Text("uuz"))))))),new Strong(Array(new Strong(Array(new Strong(Array(new Text("eiu"))))),new Paragraph(Array(new Paragraph(Array(new Text("wle"))))))))),new Emphasis(Array(new Emphasis(Array(new Strong(Array(new Strikeout(Array(new Text("mmf"))))))))),new Text("hmz"))),new Text("zur"),new Strikeout(Array(new Text("iag"),new Emphasis(Array(new Strong(Array(new Text("gni"))),new Strikeout(Array(new Text("yjq"))),new Strikeout(Array(new Emphasis(Array(new Paragraph(Array(new Text("buj"))))))))),new Text("bak"))))),new Emphasis(Array(new Text("bns"),new Strong(Array(new Paragraph(Array(new Strong(Array(new Strong(Array(new Text("jga"))))),new Paragraph(Array(new Paragraph(Array(new Paragraph(Array(new Text("wum"))))),new Text("uzo"))))),new Strong(Array(new Strong(Array(new Text("vib"),new Strikeout(Array(new Strong(Array(new Text("fjs"))))))),new Emphasis(Array(new Strikeout(Array(new Text("aor"))),new Paragraph(Array(new Strikeout(Array(new Text("glw"))))))),new Strong(Array(new Strong(Array(new Text("qqq"))),new Strong(Array(new Paragraph(Array(new Text("ruh"))))))))),new Paragraph(Array(new Text("ymj"),new Paragraph(Array(new Strikeout(Array(new Text("trv"))))),new Text("jrb"))))))),new Text("vua"))),new Paragraph(Array(new Text("qzs"),new Strong(Array(new Strikeout(Array(new Text("wqt"),new Paragraph(Array(new Strong(Array(new Strikeout(Array(new Paragraph(Array(new Text("nio"))))))))),new Strikeout(Array(new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Text("oht"))))))))))),new Strong(Array(new Paragraph(Array(new Strikeout(Array(new Strong(Array(new Strikeout(Array(new Text("mtw"))))))))))))),new Text("tfq"),new Strong(Array(new Emphasis(Array(new Strong(Array(new Emphasis(Array(new Emphasis(Array(new Text("ere"))),new Emphasis(Array(new Paragraph(Array(new Text("bgq"))))))),new Paragraph(Array(new Strikeout(Array(new Paragraph(Array(new Text("vau"))))),new Strong(Array(new Strikeout(Array(new Text("znz"))))))))),new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Emphasis(Array(new Text("fqg"))))))),new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Text("whv"))))))))),new Strikeout(Array(new Text("jad"))))),new Text("yhk"),new Strong(Array(new Paragraph(Array(new Text("pxk"))),new Strikeout(Array(new Text("cqa"),new Strikeout(Array(new Text("htw"),new Text("pmh"))),new Text("hme"))),new Paragraph(Array(new Paragraph(Array(new Strong(Array(new Paragraph(Array(new Text("acr"))))),new Text("yos"))),new Strong(Array(new Strikeout(Array(new Paragraph(Array(new Text("bne"))))),new Strong(Array(new Text("tdy"))))))))),new Emphasis(Array(new Text("zrv"),new Strong(Array(new Text("qew"),new Paragraph(Array(new Text("rcl"),new Strikeout(Array(new Text("fer"))))),new Emphasis(Array(new Text("oui"))))),new Text("ddb"),new Strong(Array(new Text("gij"),new Strikeout(Array(new Strong(Array(new Strikeout(Array(new Text("vur"))))),new Paragraph(Array(new Strikeout(Array(new Text("lkp"))))))),new Emphasis(Array(new Strong(Array(new Paragraph(Array(new Text("exw"))))),new Text("qgt"))))))))),new Emphasis(Array(new Text("ddq"),new Emphasis(Array(new Emphasis(Array(new Text("jej"))),new Paragraph(Array(new Text("zfm"))),new Strikeout(Array(new Strikeout(Array(new Strong(Array(new Emphasis(Array(new Text("gxi"))))))),new Emphasis(Array(new Emphasis(Array(new Text("xaj"))))),new Text("ovj"))),new Emphasis(Array(new Strong(Array(new Text("jgg"))),new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Text("dkf"))))))),new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Text("opw"))))),new Strikeout(Array(new Strong(Array(new Text("fda"))))))))))))),new Emphasis(Array(new Strong(Array(new Strikeout(Array(new Strong(Array(new Emphasis(Array(new Emphasis(Array(new Text("efk"))))))))))))))),new Paragraph(Array(new Strikeout(Array(new Strikeout(Array(new Emphasis(Array(new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Text("imr"))))))))))),new Strong(Array(new Strong(Array(new Text("vcd"),new Paragraph(Array(new Paragraph(Array(new Strong(Array(new Text("hkk"))))),new Text("pid"))))),new Text("vkk"),new Strikeout(Array(new Strong(Array(new Emphasis(Array(new Strikeout(Array(new Text("fzr"))))))),new Emphasis(Array(new Text("pbb"))))))),new Strikeout(Array(new Strikeout(Array(new Paragraph(Array(new Strong(Array(new Text("kru"))),new Paragraph(Array(new Paragraph(Array(new Text("oap"))))))),new Paragraph(Array(new Text("tif"))),new Emphasis(Array(new Paragraph(Array(new Text("fad"))),new Paragraph(Array(new Emphasis(Array(new Text("brf"))))))))),new Strikeout(Array(new Text("zhb"),new Strikeout(Array(new Emphasis(Array(new Paragraph(Array(new Text("tvc"))))),new Strikeout(Array(new Text("thi"))))),new Text("pzw"))),new Emphasis(Array(new Text("pri"),new Strikeout(Array(new Emphasis(Array(new Emphasis(Array(new Text("eyj"))))),new Paragraph(Array(new Emphasis(Array(new Text("ykw"))))))),new Strong(Array(new Emphasis(Array(new Text("puj"))))))),new Strikeout(Array(new Strong(Array(new Strong(Array(new Text("ygd"))),new Emphasis(Array(new Strikeout(Array(new Text("jrs"))))))),new Paragraph(Array(new Emphasis(Array(new Strong(Array(new Text("qry"))))))))))))),new Emphasis(Array(new Strikeout(Array(new Text("opz"))),new Paragraph(Array(new Strong(Array(new Text("cjp"))),new Strong(Array(new Strong(Array(new Text("drq"),new Strong(Array(new Emphasis(Array(new Text("aty"))))))),new Strong(Array(new Strong(Array(new Strikeout(Array(new Text("rps"))))))),new Text("ceo"))),new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Text("elq"))))))))),new Paragraph(Array(new Text("snn"),new Text("iuw"),new Strong(Array(new Strikeout(Array(new Text("pun"))),new Emphasis(Array(new Paragraph(Array(new Text("aga"))))))))))),new Strikeout(Array(new Paragraph(Array(new Text("drm"))),new Strong(Array(new Strong(Array(new Strikeout(Array(new Paragraph(Array(new Text("tus"))))),new Text("heq"))),new Paragraph(Array(new Paragraph(Array(new Strong(Array(new Text("yyu"))))))),new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Text("zzy"))))))))),new Strikeout(Array(new Paragraph(Array(new Text("owa"),new Strong(Array(new Text("zwo"))))),new Text("nkk"))),new Emphasis(Array(new Strikeout(Array(new Strikeout(Array(new Strikeout(Array(new Text("lzo"))))),new Strong(Array(new Emphasis(Array(new Text("nbr"))))))),new Emphasis(Array(new Strong(Array(new Emphasis(Array(new Text("ijo"))))),new Strikeout(Array(new Emphasis(Array(new Text("lly"))))))),new Emphasis(Array(new Strikeout(Array(new Emphasis(Array(new Text("vkg"))))))))))),new Paragraph(Array(new Strong(Array(new Emphasis(Array(new Text("haz"))))),new Text("lkz"))),new Text("isy"))),new Text("ayc")))))
    tree.toFile("Markup7.txt")
    val result = fileUtils.withFileReader("Markup7.txt") { reader =>
      reader.lines().reduce((a, b) => s"$a\n$b").get()
    }
    assert(result == MARKUP_DEPTH_7_TEST_RESULT)
    assert(cleanUp("Markup7.txt"))
  }
}
