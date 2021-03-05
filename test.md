<script src="https://gist.github.com/cmabdullah/88dde561338dba6ee05148a1e87ff4c8.js"></script>
VivaPreperationResources.md
Viva Preparation
General Definition
https://opensourceforu.com/2015/06/data-structures-made-easy-with-java-collections/

Data Structure and Algorithms
Arrays
This is a data structure that can store a fixed-size sequential collection of elements of the same type. Elements are accessed using indexes.

Linked List
This data structure consists of a group of nodes, which together represent a sequence. Under the simplest form, each node is composed of data and a pointer to the next node.

Stack
This is a data structure that implements the LIFO (Last In First Out) paradigm. It is like a pile of plates — the one put in last is removed first. It can be implemented both through arrays and Linked List.

Queue
This is a FIFO (First In First Out) data structure. It is similar to a queue of people at a movie ticket counter. The first element added to the queue will be the first one to be removed.

Tree
A tree consists of a set of elements (nodes) which can be linked to other elements, sometimes hierarchically and sometimes not. A tree data structure can be defined recursively (locally) as a collection of nodes (starting at a root node), where each node is a data structure consisting of a value, together with a list of references to nodes (the Children), with the constraint that no reference is duplicated or points to the root.

ArrayList class
This class uses dynamic arrays for storing elements, and arrays are sequentially arranged in the memory. It implements the List interface and extends the AbstractList class. It can contain duplicate elements, and it maintains an insertion order.

LinkedList class
This class uses a doubly-linked list to store elements. It maintains an insertion order, and it can be used as a list, stack or queue. It actually implements the List and Dequeue interfaces and extends the Abstract class. The add and remove methods are used to add and delete. The size method returns the number of lists in the list.

HashMap
This is used to store key value pairs. It implements the Map interface and is not a part of the collection. HashMap uses the hashing technique to store key value pairs. The key value pair is called a bucket. Each bucket is stored in an array in the HashMap class. The hashing function works on the key and returns an index at which the bucket is stored. There are chances of two keys returning the same index upon hashing. In such cases, the buckets are stored at the same index but are linked, the same as in a Linked List. Each bucket contains the pointer to the next bucket.

TreeMap
The TreeMap class implements the Map interface by using a tree. A TreeMap provides an efficient means of storing key/value pairs in sorted order, and allows rapid retrieval. You should note that, unlike a HashMap, a TreeMap guarantees that its elements will be sorted in ascending key order.

TreeSet
This provides an implementation of the Set interface that uses a tree for storage. Objects are stored in sorted, ascending order. Access and retrieval times are quite fast, which makes TreeSet an excellent choice when storing large amounts of sorted information that must be found quickly. It contains unique elements only.

String manipulation
Big O notation [Complexity of Algorithms]
Some common runtime
Visualising difference using x y curve
Recursion
The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function.

recursive function can go infinite like a loop. To avoid infinite running of recursive function, there are two properties that a recursive function must have −

Base case
There must be at least one base criteria or condition, such that, when this condition is met the function stops calling itself recursively.

Progressive approach
The recursive calls should progress in such a way that each time a recursive call is made it comes closer to the base criteria.

Stack Overflow
If the base case is not reached or not defined, then the stack overflow problem may arise. Let us take an example to understand this.

Quick Sort / Merge Sort
Divide and Conquer
In computer science, divide and conquer is an algorithm design paradigm based on multi-branched recursion. A divide-and-conquer algorithm works by recursively breaking down a problem into two or more sub-problems of the same or related type, until these become simple enough to be solved directly. The solutions to the sub-problems are then combined to give a solution to the original problem.

Merge vs Quick
Great answers here. I'm adding few more points for justifying why QuickSort is better than other sorting algorithms with same asymptotic complexity O(nlogn) (merge sort, heap sort). Even though quicksort has O(n^2) in worst case, it can be easily avoided with high probability by choosing the right pivot.

Hash Table
Basic Definition with visualisation
https://www.tutorialspoint.com/data_structures_algorithms/hash_data_structure.htm

Hash Table is a data structure which stores data in an associative manner. In a hash table, data is stored in an array format, where each data value has its own unique index value. Access of data becomes very fast if we know the index of the desired data.

Thus, it becomes a data structure in which insertion and search operations are very fast irrespective of the size of the data. Hash Table uses an array as a storage medium and uses hash technique to generate an index where an element is to be inserted or is to be located from.

Lookup
Preventing Duplicate
BFS
BFS [Finding shortest path]
BFS is a traversing algorithm where you should start traversing from a selected node (source or starting node) and traverse the graph layerwise thus exploring the neighbour nodes (nodes which are directly connected to source node). You must then move towards the next-level neighbour nodes.

What is graph
A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.

A Graph consists of a finite set of vertices(or nodes) and set of Edges which connect a pair of nodes.

Graph traversals
Graph traversal means visiting every vertex and edge exactly once in a well-defined order. While using certain graph algorithms, you must ensure that each vertex of the graph is visited exactly once. The order in which the vertices are visited are important and may depend upon the algorithm or question that you are solving.

During a traversal, it is important that you track which vertices have been visited. The most common way of tracking vertices is to mark them.

Dijkstra's algorithm
Terminology
Nogative-weight edges
Find firs-test path
Greedy algorithms
A greedy algorithm, as the name suggests, always makes the choice that seems to be the best at that moment. This means that it makes a locally-optimal choice in the hope that this choice will lead to a globally-optimal solution.

How do you tell if a problem is NP-complete.
Terminology
Approximation algorithms
P, NP , NP-hard, NP Complete and proove of NP
P: Problems solvable in polynomial time

Definition of P:
Set of all decision problems solvable in polynomial time on real computers
Set of all decision problems solvable in polynomial time on a non-deterministic computer
Set of all decision problems with efficient verification algorithms
efficient = polynomial number of steps on deterministic TM
Verifier: algorithm for decision problem with extra input
Examples:
SHORTEST PATH: Is the shortest path between u and v in a graph shorter than k?
RELPRIME: Are the integers x and y relatively prime?
YES: (x, y) = (34, 39).
LCS: Given two strings x and y, is the length of their longest common subsequence > k?
YES: (x, y, k) = (”CGTTAG”, ”GGTACG”, 3)
NP: Problems verifiable in polynomial time

Informal definition of NP-hard
A problem with the property that if it can be solved efficiently, then it can be used as a subroutine to solve any other problem in NP efficiently
NP-complete problems are NP problems that are NP-hard
”Hardest computational problems” in NP
NPC: ”reference problems” in NP (can be used to solve the other NP problems)

Travelling salesperson
A traveling salesperson needs to visit n cities Is there a route of at most d length? (decision problem) Optimization-version asks to find a shortest cycle visiting all vertices once in a weighted graph

Naive solutions take n! time in worst-case, where n is the number of edges of the graph

No polynomial-time algorithms are known TSP is an NP-complete problem Simpler Hamiltonian Cycle problem is NP-complete

Longest Path problem between A and B in a weighted graph is also NP-complete Remember the running time for the shortest path problem

যেসব প্রবলেমের কমপ্লেক্সিটি ইনপুট সাইজের পাওয়ার সেগুলো পলিনমিয়াল কমপ্লেক্সিটি...। যেমন O(n), O(NlogN), O(n^3) ইত্যাদি ...। পলিনমিয়াল কমপ্লেক্সিটি টাইমে যেসব প্রবলেম solve করা যায় সেগুলো P প্রবলেম ...

P বা পলিনমিয়াল ক্যাটাগরির প্রবলেমকে ডিটারমিনিস্টিক টুরিং মেশিন দিয়ে solve করা যায় ... যেমন : Sortest path , knapsack path

P প্রবলেমের সলিউশন ভ্যালিড নাকি সেটা পলিনমিয়াল টাইমে ভেরিফাই করা যায় ... ইউলার পাথ প্রবলেম এক্টা P  প্রবলেম ...। ইউলার পাথ প্রবলেম হচ্ছে একটি গ্রাফের সবগুলো এজ ভিজিট করতে হবে এবং কোন এজ দুইবার ভিজিট করা যাবে না...। ইউলার পাথ প্রবলেম এর কিছু এজ এর সিকুয়েন্স জানা থাকলে পাথ ভ্যালিড কিনা জানা যায় ...

np (non deterministic polynomial) প্রবলেম ঃ NP প্রবলেমকে ডিটারমিনিস্টিক টুরিং মেশিন দারা পলিনমিয়াল টাইমে ভেরিফাই করা যায় ... NP প্রবলেম পলিনমিয়াল টাইমে solve করা যায় কিনা সেটা প্রমাণ করা সম্ভব হয় নি ... যেমন ঃ হামিল্টন পাথ প্রবলেম হচ্ছে একটি গ্রাফের সবগুলো নোড ভিজিট করতে হবে এবং কোন নোড দুইবার ভিজিট করা যাবে না...। ইউলার পাথ এর মত কিছু নোড এর সিকুয়েন্স জানা থাকলে পাথ ভ্যালিড কিনা জানা যায় ... কিন্তু কেতা গ্রাফে হামিল্টন পাথ আছে কিনা সেটি পলিনমিয়াল টাইমে বলা সম্ভব না ...। পলিনমিয়াল এলগরিদম এর পরিবর্তে এক্সপনেন্সিয়াল এলগরিদম দিয়ে এসব প্রবলেম শলভ করা যায় ...। NP প্রবলেমের জন্য ব্রুট ফোর্সের সাহায্যে অল পসিবল কম্বিনেশন বের করতে হয় ...। ছোট ইনপুটের জন্য অল পসিবল কম্বিনেশন বের করতে পারলে ও বড় ইনপুটের জন্য ইন্ট্রাক্টেবল ... কাড়ন সব P প্রবলেমকে পলিনমিয়াল টাইমে ভেরিফাই করা যায় জেতা NP ক্যাটাগরির শর্ত ...। p হল NP এর সাব সেট

P=NP? এই স্টেটমেন্টের মানে হল সব NP প্রবলেম কি P প্রবলেম ? প্রতিটা P প্রবলেমঈ NP প্রবলেম ক্যাটাগরিতে পরে ...।

NP প্রবলেমের উদাহরণ ঃ ধরি আমরা পাথর কুড়িয়ে দুটি টাওয়ার বানাতে চাই যাদের ভর সমান ...। পাথর গুলো অসমান ভর সম্পন্ন কিন্তু টাওয়ার দুটি সমান ভরের হতে হবে সেক্ষেত্রে পার্টিশন পদ্ধতি টাওয়ারের ভর নিরনিয় করা ...। পাথর গুলো নিক্তির দুই পাশে তুলে সমান কিনা দেখা যাবে ...। কিন্তু এই সহজতর পার্টিশন সমাধান ১০০ টি অসমান ভরের পাথরের উড় এপ্লাই করতে চাইলে

(2^(100-1)-1)= (6.3 * 10^29) টি কম্বিনেশনেড় মাধ্যমে করতে হবে

অর্থাৎ N সংখ্যক পাথরের জন্য কমপ্লেক্সিটি O(2^N) এটা এক্সপোনেনশিয়াল

Program Problem

planarity
dimentional matching
bipartite dimention
domain number
capacitated minimum spanning tree
Chainese postman problem
achromatic number
hamiltonian path
travelling salesman
minimum k_cut
minimum spanning tree
Math

