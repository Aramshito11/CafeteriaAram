package com.example.restaurant

class BebidaList {
    companion object{

        fun bebida(): List<Bebida>{
            return beure;
        }

        private val beure = listOf(
            Bebida(
                R.drawable.cafe,
                "Cafe",
                "Tot tipus de cafes.",
                2.2
            ),
            Bebida(
                R.drawable.agua,
                "Agua",
                "Aigua extreta dels nostres pous.",
                1.5
            ),
            Bebida(
                R.drawable.cacaolat,
                "Cacaolat",
                "Boof un cacaolat dels bons.",
                2.5
            ),
            Bebida(
                R.drawable.colacao,
                "Colacao",
                "Amb llet de les vaques de la granja de la tia Lola.",
                1.8
            ),
            Bebida(
                R.drawable.aquarius,
                "Aquarius",
                "Simplement aquarius.",
                2.0
            ),
            Bebida(
                R.drawable.cocacola,
                "Cocacola",
                "Simplement una cocacola.",
                2.0
            ),
            Bebida(
                R.drawable.nestea,
                "Nestea",
                "Simplement un nestea.",
                2.0
            ),
            Bebida(
                R.drawable.fanta,
                "Fanta",
                "Simpelment una fanta.",
                2.0
            ),
            Bebida(
                R.drawable.cubata,
                "Cubata",
                "Tot tipus de cubates amb sabors exotics.",
                5.5
            ),
        )
    }
}