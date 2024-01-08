package com.example.restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BebidaAdapter(private val listaBebida: List<Bebida>) : RecyclerView.Adapter<BebidaAdapter.BebidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BebidaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.beure_recycleview, parent, false)
        return BebidaViewHolder(view)
    }

    override fun onBindViewHolder(holder: BebidaViewHolder, position: Int) {
        val bebida = listaBebida[position]


        holder.imageViewBebida.setImageResource(bebida.imagen)
        holder.textViewNombre.text = bebida.nombre
        holder.textViewDescripcion.text = bebida.descripcion
        holder.textViewPrecio.text = "Preu: ${bebida.precio}€"


        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return listaBebida.size
    }

    class BebidaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewBebida: ImageView = itemView.findViewById(R.id.imageViewBebida)
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
        val textViewDescripcion: TextView = itemView.findViewById(R.id.textViewDescripcion)
        val textViewPrecio: TextView = itemView.findViewById(R.id.textViewPrecio)
    }
}