3- Partitioning problem
Bin Packing
knapsack problem
Subset sum problem
Qudratic assignment problem
Numerical 3-dimentional matching
Sitring processing

closest string
longest common subsequence
post correspondence
shortest common supersequence
string to string correction
NP Hard ক্যাটাগরির প্রবলেম গুলো অন্তত NP প্রবলেমের মত কঠিন ... ধরা যাক A একটা প্রবলেম যেটি NP ক্যাটাগরির এবং B প্রবলেমটা আমরা solve করতে চাই ... A প্রবলেম কে আমরা যদি পলিনমিয়াল টাইমে B প্রবলেমে কনভার্ট করতে পারি তাহলে নিশ্চিত ভাবে বলা যায় B প্রবলেম টা ও A প্রবলেমের মত কঠিন ...।

NP-Hard প্রবলেম পলিনমিয়াল টাইমে ভেরিফাই করা যায় না ...

NP-Complete : এক্টা প্রবলেম NP-Complete হবে কেবল যদি প্রবলেম টা NP-Hard হয় এবং সেটা NP ক্যাটাগরি তে পরে NP-Complete প্রবলেম কে পলিনমিয়াল টাইমে অন্য যেকোনো NP প্রবলেমে কনভার্ট করা যায়... হামিল্টন পাথ NP-Complete প্রবলেম

Dynamic Programming
Basic Definition
Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later.

Knapsack Problem
Subsequence
Binary Search
Time complexity
Visualisation
Time Complexity
O(1) int sum = n1+n2; number of instruction is 1 . So that time complexity is O(1)

O(n)

 for (int i = 0 ; i < n; i++){
 	count++;
 }
 number of instruction is n . So that time complexity is O(n)
O(n^2)

 for (int i = 0 ; i < n; i++){
 	for (int i = 0 ; i < n; i++){
 		count++;
 	}
 }
 number of instruction is n time n . So that time complexity is O(n*n)
O(logN)

 while (low <= high){
 mid = low + (high-low)/2
 	if (k<mid) 
 	low = mid-1;
 	if (k>mid)
 	high = mid+1;
 }
প্রতি ইটারেশনে　low and high ２ দিয়ে ভাগ হয় ...

যেটি সর্বচ্চ ভাগ করা যাবে log2N বার

রিকারসিভ ফাংশনের গভীরতা এর উপড়ে কমপ্লেক্সিটি নিরভ্র করে ...।

যেমন

f(n) = n2 + 3n + 112 হলে কমপ্লেক্সিটি o(n^2)
f(n) = n3 + 99n + 112 হলে কমপ্লেক্সিটি o(n^3)
f(n) = (6log(n) + (n log(n))) হলে কমপ্লেক্সিটি o(NlogN)
f(n) = 2^n + n^2 + 100 হলে কমপ্লেক্সিটি o(2^n) এটাকে exponential কমপ্লেক্সিটি বলে
Object Oriented Programming [Java]
Polymorphism
Inheritance
Encapsulation
Abstraction
What is OOPS?

Write basic concepts of OOPS?

What is a class?

What is an object?

What is Encapsulation?

What is Polymorphism?

What is Inheritance?

What are manipulators?

Define a constructor?

Define Destructor?

What is Inline function?

What is operator overloading?

What is an abstract class?

What is an interface?

What is exception handling?

What is dynamic or run time polymorphism?

What is static and dynamic binding?

What is a copy constructor?

Difference between class and an object?

What is the difference between structure and a class?

What are different types of Inheritance supported by Java?

Why multiple Inheritance is not supported by Java?

Why Inheritance is used by Java Programmers?

How to use Inheritance in Java?

What is the syntax of Inheritance?

What is the difference between Inheritance and Encapsulation?

What is the difference between Inheritance and Abstraction?

What is the difference between Polymorphism and Inheritance?

What is the difference between Composition and Inheritance in OOP?

Can we override static method in Java?

Can we overload a static method in Java?

Can we override a private method in Java?

What is method hiding in Java?

Can a class implement more than one interface in Java?

Can a class extends more than one class in Java?

Can an interface extends more than one interface in Java?

What will happen if a class extends two interfaces and they both have a method with same name and signature?

Can we pass an object of a subclass to a method expecting an object of the super class?

What is the Liskov substitution principle?

How to call a method of a subclass, if you are holding an object of the subclass in a reference variable of type superclass?

What is OOPS?

Object Oriented Programming is a programming paradigm where the complete software operates as a bunch of object talking to each other. An object is a collection of data and methods that operate on its data...

OOPS is abbreviated as Object Oriented Programming system in which programs are considered as a collection of objects. Each object is nothing but an instance of a class.

Write basic concepts of OOPS? Following are the concepts of OOPS and are as follows:. Abstraction. Encapsulation. Inheritance. Polymorphism.

What is a class?

Collection of object is class. It is logical entitity.

A class can be defined as a bluprint from which you can create individual object. Class doesnot consume space.

A class is simply a representation of a type of object. It is the blueprint/ plan/ template that describe the details of an object.

What is an object?
Any entity that has state and behavior is known as object. Example pen, chair etc... an object can be defined as instance of class. An object contains an address and take up some space.

Object is termed as an instance of a class, and it has its own state, behavior and identity.

What is Encapsulation?
Binding or wrapping code and data together into a single unit are known as encapsulation. Example : Capsule is wrapped with defferent medicine.

Encapsulation is an attribute of an object and it contains all data which hidden. That hidden data can be resticted to member of the class.

Encapsulation is an attribute of an object, and it contains all data which is hidden. That hidden data can be restricted to the members of that class. Levels are Public,Protected, Private, Internal and Protected Internal.

What is Polymorphism?
If one task is performed by different ways it is known as polymorphism. For example : to convice the customer differently to draw somthing for example shape, triangle etc... In java we used mathod overloading to achieve polymorphism.

If one task is performed by different ways it is known as polymorphism. The property of an object to take on many different forms. Java object may different form. Java object may be accessed using a reference with the same type as the object. A reference that is superclass of the object or a reference that defines an interface the object implements. either directly or through a superclass...

Polymorphism is nothing butassigning behavior or value in a subclass to something that was already declared in the main class. Simply, polymorphism takes more than one form.

What is Inheritance?
When one object acquire all properties and behaviours of a parent object, its known as inheritance. It provide code reusablity. It is achieved at runtime...

Inheritance is the process by which the new child subclass automatically includes any public or protected primitives, objects or methods define in the parent class.

Inheritance is a concept where one class shares the structure and behavior defined in another class. Ifinheritance applied on one class is called Single Inheritance, and if it depends on multiple classes, then it is called multiple Inheritance.

Abstraction
Hiding internal detailss and showing functionality is known as abstraction. for example phone call, we dont know internal processing...

What are manipulators? Manipulators are the functions which can be used in conjunction with the insertion (<<) and extraction (>>) operators on an object. Examples are endl and setw.

Define a constructor? Constructor is a method used to initialize the state of an object, and it gets invoked at the time of object creation. Rules forconstructor are: Constructor Name should be same asclass name. Constructor must have no return type.

Define Destructor? Destructor is a method which is automatically called when the object ismade ofscope or destroyed. Destructor name is also same asclass name but with the tilde symbol before the name.

What is Inline function? Inline function is a technique used by the compilers and instructs to insert complete body of the function wherever that function is used in the program source code.

What is operator overloading? Operator overloading is a function where different operators are applied and depends on the arguments. Operator,-,* can be used to pass through the function , and it has their own precedence to execute.

What is an abstract class? An abstract class is a class which cannot be instantiated. Creation of an object is not possible with abstract class , but it can be inherited. An abstract class can contain only Abstract method. Java allows only abstract method in abstract class while for other language it allows non-abstract method as well.

What is an interface? An interface is a collection of abstract method. If the class implements an inheritance, and then thereby inherits all the abstract methods of an interface.

What is exception handling? Exception is an event that occurs during the execution of a program. Exceptions can be of any type — Run time exception, Error exceptions. Those exceptions are handled properly through exception handling mechanism like try, catch and throw keywords.

What is dynamic or run time polymorphism? Dynamic or Run time polymorphism is also known as method overriding in which call to an overridden function is resolved during run time, not at the compile time. It means having two or more methods with the same name,same signature but with different implementation.

What is static and dynamic binding? Binding is nothing but the association of a name with the class. Static binding is a binding in which name can be associated with the class during compilation time , and it is also called as early Binding. Dynamic binding is a binding in which name can be associated with the class during execution time , and it is also called as Late Binding.

What is a copy constructor? This is a special constructor for creating a new object as a copy of an existing object. There will be always only on copy constructor that can be either defined by the user or the system.

Difference between class and an object? An object is an instance of a class. Objects hold any information , but classes don’t have any information. Definition of properties and functions can be done at class and can be used by the object. Class can have sub-classes, and an object doesn’t have sub-objects.

What is the difference between structure and a class? Structure default access type is public , but class access type is private. A structure is used for grouping data whereas class can be used for grouping data and methods. Structures are exclusively used for data and it doesn’t require strict validation , but classes are used to encapsulates and inherit data which requires strict validation.

What are different types of Inheritance supported by Java?

Java supports
single Inheritance [only one super class]
~~ multiple Inheritance [Several super class] ~~
Hierarchical I heritence [one superclass, many subclss]
multi-level inheritance [Derived from a derived class]
inheritance alt text

Why multiple Inheritance is not supported by Java? If a class is inheriting from two or more classes then it is called multiple inheritance.if the parent classes having same members then it will be a confusion to child class whether to access members from first parent class or second parent classes..and so on....to avoid the confusion there is no multiple inheritance concept in java. java does not suppports multipal inheritance .for this java has interfaces.

Why Inheritance is used by Java Programmers? Answer: Inheritance is used for code reuse and leveraging Polymorphism by creating a type hierarchy. It's better to use Inheritance for type declaration but for code reuse composition is a better option because it's more flexible. See this article for learning more about why Composition is better than Inheritance.

How to use Inheritance in Java? Answer: You can use Inheritance in Java by extending classes and implementing interfaces. Java provides two keywords extends and implements to achieve inheritance. A class which is derived from another class is known as a subclass and an interface which is derived from another interface is called subinterface. A class which implements an interface is known as implementation.

What is the syntax of Inheritance? Answer: You can use either extends of implements keyword to implement Inheritance in Java. A class extends another class using extends keyword, an interface can extend another interface using extend keyword, and a class can implement an interface using implements keyword in Java.

What is the difference between Inheritance and Encapsulation? Answer: Inheritance is an object oriented concept which creates a parent-child relationship. It is one of the ways to reuse the code written for parent class but it also forms the basis of Polymorphism. On the other hand, Encapsulation is an object oriented concept which is used to hide the internal details of a class e.g. HashMap encapsulate how to store elements and how to calculate hash values.

What is the difference between Inheritance and Abstraction? Answer: Abstraction is an object oriented concept which is used to simply things by abstracting details. It helps in the designing system. On the other hand, Inheritance allows code reuse. You can reuse the functionality you have already coded by using Inheritance. See Head First Object Oriented Analysis and Design for more details.

What is the difference between Polymorphism and Inheritance? Answer: Both Polymorphism and Inheritance goes hand on hand, they help each other to achieve their goal. Polymorphism allows flexibility, you can choose which code to run at runtime by overriding.

