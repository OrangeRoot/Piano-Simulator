package com.example.mypiano

class SamplesData(number: Int) {
    private val quaver: Long = 300
    private val sampl1 = arrayOf(Pair(7, quaver*2), Pair(4, quaver*2), Pair(4, quaver*2), Pair(5, quaver*2), Pair(2, quaver*2), Pair(2, quaver*2), Pair(0, quaver), Pair(4, quaver), Pair(7, quaver*4), Pair(7, quaver*2), Pair(4, quaver*2), Pair(4, quaver*2), Pair(5, quaver*2), Pair(2, quaver*2), Pair(2, quaver*2), Pair(0, quaver), Pair(4, quaver), Pair(0, quaver*4),
                         Pair(0, quaver*2), Pair(4, quaver*2), Pair(4, quaver*2), Pair(5, quaver*2), Pair(2, quaver*2), Pair(2, quaver*2), Pair(0, quaver), Pair(4, quaver), Pair(7, quaver*4), Pair(7, quaver*2), Pair(4, quaver*2), Pair(4, quaver*2), Pair(5, quaver*2), Pair(2, quaver*2), Pair(2, quaver*2), Pair(0, quaver), Pair(4, quaver), Pair(0, quaver*4))
    private val sampl2 = arrayOf(Pair(-1, quaver*3), Pair(7, quaver), Pair(12, quaver), Pair(15, quaver),
            Pair(14, quaver), Pair(12, quaver), Pair(15, quaver), Pair(12, quaver),Pair(14, quaver), Pair(12, quaver),Pair(8, quaver), Pair(10, quaver),
            Pair(7, quaver*4), Pair(-1, quaver),Pair(7, quaver), Pair(12, quaver), Pair(15, quaver),
            Pair(14, quaver), Pair(12, quaver),Pair(15, quaver), Pair(12, quaver), Pair(14, quaver), Pair(12, quaver),Pair(7, quaver), Pair(6, quaver),
            Pair(5, quaver*4), Pair(-1, quaver),Pair(5, quaver), Pair(8, quaver), Pair(11, quaver),
            Pair(14, quaver*4), Pair(-1, quaver),Pair(5, quaver), Pair(8, quaver), Pair(11, quaver),
            Pair(12, quaver*4), Pair(-1, quaver),Pair(0, quaver), Pair(3, quaver), Pair(10, quaver),
            Pair(8, quaver), Pair(7, quaver),Pair(10, quaver), Pair(8, quaver), Pair(8, quaver), Pair(7, quaver),Pair(7, quaver), Pair(11, quaver),Pair(12, quaver*8))
    private val sampl3 = arrayOf(Pair(15,quaver ), Pair(10,quaver), Pair(7,quaver),Pair(15,quaver), Pair(10,quaver),Pair(7,quaver),Pair(15,quaver), Pair(10,quaver),         Pair(13,quaver),Pair(10,quaver), Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver) ,         Pair(13,quaver),Pair(10,quaver), Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),           Pair(12,quaver),Pair(8,quaver), Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),
                         Pair(15,quaver ), Pair(10,quaver), Pair(7,quaver),Pair(15,quaver), Pair(10,quaver),Pair(7,quaver),Pair(15,quaver), Pair(10,quaver),         Pair(13,quaver),Pair(10,quaver), Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver) ,         Pair(13,quaver),Pair(10,quaver), Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),           Pair(12,quaver),Pair(8,quaver), Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),
                         Pair(15,quaver*2 ), Pair(15,quaver*2), Pair(15,quaver*2),Pair(15,quaver),Pair(12,quaver),           Pair(13,quaver), Pair(12,quaver*2), Pair(10,quaver*4),Pair(-1,quaver),       Pair(13,quaver*2 ), Pair(13,quaver*2), Pair(13,quaver*2),Pair(13,quaver),Pair(10,quaver),           Pair(12,quaver), Pair(10,quaver*2), Pair(8,quaver*4),Pair(-1,quaver),
                         Pair(15,quaver*2 ), Pair(15,quaver*2), Pair(15,quaver*2),Pair(15,quaver),Pair(12,quaver),           Pair(13,quaver), Pair(12,quaver*2), Pair(10,quaver*4),Pair(-1,quaver),       Pair(13,quaver*2 ), Pair(13,quaver*2), Pair(13,quaver*2),Pair(13,quaver),Pair(10,quaver),           Pair(12,quaver), Pair(10,quaver*2), Pair(8,quaver*4),Pair(-1,quaver),
                         Pair(15,quaver ), Pair(10,quaver), Pair(7,quaver),Pair(15,quaver), Pair(10,quaver),Pair(7,quaver),Pair(15,quaver), Pair(10,quaver),         Pair(13,quaver),Pair(10,quaver), Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver) ,         Pair(13,quaver),Pair(10,quaver), Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),           Pair(12,quaver),Pair(8,quaver), Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),
                         Pair(15,quaver*2 ), Pair(15,quaver*2), Pair(15,quaver*2),Pair(15,quaver),Pair(12,quaver),           Pair(13,quaver), Pair(12,quaver*2), Pair(10,quaver*4),Pair(-1,quaver),       Pair(13,quaver*2 ), Pair(13,quaver*2), Pair(13,quaver*2),Pair(13,quaver),Pair(10,quaver),           Pair(12,quaver), Pair(10,quaver*2), Pair(8,quaver*4),Pair(-1,quaver),
                         Pair(-1,quaver*6), Pair(1,quaver*2),       Pair(1,quaver*2), Pair(8,quaver*4), Pair(6,quaver),Pair(5,quaver),      Pair(3,quaver*2), Pair(2,quaver), Pair(3,quaver),Pair(5,quaver*4),
                         Pair(-1,quaver*6), Pair(1,quaver*2),       Pair(1,quaver*2), Pair(8,quaver*4), Pair(6,quaver),Pair(5,quaver),      Pair(3,quaver*2), Pair(2,quaver), Pair(3,quaver),Pair(5,quaver*4),
                         Pair(15,quaver),Pair(10,quaver),Pair(7,quaver),Pair(15,quaver),Pair(10,quaver),Pair(7,quaver),Pair(15,quaver),Pair(10,quaver),           Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),          Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),         Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),
                         Pair(15,quaver),Pair(10,quaver),Pair(7,quaver),Pair(15,quaver),Pair(10,quaver),Pair(7,quaver),Pair(15,quaver),Pair(10,quaver),           Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),          Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),Pair(5,quaver),Pair(13,quaver),Pair(10,quaver),         Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),Pair(5,quaver),Pair(12,quaver),Pair(8,quaver),
                         Pair(20,quaver),Pair(19,quaver),Pair(15,quaver),Pair(20,quaver),Pair(19,quaver),Pair(15,quaver),Pair(20,quaver),Pair(19,quaver),         Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),        Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),       Pair(20,quaver),Pair(19,quaver),Pair(12,quaver),Pair(20,quaver),Pair(19,quaver),Pair(12,quaver),Pair(20,quaver),Pair(19,quaver),
                         Pair(20,quaver),Pair(19,quaver),Pair(15,quaver),Pair(20,quaver),Pair(19,quaver),Pair(15,quaver),Pair(20,quaver),Pair(19,quaver),         Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),        Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),Pair(13,quaver),Pair(20,quaver),Pair(19,quaver),       Pair(20,quaver),Pair(19,quaver),Pair(12,quaver),Pair(20,quaver),Pair(19,quaver),Pair(12,quaver),Pair(20,quaver),Pair(19,quaver),
                         Pair(20,quaver),Pair(19,quaver),Pair(12,quaver),Pair(20,quaver),Pair(19,quaver),Pair(12,quaver),Pair(20,quaver),Pair(19,quaver),         Pair(20,(quaver*1.5).toLong()),Pair(19,(quaver*1.5).toLong()),Pair(12,(quaver*1.5).toLong()),Pair(20,(quaver*1.5).toLong()),Pair(19,(quaver*1.5).toLong()),Pair(12,(quaver*1.5).toLong()),Pair(20,(quaver*1.5).toLong()),Pair(19,quaver*4)
                )
    private val sampl4 = arrayOf(Pair(9,quaver/2),Pair(14,quaver/2),Pair(9,quaver/2),Pair(16,quaver/2),Pair(9,quaver/2),Pair(17,quaver/2),   Pair(9,quaver/2),Pair(14,quaver/2),Pair(9,quaver/2),Pair(16,quaver/2),Pair(9,quaver/2),Pair(17,quaver/2),Pair(9,quaver/2),Pair(19,quaver/2),        Pair(9,quaver/2),Pair(16,quaver/2),Pair(9,quaver/2),Pair(17,quaver/2),Pair(9,quaver/2),Pair(19,quaver/2),Pair(9,quaver/2), Pair(21,quaver/2),           Pair(9,quaver/2),Pair(17,quaver/2),Pair(9,quaver/2),Pair(19,quaver/2),Pair(9,quaver/2),Pair(21,quaver/2),Pair(9,quaver/2),Pair(22,quaver/2)    ,Pair(9,quaver/2),Pair(19,quaver/2),Pair(9,quaver/2),Pair(21,quaver/2),Pair(9,quaver/2),Pair(17,quaver/2),Pair(9,quaver/2),Pair(19,quaver/2),Pair(9,quaver/2),Pair(16,quaver/2),Pair(9,quaver/2),Pair(17,quaver/2),Pair(9,quaver/2),Pair(14,quaver/2),Pair(9,quaver/2),Pair(16,quaver/2),Pair(9,quaver/2),Pair(13,quaver/2),Pair(9,quaver/2),Pair(14,quaver/2),      Pair(9,quaver/2),Pair(9,quaver/2),    Pair(9,quaver/2),Pair(10,quaver/2),Pair(9,quaver/2),Pair(7,quaver/2),Pair(9,quaver/2),Pair(9,quaver/2),Pair(9,quaver/2),Pair(5,quaver/2),Pair(9,quaver/2),Pair(7,quaver/2),Pair(9,quaver/2),Pair(4,quaver/2),Pair(9,quaver/2),Pair(5,quaver/2),Pair(9,quaver/2),Pair(2,quaver/2),Pair(9,quaver/2),Pair(4,quaver/2),Pair(9,quaver/2),Pair(1,quaver/2),Pair(9,quaver/2),Pair(2,quaver*4) )
    private val samples = arrayOf(sampl1,sampl2,sampl3,sampl4)
    val sampleToPlay: Array<Pair<Int,Long>> = samples[number]

}