package com.example.android.aicartapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
    tableName = "artworks"
)

data class Artwork(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

)