What is the difference between Composition and Inheritance in OOP? Answer: One of the good question to check the candidate's object-oriented programming skills. There are several differences between Composition and Inheritance in Java, some of them are following:

The Composition is more flexible because you can change the implementation at runtime by calling setXXX() method, but Inheritance cannot be changed i.e. you cannot ask a class to implement another class at runtime.
Composition builds HAS-A relationship while Inheritance builds IS-A relationship e.g. A Room HAS A Fan, but Mango IS-A Fruit.
The parent-child relationship is best represented using Inheritance but If you just want to use the services of another class use Composition. For more differences see 5 reasons to favor composition over Inheritance.
Can we override static method in Java? Answer: No, you cannot override a static method in Java because it's resolved at compile time. In order for overriding to work, a method should be virtual and resolved at runtime because objects are only available at runtime. This is one of the tricky Java questions, where interviewer tries to confuse you. A programmer is never sure about whether they can override or overload a static method in Java.

Can we overload a static method in Java? Answer: Yes, you can overload a static method in Java. Overloading has nothing to do with runtime but the signature of each method must be different. In Java, to change the method signature, you must change either number of arguments, type of arguments or order of arguments.

Can we override a private method in Java? Answer: No, you cannot override a private method in Java because the private method is not inherited by the subclass in Java, which is essential for overriding. In fact, a private method is not visible to anyone outside the class and, more importantly, a call to the private method is resolved at compile time by using Type information as opposed to runtime by using the actual object.

What is method hiding in Java? Answer: Since the static method cannot be overridden in Java, but if you declare the same static method in subclass then that would hide the method from the superclass. It means, if you call that method from subclass then the one in the subclass will be invoked but if you call the same method from superclass then the one in superclass will be invoked. This is known as method hiding in Java.

Can a class implement more than one interface in Java? Answer: Yes, A class can implement more than one interface in Java e.g. A class can be both Comparable and Serializable at the same time. This is why the interface should be the best use for defining Type as described in Effective Java. This feature allows one class to play a polymorphic role in the program.

Can a class extends more than one class in Java? Answer: No, a class can only extend just one more class in Java. Though Every class also, by default extend the java.lang.Object class in Java.

Can an interface extends more than one interface in Java? Answer: Yes, unlike classes, an interface can extend more than one interface in Java. There are several example of this behavior in JDK itself e.g. java.util.List interface extends both Collection and Iterable interface to tell that it is a Collection as well as it allows iteration via Iterator.

What will happen if a class extends two interfaces and they both have a method with same name and signature? Answer: In this case, a conflict will arise because the compiler will not able to link a method call due to ambiguity. You will get a compile time error in Java.

Can we pass an object of a subclass to a method expecting an object of the super class? Answer: Yes, you can pass that because subclass and superclass are related to each other by Inheritance which provides IS-A property. I mean Banana is a Fruit so you can pass banana if somebody expect fruit. Now there are scenario, where you can't do e.g. when subclass violates the Liskov Substitution principle i.e. you cannot pass a plastic banana to someone expecting fruit :-), The eat() function will throw exception.

What is the Liskov substitution principle? Answer: The Liskov substitution principle is one of the five object-oriented design principles, collectively know as SOLID principles. This design principle is L of SOLID acronym. The Liskov substitution principle states that in an object oriented program if a function or method is expecting an object of base class then it should work fine with a derived class object as well. If it cannot function properly with derived class object then the derived class is violating the Liskov Substitution principle.

For example, if a method is expecting a List you can also pass ArrayList or LinkedList and it should work just fine because ArrayList and LinkedList both follow Liskov Substitution Principle, but the java.sql.Date which is a subclass of java.util.Date in Java violates Liskov Substitution Principle because you cannot pass an object of java.sql.Date class to a method which is expecting an object of java.util.Date, Why? because all time-related method will throw java.lang.UnsupportedOperationException.

Here is another example of violating The Liskov Substitution Principle, Square is a special type of Rectangle whose adjacent sides are equal but making Square extending Rectangle violates LSP principle. For more details on SOLID design principles, read Clean Code by Rober C. Martin, the inventor of SOLID principles.

How to call a method of a subclass, if you are holding an object of the subclass in a reference variable of type superclass? Answer: You can call a method of the subclass by first casting the object hold by reference variable of superclass into the subclass. Once you hold the object in subclass reference type, you can call methods from the subclass. See how type casting works in Java for more details.
That's all about some good interview questions based OOP concept, Inheritance. You should also know that how private and final variables affect Inheritance. How can you extend a class which is holding a private variable, and probably the difference between private and protected modifier in Java? They are really important to understand and use Inheritance in Java.

OOPS Concept Interview Questions in Java
In this article, I am going to share you some OOPS concept based Java interview questions which I have collected from friends and colleagues and they have seen in various Java interviews on different companies. They are mostly asked at first few round e.g. on screening round or on the telephonic round.

If you are senior Java developer then you already know answers to this question and I suggest you practice more on object-oriented analysis and design skill i.e. how to do code against a specification. If you are fresher and junior Java developer with 2 to 3 years experience then you must revise these questions, learn if you don't know to do well on your Java Job interviews.

What is method overloading in OOP or Java? (answer) It's one of the oldest OOPS concept questions, I have seen it 10 years ago and still sees it now. When we have multiple methods with the same name but different functionality then it's called method overloading. For example. System.out.println() is overloaded as we have 6 or 7 println() method each accepting a different type of parameter.

What is method overriding in OOP or Java? (answer) It's one of the magic of object oriented programming where the method is chose based upon an object at runtime. In order for method overriding, we need Inheritance and Polymorphism, as we need a method with the same signature in both superclass and subclass. A call to such method is resolved at runtime depending upon the actual object and not the type o variable. See the answer for more detailed discussion.

What is method hiding in Java? (answer) When you declare two static methods with same name and signature in both superclass and subclass then they hide each other i.e. a call to the method in the subclass will call the static method declared in that class and a call to the same method is superclass is resolved to the static method declared in the super class.

Is Java a pure object oriented language? if not why? (answer) Java is not a pure object-oriented programming language e.g. there are many things you can do without objects e.g. static methods. Also, primitive variables are not objects in Java. See the answer for a more detailed explanation.

What are rules of method overloading and overriding in Java? (answer) One of the most important rules of method overloading in Java is that method signature should be different i.e. either the number of arguments or the type of arguments. Simply changing the return type of two methods will not result in overloading, instead, the compiler will throw an error. On the other hand, method overriding has more rules e.g. name and return type must be same, method signature should also be same, the overloaded method cannot throw a higher exception etc. See the answer for a full list of rules related to method overloading and overriding in Java.

The difference between method overloading and overriding? (answer) Several differences but the most important one is that method overloading is resolved at compile time and method overriding is resolved at runtime. The compiler only used the class information for method overloading, but it needs to know object to resolved overridden method calls. This diagram explains the difference quite well, though:

Can we overload a static method in Java? (answer) Yes, you can overload a static method in Java. You can declare as many static methods of the same name as you wish provided all of them have different method signatures. See the answer for more detailed explanation and code example.

Can we override static method in Java? (answer) No, you cannot override a static method because it's not bounded to an object. Instead, static methods belong to a class and resolved at compile time using the type of reference variable. But, Yes, you can declare the same static method in a subclass, that will result in method hiding i.e. if you use reference variable of type subclass then new method will be called, but if you use reference variable of superclass than old method will be called.

Can we prevent overriding a method without using the final modifier? (answer) Yes, you can prevent the method overriding in Java without using the final modifier. In fact, there are several ways to accomplish it e.g. you can mark the method private or static, those cannot be overridden.

Can we override a private method in Java? (answer) No, you cannot. Since the private method is only accessible and visible inside the class they are declared, it's not possible to override them in subclasses. Though, you can override them inside the inner class as they are accessible there.

What is covariant method overriding in Java? (answer) In covariant method overriding, the overriding method can return the subclass of the object returned by original or overridden method. This concept was introduced in Java 1.5 (Tiger) version and it's very helpful in case original method is returning general type like Object class, because, then by using covariant method overriding you can return more suitable object and prevent client side type casting. One of the practical use of this concept is in when you override the clone() method in Java.

Can we change the return type of method to subclass while overriding? (answer) Yes, you can, but only from Java 5 onward. This feature is known as covariant method overriding and it was introduced in JDK 5 release. This is immensely helpful if original method return super-class e.g. clone() method return java.lang.Object. By using this, you can directly return the actual type, preventing client-side type casting of the result.

Can we change the argument list of an overriding method? (answer) No, you cannot. The argument list is part of the method signature and both overriding and overridden method must have the same signature.

Can we override a method which throws runtime exception without throws clause? (answer) Yes, there is no restriction on unchecked exception while overriding. On the other hand, in the case of checked exception, an overriding exception cannot throw a checked exception which comes higher in type hierarchy e.g. if original method is throwing IOException than overriding method cannot throw java.lang.Exception or java.lang.Throwable.

How do you call superclass version of an overriding method in sub class? (answer) You can call a superclass version of an overriding method in the subclass by using super keyword. For example to call the toString() method from java.lang.Object class you can call super.toString().

Can we override a non-static method as static in Java? (answer) Yes, you can override the non-static method in Java, no problem on them but it should not be private or final :)

Can we override the final method in Java? (answer) No, you cannot override a final method in Java, final keyword with the method is to prevent method overriding. You use final when you don't want subclass changing the logic of your method by overriding it due to security reason. This is why String class is final in Java. This concept is also used in template design pattern where template method is made final to prevent overriding.

Can we have a non-abstract method inside interface? (answer) From Java 8 onward you can have a non-abstract method inside interface, prior to that it was not allowed as all method was implicitly public abstract. From JDK 8, you can add static and default method inside an interface.

What is the default method of Java 8? (answer) Default method, also known as extension method are new types of the method which you can add on the interface now. These method has implementation and intended to be used by default. By using this method, JDK 8 managed to provide common functionality related to lambda expression and stream API without breaking all the clients which implement their interfaces. If you look Java 8 API documentation you will find several useful default method on key Java interface like Iterator, Map etc.

What is an abstract class in Java? (answer) An abstract class is a class which is incomplete. You cannot create an instance of an abstract class in Java. They are provided to define default behavior and ensured that client of that class should adore to those contract which is defined inside the abstract class. In order to use it, you must extend and implement their abstract methods. BTW, in Java, a class can be abstract without specifying any abstract method.

What is an interface in Java? What is the real user of an interface? (answer) Like an abstract class, the interface is also there to specify the contract of an API. It supports OOP abstraction concept as it defines only abstract behavior. It will tell that your program will give output but how is left to implementors. The real use of the interface to define types to leverage Polymorphism. See the answer for more detailed explanation and discussion.

The difference between Abstract class and interface? (answer) In Java, the key difference is that abstract class can contain non-abstract method but the interface cannot, but from Java 8 onward interface can also contain static and default methods which are non-abstract. See the answer for more detailed discussion as I have described a lot of points there.

Java Object Oriented Programming questions for experienced
Can we make a class abstract without an abstract method? (answer) Yes, just add abstract keyword on the class definition and your class will become abstract.

Can we make a class both final and abstract at the same time? (answer) No, you cannot apply both final and abstract keyword at the class same time because they are exactly opposite of each other. A final class in Java cannot be extended and you cannot use an abstract class without extending and make it a concrete class. As per Java specification, the compiler will throw an error if you try to make a class abstract and final at the same time.

