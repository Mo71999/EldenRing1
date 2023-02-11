package com.example.eldenring

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val characters = mutableListOf<Character>()

        characters.add(Character("RADHAN","HP: 9572",R.mipmap.rad,"Caelid", 0,listOf()))
        characters.add(Character("MALENIA","HP: 33000",R.mipmap.malenia,"Grand Lift of Rold", 0,listOf()))
        characters.add(Character("RENNALA","HP: 3493",R.mipmap.rennala,"Academy of Raya Lucaria", 0,listOf()))
        characters.add(Character("GODFREY","HP: 21903",R.mipmap.godfray,"Ashen Capital", 0,listOf()))
        characters.add(Character("MORGOTT","HP: 10399",R.mipmap.morgott,"Royal Capital", 0,listOf()))
        characters.add(Character("NIALL","HP: 15541",R.mipmap.nial,"Castle Sol", 0,listOf()))

        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter
    }

}
