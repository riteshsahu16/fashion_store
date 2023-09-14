package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentVerificationBinding

class VerificationFragment : Fragment() {
   private lateinit var binding:FragmentVerificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentVerificationBinding.inflate(layoutInflater)
        binding.btnVerify.setOnClickListener {
            findNavController().navigate(R.id.action_verificationFragment_to_homeFragment)
        }
        binding.imgBack.setOnClickListener {
            findNavController().navigate(R.id.action_verificationFragment_to_registrationFragment)
        }
        return binding.root
    }


}