package com.example.appinterface

class Cliente (private var Documento_Cliente: String = "DocCliente",
               private var Nombre_Cliente: String = "NombreCli",
               private var Apellido_Cliente: String = "ApellidoCli",
               private var Telefono: String = "TelCliente",
               private var Fecha_Nacimiento: String = "FechaCli",
               private var Genero: String = "GeneroCli",
               private var ID_Estado: String = "EstadoCli"){

    fun Cliente (DocCliente: String, NombreCli: String, ApellidoCli: String, TelCliente: String,
                 FechaCli:String, GeneroCli: String, EstadoCli: String) {
        this.Documento_Cliente = DocCliente
        this.Nombre_Cliente = NombreCli
        this.Apellido_Cliente = ApellidoCli
        this.Telefono = TelCliente
        this.Fecha_Nacimiento = FechaCli
        this.Genero = GeneroCli
        this.ID_Estado = EstadoCli
    }

    fun getDocumento_Cliente(): String {return Documento_Cliente}
    fun getNombre_Cliente (): String {return Nombre_Cliente}
    fun getApellido_Cliente (): String {return Apellido_Cliente}
    fun getTelefono (): String {return Telefono}
    fun getFecha_Nacimiento (): String {return Fecha_Nacimiento}
    fun getGenero (): String {return Genero}
    fun getID_Estado (): String{return ID_Estado}

}