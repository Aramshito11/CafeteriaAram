package com.example.restaurant.Login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.restaurant.MainActivity
import com.example.restaurant.R
import com.example.restaurant.SharedVM
import com.example.restaurant.databinding.FragmentLoginBinding

class login_fragment : Fragment() {

    private val loginVM: LoginVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentLoginBinding.inflate(inflater)
        val boton = binding.loginButton

        boton.setOnClickListener {
            val shared_model = ViewModelProvider(requireActivity()).get(SharedVM::class.java)

            if (loginVM.comprovacio(binding.usuario.text.toString(), binding.contrasenya.text.toString())==true){
                loginVM.loginModel.observe(viewLifecycleOwner, Observer {
                    shared_model.dades(it)
                })
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(requireContext(), "Credencials incorrectes", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        return binding.root
    }

}


