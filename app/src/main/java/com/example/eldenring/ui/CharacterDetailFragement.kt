package com.example.eldenring.ui

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.namespace.R


class CharacterDetailFragement : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_character_detail, container, false)
        //println(Resources.getSystem().getIdentifier("morgott", "mipmap", "android"))
        if (arguments != null) {
            val name = requireArguments().getString("name")
            val age = requireArguments().getInt("hp")
            val image = requireArguments().getInt("image")
            val cateGory = requireArguments().getString("category")
            val loCation = requireArguments().getString("location")
            val deTail = requireArguments().getString("detail")
            Glide.with(this).load(image).into(view.findViewById(R.id.imageView))
            view.findViewById<TextView>(R.id.character_name).text = name
            view.findViewById<TextView>(R.id.character_category).text = cateGory
            view.findViewById<TextView>(R.id.character_location).text = loCation
            view.findViewById<TextView>(R.id.character_details).text = deTail


        }

        return view
    }
}