Can we overload or override the main method in Java? (answer) No, since main() is a static method, you can only overload it, you cannot override it because the static method is resolved at compile time without needing object information hence we cannot override the main method in Java.

What is the difference between Polymorphism, Overloading, and Overriding? (answer) This is slight tricky OOP concept question because Polymorphism is the real concept behind on both Overloading and Overriding. Overloading is compiled time Polymorphism and Overriding are Runtime Polymorphism.

Can an interface extend more than one interface in Java? Yes, an interface can extend more than one interface in Java, it's perfectly valid.

Can a class extend more than one class in Java? No, a class can only extend another class because Java doesn't support multiple inheritances but yes, it can implement multiple interfaces.

What is the difference between abstraction and polymorphism in Java? (answer) Abstraction generalizes the concept and Polymorphism allow you to use different implementation without changing your code. This diagram explains the abstraction quite well, though:

Advance Java Question
Can we overload main in Java? Yes you can overload the main method in Java, nothing wrong with this but Java will only call your specific main method, i.e. main method with the following signature: public static void main(String[] args) or public static void main(String args...) which is the main method as variable argument method and only supported post-Java 5 world.

Can we override main in Java? No, you can not override the main method in Java, Why? because main is a static method and in Java static method is bonded during compile time and you can not override static method in Java. If you declare a method with same name and signature its called method hiding.

Can we make main final in Java? Of course, you can make the main method final in Java. JVM has no issue with that. Unlike any final method, you can not override main in Java.

Can we make main synchronized in Java? Yes, main can be synchronized in Java, synchronized modifier is allowed in the main signature and you can make your main method synchronized in Java.

How to call a nonstatic method from main in Java? This question applies not only to main but all static methods in Java. Since nonstatic methods can not be called from static context directly, you need to first create an Object as local variable and then you can call nonstatic method using that object, as shown in the following example:

What is difference between Vector and ArrayList in Java? Answer : One of the most popular Java question at 2 years experience level which aims to check your knowledge on Java collection API. key point to mention is synchronization and speed, since ArrayList is not synchronized its fast compare to Vector. See Vector vs ArrayList in Java for more difference between both of them.

What is difference in LinkedList and ArrayList in Java? Answer : If you don't get previous Java question then you are likely to get this question at 2 to 3 years experience level Java interview. Unlike synchronization, key point to mention here is underlying data structure. See LinkedList vs ArrayList in Java for detail answer of this java question.

What is difference between fail-fast and fail-safe Iterator in Java? This is relatively new Java question compare to previous ones but increasingly getting popular into 2 to 3 years level Java interviews. key difference here is that fail-fast Iterator throw ConcurrentModificationException while fail-safe doesn't. See fail-safe vs fail-fast Iterator in Java for more differences between two.

Difference between throw and throws in Java? This Java question belongs to Exception handling category which is another popular category for 2 to 4 years experienced Java programmer. Main difference between these two is that one declares exception thrown by a Java method while other is actually used to throw Exception. See Difference between throw and throws in Java for full answer of this Java exception handling question.

What is difference between checked and unchecked Exception in Java. Another java interview question for 2 to 4 years experienced Java programmer from Exception handling. key point to mention here is that checked Exception requires mandatory exception handling code while unchecked doesn't. See checked vs unchecked Exception in Java for more differences.

What is difference between Runnable and Thread in Java ? Frequently asked Java interview question on 2 to 4 years experienced level from Threading fundamentals. there are two ways to implement Thread in Java, in fact three e..g extending java.lang.Thread class or implementing java.lang.Runnable or Callable interface. See Thread vs Runnable in Java for exact differences on following each approach.

What happens if you don't call wait and notify from synchronized block? Another common Java interview question from multi-threding and inter thread communication. As I said earlier you must know concept of wait and notify in Java if you have worked for 2 to 3 years in Java. Check why wait and notify needs to call from synchronized block for exact reason to answer this Java question.

Write code to solve producer consumer problem in Java. A good java question in my opinion which is mix of threading, synchronization, inter-thread communication and coding abilities. This particular java question can make any body's list at any day, not just 2 to 4 years experienced programmer. despite being so common it has something on it which confuse average programmer and allow you to differentiate between good and average programmer. See Producer consumer problem solving using BlockingQueue in Java for full code example.

Difference between String, StringBuffer and StringBuilder in Java? (detailed answer) String is immutable while both StringBuffer and StringBuilder is mutable, which means any change e.g. converting String to upper case or trimming white space will produce another instance rather than changing the same instance. On later two, StringBuffer is synchronized while StringBuilder is not, in fact its a ditto replacement of StringBuffer added in Java 1.5.

Difference between extends Thread vs implements Runnable in Java? (detailed answer) Difference comes from the fact that you can only extend one class in Java, which means if you extend Thread class you lose your opportunity to extend another class, on the other hand if you implement Runnable, you can still extend another class.

Difference between Runnable and Callable interface in Java? (detailed answer) Runnable was the only way to implement a task in Java which can be executed in parallel before JDK 1.5 adds Callable. Just like Runnable, Callable also defines a single call() method but unlike run() it can return values and throw exceptions.

Difference between ArrayList and LinkedList in Java? (detailed answer) In short, ArrayList is backed by array in Java, while LinkedList is just collection of nodes, similar to linked list data structure. ArrayList also provides random search if you know the index, while LinkedList only allows sequential search. On other hand, adding and removing element from middle is efficient in LinkedList as compared to ArrayList because it only require to modify links and no other element is rearranged.

What is difference between wait and notify in Java? (detailed answer) Both wait and notify methods are used for inter thread communication, where wait is used to pause the thread on a condition and notify is used to send notification to waiting threads. Both must be called from synchronized context e.g. synchronized method or block.

Difference between HashMap and Hashtable in Java? (detailed answer) Though both HashMap and Hashtable are based upon hash table data structure, there are subtle difference between them. HashMap is non synchronized while Hashtable is synchronized and because of that HashMap is faster than Hashtable, as there is no cost of synchronization associated with it. One more minor difference is that HashMap allows a null key but Hashtable doesn't.

Difference between TreeSet and TreeMap in Java? (detailed answer) Though both are sorted collection, TreeSet is essentially a Set data structure which doesn't allow duplicate and TreeMap is an implementation of Map interface. In reality, TreeSet is implemented via a TreeMap, much like how HashSet is implemented using HashMap.

How to Swap two numbers without using temp variable? (solution) This question is ages old. I have first seen this question way back in 2005 but I am sure its even older than that. Good thing about this problem is that except XOR trick all solution has some flaws, which is used to test whether candidate really knows his stuff or not. Check out the solution for all three possible solution and drawback of each.

Difference between Serializable and Externalizable in Java? (detailed answer) Serializable is a marker interface with no methods defined it but Externalizable interface has two methods defined on it e.g. readExternal() and writeExternal() which allows you to control the serialization process. Serializable uses default serialization process which can be very slow for some application.

Difference between transient and volatile in Java? (detailed answer) transient keyword is used in Serialization while volatile is used in multi-threading. If you want to exclude a variable from serialization process then mark that variable transient. Similar to static variable, transient variables are not serialized. On the other hand, volatile variables are signal to compiler that multiple threads are interested on this variable and it shouldn't reorder its access. volatile variable also follows happens-before relationship, which means any write happens before any read in volatile variable. You can also make non atomic access of double and long variable atomic using volatile.

Difference between abstract class and interface? (detailed answer) From Java 8 onwards difference between abstract class and interface in Java has minimized, now even interface can have implementation in terms of default and static method. BTW, in Java you can still extend just one class but can extend multiple inheritance. Abstract class is used to provide default implementation with just something left to customize, while interface is used heavily in API to define contract of a class.

Difference between Association, Composition and Aggregation? (detailed answer) Between association, composition and aggregation, composition is strongest. If part can exists without whole than relationship between two class is known as aggregation but if part cannot exists without whole than relationship between two class is known as composition. Between Inheritance and composition, later provides more flexible design.

What is difference between FileInputStream and FileReader in Java? (detailed answer) Main difference between FileInputStream and FileReader is that former is used to read binary data while later is used to read text data, which means later also consider character encoding while converting bytes to text in Java.

How do you convert bytes to character in Java? (detailed answer) Bytes are converted to character or text data using character encoding. When you read binary data from a file or network endpoint, you provide a character encoding to convert those bytes to equivalent character. Incorrect choice of character encoding may alter meaning of message by interpreting it differently.

Can we have return statement in finally clause? What will happen? (detailed answer) Yes, you can use return statement in finally block, but it will not prevent finally block from being executed. BTW, if you also used return statement in try block then return value from finally block with override whatever is returned from try block.

Can you override static method in Java? (detailed answer) No, you cannot override static method in Java because they are resolved at compile time rather than runtime. Though you can declare and define static method of same name and signature in child class, this will hide the static method from parent class, that's why it is also known as method hiding in Java.

Difference between private, public, package and protected in Java? (detailed answer) All four are access modifier in Java but only private, public and protected are modifier keyword. There is no keyword for package access, its default in Java. Which means if you don't specify any access modifier than by default that will be accessible inside the same package. Private variables are only accessible in the class they are declared, protected are accessible inside all classes in same package but only on sub class outside package and public variables e.g. method, class or variables are accessible anywhere. This is highest level of access modifier and provide lowest form of encapsulation.

5 Coding best practices you learned in Java? (detailed answer) If you are developing on a programming language for couple of years, you sure knows lots of best practices, by asking couple of them, Interviewer just checking that you know your trade well. Here are my 5 Java best practices :

Always name your thread, this will help immensely in debugging.
Use StringBuilder for string concatenation
Always specify size of Collection, this will save lot of time spent on resizing
Always declare variable private and final unless you have good reason.
Always code on interfaces instead of implementation
Provide dependency to method instead they get it by themselves, this will make your code unit testable.
What is difference between calling start() and run() method of Thread? (detailed answer) You might have heard this question before, if calling start() method calls the run() method eventually then why not just call the run() method? Well the difference is, start method also starts a new thread. If you call the run method directly then it will run on same thread not on different thread, which is what original intention would be.

Write a Program to solve Producer Consumer problem in Java? (solution) A very good question to check if candidate can write inter thread communication code or not. If a guy can write producer consumer solution by hand and point out critical section and how to protect, how to communicate with thread then he is good enough to write and maintain your concurrent Java program. This is the very minimum requirement for a Java developer and that's why I love this question, it also has several solution e.g. by using concurrent collections like blocking queue, by using wait and notify and by using other synchronizers of Java 5 e.g. semaphores.

What is equlas() and hashCode() contract in Java? Where does it used? (detailed answer) One of the must ask question in Java telephonic interview. If a guy doesn't know about equals() and hashCode() then he is probably not worth pursuing further because its the core of the Java fundamentals. The key point of contract is that if two objects are equal by equals() method then they must have same hashcode, but unequal object can also have same hashcode, which is the cause of collision on hash table based collection e.g HashMap. When you override equals() you must remember to override hashCode() method to keep the contract valid.

Why wait and notify methods are declared in Object class? (detailed answer) This question is more to find out how much experience you really have and what is your thinking towards Java API and its design decision. Similar question is why String is immutable in Java? Well, true answer can only be given by Java designers but you can reason something. For example, wait and notify methods are associated with locks which is owned by object not thread, and that's why it make sense to keep those method on java.lang.Object class. See the detailed answer for more discussion and reasoning.

