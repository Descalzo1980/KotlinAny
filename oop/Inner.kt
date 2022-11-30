package oop

import java.text.FieldPosition

fun main() {
    val listView = ListView(arrayOf("Name 1","Name 2","Name 3","Name 4"))
    listView.ListViewItems().displayItem(2)
}

class ListView(val items : Array<String>){



    inner class ListViewItems(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }

}


