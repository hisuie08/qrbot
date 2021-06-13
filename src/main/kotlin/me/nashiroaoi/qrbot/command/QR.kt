package me.nashiroaoi.qrbot.command

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent
import me.nashiroaoi.qrbot.internal.QRBuilder

class QR:Command() {
    init {
        this.name = "qr"
    }
    override fun execute(event : CommandEvent?) {
        //val image = QRBuilder().build("https://google.com").toByteArray()
        //event?.channel?.sendFile(image,"result.png")?.queue()
    }
}