How does HashSet works in Java? (detailed answer) HashSet is internally implemented using HashMap in Java and this is what your interviewer wants to hear. He could then quiz you with some common sense based question e.g. how can you use HashMap because its needs two object key and value? what is the value in case of HashSet? Well, in case of HashSet a dummy object is used as value and key objects are the actual element on Set point of view. Since HashMap doesn't allow duplicate key it also follows contract of set data structure to not allow duplicates. See detailed answer for more analysis and explanation.

What is difference between synchronize and concurrent Collection in Java? (detailed answer) There was time, before Java 1.5 when you only have synchronized collection if you need them in a multi-threaded Java program. Those classes were plagued with several issue most importantly performance because they lock the whole collection or map whenever a thread reads or writes. To address those issue, Java released couple of Concurrent collection classes e.g. ConcurrentHashMap, CopyOnWriteArrayList and BlockingQueue to provide more scalability and performance.

What is difference between Iterator and Enumeration in Java? (detailed answer) Main difference is that Iterator was introduced in place of Enumeration. It also allows you to remove elements from collection while traversing which was not possible with Enumeration. The methods of Iterator e.g. hasNext() and next() are also more concise then corresponding methods in Enumeration e.g. hasMoreElements(). You should always use Iterator in your Java code as Enumeration may get deprecated and removed in future Java release.

What is difference between Overloading and Overriding in Java? (detailed answer) Another frequently asked question from telephonic round of Java interviews. Though both overloading and overriding are related with methods of same names but they have different characteristics e.g.overloaded methods must have different method signature than original method but overridden method must have same signature. Also, overloaded methods are resolved at compiled time while overridden methods are resolved at runtime. See the detailed answer for more analysis and differences.

Difference between static and dynamic binding in Java? (detailed answer) This is usually asked as follow-up of previous question, static binding is related to overloaded method and dynamic binding is related to overridden method. Method like private, final and static are resolved using static binding at compile time but virtual methods which can be overridden are resolved using dynamic binding at runtime.

Difference between Comparator and Comparable in Java? (detailed answer) This is one more basic concept, I expect every Java candidate to know. You will deal with them on every Java project. Several core classes in Java e.g. String, Integer implements Comparable to define their natural sorting order and if you define a value class or a domain object then you should also implement Comparable and define natural ordering of your object. Main difference between these two is that, you could create multiple Comparator to define multiple sorting order based upon different attribute of object. Also, In order to implement Comparable you must have access of the class or code, but you can use Comparator without having source code of class, all you need is the JAR file of particular object. That's why Comparator is very powerful to implement custom sorting order and from Java 8 you can do it even more elegantly, as seen here.

What is difference between PATH and CLASSPATH in Java? (detailed answer) PATH is an environment variable which points to Java binary which is used to run Java programs. CLASSPATH is another environment variable which points to Java class files or JAR files. If a class is not found in CLASSPATH then Java throws ClassNotFoundException.

What is difference between Checked and Unchecked Exception in Java? (detailed answer) Checked exception ensures that handling of exception is provided and its verified by compiler also, while for throwing unchecked exception no special provision is needed e.g. throws clause. A method can throw unchecked exception without any throw clause.

Java Collection Interview Questions Answers
Java Collection Interview Questions Answers | Java Collection FAQHere is a list of my favorite, frequently asked Questions from Java collection framework. Almost all of these questions have appeared in Java interview at the various level ranging from Junior to Senior Software Engineer level at different Companies e.g. Capgemini, Tech Mahindra, TCS, Satyam, and CTS.

What is Difference between Hashtable and HashMap in Java? This Java collection interview question is I guess most popular one. Most of Java programmer who has at least 2 years of experience has seen this question on core Java or J2EE interview. Well, there is much difference between them but most important is thread-safety, HashMap is not thread-safe while Hashtable is a thread-safe collection. See Hashtable vs HashMap in Java for more differences between HashMap and Hashtable in Java.

What is the difference between Hashtable and ConcurrentHashMap in Java? Another frequently asked Java collection interview question post-Java 5 world which introduced Concurrent Collection classes like ConcurrentHashMap and CopyOnWriteArrayList along with Concurrency utilities e.g. CyclicBarrier and CountDownLatch. Well, both Hashtable and ConcurrentHashMap are thread-safe here but later provides more scalability than former. See Difference between ConcurrentHashMap and Hashtable in Java for the answer of this Java collection interview question.

What is Difference between Iterator and Enumeration in Java? One of the classic interview Questions asked on Java collection framework, This is pretty old and programmer who has been working in Java for 4 to 6 years must have seen this question before. Well, Iterator and ListIterator in Java is a new way to iterator collection in Java and provides the ability to remove an object while traversing while Enumeration doesn't allow you to remove the object. See Iterator vs Enumeration in Java for more differences between both of them.

What is Difference between fail-safe and fail-fast Iterator in Java? This is relatively new Java collection interview question because the concept of a fail-safe iterator is come along with ConcurrentHashMap and CopyOnWriteArrayList. See Difference between fail-safe and fail-fast Iterator in Java for the answer of this Java collection question.

How HashMap works internally in Java? One of the most frequently asked Java interview question to experience Java programmer of 4 to 5 years of experience. I have seen this question on big companies like Morgan Stanley, JP Morgan, Nomura and other banks e.g. Barclays Capital. See How HashMap works internally in Java for detailed answer of this Java collection interview question.

Can you write code to traverse Map in Java on 4 ways? Another Java collection question which appears as part of Java Coding interview question and appeared in many interviews. As you know there are multiple ways to traverse or iterate Map in Java e.g. for loop, while loop using Iterator etc. 4 ways to iterator Map in Java has detailed explanation and sample code which is sufficient to answer this Java collection framework interview question.

What is the difference between ArrayList and LinkedList in Java? A follow-up question which is asked in response to previous Java collection interview question. Here also both LinkedList and ArrayList are List implementation but their internal data-structure is different, one is derived from Array while other is derived from LinkedList. See LinkedList vs ArrayList in Java to answer this Java Collection interview question.

What is the difference between List and Set in Java? List vs Set is one of the most important concepts to understand in Java Collection framework and this Java collection interview question focus on that. Most important difference between them is that List allows duplicates and maintain insertion order while Set doesn't allow duplicates and doesn't maintain any order. See Difference between Set and List in Java to see more differences between them.

How do you find if ArrayList contains duplicates or not? Since List allows duplicates this becomes a followup question of earlier Java collection framework interview question. See How to check if ArrayList contains duplicates or not for the answer of this Java collection question.

What is the difference between Vector and ArrayList in Java? Along with Difference between HashMap and Hashtable, this Java collection interview question is probably second in the list of frequently asked question on Java collection framework. Both ArrayList and Vector implements List interface from Java 4 but they have differences including synchronization, See the difference between Vector and ArrayList in Java for the complete answer of this collection interview question in Java.

JSP Servlet Interview Questions Answers
Servlet JSP Interview Questions Answers FAQHere is my list of frequently asked JSP Servlet Interview questions to any Java programmer. Most of these Servlet JSP questions has appeared in various level of J2EE interviews including 2 to 3 and 2 to 4 years experience level. None of these questions require special question and neither of them are tricky questions, they all are focused on fundamentals which is key to clear any interview.

What is JSESSIONID in Java? When does JSESSIONID gets created ? One of my favourite Servlet JSP Interview question for 2 to 4 years experience programmers on web development. JSESSION id is a cookie which is used to manage session in Java web application. JSESSIONID is created by Web Container whenever a new session is created. See What is JSESSIONID in Servlet JSP for more details.

What is difference between include action and include directive in JSP? Another very popular JSP Interview questions, mostly asked to 2 to 3 years experienced J2EE programmer. There are couple of differences, most important of them is that include action is request time inclusion while include directive is translation time inclusion of another resource e.g. JSP or html pages. This questions is also asked as difference between file include and page include. See Include action vs Include directive for more differences.

How do you define application wide error page in JSP? Almost in every Servlet JSP interview you will see question from error handling. You can define two kinds of error pages in Java web application, one is using tag in web.xml and other is by using error page JSP which uses isErrorpage to declare that this jsp page can be used as error page. Other JSP uses that page by using attribute errorpage="error.jsp". Whenever you get an unhandled exception in JSP, request will be routed to error page. See How to use error page in JSP for detailed answer of this question.

Difference between sendredirect and forward in Servlet ? One of the classical Interview Question from Servlet and JSP. This question is as old as Vector vs ArrayList in core Java. Anyway see difference between sendredirect and forward to answer this Servlet Interview question.

How do remove variable using <c:set> tag from JSTL ? This is one of the tricky Servlet JSP question. Many people assumes that <c:set> can only add or set variables in a particular scope but you can also remove any variable from any scope using JSTL <c:set> tag. See How to use <c:set> JSTL tag in JSP for exact way to remove any variable from any scope in JSP page.

What is difference between Web Server and Application Server ? This is rather simple Servlet JSP question to answer. If you have used EJB then you should know that , Web Server doesn't contain EJB container and EJB can not be deployed on that. Application Server is used to deploy and run EJB in J2EE environment. See 5 difference between Application and Web Server to see more differences.

What is difference between URL Encoding and URL rewriting ? URL Encoding and URL rewriting is general web concept irrespective of Java programming language. URL Encoding refers to encoding URL e.g. replacing space with %20, you can see this when browser sends request to Server. On the other hand URL Rewriting is way to manage Session in web application. See URL Encoding vs URL Rewriting for more differences.

How do you get ServletContext reference inside Servlet ? ServletContext is very important object in Java Web application. ServletContext object is one per web application and serves as application scope and use to store common config and things which doesn't change on per session. Its easy to get reference of ServletContext in jsp using application implicit variable but in Servlet is not available in HttpServletRequest until version 3.0. You need HttpSession object to retrieve ServletContext in any Servlet. A good follow-up questions is How do you get ServletContext in Struts Action class or Spring Controller classes. See How to retrieve ServletContext in Servlet, Spring and Struts for more details.

What is difference between ServletContext and ServletConfig in Java ? One of those classical Servlet Interview Questions which you can't afford to miss. Again ServletContext is used to provide application wide configure while ServletConfig is used to configure and provide initialization parameter to one Servlet. See ServletContext vs ServletConfig for more differences.

Which open source tag library have you used ? This is an interesting Servlet JSP questions and gives an opportunity to show how many tag library you are familiar with and which ones have you used. Most J2EE programmer answer this question with saying JSTL core tag library, Struts tag library , Spring tag library or display tag, which is quite popular tag library to display tabular data and provides lot of feature out of box e.g. paging, sorting and export functionality.

What is difference between GET and POST method in HTTP protocol? Another classical web interview question, not specific to Servlet or JSP but very important in context of web development which is based on HTTP protocol. There several differences between GET and POST method including length of data required to Send to Server. GET is less secure and can only send limited data hence not useful to transfer sensitive information. See GET vs POST HTTP method for more differences.

What does load-on-start-up element in web.xml do? One of the tough Servlet JSP Interview question especially to 2 years experience guy, who may not be exposed to all tags of web.xml. load-on-startup is related to loading of Servlet. See What is load-on-startup tag in web.xml for more details.

