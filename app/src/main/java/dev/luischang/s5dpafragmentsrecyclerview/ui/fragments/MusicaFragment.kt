package dev.luischang.s5dpafragmentsrecyclerview.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.luischang.s5dpafragmentsrecyclerview.R
import dev.luischang.s5dpafragmentsrecyclerview.ui.adapter.SongAdapter
import dev.luischang.s5dpafragmentsrecyclerview.ui.model.Song


class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_musica, container, false)
        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(listSongLinkinPark())

        return view
    }

    private fun listSongLinkinPark(): List<Song>{
        val lstSong: ArrayList<Song> = ArrayList()

        lstSong.add(Song(1,R.drawable.intheend,"In the end","Hybrid Theory","20,000","3:36"))
        lstSong.add(Song(2,R.drawable.numb,"Numb","Meteora","18,000","3:06"))
        lstSong.add(Song(3,R.drawable.whativedone,"What I've done","Minutes to Midnight","19,500","3:25"))
        lstSong.add(Song(4,R.drawable.onestepcloser,"One Step Closer","Hybrid Theory","14,000","2:37"))
        lstSong.add(Song(5,R.drawable.castleofglass,"Castle of Glass","Living Thins","5,000","3:25"))

        return lstSong
    }





}