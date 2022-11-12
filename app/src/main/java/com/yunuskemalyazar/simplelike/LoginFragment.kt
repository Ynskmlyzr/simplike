package com.yunuskemalyazar.simplelike

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yunuskemalyazar.simplelike.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            tvAccountCreat.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
            }
            btnSing.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment)
            }

        }
    }
}