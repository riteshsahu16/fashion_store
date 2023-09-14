package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        binding.txtSignup.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }

        binding.imgBack.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        binding.txtForgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }

        binding.btnLogin.setOnClickListener {
            if(validate()){
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            }
        }

        return binding.root
    }

    private fun validate():Boolean{
        with(binding){
            if(!android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.text).matches()){
                etEmail.error = "Invalid Email Address"
                return false
            }
            if(etPassword.text!!.length < 8 ){
                etPassword.error = "Minimum 8 character required!"
                return false
            }
        }

        return true
    }

}