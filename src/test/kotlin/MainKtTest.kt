import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculate_VKPay() {
        val card = "VK Pay"
        val pay = 7500.0 * 100
        val monthly = 7500.0 * 100

        val result = commissionCalculate(
            cardType = card,
            payment = pay,
            monthlyTotal = monthly)

        assertEquals(0, result)
    }


    @Test
    fun commissionCalculate_MasterCard_default() {
        val card = "MasterCard"
        val pay = 74500.0 * 100
        val monthly = 74500.0 * 100

        val result = commissionCalculate(
            cardType = card,
            payment = pay,
            monthlyTotal = monthly)

        assertEquals(0, result)
    }

    @Test
    fun commissionCalculate_MasterCard_condition() {
        val card = "MasterCard"
        val pay = 75500.0 * 100
        val monthly = 75500.0 * 100

        val result = commissionCalculate(
            cardType = card,
            payment = pay,
            monthlyTotal = monthly)

        assertEquals(45320, result)
    }

    @Test
    fun commissionCalculate_Visa_default() {
        val card = "Visa"
        val pay = 7.5 * 100
        val monthly = 7.5 * 100

        val result = commissionCalculate(
            cardType = card,
            payment = pay,
            monthlyTotal = monthly)

        assertEquals(3500, result)
    }

    @Test
    fun commissionCalculate_Visa_condition() {
        val card = "Visa"
        val pay = 7500.0 * 100
        val monthly = 7500.0 * 100

        val result = commissionCalculate(
            cardType = card,
            payment = pay,
            monthlyTotal = monthly)

        assertEquals(45000, result)
    }


}