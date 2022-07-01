package dev.davlatov.testing

import com.example.networkinghometasks.networking.retrofit.RetrofitHttp
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkStatusCode() {
        val response = RetrofitHttp.postService.listPost().execute()
        assertEquals(response.code(), 400)
    }

    @Test
    fun responseIsSuccessful() {
        val response = RetrofitHttp.postService.listPost().execute()
        assertTrue(response.isSuccessful)
    }

    @Test
    fun checkPostListNotNull() {
        val response = RetrofitHttp.postService.listPost().execute()
        assertNotNull(response.body())
    }

    @Test
    fun checkPostListSize() {
        val response = RetrofitHttp.postService.listPost().execute()
        val posts = response.body()
        assertEquals(posts!!.size, 100)
    }

    @Test
    fun checkFirstUserId() {
        val response = RetrofitHttp.postService.listPost().execute()
        val posts = response.body()
        val post = posts!![0]
        assertEquals(post.userId, 1)
    }







}