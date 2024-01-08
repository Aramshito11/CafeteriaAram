package com.example.restaurant

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Comida_fragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var comidaAdapter: ComidaAdapter
    private lateinit var sharedViewModel: SharedVM

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menjar, container, false)

        val listaComida: List<Comida> = ComidaList.menjar()

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedVM::class.java)

        recyclerView = view.findViewById(R.id.recyclerViewComida)

        recyclerView.layoutManager = LinearLayoutManager(activity)

        comidaAdapter = ComidaAdapter(listaComida) { comida ->
            sharedViewModel.agregarProducto(comida)
        }

        recyclerView.adapter = comidaAdapter

        return view
    }
}

