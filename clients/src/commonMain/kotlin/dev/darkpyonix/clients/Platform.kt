package dev.darkpyonix.clients

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform