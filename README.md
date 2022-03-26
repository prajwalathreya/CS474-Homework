# CS474-Homework


CS474 Spring 2022 - Home Work 1_ Prajwal Athreya Jagadish , Documentation.

#Documentation for my language ScalaSet written in Scala language version 3.1 and using sbt(scala build tool).

ScalaSet can be used by the users to implement binary set operations like Union,Intersection,Difference ,Symmetric Difference and Cartesian product of Sets. My main source code file is named as homework1_PAJ and is in the package named prajwal.The test cases are under the file test and named homework1_PAJtest.

package prajwal should be imported to run the program and implement binary operation on sets.

Binary Operations that can be performed on sets by the user:

The different binary operations that can be performed on sets by the users are :

a)setUnion : Uses union Operation where the user can implement the union of two sets.

b)setInterction : Uses intersect Operation where the user can implement the intersection of two sets.

c)setDifference : Uses diff operation where the user can implement the difference of two sets.

d)setSymmetricDifference : Since there is no standard operation for setSymmetricDifference,we can create an operation using operators diff and union.That is setSymmetricDifference will be :

                       (set1.diff(set2)).union(set2.diff(set1))
e)setCartesianProduct : Similar to the setSymmetricDifference ,there is no standard operator to implement the cartesian product of two sets and hence we have created an operation using flatMap() method. We know that cartesian product of two sets is given as :

                    set1 X set2 = {(a,b) : a € set1 , b € set2 }
                    
                    So when we use flatMap() method,it will take the predicate and applies it to each element of the collection and the returns the new
                    collection.In our case flatMap() method will take the element from set1(element belonging to set 1 (a)) and set2 (element belonging to 
                    set2(b)) and then returns a new set with these elements which is the cartesian product of the two sets.
Also there are other opeations that can be performed with sets and they are :

a)newSet : In this language, newSet can be used to create a new set and populate the elements to that set.In the newSet I have used (args:Any*) so that our set can take any number of elements. And the syntax to print the new can be something like the following :

       println(newSet("Your set name",1,2,3)) or
       
       println(newSet("Your set name","string1","string2","string3")) and hence like this any set can be created with newSet in scalaSet language.
b)setInsert : Another feature is to insert elements by the user after the set is already created.Say if the user wants to insert a few elements to the set that was created ,the the user can use setInsert in order to insert more elements to the already existing set.And the syntax for this feature is as follows :

          Assign("the set name in which you want to insert elements",setInsert("the set name in which you want to insert elements",1,2,3,4)).eval()
c)setDelete :Similar to the setInsert feature we also have a setDelete feature which deletes the elements from an existing set.If the user wants to delete certain elements from an existing set then the user can use setDelete in order to delete the elements from an existing set.And the syntax for this feature is as follows :

         Assign("the set name in which you want to delete elements",setDelete("the set name in which you want to delete elements",1,2,3,4)).eval()
d)Assign : Assign operation can be used to locate any set and also to use any other features like setUnion,setIntersection,setDifference,newSet and other operations as well.Assign operation can be used in the main method and the syntax is as follows :

       Assign("name of the set",setOperation_to_be_performed("name of the set",e,l,e,m,e,n,t,s)).eval()
->Project file name is homework and homework1_PAJ is the main file in src and homework1_PAJ in test is the test file with testcases. in build.sbt file I added the libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"




->Questions for homework3:

~Can a class/interface inherit from itself?
    A class doesn't inherit from itself.Every instantiation is a different,unrelated class and class can never extend itself.
    example:
    
    public class extends{
}
    //public static void main(String [] args) {

}

    the output for this program wad "Error" cyclic inheritance.
    But interface can inherit from one or more interfaces.The derived interface.


~Can an interface inherit from an abstract class with all pure methods?
    An abstract class defines the identity of a class.An interface can inherit multiple interface but cannot inherit a class.An interface cannot declare constructors or destruction.


~Can an interface implement another interface?
    One interface can extend any number of interfaces but one interface cannot implement another Interface , because if any interface is implemented then its methods must be defined and interface never has the definition of any method.


~Can a class implement two or more different interfaces that declare methods with exactly the same signatures?
    If two interfaces contain a method with the same signature but different return type,then it is impossible to implement both the interface together.

~Can an abstract class inherit from another abstract class and implement interfaces where all interfaces and the abstract class have methods with the same signatures?
    Yes an abstract class can inherit from other abstract classes and implement interfaces where all interfaces and abstract class have methods with the same signature.
    
~Can an abstract class implement interfaces?
    Yes an abstract class can implement interfaces.

~Can a class implement two or more interfaces that have methods whose signatures differ only in return types?
    If two interfaces contains a method with same signature but differ in the return types,then it is impossible to implement both the interfaces simultaneously


~Can an abstract class inherit from a concrete class?
    Abstract class is similar to interfaces.We cannot instantiate them,but they may contain a concrete mix of methods declared with or without implementation. 


~Can an abstract class/Interface be instantiated as anonymous concrete classes?
    No we cannot instantiate an interface or abstract class.But we can instantiate an anonymous class that implements and extends the interface or abstract class without defining a class object.






















