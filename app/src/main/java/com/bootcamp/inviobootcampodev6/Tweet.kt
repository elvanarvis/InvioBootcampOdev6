package com.bootcamp.inviobootcampodev6

import java.io.Serializable

data class Tweet(var profilFoto: String,
                 var name: String,
                 var profTik: Boolean,
                 var nickName: String,
                 var time: String,
                 var paragraf: String,
                 var fotoVarMı: Boolean,
                 var foto: String,
                 var yorum: String,
                 var retweet: String,
                 var kalp: String) : Serializable {
}