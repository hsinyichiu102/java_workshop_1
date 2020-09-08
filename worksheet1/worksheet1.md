##worksheet 1##

####Exercise 1 ####
>* Write a class Car with the four field variables make, price, maxSpeed, and colour of types String, int, int, and String, respectively.
>* Write a constructor to create Car objects.
>* Implement all getter and setter methods. 
>
>Furthermore write a
>* public String toString() method that is used for printing objects of class Car in a user friendly
>way. (Note, the toString() method in this exercise WILL NOT BE tested, that is, you have flexibility how to write it.)
>
>Note that you have always to comment and test your programs appropriately, not just for this exercise and not just for this worksheet. We will not write this to the exercises in future.

#### Exercise 2 ####
>* Write a class Film with the three fields private String title, private Date releaseDate, and private int length. Date should be the class defined in the lecture.
>* Write a constructor public Film(String title, Date releaseDate, int length).
>* Write getters for all three fields.
>* Write a setter for the releaseDate.
>* Furthermore write a toString() method that is used for printing objects of type Film in a user friendly way. (Again, the toString() method in this exercise WILL NOT BE tested.)
>
>In the main method create an example object Film adAstra with title "Ad Astra", release date new Date(18, "September", 2019), and length 123 minutes.

#### Exerceise 3 ####
>* Write a class Good. Each Good is represented by its name and its netPrice of types String and double, respectively. The class should contain
>* a constructor,all getters, all setters, and a toString() method (which should return a String as specified in the example below).
>* Furthermore assume a fixed VAT rate of 20 percent stored in a final static double VAT RATE variable. Use this to write a method public double grossPrice(). For example, let us assume a good Good milk = new Good("Milk", 0.50);.
>System.out.println(milk); should give us:
>"The Milk has a gross price of £ 0.60."
>* Write a method public void discount(double rate) that reduces the price of the object by the given rate (between 0 and 100 percent). For instance, after calling the method milk.discount(20); 
> System.out.println(milk); should give us: "The Milk has a gross price of £ 0.48."
>
> Note, in order to display the pound symbol you should NOT use the pound symbol on the keyboard, but
the corresponding unicode symbol, that is, \u00A3.

#### Exerceise 4 ###
>>debug