10 tough Java interview question and answer
Here is my list of 10 tough or tricky Java interview questions. These questions are mostly from Core Java and I have not included J2EE questions. As I said you may know answers of these tough Java question or you may not even find it tough enough to challenge your Java knowledge but once upon a time these were asked in various Java interview and many programmers including my friends and colleagues find them tough to answer.

Why wait and notify is declared in Object class instead of Thread ? Another tough java question, how can you answer this question if you are not designed Java programming language. anyway, some common sense and deep knowledge of Java programming help to answer such tough core java interview question. See this blog post to learn Why to wait and notify is declared in Object class and not in Thread.

Why is multiple inheritances not supported in Java ? I found this core Java question really tough to answer because your answer may not satisfy Interviewer, in most cases Interviewer is looking for specific points and if you can bring them, they would be happy. The key to answering this kind of tough question in Java is to prepare topic well to accommodate any follow-ups. See Why multiple inheritances are not supported in Java for an answer of this tough Java question.

Why does Java not support operator overloading ? One more similar category of tough Java question. C++ supports operator overloading than why not Java? this is the argument Interviewer will give to you and sometimes even say that + operator is overloaded in Java for String concatenation, Don't be fooled by such arguments. See Why to support operator overloading is not supported in Java for detailed answer of this tricky Java question.

Why is String immutable in Java? My favorite Java interview question, this is tough, tricky but same time very useful as well. Some interviewer also asks this question as Why String is final in Java. look at this post for some points which make sense on Why String is final or immutable in Java

Why char array is preferred to store password than String in Java? Another tricky Java question which is based on String and believe me there is only few Java programmer which can answer this question correctly. This is a real tough core Java interview question and again the solid knowledge of String is required to answer this. see Why char array is better than String for storing the password in Java to find out the answer to this tough Java question.

How to create a thread-safe singleton in Java using double-checked locking? Tough core Java interview questions and answersThis Java question is also asked as What is a thread-safe singleton and how to do you write it. Well, Singleton created with double checked locking before Java 5 was a broker and it's possible to have multiple instances of Singleton if multiple threads try to create an instance of Singleton at the same time. from Java 5 it's easy to create thread-safe Singleton using Enum. but if interviewer persists with double checked locking then you have to write that code for them. remember to use a volatile variable. See 10 Java singleton interview question for more details on this topic.

Write Java program to create a deadlock in Java and fix it ? One of the classical but tough core Java interview question and you are likely to fail if you have not involved in the coding of multi-threaded concurrent Java application. See how to create and prevent deadlock in Java for complete answer of this tough core Java interview question

What happens if your Serializable class contains a member which is not serializable? How do you fix it? Any attempt to Serialize that class will fail with NotSerializableException, but this can be easily solved by making that variable transient for static in Java. See Top 10 Serialization interview question answers in Java for more details.

Why wait and notify called from synchronized method in Java? Another tough core Java question for the wait and notify. They are called from synchronized method or synchronized block because wait and modify need monitor on Object on which wait or notify-get called. See Why to wait and notify require synchronized context for a complete answer to this tough and tricky Java multi-threading question.

Can you override static method in Java? if I create the same method in the subclass is it compile time error? No, you can not override static method in Java but it's not a compile-time error to declare an exactly same method in a subclass, That is called method hiding in Java. See Can you override static method in Java for a complete answer to this tough Java interview question.

These were my list of tough core Java interview question and answers. Some of the Java questions doesn't look that tough for experienced programmer but they are really tricky to answer for intermediate and beginners in Java. by the way, if you have faced any tough Java question in an interview then please share with us.

Top 20 Essential Java Interview Questions with Answers for Freshers with 1 to 2 years Experienced https://www.java67.com/2018/03/20-Java-Interview-Questions-Answers-freshers-1-2-3-YearsExperienced-Programmers.html

What's is Polymorphism in Java or OOP? (answer)
Given a reference to an abstract class Shape that has an abstract method named Draw, how does Java determine which version of the draw to call? What portion is handled at runtime and what portion at compile time? (answer)
what is the difference between an array and a linked list? How does this affect performance and memory usage? (answer)
Describe garbage collection. What do mark and sweep mean? How about generational garbage collection? (answer)
what is the difference between a string literal and a string object? (answer)
what is the difference between int and Integer? (answer)
what is a binary search tree? How do you implement in Java? (answer)
what is a heap memory in Java? (answer)
how would you implement a priority queue in Java? (answer)
what does "Big O of n" mean in practice? Will an O(n) algorithm always outperform an O(n*n) algorithm? (answer)
What is the difference between a list and a linked list in Java? (answer)
What is a map in Java? (answer)
what is an array in Java? (answer)
What is a thread in Java? (answer)
What is a lock in Java? (answer)
What is deadlock? (answer)
Difference between Overloading and Overriding? (answer)
Difference between abstract class and interface? (answer)
Difference between Process and Thread in Java? (answer)
Difference between "extends" thread and "implements" Runnable? (answer)
Top 10 Tricky Java interview questions and Answers https://www.java67.com/2012/09/top-10-tricky-java-interview-questions-answers.html

Top 40 Advanced Java/J2EE Interview Questions Answers for Experienced - 3 to 5 Years https://www.java67.com/2017/06/39-essential-java-jee-support-engineer-interview-questions-answers.html

Thread
Asynchronous
Asynchronous means that the block is not all executed at the same time.
"Asynchronous" means "not using the same clock" so the instructions are not concerned with being in step with each other. That's why it looks backwards, the term is not referring to the instructions relationship to each other. It's referring to each instructions relationship to the clock. Hope that helps.
Asynchronous execution, you begin a routine, and let it run in the background while you start your next, then at some point, say "wait for this to finish". It's more like: Start A->B->C->D->Wait for A to finish. The advantage is that you can execute B, C, and or D while A is still running (in the background, on a separate thread), so you can take better advantage of your resources and have fewer "hangs" or "waits".
Asynchronous Execution: All tasks within a block of code are not all executed at the same time.
Synchronous [existing or occuring at same time]
When you execute something synchronously, you wait for it to finish before moving on to another task. When you execute something asynchronously.
Synchronous execution means the execution happens in a single series. A->B->C->D. If you are calling those routines, A will run, then finish, then B will start, then finish, then C will start, etc.
Oddly enough "Synchronously" means "using the same clock" so when two instructions are synchronous they use the same clock and must happen one after the other.
Synchronous Execution: All tasks within a block of code are all executed at the same time.
What absolutely confuses me is that synchronous means "at the same time", yet when used in the sense above, it means sequential, and asynchronous means "not at the same time"...?? Can somebody explain this conflict?
@Zenph: In this context, an entire block of code is what we're concerned with. Synchronous means that the block is executed at the same time (though, yes, the components are executed sequentially). Asynchronous means that the block is not all executed at the same time.
Concurrent
Parallel
Thread Implementation
https://stackoverflow.com/questions/748175/asynchronous-vs-synchronous-execution-what-does-it-really-mean

Process and threads
in concurrent programming there are two basic unit of execution process and thread.
In java we usally focused on thread.
A computer system usally have many active processes and threads, processing time for single core is shared among processes and threads -> this is the time slicing
Process
Process has a self contain execution environment, has a private set of runtime resources for exmple each process has its owne memory space, process can communicate with each other (IPC). IPC is used not just for communication between process on the same system, but process on different system...

Thread
What is thread? Thread are lightweight process...

Both Thread and process provide Execution environment, but creating new thread require fewer resources then creating new process...

Thread exist within a process
Every process has atlest one thread...
Thread share the processes resources including memory and open files...
in java application we can create new thread with the help of new thread...
Advantages of multithreading
We can design more responsive software -> Several things at same time
we can achieve better resources utilization
we can improve performance
Disadvantages of multithreading
Multithreading is not always better
thread manupulate data located on same memory area -> we have to take it into consideration
difficult to design multithread software
Hard to detect error
Expensive operation -> switching between two thread
Thread Life Cycle
new
runnable
running
waiting
dead
New When we instantiate a thread It is in this state until we start it start()
Runnable after we have started the thread the thread is executing its task in this state.
Waiting when a thread is waiting for example for another thread to finish its task, when one thread signals -> this thread goes back to the runnable state -> wait() , sleep()
DEAD After this thread finished its tasks.
Thread Join
join() waits to thread die

Volatile
Every read of a volatile variable will be read from RAM so from main memory. Not from cache. usally variable are cache are for performance reasons

Caches are faster -> Do not use volatile keyword if not necessary (it prevents instruction re ordering which is a performence boost techinique)

Thread Deadlock
Two process blocked each other is called dedlock. Deadlock is a situation in which two or more competing actions are each waiting for the other to finish, and thus neither ever does Databases  deadlock happens when two processes each within its own transaction updates two rows of information but in the opposite order. For example, process A updates row 1 then row 2 in the exact timeframe that process B updates row 2 then row 1 !!! Operating system  a deadlock is a situation which occurs when a process or thread enters a waiting state because a resource requested is being held by another waiting process, which in turn is waiting for another resource held by another waiting process.

Thread Livelock
A thread often acts in response to the action of another thread If the other thread's action is also a response to the action of another thread  livelock !!! Livelocked threads are unable to make further progress. However, the threads are not blocked  they are simply too busy responding to each other to resume work Like two people attempting to pass each other in a narrow corridor: A moves to his left to let B pass, while B moves to his right to let A pass. They are still blocking each other, A moves to his right, while B moves to his left ... still not good.

What is Synchronization in Java
Synchronization in Java is an important concept since Java is a multi-threaded language where multiple threads run in parallel to complete program execution. In multi-threaded environment synchronization of Java object or synchronization of Java class becomes extremely important. Synchronization in Java is possible by using Java keywords "synchronized" and "volatile”.

Concurrent access of shared objects in Java introduces to kind of errors: thread interference and memory consistency errors and to avoid these errors you need to properly synchronize your Java object to allow mutual exclusive access of critical section to two threads.

Lock
private static Object lock2 = new Object();
	
	public  static void add() {
		// when execute this method blocks all other threads...
		//synchronized(_10SynchronizedBlocksSolution.class) {//when execute this method block or lock all other threads... in the same class
			// how we get read of , we can not lock whole class, we can lock just an object
		synchronized(lock1) {	
			count1++;
		}
	}
https://www.baeldung.com/java-wait-notify

wait();
The wait() method causes the current thread to wait indefinitely until another thread either invokes notify() for this object or notifyAll().

wait(long timeout)
Using this method, we can specify a timeout after which thread will be woken up automatically. A thread can be woken up before reaching the timeout using notify() or notifyAll().

Note that calling wait(0) is the same as calling wait().

notify();
The notify() method is used for waking up threads that are waiting for an access to this object's monitor.

There are two ways of notifying waiting threads. For all threads waiting on this object's monitor (by using any one of the wait() method), the method notify() notifies any one of them to wake up arbitrarily. The choice of exactly which thread to wake is non-deterministic and depends upon the implementation. Since notify() wakes up a single random thread it can be used to implement mutually exclusive locking where threads are doing similar tasks, but in most cases, it would be more viable to implement notifyAll(). This method simply wakes all threads that are waiting on this object's monitor. The awakened threads will complete in the usual manner – like any other thread. every iteration we have to call notify() method in order to tell the other thread, okay if you want to do something with this consumer method, you can get the lock if we get some code after notify() then it cannot control to the other thread..... question: when we called notify method that time why its not hand back to the other thread? notify method will run inside this thread. when it get wait() it transfer control to the another thread... and lost operation of given method....

