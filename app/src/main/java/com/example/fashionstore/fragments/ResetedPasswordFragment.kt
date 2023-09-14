package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentResetedPasswordBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ResetedPasswordFragment : BottomSheetDialogFragment() {

    private lateinit var binding:FragmentResetedPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResetedPasswordBinding.inflate(layoutInflater)
        binding.btnHome.setOnClickListener {
            findNavController().navigate(R.id.action_resetedPasswordFragment_to_homeFragment)
        }
        return binding.root
    }

}