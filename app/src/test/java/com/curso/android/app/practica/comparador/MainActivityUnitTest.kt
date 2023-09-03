package com.curso.android.app.practica.comparador

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Before

class MainActivityTest {

    private lateinit var mainActivity: MainActivity

    @Before
    fun setUp() {
        mainActivity = MainActivity()
    }

    @Test
    fun testCompareTexts_WhenTextsAreEqual() {
        val text1 = "Hello"
        val text2 = "Hello"
        val expectedResult = "Los textos son iguales."

        val result = mainActivity.compareTexts(text1, text2)

        assertEquals(expectedResult, result)
    }

    @Test
    fun testCompareTexts_WhenTextsAreDifferent() {
        val text1 = "Hello"
        val text2 = "World"
        val expectedResult = "Los textos son diferentes."

        val result = mainActivity.compareTexts(text1, text2)

        assertEquals(expectedResult, result)
    }
}
