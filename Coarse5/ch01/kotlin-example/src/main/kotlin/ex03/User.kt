package org.example.ex03

class User (
    var name: String,
    var age: Int
) {
    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }
}