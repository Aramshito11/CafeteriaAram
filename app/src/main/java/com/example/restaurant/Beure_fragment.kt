package com.example.restaurant

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Beure_fragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bebidaAdapter: BebidaAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beure_fragment, container, false)

        val listaBebida: List<Bebida> = BebidaList.bebida()

        recyclerView = view.findViewById(R.id.recyclerViewBebida)

        recyclerView.layoutManager = LinearLayoutManager(activity)

        bebidaAdapter = BebidaAdapter(listaBebida)

        recyclerView.adapter = bebidaAdapter

        return view
    }
}