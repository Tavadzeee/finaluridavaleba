package com.example.garagefinaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.garagefinaluri.dataclasses.Image

class Testing : AppCompatActivity() {

    private lateinit var button: Button


    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)
        button = findViewById(R.id.button13)

        goToMenu()

        val imageList = listOf<Image>(
            Image(
                R.drawable.georgia,
                "საქართველო",
                "მოსახლეობა - 3.709 მილიონი\n" +
                        "  სახელმწიფო ევრაზიაში, კავკასიაში, შავი ზღვის აღმოსავლეთ სანაპიროზე.\n" +
                        "  საპარლამენტო რესპუბლიკა\n" +
                        "  პრეზიდენტი -სალომე ზურაბიშვილი\n"+
                        " დედაქალაქი - თბილისი\n"
            ),
            Image(
                R.drawable.germanyy,
                "გერმანია",
                " მოსახლეობა - 83.2\n" +
                        " ქვეყანა მდებარეობს ცენტრალურ ევროპაში.\n" +
                        " კონსტიტუციური რესპუბლიკა\n" +
                        "პრეზიდენტი ფრანკ-ვალტერ შტაინმაიერი\n"+
                        "დედაქალაქი - ბერლინი\n"
            ),
            Image(
                R.drawable.francee,
                "საფრანგეთი",
                "მოსახლეობა - 67.75 მილიონი\n" +
                        "  ქვეყანა დასავლეთ ევროპაში\n" +
                        "  კონსტიტუციური რესპუბლიკა\n" +
                        "  პრეზიდენტი ემანუელ მაკრონი\n" +
                        " დედაქალაქი - პარიზი\n"
            ),
            Image(
                R.drawable.italy,
                "იტალია",
                "მოსახლეობა - 59.11 მილიონი\n" +
                        " ქვეყანა სამხრეთ ევროპაში\n" +
                        " საპარლამენტო რესპუბლიკა \n" +
                        " პრეზიდენტი სერჯო მატარელა\n" +
                        "დედაქალაქი რომი\n"
            ),
            Image(
                R.drawable.spain,
                "ესპანეთი",
                "მოსახლეობა - 47.42 მილიონი\n" +
                        " ქვეყანა პირინეის ნახევარკუნძულზე\n" +
                        "კონსტიტუციური მონარქია\n" +
                        " მონარქი ფილიპე VI\n" +
                        " დედაქალაქი მადრიდი\$"
            ),
            Image(
                R.drawable.usa,
                "აშშ",
                " მოსახლეობა - 331.9 მილიონი\n" +
                        " სახელმწიფო მდებარეობს ჩრდილოეთ ამერიკის ცენტრალურ ნაწილში\n" +
                        " საპრეზიდენტო რესპუბლიკა\n" +
                        " პრეზიდენტი ჯო ბაიდენი\n" +
                        "დედაქალაქი ვაშინგტონი \n"
            ),
            Image(
                R.drawable.england,
                "ინგლისი",
                "მოსახლეობა - 55.98 მილიონი\n" +
                        " სახელმწიფო მდებარეობს დიდი ბრიტანეთის კუნძულის სამხრეთ-აღმოსავლეთ ნაწილზე\n" +
                        " საპარლამენტო მმართველობა\n" +
                        "პრემიერ მინისტრი ლიზ ტრასი\n" +
                        " დედაქალაქი - ლონდონი \n"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    private fun goToMenu() {
        button.setOnClickListener() {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()
        }
    }
}