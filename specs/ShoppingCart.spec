Basic Shopping Cart
=====================
Created by gauge on 6/8/15

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

* Navigate to shoppe homepage
![img](../resources/_homepage.jpg)

Add items to basket
-------------------

* Add item "Yealink T20P" to my basket
![img](../resources/_additem.jpg)

* Check if my basket has item "Yealink T20P"
![img](../resources/_checkProductExists.jpg)

* Check if total price is "$75.59"
![img](../resources/_checkTotal.jpg)

Checkout an item
----------------
* Add item "Yealink T20P" to my basket
![img](../resources/_additem.jpg)

* Checkout cart with default address
![img](../resources/_checkout.jpg)

* Make payment with card number "68628348" and security code "789"
![img](../resources/_makePayment.jpg)

* Confirm order submission
![img](../resources/_checkIfOrderIsPlaced.jpg)
