package Models

import java.io.Serializable

class User (
    val userName : String,
    val email :String,
    val password :String,
    val address :String,
    val mobilNumber : String,
    val birthDate: String
    ): Serializable

