package com.wwc.whatdidilearn.data

import com.wwc.whatdidilearn.entities.ItemLearned
import com.wwc.whatdidilearn.entities.Level

class DataBaseItem {
    fun getAll(): List<ItemLearned>{
        val itemOne = ItemLearned("kotlin Null Safety",
            "o sistema de tipos de kotlinvisa eliminar o perigo de referências nulas no código",
             Level.HIGH
        )
        val itemTwo = ItemLearned("Layout Editor",
            "O desing editor exibe o layout em vários dispositivos e versões do android",
             Level.HIGH
        )
        val itemTree = ItemLearned("Git",
            "o sistema de tipos de kotlinvisa eliminar o perigo de referências nulas no código",
             Level.HIGH
        )
        val itemFour = ItemLearned("Group View",
            "o sistema de tipos de kotlinvisa eliminar o perigo de referências nulas no código",
             Level.HIGH
        )

        return listOf(itemOne, itemTwo, itemTree, itemFour)
    }
}