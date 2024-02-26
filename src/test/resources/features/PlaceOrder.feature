Feature: Place order

Scenario: Search single item
Given User is on Home Page
When User search an item "Parry Hotter"
Then Item must be listed

Scenario: Add Item to cart
Given User should be on Search Result Page
When User add item to cart
Then Item must be added

Scenario: Checkout Order
When User do checkout
Then Should navigate to Checkout page