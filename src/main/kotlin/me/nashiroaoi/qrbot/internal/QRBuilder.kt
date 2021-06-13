package me.nashiroaoi.qrbot.internal

import net.glxn.qrgen.javase.QRCode
import java.io.ByteArrayOutputStream

class QRBuilder {
    fun build(url:String) : ByteArrayOutputStream {
        return QRCode.from(url).stream()
    }
}