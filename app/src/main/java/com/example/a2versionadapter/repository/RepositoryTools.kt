package com.example.a2versionadapter.repository

import com.example.a2versionadapter.model.TheTools

class RepositoryTools() {
    fun getListTools ():List<TheTools>{
        return listOf(
        TheTools("Martelo", "Marcenaria", "Tramontina", "6 Meses"),
        TheTools("Chave de Fenda", "Manutenção", "Stanley", "30 Dias"),
        TheTools("Alicate", "Eletricidade", "Vonder", "30 Dias"),
        TheTools("Serra", "Marcenaria", "Makita", "1 Ano"),
        TheTools("Nível de Bolha", "Construção", "Bosch", "30 Dias"),
        TheTools("Parafusadeira", "Manutenção", "Dewalt", "2 Anos"),
        TheTools("Chave Inglesa", "Mecânica", "Gedore", "7 Dias"),
        TheTools("Multímetro", "Eletricidade", "Minipa", "1 Ano"),
        TheTools("Esquadro", "Construção", "Starrett", "Sem garantia"),
        TheTools("Grampeador", "Estofaria", "Rocama", "7 Dias")
        )
    }
}
