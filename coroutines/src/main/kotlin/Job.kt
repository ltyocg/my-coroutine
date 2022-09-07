import kotlin.coroutines.CoroutineContext

interface Job : CoroutineContext.Element {
    companion object Key : CoroutineContext.Key<Job>

    override val key: CoroutineContext.Key<*> get() = Job
    val isActive: Boolean
    fun cancel()
    fun attachChild(child: Job): DisposableHandle
    suspend fun join()
    fun invokeOnCompletion(handler: CompletionHandler): DisposableHandle
}

interface DisposableHandle {
    fun dispose()
}