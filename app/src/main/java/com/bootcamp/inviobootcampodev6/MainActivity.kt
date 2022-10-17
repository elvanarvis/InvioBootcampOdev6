package com.bootcamp.inviobootcampodev6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bootcamp.inviobootcampodev6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tweetListesi = ArrayList<Tweet>()

        val t3 =
            Tweet(
                "simone",
                "simone",
                false,
                " @simmoone",
                "5 sa",
                "Günaydın. Güneşlenin",
                true,
                "simone_foto",
                "22",
                "34",
                "1.934"
            )

        val t4 =
            Tweet(
                "laura_viglioni",
                "Laura",
                false,
                " @lauraViglioni",
                "5 sa",
                "Finally... The Github bathroom",
                true,
                "github",
                "1.201",
                "5.600",
                "12.553"
            )

        val t1 =
            Tweet(
                "android",
                "Android",
                true,
                " @Android",
                "2 sa",
                "If your messages aren't secure with everyone, are they really secure at all?",
                true,
                "android_foto",
                "44",
                "120",
                "780"
            )

        val t5 =
            Tweet(
                "ted_evelyn",
                "ted evelyn",
                false,
                " @bented",
                "9 sa",
                "sen poz değiştir kanka ben bir sürü çekiyorum",
                true,
                "ted_evelyn_foto",
                "100",
                "118",
                "5.371"
            )

        val t2 =
            Tweet(
                "film_lovers",
                "FilmLoverss",
                false,
                " @filmoverss",
                "3 sa",
                "Jennifer Coolidge, yapımcılığını Ryan Murphy'nin üstlendiği Naomi Watts ve Bobby Cannavale'lı The Watcher'ın oyuncu kadrosuna dahil oldu.",
                false,
                "",
                "",
                "2",
                "18"
            )


        tweetListesi.add(t1)
        tweetListesi.add(t2)
        tweetListesi.add(t3)
        tweetListesi.add(t4)
        tweetListesi.add(t5)

        binding.rv.layoutManager = LinearLayoutManager(this)

        val adapter = TweetAdapter(this, tweetListesi)
        binding.rv.adapter = adapter
    }
}