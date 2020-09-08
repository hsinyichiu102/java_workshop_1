## Worksheet 4

#### Exercise 1
>Using the javafx.scene.shape.Polygon class, write a class Upload.java that displays an upload icon as shown below.
<img src="/Users/hs.chiu/Documents/CS/github/java_workshop_1/worksheet4/figure/1.png " style="zoom 50%"/>

#### Exercise 2
>Write a minimal class Expenditure.java that represents an expenditure with the two field variables
>private String description and private int value. Write a constructor and the getters.
>Note that you can sort an array of type Expenditure from biggest to smallest by the sort method from
>the Java API class java.util.Arrays as follows:
>Arrays.sort(expenditures, (Expenditure exp1, Expenditure exp2) -> exp2.getValue() - exp1.getValue());
>
>Assume that a company uses an array of type Expenditure to represent all its expenditures. You have
>to write a class Waffle.java in order to represent expenditures as a Waffle chart. See, for instance,
> https://en.wikipedia.org/wiki/Pie_chart#Square_chart_/_Waffle_chart.
>
>For an array of up to maximum elements, display all elements (biggest to smallest). For an array with more than maximum elements, display only the maximum-1 biggest ones (biggest to smallest) and accumulate the others summed up as an entry with the description "Other". For instance, with maximum = 8; and expenditures as left below the waffle chart should look like right below (Fig. 2).
>
><img src="/Users/hs.chiu/Documents/CS/github/java_workshop_1/worksheet4/figure/2.png " style="zoom 50%"/>

#### Exercise 3
>Like in exercise 2, we want to represent expenditures, however, this time as a pie chart. Write a class Pie.java to represent all expenditures in a corresponding array of typeExpenditure. Write a method public void start(Stage stage) throws Exception that displays theexpenditures as a pie chart with the description placed next to the corresponding part of the pie chart.
>Take care that the description does not overlap with the pie chart itself.Do not make use of the javafx.scence.shape.PieChart class, but only the two shapes javafx.scene.shape.Circle and javafx.scene.shape.Line. You need also javafx.scence.text.Text.
>For instance, with the values from Exercise 2 your pie chart should look like the figure on the left (Fig. 3). The right figure (Fig. 4) gives an example how the descriptive text should NOT look like.
>
><img src="/Users/hs.chiu/Documents/CS/github/java_workshop_1/worksheet4/figure/3.png " style="zoom 50%"/>
>
