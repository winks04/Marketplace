package com.example.marketplace

import com.google.gson.Gson

class UserList{
    val userList: List<UserData> = Gson().fromJson(users, Array<UserData>::class.java).asList()
    val avatarMap: MutableMap<Int, Int> = mutableMapOf()
    val userMap: MutableMap<String, Int> = mutableMapOf()

    init {
        avatarMap[0] = R.drawable.akshat
        avatarMap[1] = R.drawable.joseph
        avatarMap[2] = R.drawable.roselene
        avatarMap[3] = R.drawable.lexie
        avatarMap[4] = R.drawable.alexander
        avatarMap[5] = R.drawable.maximillion

        userMap["eVbz3kWZELUOgtgcE1i2kho4MVh1"] = 0
        userMap["1az8S3bXN4fnNcuVesKrqh1E6rC3"] = 1
        userMap["4E0qedIm2EZU1pC6Nj3OsXYZSjQ2"] = 2
        userMap["wJqDWByavdRnAUmU6DbGOw5cQ6l2"] = 3
        userMap["9OuLe8C2pAdkPeV5WvrC5m6h3YJ2"] = 4
        userMap["Xlsuew3d3phW08KV5kgd0Dm9ACx1"] = 5
    }
}

data class UserData(
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val zip: String,
    val phone: String,
    val rating: Float,
    val status: String
)

val users = """
    [
        {
            "id": 0,
            "name": "akshat",
            "email": "akshat14@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "6175993771",
            "rating": 3.5,
            "status": "1"
            
        },
        {
            "id": 1,
            "name": "joseph",
            "email": "joseph@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 3.7,
            "status": "1"
        },
        {
            "id": 2,
            "name": "Roselene",
            "email": "winks@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 3.2,
            "status": "1"
        },
        {
            "id": 3,
            "name": "Lexie Meager",
            "email": "lexie@syr.edu",
            "password": "123456",
            "zip": "13210",
            "phone": "123456789",
            "rating": 4.3,
            "status": "1"
        },
        {
            "id": 4,
            "name": "Alexander Sustache",
            "email": "alex@syr.edu",
            "password": "123456",
            "zip": "13210",
            "phone": "123456789",
            "rating": 1.7,
            "status": "1"
        },
        {
            "id": 5,
            "name": "Maximillion Blumetti",
            "email": "max@syr.edu",
            "password": "123456",
            "zip": "13210",
            "phone": "123456789",
            "rating": 2.7,
            "status": "1"
        }
    ]
""".trimIndent()
