package inheritance

open class Button(val text : String, val orientation : String) : View() {
    override fun draw() {
        println("��� �� ������ ������")
    }
}