ReentrantLock
public static Lock lock = new ReentrantLock();//it is equivalent as synchronized method Thread t1 and t2 is not able to run increment() at a same time coz they are locking on the same lock.

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void producer() throws InterruptedException {

		lock.lock();
		System.out.println("Producer method....");
		condition.await();// same as wait
		System.out.println("Producer again....");
		lock.unlock();

	}

	public void consumer() throws InterruptedException {
		lock.lock();
		Thread.sleep(2000);
		System.out.println("Consumer method....");
		condition.signal();// same as notify
		lock.unlock();

	}
Lock vs Synchronization
A reentrant lock has basic behaviour as we have seen so for synchronized blocks

We can make a lock fair : prevent thread stervation Synchronized blocks are unfair by default...
We can check wheather the given lock is heald or not with reentrant lock
we can get the list of thread waiting for given lock with reentrant locks
Synchronized block are nicer: we do not need the try catch finally block.
Semaphore
Semaphore are variable or ADT that are used for controlling access to common resources
Semaphore is a record of how many unit of perticular resources are available ... wait until a unit of resources become available
Binary Semaphore : Semaphore which has resticted to the values 0 and 1
Semaphore tracks how many resources are free, it doesnot tracks that which resources are free
Semaphore count many serve as a useful trigger for a number of different actions
producer-consumer problem can be solved with the help of semaphore
Mutex
Mutex is essentially same things as binary semaphore
while a binary semaphore is used as a mutex. a mutex has more specific use-case
mutex has concept of his owner. Only the process that locked the mutex is supposed to unlock it.
Mutex can provide priority inversion safty. If mutex know its current ownerit is possible to promot the priority of the owner whenever a high priority tasks starts waiting on the mutex, mutex can provide deletion safty
Parallel, Concurrent, Synchronous, Asynchronous and Distributed Computing কোনটা কি? একজন কাস্টমার ফুড এর দোকানে গেলো। বসলো এবং নিচের কাজগুলি করলোঃ

০১. কাস্টমার ওয়েটারকে “চিকেন বিরিয়ানী” আনতে অর্ডার দিলো ০২. এরপর কাস্টমার অপেক্ষা করতে লাগলো বিরিয়ানী আসার

এইদিকে ওয়েটার গিয়ে তাদের ১০ জন শেফ এর মাঝে একজন খালি থাকা শেফ কে বললেন কাস্টমার এর অর্ডার করা বিরিয়ানীর কথা। আর যদি ১০ জন শেফের সবাই ব্যস্ত থাকে তাহলে হোটেল এর দ্বিতীয় শাখায় কাজ পাঠিয়ে দেয়া হয়। শেফ বিরিয়ানী রান্না করতে শুরু করলো। ওয়েটার এসে কাস্টমারকে জানালো “অপেক্ষা করুন, আপনার অর্ডার গরম গরম প্রস্তুত করা হচ্ছে”। এরপর কাস্টমার অপেক্ষা করতে লাগলো আর ঐদিকে ওয়েটার নতুন আসা আরেক কাস্টমারের কাছে গেলো এবং একইভাবে ঐ নতুন কাস্টমারের কাছ থেকে অর্ডার নিয়ে আরেকজন শেফকে দায়িত্ব দিলো রান্না করার।

খেয়াল করে দেখুন, কাস্টমার কিন্ত অর্ডার দিয়ে অপেক্ষায় বসেই আছে। সে কিন্ত এই অর্ডার না খেয়ে বাহিরে গিয়ে অন্য কাজ করতে পারতেছে না। তার মানে খাবার এর অর্ডারের জন্য কাস্টমারের অন্য কাজগুলি ব্লক হয়ে আছে। আর অপরদিকে ওয়েটার কিন্ত প্রত্যেকটা কাস্টমারের কাছ থেকেই অর্ডার নিচ্ছেই, কখনোই কোনো কাস্টমারকে বলছে না “আমাদের আগের কাস্টমার এর অর্ডার চলছে, তারটা শেষ হলে আপনারটা দিবো”। এটা বললে তার ব্যবসা থাকবে না। তাই সে মোট ১০ জন অভিজ্ঞ শেফ রেখেছেন যারা ৫ মিনিটে রান্না করা খাবার গরম করে সার্ভ করতে পারে। এরপরও ১০ জন ব্যস্ত হলে হোটেল এর দ্বিতীয় শাখায় কাজ পাঠিয়ে দেয়া হয়।

আসুন কম্পিউটিং এর দিক থেকে চিন্তা করি।

এখানে কাস্টমার এর কাজগুলি একটার পর আরেকটা হচ্ছে, আগের কাজ সম্পন্ন না হলে পরেরটা করতে পারছে না এবং আগের কাজটা পরের কাজকে ব্লক করে রাখছে, এটা হলো “সিনক্রোনাস বা সিক্যুয়েন্সিয়াল প্রসেসিং”

কিন্ত ওয়েটার কিন্ত একটা অর্ডার নিয়েই বসে নেই, সে এক সাথে অনেকগুলি অর্ডার নিচ্ছে এবং শেফদের মাঝে কাজ ভাগ করে দিচ্ছে। এবং যখন শেফ তার কাজ শেষ করছে তখন সে ওয়েটারকে জানিয়ে দিচ্ছে যে অর্ডার রেডি। এরপর ওয়েটার গিয়ে খাবার নিয়ে এসে কাস্টমারকে দেয়। ওয়েটার অর্ডারগুলিকে শেফদের মাঝে ভাগ করে দিয়ে নিজেকে ফ্রি রাখছে নতুন কাস্টমারের জন্য। যার ফলে কোন অর্ডারই তার কাজকে ব্লক করতে পারছে না। এখানে ওয়েটার এর কাজ হলো “এসিনক্রোনাস প্রসেসিং”

অপরদিকে কাজ কিন্তু একই ধরনের “খাবার প্রস্তুত করা” কিন্ত এই একই কাজ অনেক কাস্টমারের হয় বিধায় একই সাথে ১০ জন অভিজ্ঞ শেফ এর মাঝে কাজগুলি ভাগ করে দেয়া হয় যাতে করে প্রত্যেক শেফই একই সাথে “খাবার প্রস্তুত করা” কাজটি সম্পন্ন করতে পারে। এখানে ১০ জন শেফ এর মাঝে একটি কাজ ভাগ করে বন্টন করে একই সাথে চালিয়ে যাওয়াটা হলো “প্যারালাল প্রসেসিং”।

সর্বশেষ খেয়াল করুন, ১০ জন শেফই যদি ব্যস্ত থাকে তাহলেও কিন্ত কাস্টমারকে ফিরিয়ে দেয়া হচ্ছে না। বরং অর্ডারকে হোটেল এর আরেক শাখায় পাঠিয়ে দেয়া হয় তৈরি করার জন্য। এটা হচ্ছে “ডিস্ট্রিবিউটেড প্রসেসিং”।

https://medium.com/%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A7%8B%E0%A6%97%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%AE%E0%A6%BF%E0%A6%82-%E0%A6%AA%E0%A6%BE%E0%A6%A4%E0%A6%BE/asynchronous-%E0%A6%93-multi-threading-%E0%A6%AA%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B0%E0%A6%BE%E0%A6%B2%E0%A6%BE%E0%A6%B2-%E0%A6%AA%E0%A6%BE%E0%A6%87%E0%A6%A5%E0%A6%A8-%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A7%8B%E0%A6%97%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%AE%E0%A6%BF%E0%A6%82-cff303dee2cb

Lamda Expression/Stream API

Collection API

ArrayList
add(200);
remove(0);//first index
LinkedList
HashMap
map.put(6, "Six");
Map.Entry<Integer, String> entry : map.entrySet()
key = entry.getKey();
entry.getValue();
TreeMap
short keys in natural worder
LinkedHashMap
// maintain order that we put
HashSet
HashSet does not return any order
set1.add("cat");
set1.isEmpty()
.removeAll(set2);
set1.contains("Abdullah")
LinkedHashSet
remember the order that we added
TreeSet
TreeSet sort in natural order
PriorityQueue
ArrayDeque
EnumSet
Spliterators(Not completed) page 536 hs, tcr, 9e
Comparators
Unlike Comparable, Comparator is external to the element type we are comparing. It’s a separate class. We create multiple separate classes (that implement Comparator) to compare by different members.
Comparable
A comparable object is capable of comparing itself with another object. The class itself must implements the java.lang.Comparable interface to compare its instances.
When we make a collection element comparable(by having it implement Comparable), we get only one chance to implement the compareTo() method.
Dictionary
Hashtable
SOLID Principle

Design pattern basic[novice level]

What problem is solved by Strategy pattern in Java? (answer)
Strategy pattern allows you to introduce new algorithm or new strategy without changing the code which uses that algorithm. For example, the Collections.sort() method which sorts the list of the object uses the Strategy pattern to compare object. Since every object uses different comparison strategy you can compare various object differently without changing sort method.
Which OOP concept Decorator design Pattern is based upon? (answer)
Decorator pattern takes advantage of Composition to provide new features without modifying the original class. A very good to-the-point question for the telephonic round. This is quite clear from UML diagram of Decorator pattern, as you can see the Component is associated with Decorator.
When to use Singleton design pattern in Java? (answer)
When you need just one instance of a class and wants that to be globally available then you can use Singleton pattern. It's not free of cost though because it increases coupling between classes and makes them hard to test. This is one of the oldest design pattern questions from Java interviews. Please see the answer for more detailed discussion.
What is the difference between State and Strategy Pattern? (answer)
Though the structure or class diagram of State and Strategy pattern is same, their intent is completely different. State pattern is used to do something specific depending upon state while Strategy allows you to switch between algorithms without changing the code which uses it.
What is the difference between Association, Aggregation, and Composition in OOP? (answer)
When an object is related to another object it called association. It has two forms, aggregation, and composition. the former is the loose form of association where the related object can survive individually while later is a stronger form of association where a related object cannot survive individually. For example, the city is an aggregation of people but is the composition of body parts.
What is the difference between Decorator, Proxy and Adapter pattern in Java? (answer)
Again they look similar because their structure or class diagram is very similar but their intent is quite different. Decorator adds additional functionality without touching the class, Proxy provides access control and Adapter is used to make two incompatible interfaces work together.
What is the 5 objects oriented design principle from SOLID? (answer)
SOLID is the term given by Uncle Bob in his classic book, the Clean Code, one of the must-read books for programmers. In SOLID each character stands for one design principle: S for Single Responsibility Principle O for Open closed design principle L for Liskov substitution principle I for Interface segregation principle D for Dependency inversion principle
What is the difference between Composition and Inheritance in OOP? (answer)
This is another great OOPS concept question because it tests what matters, both of them are very important from a class design perspective. Though both Composition and Inheritance allows you to reuse code, formerly is more flexible than later. Composition allows the class to get an additional feature at runtime, but Inheritance is static. You can not change the feature at runtime by substitution new implementation. See the answer for more detailed discussion.
Low level implementation

