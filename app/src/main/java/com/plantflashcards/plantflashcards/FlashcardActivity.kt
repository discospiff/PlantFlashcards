package com.plantflashcards.plantflashcards

import android.os.AsyncTask
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.plantflashcards.plantflashcards.dto.Photo
import com.plantflashcards.plantflashcards.dto.Plant
import com.plantflashcards.plantflashcards.service.PlantService

class FlashcardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_flashcard, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    fun onButton1Clicked(v: View) {
        var foo:String? = "bar"
        var size = foo?.length ?: 0
        var i = 1 + 1

    }

    fun onButton2Clicked(v: View) {
        // declare collection
        var allPlants = ArrayList<Plant>()

        // create an object of a plant.
        var redbud = Plant(83,"Cercis", "canadensis", "", "Eastern Redbud")
        allPlants.add(redbud)
        var pawpaw = Plant(100, "Asimina", "triloba", "Alleghany", "Alleghany Pawpaw", 10)
        allPlants.add(pawpaw)

        var i = 1 + 1
    }

    fun onButton3Clicked(v: View) {
        // create an object of our inner AsyncTask class.
        var getPlantsActivity = GetPlantsActivity()
        // the method called execute will start a new thread, and THEN invoke
        // doInBackground on that new thread.
        getPlantsActivity.execute("1")

    }

    fun onButton4Clicked(v: View) {
        val ONE_MINUTE = 60000;
        var FIFTEEN_SECONDS = ONE_MINUTE/4;
        Toast.makeText(this, "You clicked me!", Toast.LENGTH_LONG).show()
        var j = 1 + 1
        var foo:String? = "bar";
        var length = foo?.length ?: 10
        var redbud = Plant(1, "Cercis", "canadensis", "", "Eastern Redbud", 5)
    }

    inner class GetPlantsActivity : AsyncTask<String, Int, List<Plant>?>() {

        /**
         * Has access to the user interface thread, and the components of the
         * encolsing activity.
         * In this method, we can update the screen based on the data retrieved in
         * the background thread.
         */
        override fun onPostExecute(result: List<Plant>?) {
            super.onPostExecute(result)
        }

        /**
         * this method runs on a separate thread, so it can perform networking operations
         * without impacting our User Interface experience.
         * @param p0: an idication of the plant types for which we want flashcards.
         * @return A collection of populated Plant objects, where those plants were populated from our JSON data stream.
         */
        override fun doInBackground(vararg p0: String?): List<Plant>? {
            // get the difficulty from the incoming parameter as the first argument of the array.
            var difficulty = p0[0]

            // create an object of PlantService
            var plantService = PlantService()

            // invoke another function.
            return plantService.parsePlantsFromJSONData(difficulty)

        }

    }



}
