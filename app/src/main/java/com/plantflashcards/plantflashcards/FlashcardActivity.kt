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
import com.plantflashcards.plantflashcards.dto.Plant

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

    fun onButton4Clicked(v: View) {
        val ONE_MINUTE = 60000;
        var FIFTEEN_SECONDS = ONE_MINUTE/4;
        Toast.makeText(this, "You clicked me!", Toast.LENGTH_LONG).show()
        var j = 1 + 1
        var foo:String? = "bar";
        var length = foo?.length ?: 10
        var redbud = Plant(1, "Cercis", "canadensis", "", "Eastern Redbud", 5)
    }

    inner class GetPlantsActivity : AsyncTask<String, Int, List<Plant>>() {

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
        override fun doInBackground(vararg p0: String?): List<Plant> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            // open a network connection to our JSON data feed: http://plantplaces.com/perl/mobile/flashcard.pl

            // parse the raw data into a set of Plant objects.

            // add the plant objects to a collection.

            // return the collection.
        }

    }

}
