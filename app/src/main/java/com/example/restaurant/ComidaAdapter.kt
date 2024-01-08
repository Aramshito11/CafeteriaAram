package com.example.restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComidaAdapter(private val listaComida: List<Comida>,
                    private val onItemClick: (Comida) -> Unit)
    : RecyclerView.Adapter<ComidaAdapter.ComidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menjar_recylceview, parent, false)
        return ComidaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        val comida = listaComida[position]

        holder.imageViewComida.setImageResource(comida.imagen)
        holder.textViewNombre.text = comida.nombre
        holder.textViewDescripcion.text = comida.descripcion
        holder.textViewPrecio.text = "Preu: ${comida.precio}€"

        holder.itemView.setOnClickListener {
            onItemClick(comida)
        }
    }

    override fun getItemCount(): Int {
        return listaComida.size
    }

    class ComidaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewComida: ImageView = itemView.findViewById(R.id.imageViewComida)
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
        val textViewDescripcion: TextView = itemView.findViewById(R.id.textViewDescripcion)
        val textViewPrecio: TextView = itemView.findViewById(R.id.textViewPrecio)
    }
}
