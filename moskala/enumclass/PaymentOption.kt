package moskala.enumclass

import moskala.statements.println
import java.math.BigDecimal

enum class PaymentOption {
    CASH,
    CARD,
    TRANSFER,
}

enum class Payment(val commission: BigDecimal) {
    CASH(BigDecimal.ONE),
    CARD(BigDecimal.TEN),
    TRANSFER(BigDecimal.ZERO)
}
fun printOption(option: PaymentOption) {
    println(option)
}
fun main() {
    val option: Array<PaymentOption> = PaymentOption.values()
    option.forEach { it.println()}
    for (i in option){
        println(i)
    }
    val paymentOptions = enumValues<PaymentOption>()
    val paymentOptions1 = enumValueOf<PaymentOption>("CASH")

    val optionNew = PaymentOption.TRANSFER
    println(optionNew.name) // TRANSFER
    println(optionNew.ordinal) // 2

    println(Payment.CARD.commission) // 10
    println(Payment.TRANSFER.commission) // 0
    val payment: Payment =
        Payment.values().random()
    println(payment.commission) // 0, 1 or 10
}