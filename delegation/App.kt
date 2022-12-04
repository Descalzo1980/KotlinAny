package delegation

class App : A by FirstDelegate(),B by SecondDelegate() {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}