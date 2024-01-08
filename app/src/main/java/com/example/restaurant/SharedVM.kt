package com.example.restaurant

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurant.Login.LoginModel

class SharedVM : ViewModel(){
    val loginModel = MutableLiveData<LoginModel>()

    fun dades(dades_usuari: LoginModel) {
        loginModel.postValue(dades_usuari)
    }


    private val _productosSeleccionados = MutableLiveData<MutableList<Comida>>()
    val productosSeleccionados: LiveData<MutableList<Comida>> = _productosSeleccionados

    init {
        _productosSeleccionados.value = mutableListOf()
    }

    fun agregarProducto(producto: Comida) {
        val listaActual = _productosSeleccionados.value
        listaActual?.add(producto)
        _productosSeleccionados.value = listaActual!!
    }

    fun calcularTotal(): Double {
        return _productosSeleccionados.value?.sumByDouble { it.precio } ?: 0.0
    }
}