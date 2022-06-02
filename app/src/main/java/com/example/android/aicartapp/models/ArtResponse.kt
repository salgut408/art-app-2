package com.example.android.aicartapp.models

data class ArtResponse(
    val artworks: MutableList<Artwork>,
    val status: String,
    val totalResilts: Int
)
