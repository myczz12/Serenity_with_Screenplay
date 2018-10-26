#Author: your.email@your.domain.com
@tag
Feature: Title of your feature
    As a web user
    I want to search a product on Homecenter page
    To see in the shopping cart the product that i selected

  @SearchForProducts
  Scenario: Search for products on Homecenter page
    Given that Casemiro navigate to the homepage of Homecenter
     When he enter in the search box the name of a product
      | productName |
      | lampara led |
     When he clicks the search button
      And he picks a product
      | productIndex |
      |            5 |
     Then he should see the same product in the shopping cart
