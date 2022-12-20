package lambda


import kotlin.random.Random

fun main(){
    val posts = listOf(
        InstagramPost(0,Picture(generateRandomData(256)), { it.data }),
        InstagramPost(1, listOf(Picture(generateRandomData(256)),Picture(generateRandomData(256)))
        ) { pictures -> pictures
            .map { it.data }
            .fold(byteArrayOf()) { acc, item -> acc + item } },
        InstagramPost(2, Video(generateRandomData(1024)),{it.data}),
    )
    println(posts)

    val downloadContent = posts.map { post->post.download() }.map { it.size }
    println(downloadContent)
}

fun generateRandomData(length: Int): ByteArray = Random.nextBytes(length)


class Picture(val data: ByteArray){

}

class Video(val data: ByteArray){

}

class InstagramPost<T>(private val id: Long, private val content: T,val downloader:(T) -> ByteArray) {
    override fun toString(): String {
        return "InstagramPost(id=$id, content=$content)"
    }
    fun download():ByteArray = downloader(content)

}