package com.example.fashionstore.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
    private lateinit var  binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(layoutInflater)

        Handler(Looper.getMainLooper()).postDelayed({
            if(isOnBoardingFinished()){
                findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
            }
            else{
                findNavController().navigate(R.id.action_welcomeFragment_to_onboardFragment)
            }

        }, 3000)
        val anim =AnimationUtils.loadAnimation(binding.root.context, R.anim.zoom_out)
        binding.textView.startAnimation(anim)
        binding.textDescription.startAnimation(anim)

        return binding.root
    }

    private fun isOnBoardingFinished():Boolean{
        val sharedPreference = requireActivity().getSharedPreferences("onBoardingPref", Context.MODE_PRIVATE)
        return sharedPreference.getBoolean("isFinished", false)
    }


}