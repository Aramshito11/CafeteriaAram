package com.example.restaurant

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Pagar_Fragment : Fragment() {

    private lateinit var sharedViewModel: SharedVM
    private lateinit var recyclerView: RecyclerView
    private lateinit var textViewTotal: TextView
    private lateinit var pagarAdapter: PagarAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pagar_, container, false)

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedVM::class.java)

        recyclerView = view.findViewById(R.id.recyclerViewPagar)
        textViewTotal = view.findViewById(R.id.textViewTotal)

        pagarAdapter = PagarAdapter()
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = pagarAdapter

        sharedViewModel.productosSeleccionados.observe(viewLifecycleOwner, Observer { productos ->
            pagarAdapter.actualizarLista(productos)

            val total = sharedViewModel.calcularTotal()
            textViewTotal.text = "Total: $total €"
        })

        return view
    }

}
