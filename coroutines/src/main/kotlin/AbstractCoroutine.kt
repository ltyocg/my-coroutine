import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext

abstract class AbstractCoroutine<in T>(
    parentContext: CoroutineContext
) : Job, Continuation<T>, CoroutineScope {
    @Suppress("LeakingThis")
    final override val context: CoroutineContext = parentContext + this
    override val coroutineContext: CoroutineContext get() = context
}