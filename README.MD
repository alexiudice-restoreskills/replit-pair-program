# Java Pair Programming Exercise

We'll run through this pair programming exercise together.

Please write code and documentation as you would when programming for a professional setting. 

## Multi-Currency Invoice Calculator

We will build a service that calculates the total cost of items in different currencies, 
applies currency exchange rates, returns a final invoice total in the desired output currency, 
and prints an itemized invoice in the desired currency type.

We'll use Test-Driven Development to guide our development.
Create unit tests that are responsible testing our methods.

### Requirements
1. Store Item Information
   1. Accept an item name, price (numerical) and a currency code (USD, EUR, JPY, GBP, CNY, CZK).
1. Set Exchange Rates
   1. Create/use a data structure to hold exchange rates
1. Final Invoice Total
   1. Create a method that gets the total invoice amount in desired currency type.
1. Final Invoice Print
   1. Print an itemized invoice sorted by cost in desired currency type
1. Ability to handle errors due to bad input