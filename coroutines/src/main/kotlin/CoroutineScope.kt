import kotlin.coroutines.CoroutineContext

interface CoroutineScope {
    val coroutineContext: CoroutineContext
}