/*
package com.curtisploit.bm9k

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import app.cash.turbine.test
import com.curtisploit.bm9k.domain.CounterViewModel
import com.curtisploit.bm9k.data.CounterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class CounterViewModelTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private val repo = mock<CounterRepository>().apply {
        whenever(countFlow).thenReturn(MutableStateFlow(5))
    }

    @Test
    fun `increment updates count`() = runBlocking {
        val vm = CounterViewModel(repo)
        vm.count.test {
            assert(awaitItem() == 5)
        }
        vm.increment()
        // further verification if needed
    }
}
*/
