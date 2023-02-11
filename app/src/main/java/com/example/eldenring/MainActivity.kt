package com.example.eldenring

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.eldenring.ui.CharacterListFragement
import com.example.eldenring.ui.CharacterDetailFragement
import com.example.namespace.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, CharacterListFragement())
        }
    }
}