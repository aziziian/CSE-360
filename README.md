# HW4 - Staff Review Manager

**Author:** Ian Azizi  
**Course:** CSE 230 - Spring 2025  
**Project:** HW4 – Staff Review Manager

---

## 📌 Overview

This project is a simple Java program for managing questions, answers, and feedback that could be used by staff members in an educational setting. The idea is to let staff review what students are asking, how questions are being answered, and to allow internal feedback to be stored. It was built using object-oriented programming principles and tested with JUnit.

This is for Homework 4 in CSE 230, and everything was built without using external frameworks—just plain Java and some JUnit 5 for testing.

---

## 🧠 User Story (Epic)

> As a staff member, I want to review questions, answers, and private feedback so that I can monitor student interactions and identify any concerns early.

---

## 💡 Features

- Add new questions, answers, and feedback
- View lists of all submitted questions, answers, and feedback
- Easily extendable for more features later on
- Unit tests included using JUnit 5

---

## 🧱 Classes

- `Question`: Stores a question string and the author's name.
- `Answer`: Stores an answer string and the responder's name.
- `Feedback`: Stores feedback from staff with an optional name.
- `StaffReviewManager`: Main class that stores and manages all the questions, answers, and feedback.
- `StaffReviewManagerTest`: JUnit test file to test that the above features work correctly.

---

## ▶️ How to Run (In Eclipse)

1. Open Eclipse and create a new **Java Project**.
2. Create a package called `edu.asu.hw4`.
3. Add all the `.java` files for the classes above in that package.
4. Download JUnit 5 (I used `junit-platform-console-standalone-1.9.3.jar`) and place it in a folder named `lib` in your project.
5. Right-click your project > Properties > Java Build Path > Add External JARs → Select the JUnit `.jar` file.
6. Under “Classpath” (not “Modulepath”), add the `.jar`.
7. Right-click on `StaffReviewManagerTest.java` → Run As → JUnit Test.

---

## 🧪 Testing

The `StaffReviewManagerTest` class includes:

- Test for adding and retrieving a question
- Test for adding and retrieving an answer
- Test for adding and retrieving feedback

All tests should pass when everything is set up correctly.

---

## 📸 Screencast

A short screencast is included to show:

- How the program works
- How to run the tests
- What output you should expect

Screencast link:  
https://github.com/user-attachments/assets/dfd3f856-dae9-43e0-a12e-706f06061f6f



---

## 📚 Javadoc

I’ve added Javadoc comments to all classes and tests. You can generate them in Eclipse:

- Go to **Project > Generate Javadoc**
- Select all classes and set an output folder like `/doc`
- After it’s done, open `index.html` in your browser to view the documentation
