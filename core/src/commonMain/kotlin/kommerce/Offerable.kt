@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kommerce

import identifier.Named
import identifier.Unique
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@Serializable
sealed interface Offerable : Unique, Named {
    val asProduct get() = this as? ProductRef
    val asService get() = this as? ServiceRef
}