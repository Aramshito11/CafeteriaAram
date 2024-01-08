package com.example.restaurant.Login

class LoginList {

    fun llista(): List<LoginModel>{
        return usuaris;
    }
    companion object{
        private val usuaris = listOf(
            LoginModel(
                usuario = "Aram",
                contrasenya = "12345",
                DNI = "12341234W",
                edat = 19
            ),
            LoginModel(
                usuario = "Dani",
                contrasenya = "54321",
                DNI = "12122323Q",
                edat = 11
            ),
            LoginModel(
                usuario = "Arnau",
                contrasenya = "12345",
                DNI = "89785634K",
                edat = 22
            ),
            LoginModel(
                usuario = "Enaitz",
                contrasenya = "54321",
                DNI = "54671322T",
                edat = 34
            ),
        )
    }
}