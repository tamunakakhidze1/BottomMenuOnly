package com.example.fragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragments.R
import com.example.fragments.Zodiac
import com.example.fragments.ZodiacAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val signList = ArrayList<Zodiac>()
        signList.add(Zodiac(1,"https://www.vhv.rs/dpng/d/454-4542043_aries-png-aries-zodiac-sign-png-transparent-png.png", "ვერძი"))
        signList.add(Zodiac(2, "https://w7.pngwing.com/pngs/996/965/png-transparent-aries-symbol-zodiac-logo-taurus-aries-leaf-logo-astrological-sign.png", "კურო"))
        signList.add(Zodiac(3, "https://www.kindpng.com/picc/m/178-1782975_gemini-gemini-icon-png-transparent-png.png", "ტყუპები"))
        signList.add(Zodiac(4, "https://www.pngfind.com/pngs/m/47-476797_drawn-crab-cancer-crab-cancer-zodiac-sign-png.png", "კირჩხიბი"))
        signList.add(Zodiac(5, "https://www.pngkey.com/png/detail/175-1756560_primary-logo-leo-black-icon-astrological-sign-leo.png", "ლომი"))
        signList.add(Zodiac(6, "https://www.kindpng.com/picc/m/487-4877374_virgo-zodiac-sign-logo-hd-png-download.png", "ქალწული"))
        signList.add(Zodiac(7, "https://c0.klipartz.com/pngpicture/300/290/gratis-png-icono-astrologico-del-signo-zodiacal-de-libra-libra.png", "სასწორი"))
        signList.add(Zodiac(8, "https://c0.klipartz.com/pngpicture/316/492/gratis-png-escorpio-signo-astrologico-astrologia-zodiaco-simbolos-astrologicos-escorpio.png", "მორიელი"))
        signList.add(Zodiac(9, "https://www.hitsfm.com.np/wordpress/wp-content/uploads/2016/11/sagittarius.png", "შვილდოსანი"))
        signList.add(Zodiac(10, "https://e7.pngegg.com/pngimages/181/476/png-clipart-capricorn-astrological-sign-astrology-zodiac-cancer-capricorn-love-horse.png", "თხის რქა"))
        signList.add(Zodiac(11, "https://lh3.googleusercontent.com/proxy/hUSSFBy5bsV6AwTmDfoCdnVDQLiB_eJb_I-hOX2dbM7dankRr12DbamNKKjzDgZGboLiSYlWbqvtZ7a0YIC0MXfyW5oqx2YR7gZHOlfNaoNNRH5wR1lLn7lA", "მერწყული"))
        signList.add(Zodiac(12, "https://www.vhv.rs/dpng/d/456-4562122_pisces-zodiac-astrological-sign-symbol-pisces-png-transparent.png", "თევზები"))

        val signAdapter = ZodiacAdapter(signList)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = signAdapter
    }

}