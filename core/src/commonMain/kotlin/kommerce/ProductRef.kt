package kommerce

import kotlinx.serialization.Serializable

@Serializable
data class ProductRef(
    override val uid: String,
    override val name: String
) : Offerable