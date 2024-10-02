# Multi-Screen App

This is a simple two-screen Android application built using Kotlin. The app allows users to place an order on the first screen and displays the order details on the second screen.

## Features

- **Two Screens**: The app has two main screens, one for placing the order and the other for showing the order summary.
- **Explicit Intents**: Used for navigating between the order screen and the order summary screen.
- **User Input**: The app takes input from the user on the first screen to generate the order summary.

## Screens

1. **Order Screen**: 
    - This is the main screen where users can input their order details (e.g., item name, quantity).
    - A button is provided to submit the order and navigate to the next screen.

2. **Order Summary Screen**: 
    - After the user submits the order, this screen displays the order details provided by the user on the previous screen.

## Project Structure

- **MainActivity.kt**: 
    - Contains the logic for taking the user's order on the first screen.
    - Handles the button click event to send the order details to the second screen using an explicit intent.

- **OrderSummaryActivity.kt**: 
    - Receives the order details from the first screen and displays them in a user-friendly format.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/AdityaHegde06/MultiScreen_App.git
