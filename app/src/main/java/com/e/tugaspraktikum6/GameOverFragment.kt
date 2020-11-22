package com.e.tugaspraktikum6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.e.tugaspraktikum6.databinding.FragGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragGameOverBinding =
            DataBindingUtil.inflate(inflater, R.layout.frag_game_over, container, false)
        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
        return binding.root
    }
}