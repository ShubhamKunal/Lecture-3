import TestConstants.{MESSAGES_COMPLEX_TEST_RESULT, MESSAGES_EXAMPLE_TEST_RESULT}
import org.scalatest.funsuite.AnyFunSuite
import ru.ifmo.backend_2021.reddit._

class MessagesTest extends AnyFunSuite {
  test("example") {
    val threadPrinter = new RedditThreadPrinter()
    import threadPrinter._
    val sb = new StringBuilder()
    printMessages(
      Array(
        new RedditMessage(0, None, "I don't particularly care which interaction they pick so long as it's consistent."),
        new RedditMessage(1, Some(0), "Exactly, both is fine but do pick one."),
        new RedditMessage(2, Some(1), "Riot consistency"),
        new RedditMessage(3, Some(0), "Bad bot"),
        new RedditMessage(4, None, "I think it should be 4x1 damage always"),
        new RedditMessage(5, Some(4), "Yeah, because you're pulling X number of puffcaps, that doesn't mean one puffcap deals X damage, it's X puffcaps deal 1 damage."),
        new RedditMessage(6, Some(4), "I think 1xShrooms"),
        new RedditMessage(7, Some(6), "I agree, but I'm also scared of swain stunning 4 charas at the start of the turn lol."),
        new RedditMessage(8, Some(6), "So swain should stun multiple people right?"),
      )
    )(s => sb.append(s).append("\n"))
    assert(sb.result() == MESSAGES_EXAMPLE_TEST_RESULT)
  }

  test("complext") {
    val threadPrinter = new RedditThreadPrinter()
    import threadPrinter._
    val sb = new StringBuilder()
    printMessages(
      Array(
        new RedditMessage(1, Some(0), "0-1"),
        new RedditMessage(0, None, "0-0"),
        new RedditMessage(15, Some(7), "0-5"),
        new RedditMessage(2, Some(0), "1-1"),
        new RedditMessage(3, Some(1), "0-2"),
        new RedditMessage(5, Some(2), "2-2"),
        new RedditMessage(6, Some(3), "0-3"),
        new RedditMessage(20, Some(19), "5-5"),
        new RedditMessage(16, Some(8), "1-5"),
        new RedditMessage(9, Some(5), "3-3"),
        new RedditMessage(7, Some(4), "1-3"),
        new RedditMessage(8, Some(5), "2-3"),
        new RedditMessage(10, Some(6), "0-4"),
        new RedditMessage(11, Some(6), "1-4"),
        new RedditMessage(17, Some(8), "2-5"),
        new RedditMessage(13, Some(7), "3-4"),
        new RedditMessage(12, Some(6), "2-4"),
        new RedditMessage(14, Some(7), "4-4"),
        new RedditMessage(4, Some(2), "1-2"),
        new RedditMessage(19, Some(18), "4-5"),
        new RedditMessage(18, Some(13), "3-5"),
      )
    )(s => sb.append(s).append("\n"))
    assert(sb.result() == MESSAGES_COMPLEX_TEST_RESULT)
  }
}
