## Worksheet 3

#### Exercise 1
>Write a class Aircraft.java with the two field variables
>passengerNumber and maxSpeed both of type int with a standard constructor, getter(s), setter(s), and
>a toString method. Furthermore write a subclass Aeroplane.java with the additional field variable
>fuelConsumption of type double. The class should contain a constructor, getter(s) and setter(s), and a
>toString method. Make use of inheritance as far as possible.
>
#### Exercise 2 
>Let two interfaces for the two classes Subscription.java and SubscriptionPrime.java be given as SubscriptionInterface.java and SubscriptionPrimeInterface.java. You find the interfaces in the
archive WS1-04-interfaces.zip on the Canvas page for the worksheet.
>Subscription.java describes the subscription to a journal by the 3 field variables title, email, and cost of types String, String, and int, respectively. The subclass SubscriptionPrime.java has the additional field address of type String, indicating where hard copies of the journal should be sent to. Make use of inheritance as far as possible.
>
#### Exercise 3
>Assume a website for downloading music which has four classes, one for representing a music title, MusicTitle.java, and three for user accounts. The class Account.java is abstract with two subclasses AccountStandard.java for customers, and AccountAdministrator.java for administrators. Each of the four classes is to implement a corresponding interface with the names MusicTitleInterface.java, AccountInterface.java, AccountStandardInterface.java, and AccountAdministratorInterface.java, respectively. 
>
>The class Account has to have five field variables: name, salutation, email, password, and loggedIn of types String, String, String, String, and boolean, respectively.
>The subclass AccountStandard has the field variables balance, titlesBought, and failedLoginAttempts of types int, ArrayList<MusicTitle>, and int, respectively. Furthermore, assume a fixed number of 3 maximal login attempts, stored in a public static final int MAXIMAL LOGIN ATTEMPTS variable.
>The subclass AccountAdministrator has the field variable accounts of type ArrayList<Account>. An administrator shall have the possibility to reset an account of a user by a method public void resetAccount(Account account, String password). The method shall first reset the password. For standard users (and only for standard users) it shall also reset the counter
>failedLoginAttempts of failed login attempts to 0. For the latter, you may make use of account instanceof AccountStandard to check whether the object account is an instance of the subclass AccountStandard. If it is, it is still of type Account, but it can be cast to the type AccountStandard using the standard type casting approach: (AccountStandard) account.
>Make use of inheritance as far as possible.
