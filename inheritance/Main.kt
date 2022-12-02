package inheritance

fun main() {
    val view = View()
    view.draw()

    val button = Button("Push","vertical")
    button.draw()

    val roundButton = RoundButton("Push","horizontal",20)
    roundButton.draw()
}
