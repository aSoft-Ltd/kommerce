@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kommerce

import kotlinx.serialization.Serializable
import cabinet.Attachment
import kollections.List
import kotlinx.JsExport

@Serializable
data class ProductRef(
    override val uid: String,
    override val name: String,
    val sku:String? = null,
    val photos: List<Attachment>? = null,
) : Offerable