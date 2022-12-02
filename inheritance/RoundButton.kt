package inheritance

class RoundButton(text : String, orientation : String,val corners : Int ) : Button(text, orientation) {
    override fun draw() {
        println("Эта кнопка такая круглая")
    }
}