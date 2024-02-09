# Vehicle Charging Station Simulation
## Overview
This project simulates an electric vehicle (EV) charging station system, designed to manage the charging process of electric cars in a simulated environment. It incorporates various components such as car queue management, energy source management based on weather conditions, a graphical user interface for monitoring the charging process, and handling potential exceptions related to charging.

## Components
- Car.java: Defines the Car class, representing the electric vehicles that will be charged at the station.
- CarQueue.java: Manages a queue of cars waiting to be charged, encapsulating the logic for adding and removing cars from the queue.
- ChargingExceptions.java: Contains custom exceptions that might occur during the charging process, such as errors related to energy source or queue management.
- ChargingStation.java: The core class that simulates the charging station, managing charging slots, and coordinating the charging process of cars in the queue.
- ChargingStationGUI.java: Provides a graphical user interface to visualize the charging station's operation, showing the status of each charging slot and the cars being charged.
- EnergyManagement.java: Manages the energy source for the charging station, which could vary based on external factors like weather conditions.
- Main.java: The entry point of the simulation, setting up the charging station, initializing the components, and starting the simulation.
- Weather.java: Simulates weather conditions that might affect the energy management for the charging station.


