package com.example.restaurant

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PagarAdapter : RecyclerView.Adapter<PagarAdapter.PagarViewHolder>() {

    private var listaProductos: List<Comida> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pagar_recycleview, parent, false)
        return PagarViewHolder(view)
    }

    override fun onBindViewHolder(holder: PagarViewHolder, position: Int) {
        val producto = listaProductos[position]

        holder.textViewNombre.text = producto.nombre
        holder.textViewPrecio.text = "${producto.precio}€"
    }

    override fun getItemCount(): Int {
        return listaProductos.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun actualizarLista(nuevaLista: List<Comida>) {
        listaProductos = nuevaLista
        notifyDataSetChanged()
    }

    class PagarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
        val textViewPrecio: TextView = itemView.findViewById(R.id.textViewPrecio)
    }
}
