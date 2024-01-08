package com.example.restaurant.Login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginVM : ViewModel() {
    val loginModel = MutableLiveData<LoginModel>()
    val loginList = LoginList();
    val usuaris = loginList.llista()

    fun comprovacio(usuario: String, contrasenya: String): Boolean{
        for (i in usuaris){
            if (i.usuario == usuario && i.contrasenya == contrasenya){
                loginModel.postValue(i)
                return true
            }
        }

        return false
    }
}