package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ToggleButton
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentDrawerBinding


class DrawerFragment : Fragment() {
    private lateinit var binding: FragmentDrawerBinding
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDrawerBinding.inflate(layoutInflater)

        toggle = ActionBarDrawerToggle(requireActivity(), binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()



        return binding.root
    }

}