package com.example.eldenring



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.eldenring.ui.CharacterDetailFragement
import com.example.namespace.R
import java.lang.Character


class CharacterAdapter(private val characters: MutableList<com.example.eldenring.Character>) :
    RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
        return CharacterViewHolder(view) { position ->
            val character = characters[position]

            val bundle = bundleOf(
                "name" to character.name,
                "hp" to character.hp,
                "image" to character.image,
                "category" to character.category,
                "location" to character.Location,
                "detail" to character.DeTail
            )

            val detailFragment = CharacterDetailFragement()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        Glide
            .with(holder.itemView.context)
            .load(character.image)
            .into(holder.characterImage)

        holder.characterName.text = character.name
        holder.characterAge.text = character.hp
    }

    inner class CharacterViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val characterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterAge: TextView = itemView.findViewById(R.id.character_age)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }
}