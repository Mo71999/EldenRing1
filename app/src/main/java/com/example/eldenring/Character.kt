package com.example.eldenring

data class Character(
    val name: String,
    val hp: String,
    val image: Int,
    val Region: String,
    val id: Int,
    val relation: List<Int>
)