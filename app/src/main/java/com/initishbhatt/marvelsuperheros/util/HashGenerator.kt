package com.initishbhatt.marvelsuperheros.util

import timber.log.Timber
import java.math.BigInteger
import java.security.MessageDigest
import javax.inject.Inject

/**
 * @author nitishbhatt
 */
interface HashGenerator {
    fun buildMD5Digest(message: String): String
}

class HashGeneratorImpl @Inject constructor() : HashGenerator {
    override fun buildMD5Digest(message: String): String {
        return try {
            val messageDigest = MessageDigest.getInstance("MD5")
            val bytes = messageDigest.digest(message.toByteArray())
            val bigInteger = BigInteger(1, bytes)
            var md5 = bigInteger.toString(16)
            while (md5.length < 32) {
                md5 = "0$md5"
            }
            md5
        } catch (e: Throwable) {
            Timber.e("Error hashing required parameters:${e.message}")
            ""
        }

    }

}