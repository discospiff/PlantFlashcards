package com.plantflashcards.plantflashcards.service

import com.plantflashcards.plantflashcards.dto.Plant

/**
 * Business functions required to process plants.
 * Created by ucint on 8/26/2017.
 */

class PlantService {

    fun parsePlantsFromJSONData(difficulty: String?) : List<Plant>? {
        // declare return type
        var allPlants : ArrayList<Plant> = ArrayList<Plant>()

        var i = 1 + 1
        // open a network connection to our JSON data feed: http://plantplaces.com/perl/mobile/flashcard.pl

        // create a new plant object
        var plant = Plant()

        // parse the raw data into a set of Plant objects.

        // add the plant objects to a collection.
        allPlants.add(plant)


        // return the collection.
        return allPlants
    }

}