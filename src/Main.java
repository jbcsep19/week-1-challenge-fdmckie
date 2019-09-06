import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String weekendActivity;
        String activitySub = "";
        String activitySub2 = "";
        String activitySub3 = "";
        String activitySub4 = "";

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("Please enter weekend activity: 'Movie, Music, Bar, Restaurant, or Outdoors' ");
        weekendActivity = input.next();
        System.out.println();

        //System.out.println(weekendActivity);


        //begin conditional statement(s) if "movie" is selected

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.isEmpty()) {
            System.out.println("Who are you going out with? 'Girls, Guys, or Mixed'");
            activitySub = input.next();
            System.out.println();

        }

        //System.out.println(weekendActivity + " " + activitySub);


        //begin conditional statements if "movie" and "girls" is selected
        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("girls") && activitySub2.isEmpty()) {
            System.out.println("What mood of a movie do you want to experience? 'Tearjerker, Laughing, Scary'");
            activitySub2 = input.next();
            System.out.println();

        }

        //System.out.println(weekendActivity + " " + activitySub + " " + activitySub2);

        //begin conditional statements if "movie", "girls" and "tearjerker" are selected

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("girls") && activitySub2.equalsIgnoreCase("Tearjerker") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see a romance movie ? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'The Notebook'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Brian's Song");
                System.out.println();
            }
        }

                //System.out.println(weekendActivity + " " + activitySub + " " + activitySub2 + " " + activitySub3 );





        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("girls") && activitySub2.equalsIgnoreCase("Laughing") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see a romcom movie ? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'When Harry Met Sally'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Rough Night'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("girls") && activitySub2.equalsIgnoreCase("Scary") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see blood and guts? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Friday the 13th' or 'Saw' ");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Scary Movie' or 'Scream'");
                System.out.println();
            }
        }


        //begin conditional statements if "movie" and "boys" is selected
        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("guys") && activitySub2.isEmpty()) {
            System.out.println("What mood of a movie do you want to experience? 'Buddy, Laughing, Scary'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("guys") && activitySub2.equalsIgnoreCase("buddy") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see an action movie ? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Lethal Weapon'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'My Baby's Daddy'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("guys") && activitySub2.equalsIgnoreCase("Laughing") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see an teen movie ? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Ferris Bueller's Day Off'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Hall Pass'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("guys") && activitySub2.equalsIgnoreCase("scary") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see lots of gore? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Friday The 13th' or 'Texas Chainsaw Massacre'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Scream'");
                System.out.println();
            }
        }



        //begin conditional statements if "movie" and "mixed" is selected
        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("mixed") && activitySub2.isEmpty()) {
            System.out.println("What mood of a movie do you want to experience? 'Romance, Laughing, Scary'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("mixed") && activitySub2.equalsIgnoreCase("romance") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see a love story? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Friends With Benefits'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Gladiator'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("mixed") && activitySub2.equalsIgnoreCase("laughing") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see a romantic comedy? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'When Harry Met Sally'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Fist Fight'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("movie") && activitySub.equalsIgnoreCase("mixed") && activitySub2.equalsIgnoreCase("scary") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see lots of gore? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Alien(s)'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a movie similar to 'Halloween'");
                System.out.println();
            }
        }

        //end condition statements involving "Movie"






        //begin conditional statement(s) if "music" is selected


        while (weekendActivity.equalsIgnoreCase("music") && activitySub.isEmpty()) {
            System.out.println("How do you want to hear the music? 'Live or DJ'");
            activitySub = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("music") && activitySub.equalsIgnoreCase("live") && activitySub2.isEmpty()) {
            System.out.println("What mood of a movie do you want to experience? 'Arena or Bar'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("music") && activitySub.equalsIgnoreCase("live") && activitySub2.equalsIgnoreCase("arena") && activitySub3.isEmpty()) {
            System.out.println("Do you want to see the live music in a large arena ? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a live music event at 'Capital One Arena' or 'FedEx Field'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a live music event at 'Jiffy Lube Live' or 'Merriweather Post Pavilion'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("music") && activitySub.equalsIgnoreCase("live") && activitySub2.equalsIgnoreCase("bar") && activitySub3.isEmpty()) {
            System.out.println("Do you want to hear Jazz or R&B music? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a live music event at 'Blues Alley' or 'Howard Theater'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a live music event at 'The Hamiltion' or 'Songbyrd Cafe'");
                System.out.println();
            }
        }



        while (weekendActivity.equalsIgnoreCase("music") && activitySub.equalsIgnoreCase("DJ") && activitySub2.isEmpty()) {
            System.out.println("What type of music do you want to hear? 'Electronic' or 'Rap'");
            activitySub2 = input.next();
            System.out.println();

        }



        while (weekendActivity.equalsIgnoreCase("music") && activitySub.equalsIgnoreCase("DJ") && activitySub2.equalsIgnoreCase("electronic") && activitySub3.isEmpty()) {
            System.out.println("Do you want be around a bunch of 'kids'? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a venue like 'Flash' or 'Echostage'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a venue like '18th Street Lounge'");
                System.out.println();
            }
        }


        while (weekendActivity.equalsIgnoreCase("music") && activitySub.equalsIgnoreCase("DJ") && activitySub2.equalsIgnoreCase("rap") && activitySub3.isEmpty()) {
            System.out.println("Do you want be around a bunch of 'kids'? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a venue like 'Rosebar' or 'Opera Ultra House'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a venue like 'The Park'");
                System.out.println();
            }
        }

        // end of "music" selection



        //begin "restaurant" selection

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.isEmpty()) {
            System.out.println("What type of cuisine do you want? 'European, Asian, or Latin-American'");
            activitySub = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("European") && activitySub2.isEmpty()) {
            System.out.println("From what region in Europe? 'Western-Mediterrean', 'Balkan-Southern', or 'Central-Eastern'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("European") && activitySub2.equalsIgnoreCase("Western-Mediterrean") && activitySub3.isEmpty()) {
            System.out.println("Do you want Italian food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Fiola Mare' or 'Amalfi'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Euro-grill', 'Le Diplomate' or 'Jaleo'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("European") && activitySub2.equalsIgnoreCase("Balkan-Southern") && activitySub3.isEmpty()) {
            System.out.println("Do you want Greek food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Ambrosia' or 'Zaytinya'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Ambar Capitol Hill', or 'Cafe Divan'");
                System.out.println();
            }
        }


        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("European") && activitySub2.equalsIgnoreCase("Central-Eastern") && activitySub3.isEmpty()) {
            System.out.println("Do you want Russian food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Mari Vanna'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Old Europe-Mozart Cafe', 'Berlin Cafe', or 'Bistro Bohem' ");
                System.out.println();
            }
        }


        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("Asian") && activitySub2.isEmpty()) {
            System.out.println("From what region in Asia? 'Central' or 'South-East'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("Asian") && activitySub2.equalsIgnoreCase("Central") && activitySub3.isEmpty()) {
            System.out.println("Do you want Persian food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Yekta', 'Shamshiry' or 'Alborz Restaurant'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Silk Road Choyhona'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("Asian") && activitySub2.equalsIgnoreCase("South-East") && activitySub3.isEmpty()) {
            System.out.println("Do you want Japanese food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Ziki Japanese Steakhouse' or 'Sakura'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Tara Thai', 'Cafe Asia', or 'Honey Pig'");
                System.out.println();
            }
        }


        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("Latin-American") && activitySub2.isEmpty()) {
            System.out.println("From what region? 'Central' or 'South'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("Latin-American") && activitySub2.equalsIgnoreCase("Central") && activitySub3.isEmpty()) {
            System.out.println("Do you want Mexican food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Guapos', 'Mi Rancho'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'El Tamorindo'");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("restaurant") && activitySub.equalsIgnoreCase("Latin-American") && activitySub2.equalsIgnoreCase("South") && activitySub3.isEmpty()) {
            System.out.println("Do you want Brazilian food? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Chima' or 'Charbroil Grill Brazilian Steakhouse'");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may be looking for a restaurant like 'Rincon Peruano' or 'Kantuta's'");
                System.out.println();
            }
        }

        //end "restaurant" selection


        //Movie, Music, Bar, Restaurant, or Outdoors
        //begin "Outdoors" selection

        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.isEmpty()) {
            System.out.println("What type of environment? 'Mountains' or 'Coastal'");
            activitySub = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.equalsIgnoreCase("Mountains") && activitySub2.isEmpty()) {
            System.out.println("Do you want to be near a body of water? 'Y' or 'N'");
            activitySub2 = input.next();
            System.out.println();

        }


        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.equalsIgnoreCase("Mountains") && activitySub2.equalsIgnoreCase("Y") && activitySub3.isEmpty()) {
            System.out.println("Want to do some physical activity? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to try rafting on the New River");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to rent a cabin along Deep Creek Lake and do some fishing");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.equalsIgnoreCase("Mountains") && activitySub2.equalsIgnoreCase("N") && activitySub3.isEmpty()) {
            System.out.println("Want to do some physical activity? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to try hiking along the Appaliachian Trail");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to drive your car along Skyline Drive");
                System.out.println();
            }
        }





        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.equalsIgnoreCase("Coastal") && activitySub2.isEmpty()) {
            System.out.println("Do you want to be in the ocean? 'Y' or 'N'");
            activitySub2 = input.next();
            System.out.println();

        }


        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.equalsIgnoreCase("Coastal") && activitySub2.equalsIgnoreCase("Y") && activitySub3.isEmpty()) {
            System.out.println("Want to do some physical activity? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to try to rent a Jet-ski");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to rent a boat and watch others do some deep-sea fishing");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("Outdoors") && activitySub.equalsIgnoreCase("Coastal") && activitySub2.equalsIgnoreCase("N") && activitySub3.isEmpty()) {
            System.out.println("Want to do some physical activity? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to do some swimming along the coastline");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to work on your tan and lie on the beach");
                System.out.println();
            }
        }



        //end "Outdoors" selection

        //begin "Bar" selection

        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.isEmpty()) {
            System.out.println("What type of environment? 'Indoors' or 'Outdoors'");
            activitySub = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.equalsIgnoreCase("Indoors") && activitySub2.isEmpty()) {
            System.out.println("What theme or environment? 'typical' or 'unique'");
            activitySub2 = input.next();
            System.out.println();

        }

        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.equalsIgnoreCase("Indoors") && activitySub2.equalsIgnoreCase("typical") && activitySub3.isEmpty()) {
            System.out.println("Want to hear music? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to try Studebakers for retro music");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to Stetson's or Chadwick's for some local flavor");
                System.out.println();
            }
        }


        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.equalsIgnoreCase("Indoors") && activitySub2.equalsIgnoreCase("unique") && activitySub3.isEmpty()) {
            System.out.println("Want to hear music? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to try The Dubliner for a Guniness and Irish music");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to go to Brickskeller to sample the hundreds of beers on tap and in bottles");
                System.out.println();
            }
        }


        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.equalsIgnoreCase("Outdoors") && activitySub2.isEmpty()) {
            System.out.println("What theme or environment? 'typical' or 'unique'");
            activitySub2 = input.next();
            System.out.println();

        }


        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.equalsIgnoreCase("Outdoors") && activitySub2.equalsIgnoreCase("typical") && activitySub3.isEmpty()) {
            System.out.println("Want to hear music? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want to try The Brixton which also has a rooftop");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to try the rooftop at Public Bar Live during the daytime hours");
                System.out.println();
            }
        }

        while (weekendActivity.equalsIgnoreCase("Bar") && activitySub.equalsIgnoreCase("Outdoors") && activitySub2.equalsIgnoreCase("unique") && activitySub3.isEmpty()) {
            System.out.println("Want to hear music? 'Enter 'Y' or 'N'");
            activitySub3 = input.next();

            if (activitySub3.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("You may want the rooftop at either Eaton Hotel or Rock and Roll Hotel");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("You may want to try Biergarten Haus or Sauf Haus Bier Hall");
                System.out.println();
            }
        }



        System.out.println(weekendActivity + " " + activitySub + " " + activitySub2 + " " + activitySub3 );




    } //end Main















}
