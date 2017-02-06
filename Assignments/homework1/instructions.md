Title 	Assignment #1

Due 	Feb 13, 2017 11:55 pm

 - Status 	Not Started
 - Grade Scale 	Points (max 100.0)
 - Modified by instructor 	Feb 4, 2017 9:58 am

**Instructions**

Attached is the airport simulation code that I demonstrated in class.  This is written in java however if wish you can convert it to Python or C++ if you'd rather work with either of those languages.  Everyone must make the following additions to the simulation:

* Add an airplane class.  It should have at minimum properties of speed and maximum passinger capacity.  Feel free to add other properties you feel are important.

* You need to add an Airplane parameter for the Airport events so you know which plane the event is related to.

* Pick 5 airports in the world and add them to the simulator.  You'll need the distance between them to calculate flight time for each flight.

* For each plane departure, select a remote airport and use some sort of random distribution to calculate the number of passengers on the flight.

* For each airport, keep stats on the number of passengers arriving and departing.  Also sum the total amount circling time for each airport.  This is time where an airplane is ready to land but is waiting for an opening

* Adjust the simulator to run for an appropriate period and adjust timings (timeToLand, timeOnGround etc) accordingly

* Develop a queuing system to ensure planes are not arriving and taking off at the same time on a single runway.

Along with your code submission, you must include a writeup describing your additions, justifying your design choices, and providing references on where you obtained the information you used in your simulation.  Also include the results you obtained from the simulation.  Run the simulation multiple times, increasing the number of airplanes and reporting the total number of passengers delivered and total amount of circular time at each airport.  The total amount of simulation time for each run should allow for each plane to take off and land multiple times.  Your report can also include anything else you find interesting.  Graphs are great for reports.  Include a Future Work section where you can suggest future improvement that could be made on the model.

Use the IEEE template for your report:
[IEEE Transaction Templates Archive](https://www.ieee.org/conferences_events/conferences/publishing/templates.html)

Make sure in your final submission your code does not output random debugging data.  The only output should be single lines for each event describing what is happening similar to what is provided in the demo code.

Have fun!
Brian
