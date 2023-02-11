package com.example.eldenring.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eldenring.CharacterAdapter
import com.example.eldenring.Character
import com.example.namespace.R

class CharacterListFragement : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_character_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<Character>()

        characters.add(Character("RADHAN","HP: 9572",R.mipmap.rad,"Category: Demi-God, known as StarCourage Radhan", "Location: You can find him in Redmane Castle","Radahn was born the son of Radagon, a champion of the Erdtree, and Queen Rennala, ruler of the Academy of Raya Lucaria. He had at least two siblings, Praetor Rykard and Lunar Princess Ranni. Radahn inherited his father's flaming red hair, and was fond of its heroic implications.[3] From a young age, Radahn was enamored with the Elden Lord Godfrey. Attempting to emulate his idol, Radahn adorned his armor with lions, the symbol of Godfrey.[4]\n" +
                "\n" +
                "At some point, the first Elden Lord, Godfrey, was robbed of grace and hounded from the Lands Between. Radahn's father, Radagon, left to become Queen Marika's new consort and the second Elden Lord. Radahn and his siblings were thus raised to demigods by their new step-mother, Marika.\n" +
                "\n" +
                "Radahn grew massive in size, eventually outgrowing his scrawny but beloved steed, Leonard.[5] Not wanting to abandon his horse, Radahn studied gravitational magic in Sellia under a master who was an Alabaster Lord.[6] Mastering gravitational magic allowed Radahn to manipulate the forces of gravity, and to challenge the very stars themselves.[7] Radahn conquered the stars, saving Sellia in the process, using his vast gravitational powers to hold them in place, earning him the moniker of \"Starscourge\".",0,listOf()))
        characters.add(Character("MALENIA","HP: 33000",R.mipmap.malenia,"Category: Demi-God, ", "Location: you can find her near Grand Lift of Rold","",0,listOf()))
        characters.add(Character("RENNALA","HP: 3493",R.mipmap.rennala,"Category: Witch, Known as Rennala queen of the full-moon", "Location: you can find her in Academy of Raya Lucaria","As a young astrologer who gazed at the night sky and always chased the stars,[3] Rennala would encounter an enchanting full moon that would one day bewitch the Academy of Raya Lucaria.[4] During her youth, she would charm the academy with her lunar magic, becoming its master and renowned champion. She also led the Glintstone Knights and established the house of Caria as royalty.[5]\n" +
                "\n" +
                "When Queen Marika the Eternal established her new Age of the Erdtree, she dispatched a champion known as Radagon to lead her armies against Liurnia of the Lakes. Radagon fought two wars against Rennala and the Academy, both of which saw no clear victor. Instead, Radagon renounced his territorial ambitions, repented and married Rennala at the Church of Vows, uniting the houses of the Erdtree and the Moon.[6] Rennala would gift Radagon with a greatsword, traditionally bestowed by a Carian queen upon her spouse.[7][8]\n" +
                "\n" +
                "Together, they had three children: Radahn, Rykard, and Ranni. After Godfrey, the first Elden Lord, was hounded from the Lands Between, Radagon left Rennala's side to become the second husband of Queen Marika, and received the title of second Elden Lord. Queen Marika made Radagon and Rennala's children her demigod stepchildren. When Radagon departed, he gifted Rennala the Great Rune of the Unborn.",0,listOf()))
        characters.add(Character("GODFREY","HP: 21903",R.mipmap.godfray,"Category: Demi-God, known as", "Location: you can find him in Ashen Capital","",0,listOf()))
        characters.add(Character("MORGOTT","HP: 10399",R.mipmap.morgott,"Category: Demi-God, known as Morgott the Omen King", "Location: you can find him in Royal Capital","",0,listOf()))
        characters.add(Character("NIALL","HP: 15541",R.mipmap.nial,"Category: Boss, known as ", "Location: you can find him in the upper level of Castle Sol","",0,listOf()))


        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter

        return view
    }
}