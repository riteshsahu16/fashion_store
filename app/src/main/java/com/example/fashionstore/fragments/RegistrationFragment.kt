package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {
    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(layoutInflater)
        binding.imgBack.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
        binding.btnSubmit.setOnClickListener {
            if(validate()){
                findNavController().navigate(R.id.action_registrationFragment_to_verificationFragment)
            }
        }
        return binding.root
    }

    private fun validate():Boolean{
        with(binding){
            val pass = etPassword.text.toString()
            val confpass = etConfPassword.text.toString()
            if(etName.text!!.length == 0){
                etName.error = "Required Field!"
                return false
            }

            if(!android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.text).matches()){
                etEmail.error = "Invalid Email Address"
                return false
            }
            if(etPassword.text!!.length < 8 ){
                etPassword.error = "Minimum 8 character required!"
                return false
            }
            if(!confpass.equals(pass)){
                etConfPassword.error = "Password Mismatch"
                Toast.makeText(requireContext(), "pass:$pass \t conf:$confpass", Toast.LENGTH_SHORT).show()
                return false
            }

        }

        return true
    }


}