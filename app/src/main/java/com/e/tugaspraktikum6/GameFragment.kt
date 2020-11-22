package com.e.tugaspraktikum6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.e.tugaspraktikum6.databinding.FragGameBinding

import android.app.Activity
import android.media.MediaPlayer

class GameFragment : Fragment() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater:
        LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragGameBinding>(
            inflater,
            R.layout.frag_game,
            container,
            false
        )
        val mediaPlayer = MediaPlayer.create(context, R.raw.sweet_cat)
        mediaPlayer.start()
        mediaPlayer.seekTo(5)
        binding.submitButton.setOnClickListener { view: View ->
            val checkedId =
                binding.questionRadioGroup.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.firstAnswerRadioButton -> answerIndex = 0
                    R.id.secondAnswerRadioButton -> answerIndex = 1
                    R.id.thirdAnswerRadioButton -> answerIndex = 2
                    R.id.fourthAnswerRadioButton -> answerIndex = 3
                }
                if (answerIndex == 1) {
                    view.findNavController()
                        .navigate(R.id.action_gameFragment_to_gameWonFragment)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_gameFragment_to_gameOverFragment)
                }
            }
        }
        return binding.root
    }
}