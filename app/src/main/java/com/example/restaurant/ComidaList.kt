package com.example.restaurant

class ComidaList {
    companion object{

        fun menjar(): List<Comida>{
            return comida;
        }

        private val comida = listOf(
            Comida(
                R.drawable.bravas,
                "Patates Braves",
                "Patates caseres de la yaya amb salsa braba",
                3.0
            ),
            Comida(
                R.drawable.croquetas,
                "Croquetes",
                "Les mitiques croquetitas de la yaya.",
                5.80
            ),
            Comida(
                R.drawable.alitas,
                "Aletes de Pollastre",
                "Les aletes de pollastre del hort de la Paqui.",
                4.5
            ),
            Comida(
                R.drawable.bocadillo,
                "Entrepa de Embotit",
                "Tenim tot tipus d'embotit, escull el que mes t'agradi.",
                3.5
            ),
            Comida(
                R.drawable.bacon,
                "Entrepa de Bacon",
                "Bacon tret de la granja de la tia Lola.",
                3.8
            ),
            Comida(
                R.drawable.lomo,
                "Entrepa de Llom",
                "El millor llom de la comarca, el del l'oncle Josep",
                3.8
            ),
            Comida(
                R.drawable.biquini,
                "Biquini",
                "El biquini de tota la vida, no es re del altre mon.",
                3.2
            ),
            Comida(
                R.drawable.croissant,
                "Croissant",
                "Pues eso un coissant",
                2.1
            ),
            Comida(
                R.drawable.pastas,
                "Pasta de la casa",
                "Aixo si que si, feta per la meva dona, una crack.",
                2.5
            ),
        )
    }
}