package com.example.eldenring

data class Character(
    val name: String,
    val hp: String,
    val image: Int,
    val category: String,
    val Location: String,
    val DeTail: String,
    val id: Int,
    val relation: List<Int>
)