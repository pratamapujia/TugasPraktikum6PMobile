package com.e.tugaspraktikum6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.e.tugaspraktikum6.databinding.FragGameWonBinding

class GameWonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragGameWonBinding =
            DataBindingUtil.inflate(inflater, R.layout.frag_game_won, container, false)
        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_gameWonFragment_to_titleFragment)
        }
        return binding.root
    }
}