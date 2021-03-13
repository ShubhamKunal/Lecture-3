object TestConstants {
  lazy val FIZZ_BUZZ_RESULT: String =
    s"""1
       |2
       |Fizz
       |4
       |Buzz
       |Fizz
       |7
       |8
       |Fizz
       |Buzz
       |11
       |Fizz
       |13
       |14
       |FizzBuzz
       |16
       |17
       |Fizz
       |19
       |Buzz
       |Fizz
       |22
       |23
       |Fizz
       |Buzz
       |26
       |Fizz
       |28
       |29
       |FizzBuzz
       |31
       |32
       |Fizz
       |34
       |Buzz
       |Fizz
       |37
       |38
       |Fizz
       |Buzz
       |41
       |Fizz
       |43
       |44
       |FizzBuzz
       |46
       |47
       |Fizz
       |49
       |Buzz
       |Fizz
       |52
       |53
       |Fizz
       |Buzz
       |56
       |Fizz
       |58
       |59
       |FizzBuzz
       |61
       |62
       |Fizz
       |64
       |Buzz
       |Fizz
       |67
       |68
       |Fizz
       |Buzz
       |71
       |Fizz
       |73
       |74
       |FizzBuzz
       |76
       |77
       |Fizz
       |79
       |Buzz
       |Fizz
       |82
       |83
       |Fizz
       |Buzz
       |86
       |Fizz
       |88
       |89
       |FizzBuzz
       |91
       |92
       |Fizz
       |94
       |Buzz
       |Fizz
       |97
       |98
       |Fizz
       |Buzz
       |""".stripMargin

  lazy val MARKUP_EXAMPLE_TEST_RESULT: String = "__1~2*34*5~6__"
  lazy val MARKUP_DEPTH_7_TEST_RESULT: String = "~*zyyvxt~bdvjrm____inl______ysp__~~______aaw________elq~~dks~~__~mrw~*~kud~*~*~~*__kst__*~~*frp~~~gyt~~__*tga*__~*****vla**xnd**__**yuq**crwlho____ywq______~*~*~~uvt~~*__ioa__~**~mfm~*shk**~~frp~~~vgd~**~*~~~*jzb*~~*__jez__*tzf~dbk__~uzs~__kok*__~~ygr~~xip__~~chq~~__yqz__**__blq____~ptztru~__~bzu~bgn__**maw**__~____quu__*~__osw__~__yfd__**__*oiz*__*~fth~**__****rvs***____wwi____~odr~____*~fji__**cch***~*mjp*~*__*hmy~__~zzg~__thh~*frjqdu~~~~__*dro*____*~jlw~__*dzq*__*__~*tcf*~*qwc*__~gok~__~sxx***ruj***~__dgj*__*~uuz~*________eiu____wle__***__~mmf~__**hmz__zur~iag*__gni__~yjq~~*buj*~*bak~*bns______jga____wumuzo____vib~__fjs__~__*~aor~~glw~*____qqq____ruh______ymj~trv~jrb__*vua~qzs__~wqt__~nio~__~*~*oht*~*~~__~__~mtw~__~____tfq__*__**ere**bgq**~vau~__~znz~____****fqg****~*whv*~**~jad~*yhk__pxk~cqa~htwpmh~hme~__acr__yos__~bne~__tdy______*zrv__qewrcl~fer~*oui*__ddb__gij~__~vur~__~lkp~~*__exw__qgt*__*__*ddq**jej*zfm~~__*gxi*__~**xaj**ovj~*__jgg__~~~dkf~~~*~*opw*~~__fda__~*****__~__**efk**__~__*~~*~~~imr~~~*~____vcd__hkk__pid__vkk~__*~fzr~*__*pbb*~__~~__kru__oaptif*fad*brf**~~zhb~*tvc*~thi~~pzw~*pri~**eyj***ykw*~__*puj*__*~____ygd__*~jrs~*__*__qry__*~~~*~opz~__cjp______drq__*aty*________~rps~____ceo__~~~~elq~~~~snniuw__~pun~*aga*__~drm____~tus~heq____yyu__*~*zzy*~*__~owa__zwo__nkk~*~~~lzo~~__*nbr*__~*__*ijo*__~*lly*~**~*vkg*~**~__*haz*__lkzisy*ayc"

  lazy val MESSAGES_EXAMPLE_TEST_RESULT: String =
    s"""#0 I don't particularly care which interaction they pick so long as it's consistent.
       | #1 Exactly, both is fine but do pick one.
       |  #2 Riot consistency
       | #3 Bad bot
       |#4 I think it should be 4x1 damage always
       | #5 Yeah, because you're pulling X number of puffcaps, that doesn't mean one puffcap deals X damage, it's X puffcaps deal 1 damage.
       | #6 I think 1xShrooms
       |  #7 I agree, but I'm also scared of swain stunning 4 charas at the start of the turn lol.
       |  #8 So swain should stun multiple people right?
       |""".stripMargin
  lazy val MESSAGES_COMPLEX_TEST_RESULT: String =
    s"""#0 0-0
       | #1 0-1
       |  #3 0-2
       |   #6 0-3
       |    #10 0-4
       |    #11 1-4
       |    #12 2-4
       | #2 1-1
       |  #5 2-2
       |   #9 3-3
       |   #8 2-3
       |    #16 1-5
       |    #17 2-5
       |  #4 1-2
       |   #7 1-3
       |    #15 0-5
       |    #13 3-4
       |     #18 3-5
       |      #19 4-5
       |       #20 5-5
       |    #14 4-4
       |""".stripMargin
}
