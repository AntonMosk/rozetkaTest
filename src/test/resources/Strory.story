Meta: check prices

Narrative:
As a user
I want to have same prices
So that I will not feel fooled

Scenario: check price on page and in cart
Given a user is on the main page
When he searches for "розетка"
Then search result with products "розетка" appeared
When he opens first product from search
Then product page is opened with price on it
When he adds product to cart
Then product appeared in the cart with the same price