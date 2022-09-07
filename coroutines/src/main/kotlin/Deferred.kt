interface Deferred<out T> : Job {
    suspend fun await(): T
}