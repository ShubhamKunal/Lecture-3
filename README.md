# Lecture 3
## Scala utils
### Дедлайн 27/03/21 00:01 - 20 баллов
Задание выполняется на Scala, использование `var` запрещено.

1) Разработайте класс FizzBuzz имеющий метод `flexibleFizzBuzz`.
   Метод должен принимать на вход функцию имеющую тип `String => Unit`, 
   которая будет вызываться от каждой новой строки в последовательности, 
   позволяя вызывающему самому решить что делать с результатом. 
   Класс должен находится в пакете `ru.ifmo.backend_2021.fizzbuzz`.
   
   ```
   val fizzBuzz = new FizzBuzz()
   fizzBuzz.flexibleFizzBuzz(s => {}) ничего не делает
   fizzBuzz.flexibleFizzBuzz(s => println(s)) выведет 
   1
   2
   Fizz
   4
   Buzz
   ...
   ```
2) Разработайте класс FileUtils реализующий методы `withFileReader` и `withFileWriter`.
   Каждый метод должен принимать на вход имя файла первым списком аргументов и функцию имеющую тип 
   `java.io.BufferedReader => String` и `java.io.BufferedWriter => Unit` соответственно для чтения файла и записи в файл.
   Открытие и закрытие источников должно быть автоматизировано, чтобы вызывающий не забыл закрыть файл.
   Класс должен находится в пакете `ru.ifmo.backend_2021.fileutils`.
   
   ```
   val fileUtils = new FileUtils()
   fileUtils.withFileWriter("File.txt") { writer =>
      writer.write("Hello\n"); writer.write("World!")
   }
   val result = fileUtils.withFileReader("File.txt") { reader =>
      reader.readLine() + "\n" + reader.readLine()
   }
   assert(result == "Hello\nWorld!")
   val fizzBuzz = new FizzBuzz()
   fileUtils.withFileWriter("FizzBuzz.txt") { writer =>
      fizzBuzz.flexibleFizzBuzz(s => writer.write(s"$s\n"))
   }
   ```
   Разрешается использование `java.nio.file.Files.newBufferedWriter` и `newBufferedReader`.
3) Реализуйте предыдущее задание из [Второй лекции](https://github.com/Backend-ITMO-2021/Lecture-2-B/blob/main/README.md)
   на Scala со следующими изменениями:
   п.5: `java.lang.StringBuilder` -> `scala.collection.mutable.StringBuilder`
   
   п.6: Следующий код должен успешно компилироваться:
   ```
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
   ```
   Дополнительно все классы должны реализовывать метод `toFile(fileName)`,
   записывающий результат выражения в файл при помощи `FileUtils`.
4) Бонусное задание на доп. 10 баллов.
   В пакете `ru.ifmo.backend_2021.reddit` находятся классы 
   `RedditMessage`,
   `RedditThreadPrinter` и `TestRedditThreadPrinter`.
   Требуется реализовать функционально решение `RedditThreadPrinter.printMessages`.
   `printMessages` принимает на вход список `class RedditMessage(val id: Int, val parentId: Option[Int], val text: String)`,
   где `id` - уникальный идентификатор сообщения, `parentId` - опциональная ссылка на `id` родителя сообщения, `text` - текст сообщения.
   Сообщения могут быть переданы в случайном порядке, при выводе сообщений одного уровня, порядок должен сохраняться.
   
   Метод должен вывести все сообщения на вход функции-обработчика в следующем формате:
   1) Каждое сообщение выводится в формате `[отступ]#[номер сообщения]пробел[сообщение]`
   2) Отступ сообщения равен отступу родителя и одному пробелу
   3) Сообщение-ребёнок выводится в следующей строке после своего родителя   
   4) У нулевого сообщения отступ равен нулю
   
   Запрещается мутирование переменных и коллекций.
   
   
