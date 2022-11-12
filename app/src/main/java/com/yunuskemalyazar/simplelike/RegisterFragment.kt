package com.yunuskemalyazar.simplelike

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yunuskemalyazar.simplelike.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            btnCreat.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
            }
            tvSingIn.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
            }
            imgBackRegister.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
            }
        }
    }
}