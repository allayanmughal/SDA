Description
Polymorphism is a core concept in object-oriented programming (OOP) that allows objects to be treated as instances of their parent class or interface. It enables methods to perform different functions based on the object that it is acting upon, promoting flexibility and reusability in code.

There are two main types of polymorphism in Java:

Compile-time polymorphism (method overloading): This occurs when multiple methods in the same class have the same name but different parameters.

Runtime polymorphism (method overriding): This occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

In this example, we demonstrate runtime polymorphism through method overriding and interface implementation using a simple animal hierarchy.

Example Code
The example consists of a base class Animal, two subclasses Dog and Cat, and an interface Pet. The Animal class defines a method makeSound(), which is overridden in the subclasses to provide specific sounds for dogs and cats. The Pet interface defines a play() method, which is implemented by both subclasses.
