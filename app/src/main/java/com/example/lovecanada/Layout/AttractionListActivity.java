package com.example.lovecanada.Layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.lovecanada.R;
import com.example.lovecanada.adapeters.CanadaAttractionAdapter;
import com.example.lovecanada.models.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    private RecyclerView rvCadAttraction;
    private ArrayList<CanadaAttraction> canadaAttractions;
    private CanadaAttractionAdapter canadaAttractionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCadAttraction = findViewById(R.id.rvCadAttraction);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Canada Attraction");

        actionBar.show();
        actionBar.show();
        bindData();
        canadaAttractionAdapter = new CanadaAttractionAdapter(canadaAttractions);
        StaggeredGridLayoutManager str = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        rvCadAttraction.setLayoutManager(str);
        rvCadAttraction.setAdapter(canadaAttractionAdapter);

    }
   public void bindData()
   {
    canadaAttractions = new ArrayList<CanadaAttraction>();
    canadaAttractions.add(new CanadaAttraction(1,"Stanley Park","Vancouver","Vancouver","BC","Stanley Park is a lush peninsula of " +
            "huge trees adjacent to Downtown Vancouver. If you are looking to get outside and enjoy some nature, " +
            "this is the best place to visit in Vancouver. A paved seawall path encircles the green space and is a " +
            "wonderful place to explore on foot or by bicycle.", R.drawable.park1));

       canadaAttractions.add(new CanadaAttraction(2,"Granville Island","Vancouver","Vancouver","BC",
               "The Granville Island Public Market is one of " +
                       "the most popular attractions selling fruit and vegetables, " +
                       "seafood, and a great variety of other specialties as well as " +
                       "ready-to-eat items. Not truly an island, the arts hub is linked to " +
                       "residential areas by one road and footbridges to the south, and to the Downtown " +
                       "peninsula (across False Creek) by ferry.", R.drawable.ab));
       canadaAttractions.add(new CanadaAttraction(3,"Grouse Mountain","Vancouver","Vancouver","BC",
               "Tn both winter and summer, Grouse Mountain offers " +
                       "an unmatched panorama in clear weather. " +
                       "That's especially so in the evenings when the city lights are on.", R.drawable.ac));
       canadaAttractions.add(new CanadaAttraction(4,"Museum of Anthropology","Vancouver","Vancouver",
               "BC","Part of the University of British Columbia, " +
               "the Museum of Anthropology deals with cultures " +
               "from around the world, but places particular " +
               "emphasis on British Columbia First Nations." +
               "Exhibits display native art, including large totem poles in the Great Hall", R.drawable.ad));

       canadaAttractions.add(new CanadaAttraction(5,"Kitsilano Beach","Vancouver","Vancouver4","BC",
               "The sandy shoreline of Kitsilano Beach defines the laid-back, " +
                       "fun-loving Vancouver lifestyle. It's a place locals hang out " +
                       "with friends or take a dip in the outdoor heated " +
                       "seawater swimming pool. The wide beach here is popular " +
                       "with sun bathers in the summer.", R.drawable.ae));
       canadaAttractions.add(new CanadaAttraction(6," Gastown","Vancouver","Vancouver","BC",
               "The oldest part of the city, Gastown is an area " +
                       "of restaurants, galleries, and shops set in carefully " +
                       "restored Victorian buildings. Heritage structures, cobblestone " +
                       "streets, and iron lampposts give the district its distinctive " +
                       "atmosphere. Gastown is a short walk from Canada Place.", R.drawable.af));
       canadaAttractions.add(new CanadaAttraction(7," Canada Place","Vancouver","Vancouver",
               "BC","Canada Place is where your trip begins. " +
               "The unusual roof design creates the impression of a huge sailing " +
               "vessel. The architecturally remarkable structure is part cruise " +
               "ship terminal, part convention center and hotel, and part hub for " +
               "sightseeing bus tours", R.drawable.ag));

       canadaAttractions.add(new CanadaAttraction(8,"Chinatown","Vancouver","Vancouver","BC",
               "TBeyond the ornate Millennium Gate marking its entrance," +
                       " Vancouver's exotic and interesting Chinatown features modern " +
                       "buildings amid many older ones dating from Victorian times.", R.drawable.ah));
       canadaAttractions.add(new CanadaAttraction(9," English Bay","Vancouver","Vancouver","BC",
               "Oceanfront English Bay centers on one of the city's" +
                       " loveliest and busiest beaches. Part of the West End " +
                       "neighborhood, English Bay offers shopping and high-end " +
                       "restaurants, but is also a popular outdoor area where people come to walk, " +
                       "bike, rollerblade, or hang out with the public art installations.", R.drawable.ai));

       canadaAttractions.add(new CanadaAttraction(10,"Capilano Suspension Bridge","Vancouver","Vancouver",
               "BC","Vancouver's first tourist attraction opened in 1889" +
               " and has been thrilling visitors with its swaying bridge over a plummeting " +
               "canyon ever since. The footbridge spans a 70-meter deep river canyon leading " +
               "to an activity park filled with forest trails and a treetop walk " +
               "through old-growth giants.", R.drawable.aj));

       canadaAttractions.add(new CanadaAttraction(11,"Robson Street","Vancouver","Vancouver","BC",
               "Robson Street is best known for shopping. But international brand " +
                       "names aside, it's also the setting for many inventive Vancouver happenings." +
                       "The main hub of activity on Robson Street is centered between Burrard " +
                       "and Jarvis Streets. Over these three blocks, you'll find over " +
                       "150 stores and restaurants..", R.drawable.ak));
       canadaAttractions.add(new CanadaAttraction(12,"Museum of Vancouver","Vancouver","Vancouver",
               "BC",
               "In Vanier Park near Burrard Bridge, the Museum of " +
                       "Vancouver is a large institution devoted to all things" +
                       " Vancouver. It covers the city history from the first " +
                       "Coast Salish communities to Japantown, Kitsilano hippie days, " +
                       "and urban development.", R.drawable.al));
       canadaAttractions.add(new CanadaAttraction(13,"Queen Elizabeth Park","Vancouver","Vancouver",
               "BC","The center of Queen Elizabeth Park, " +
               "Little Mountain, marks the highest point in Vancouver, " +
               "and its elevated position affords excellent views of the city " +
               "center and the mountains to the north." +
               "Things to do in the park include pitch-and-putt golf, " +
               "tennis, disc golf, and visiting the extensive outdoor arboretum. " +
               "If the day is grey and cool, escape to the tropical environment of the Bloedel Conservatory.", R.drawable.am));

       canadaAttractions.add(new CanadaAttraction(14,"Science World","Vancouver","Vancouver","BC",
               "The futuristic sphere-like building of Science World is " +
                       "home to a child-friendly exploration center that explains " +
                       "phenomena through 12 hands-on exhibits and demonstrations. " +
                       "Themes include water, air, motion, and invention. One of the " +
                       "highlights is catching a show on the five-story-high OMNIMAX " +
                       "screen, the world's largest domed screen.", R.drawable.an));
       canadaAttractions.add(new CanadaAttraction(15," Richmond","Vancouver","Vancouver","BC",
               "South of Vancouver, Richmond is Vancouver's second Chinatown, " +
                       "hence you'll see many shops with Chinese characters on their signs. I" +
                       "f you crave authentic Chinese food, you are in the right spot. Hundreds " +
                       "of restaurants line the streets, serving delicious food", R.drawable.ao));

   }
}
