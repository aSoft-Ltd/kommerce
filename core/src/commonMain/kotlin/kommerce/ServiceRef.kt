package kommerce

import kotlinx.serialization.Serializable

@Serializable
data class ServiceRef(
    override val uid: String,
    override val name: String
) : Offerable