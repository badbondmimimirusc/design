This presented collection of packages under the strategy directory are meant to show case
the strategy design pattern. 

The strategy design pattern works utilizing polymorphism and inheritance. In order to create
this pattern follow the below steps :
1. Create the super class that you wish to have possess an ability that can change.
2. Create the interface that you wish to implement in multiple ways.
3. Implement the interface in multiple ways, aka, use the strategies.
4. Now add the Interface to the super class as a field.
5. Next, create the subclasses of the superclass and create a constructor. In the constructor
set the inherited interface to the appropriate implementation.


When is this useful?

Use the strategy design pattern when you have a group of similar classes but you want them to
vary in how they perform a certain ability. This is better than simply implementing it on the
sub class level because if multiple sub classes share the same abilties you will have duplicate
code.

Map to use strategy:

Group of similar classes : yes -> 
vary in abilities : yes -> 
some abilities will be shared : yes ->
use strategy