Abstract/interface/
default / final
Garbage Collection
Memory Structure
Heap Memory
Non Heap Memory
Meta Space
Garbage Collector
Serial GC
Parallel GC
Garbage First Collector [G1]
Concurrent Mark and Sweep GC
Types of Garbage Collector
Concurrent Collector
Parallel Collector
Stop The world
Garbage Collector Steps
Marking
Sweep
Compact
Operating System
Threads and Concurrency
User Level Threads
Kernel Level Threads
Interrupt
Processes
Scheduling
Inter-Process Communication
Memory Management
Shared Memory Method
I/O Management
Special Instruction I/O
Memory-mapped I/O
Direct memory access (DMA)
Virtualisation
Distributed File Systems
Distributed Shared Memory
Software Engineering [Agile/Scrum]
Process Model
The waterfall model
Evolutionary Development model
Component-based Software Engineering
The Incremental Model
Prototyping
Rapid Application Development (RAD)
Boehm’s Spiral Model
The Rational Unified Process
Agile
Computer Organisation and Architecture
Database Design
RDMS (Core Concept)

Database Management System

Relationship Concept

Designing A Database

Characteristics of DB

Database Schema

A database schema is the skeleton structure that represents the logical view of the entire database. It defines how the data is organized and how the relations among them are associated. It formulates all the constraints that are to be applied on the data.
Constraints

Entity integrity constraint states that no primary key value can be NULL
The Referential integrity constraint is specified between two relations and is used to maintain the consistency among tuples in the two relations. The referential integrity constraint states that a tuple in one relation that refers to another relation must refer to an existing tuple in that relation
ER MODEL

ENTITY

Entity is a thing in the real world with an independent existence
Physical existence: person, car, house or employee
Conceptual existence: company, job or university
Attributes

Each entity has attributes—the particular properties that describe it. For example, an EMPLOYEE entity may be described by the employee’s name, age, address, salary, and job.
ER MODEL

Composite Attributes

Multivalued Attribute

If an attribute can have more than one value it is called an multivalve attribute.
It is important to note that this is different to an attribute having its own attributes.
For example a teacher entity can have multiple subject values.
Derived Attribute

An attribute based on another attribute. This is found rarely in ER diagrams.
For example for a circle the area can be derived from the radius.
Recursive Relationships

Cardinality Ratios for Binary Relationship

N:1 Relationship
M:N Relationship
Participation constraint
The participation constraint specifies whether the existence of an entity depends on its being related to another entity via the relationship type
There are two types of participation constraints—total and partial
If a company policy states that every employee must work for a department, then an employee entity can exist only if it participates in at least one WORKS_FOR relationship instance.
Normalisation

Normalization is a process for evaluating and correcting table structures to minimize data redundancies, thereby reducing the likelihood of data anomalies.
First Normalisation(1NF)
Table format, remove repeating groups and primary key identified.
Second Normalisation(2NF)
1NF and remove pertial dependency.
Third Normalisation(3NF)
2NF and remove transitive dependency.
Boyce-Codd normal form(BCNF)
Every diterminat is a candidate key(Special case of 3NF)
Functional Dependence

The attribute of B fully dependent on attribute of A if each value of A only one determines one and only one value of B.
Proj_Num -> Proj_Name
Proj_Num functionaly determines Proj_Name. In this case Proj_Num is known as the determinat attribute, and the attribute Proj_Name is know as dependent attribute.
This "depends" is what we mean by dependency (column is dependent on the primary key)
Partial-key Dependency

A dependency based on only a part of a composite key is a partial dependency.
Ex : Transaction Number Customer Number Customer Name
Transaction Number + Customer Number = composite key
We record the customer's name in the customer table, not the transaction table
Transitive Dependency

The functional dependency {Book} → {Author Nationality} applies; that is, if we know the book, we know the author's nationality.

Furthermore:

{Book} → {Author}
{Author} does not → {Book}
{Author} → {Author Nationality}
Therefore {Book} → {Author Nationality} is a transitive dependency.
RELATIONAL ALGEBRA

INDEXING AND B-TREE

RAID

Objective of normalisation

SQL Query

Backend
Spring Core

What is dependency injection
if any object1 is dependent on another object2, that time object2 make an instance through Spring and initialize on object1
Example , Patient has address, when patinet class instantiate she need address class instance, address class instance injected to patient class through dependency injection. i.e Patient class is dependent on address class, address class is an independent class.....
what is spring bean?
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container.
Bean Scope, difference between prototype and singleton scope ?
when we call a beans through Spring from a App , that time she give same object referrence many time, thats why called singleton.
when we call a beans through Spring from a App , that time she give changed object referrence when changed, thats why called prototype.
Bean Init and Destroy methods
Spring call destroy method only for singleton object
when a bean create, after initialize value , then bean will destroyed. that time we may need to run another method
Factory Method
Due to some constructor issue, or sum dependency issue, we want to run program without constructor method, that itme we can use factory method.
we have to create a factory method, through factory method to beans configuration, we have to take patient beans
Define properties using p-namespace
just alternative way of factory method
Define properties using c-namespace
we will see how to use reference beans through p-namespace
p-namespace use for properyies
c-namespace use for constructor arguments
how initialize list , map through beans
List is the property of collection class object
Setting List of beans
Inner Beans
Setting Maps
Use null to set a property
Autowoiring
Autowiring feature of spring framework enables you to inject the object dependency implicitly. It internally uses setter or constructor injection.

byName : The byName mode injects the object dependency according to name of the bean. In such case, property name and bean name must be same. It internally calls setter method.
byType : The byType mode injects the object dependency according to type. So property name and bean name can be different. It internally calls setter method.
constructor : The constructor mode injects the dependency by calling the constructor of the class. It calls the constructor having large number of parameters.
The Autowired Annotation

context:annotation-config</context:annotation-config>
Autowired by default work byType
@Autowired
Required Attribute of Autowired Annotation

@Autowired(required = false) //conostructor level auto wiring
The Qualifiers Annotation

The @Qualifier annotation is used to resolve the autowiring conflict, when there are multiple beans of same type. The @Qualifier annotation can be used on any class annotated with @Component or on method annotated with @Bean . This annotation can also be applied on constructor arguments or method parameters.
@Qualifier("filewriter") //class level qualifier
The Resource Annotation JSR 250

You can use @Resource annotation on fields or setter methods and it works the same as in Java EE 5. The @Resource annotation takes a ‘name‘ attribute which will be interpreted as the bean name to be injected. You can say, it follows by-name autowiring semantics as demonstrated in the below example
@Resource(name="example")
init destroy method through annotation

@PostConstruct
@PreDestroy
Inject Annotation JSR 330

@Inject
@Named(value="demoWriter2")
Automatic Bean Discovery

@Component
<context:component-scan base-package="com.cma.spring.exceptiontest"></context:component-scan>
Setting Property Values through Annotations

@Autowired
public void setId(@Value("1234")int id) {
this.id = id;
}
Spring MVC

@RequestMapping("/")

View Resolvers

Adding Data to Session -> session.setAttribute("name", "C M Abdullah Khan");

Using Spring Data Models -> model.addAttribute("name", "tipu sultan");

Using JSTL <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

${name}

  Configuring a JNDI DataSource
  <sql:query var="rs" dataSource="jdbc/spring">
  			select id, name, email, text from notices
  		</sql:query>
  		<!--For each loop-->
  		<c:forEach var="row" items="${rs.rows}">
  			Name: ${row.name}<br/>
  			Email: ${row.email}<br/>
  		</c:forEach>
Loading Bean Containers with ContextLoaderListener

Creating DataSource Bean

Adding a Service Layer

@Service("noticesService")

Getting URL Parameters

Model

ModelMap

ModelAndView

BindingResult

Annotation

@Controller
@RequestMapping
@PathVariable
@RequestParam
@ModelAttribute
@RestController
Validation Using Spring MVC /Spring MVC supports JSR-303
@NotNull
@Min
@Max
@RequestBody
@ResponseBody
@SessionAttributes
@SessionAttribute
@EnableWebMVC
@Qualifier
MultipartResolver
@InitBinder
@ExceptionHandler
@ControllerAdvice
@ResponseStatus
@ControllerAdvice
JDBCTemplate

creation and closing of connections

executing statements and stored procedure calls

iterating over the ResultSet and returning results

Spring AOP
camera

snap()//Action
Logger //Aspect

aboutToTakePhoto()//Advice
By using pointcut we can define joinpoint
Annotation Based Aspects

@Aspect
@Before("execution( void com.spring.aop.Camera.snap())")
@Pointcut("execution( void com.spring.aop.Camera.snap(..))")// this pointcut will execute for all snap methid with different parameter.......
@Pointcut("execution( * com.spring.aop.Camera.snap(..))")// wildcut all snap method type....
@Pointcut("execution( * com.spring.aop.Camera.*(..))")// this execution joinpoint will axecute for all method inside Camera class....
@Pointcut("execution( * com.spring.aop.Camera.*(..))")
@Pointcut("execution( * .(..))")//this join point will execute for all classes....... methods...
@Pointcut("execution( * .(..))")//this pointcut will execute for all package ,all classes, allmethodes....
Advice Types - After, Around, and Others

@After("cameraSnap()")
if method is executed normally
@AfterReturning("cameraSnap()")
@AfterThrowing("cameraSnap()")
@Around("cameraSnap()")
Spring Boot
ORM
Hibernate
Front End
jsp
Thyme-leaf
Version Control
Git
The 10 Operating System Concepts Software Developers Need to Remember https://medium.com/cracking-the-data-science-interview/the-10-operating-system-concepts-software-developers-need-to-remember-480d0734d710

behevioural interview
Why did you choose to be a software engineer? I have been been facinated by technology all my life, and I also like working with people. The idea of developing something, to solve a real life problem with the help of technology keeps me going. I loved the ability of a programmer to make a machine work as per his desire just by writing a few commands.

What programming languages have you used in the past? What are your top programming languages? I'm proficient in Java, C. My two best programming languages is Java.

How much are you coding on a daily basis? If you do not code on a daily basis, what is typical in your role? I code at least 30 hours a week. The rest of my time at work is spent working on design reviews, scrums, meetings and other tasks to keep projects moving forward..

What distinguishes a great software engineer from a good one? Do you feel you have those qualities? A great software engineer has a healthy balance between perfectionism and pragmatism. Too often engineers want their code to be perfect, while losing sight of the overall goals of the project. A great programmer also learns not to fall in love with their own code, to keep a healthy skepticism until it's been thoroughly tested, making sure it is the right choice for the project at hand. And yes, I believe have the qualities of a great programmer, though working on my need to be perfect is an ongoing battle.

In your opinion, what are the principles of good software engineering? What are some basic principles everyone should follow? I think one of the main principles of software engineering, and one I try to live by, is to keep things as simple as possible. You're often already dealing with complex algorithms and design concerns, so no need to make things even more difficult with overly complicated, resource-heavy code. Your code should be simple, lean and easy to read. If you start there, the rest will follow.

If needed, how would you go about designing scalable applications? Walk us through your process. You design scalable projects by writing as little code as possible. You also want to reuse as much code as you can while not over or under doing your design. Then break things down into modular sections that can run on multiple or separate systems.

Why oracle certification is needed ? The knowledge and skills you learn during the process of preparing for your exam(s) give you confidence and personal satisfaction. You broaden your knowledge. You expand your skills beyond your daily responsibilities.

@maainul
 
Leave a comment
No file chosen
Attach files by dragging & dropping, selecting or pasting them.
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
