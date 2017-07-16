# FunctionalProgrammingCoursera
Martin Odersky's Functional Programming in Scala Course on Coursera

Week 1:  
=============================

Exercise 1
-----------------------------
Do this exercise by implementing the pascal function in Main.scala, which takes a column c and a row r, counting from 0 and returns the number at that spot in the triangle. For example, pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3.

Exercise 2
-----------------------------
Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String. For example, the function should return true for the following strings:
  
(if (zero? x) max (/ 1 x))  
I told him (that it’s not (yet) done). (But he wasn’t listening)  
The function should return false for the following strings:  
  
:-)  
())(  

Exercise 3
-----------------------------
Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

Week 2:  
=============================  

Exercise 1  
-----------------------------  
Define a function singletonSet which creates a singleton set from one integer value: the set represents the set of the one given element.  
Now that we have a way to create singleton sets, we want to define a function that allow us to build bigger sets from smaller ones.  
Define the functions union,intersect, and diff, which takes two sets, and return, respectively, their union, intersection and differences. diff(s, t) returns a set which contains all the elements of the set s that are not in the set t.  
Define the function filter which selects only the elements of a set that are accepted by a given predicate p. The filtered elements are returned as a new set.  

Exercise 2  
-----------------------------  
Implement forall using linear recursion. For this, use a helper function nested in forall.  
Using forall, implement a function exists which tests whether a set contains at least one element for which the given predicate is true.    
Note that the functions forall and exists behave like the universal and existential quantifiers of first-order logic.  
Finally, write a function map which transforms a given set into another one by applying to each of its elements the given function.  
