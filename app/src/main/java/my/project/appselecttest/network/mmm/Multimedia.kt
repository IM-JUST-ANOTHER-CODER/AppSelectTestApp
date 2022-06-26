package my.project.appselecttest.network.mmm


import com.google.gson.annotations.SerializedName

data class Multimedia(
    @SerializedName("height")
    val height: Int?,
    @SerializedName("src")
    val src: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("width")
    val width: Int?
)