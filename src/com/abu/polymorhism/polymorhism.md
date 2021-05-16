# Method Overloading in Java
```
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
```

There are two ways to overload the method in java
1. By changing number of arguments
2. By changing the data type


# Method Overriding in Java
> If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

## Usage of Java Method Overriding
1. Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
2. Method overriding is used for runtime polymorphism

## Rules for Java Method Overriding
1. The method must have the same name as in the parent class
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship (inheritance).


# Flaws 
1. Can we override static method?
> No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

2. Why can we not override static method?
> It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

3. Can we override java main method?
> No, because the main is a static method.