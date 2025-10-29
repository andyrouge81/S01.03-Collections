# S1.03-Collections ⛓️

## 🧾 Task Objectives


- Complete the exercises proposed below.
- Learn the most important types of Java Collections through practical examples.
- Add files to the repository using Git and GitHub.
>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)

---

## 📚 Documentation

[Collections](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html)

---


## Proposed Exercises

### Level 1. Exercise 1.

<details>
<<<<<<< HEAD
=======

>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)
Create a class named `Month` with an attribute `name` (which stores the name of the month). Add 11 `Month` objects (each with a different value) to an `ArrayList`, **excluding** the one with the name `"August"`.  
Then insert `"August"` into the correct position and verify that the `ArrayList` maintains the correct order.

Convert the `ArrayList` to a `HashSet` and confirm that it does not allow duplicates.

Finally, iterate through the collection using both a `for` loop and an `Iterator`.
</details>

---

### Level 1. Exercise 2.

<details>

Create and populate a `List<Integer>`.  
Create a second `List<Integer>` and insert the elements of the first list in reverse order.  
Use a `ListIterator` to read elements from the first list and insert them into the second.


</details>

---

### Level 1. Exercise 3.

<details>
<<<<<<< HEAD
=======

>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)
Read the file `countries.txt` (check the `resources` section), which contains country-capital pairs.  
The program must read the file and store the data in a `HashMap<String, String>`. Then, it should ask for the user's name and display a random country from the `HashMap`.

The user must type the capital of the displayed country. If the answer is correct, they get one point.  
This is repeated 10 times. After all questions, the user's name and final score are saved in a file called `classification.txt`.
</details>
  
---

### Level 2. Exercise 1.

<details>

Create a class called `Restaurant` with two attributes: `name` (String) and `rating` (int).  
Implement the necessary methods to ensure that duplicate `Restaurant` objects (same name and same rating) **cannot** be added to a `HashSet`.

> ⚠️ Important: A restaurant can have the same name as another but **must have a different rating**.


</details>

---

### Level 2. Exercise 2.

<details>

Using the class from the previous exercise, create the necessary implementation so that `Restaurant` objects are sorted by name and by rating in **descending** order.

<<<<<<< HEAD
Example
- name: restaurant1, rating: 8
name: restaurant1, rating: 7
=======
- Example:
- 
    ```bash

        name: restaurant1, rating: 8
        name: restaurant1, rating: 7
>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)

</details>

---

### 💻 Suggested Technologies.

<<<<<<< HEAD
  - Java (JDK) 17 o higher. Oracle
  - IntelliJ IDEA /  Eclipse.
  - Git & GitHub.

### 🤖 Requirements.

 - Java (JDK 17 o higher)
 - IntelliJ IDEA / Eclipse / VSCode with java support
 - Terminal with Git.
=======
- Java (JDK) 17 o higher. Oracle
- IntelliJ IDEA /  Eclipse.
- Git & GitHub.

### 🤖 Requirements.

- Java (JDK 17 o higher)
- IntelliJ IDEA / Eclipse / VSCode with java support
- Terminal with Git.
>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)

### 🚀 Installation.

1. Clone the repository.
<<<<<<< HEAD
	```bash
	git clone https://github.com/andyrouge81/S01.03-Collections.git

2. Navigate to the project directory:
	```bash
	cd S1.03-Collections

3. Open the project in your preferred IDE and ensure JDK compatibility.

   
=======
   ```bash
   git clone https://github.com/andyrouge81/S01.03-Collections.git

2. Navigate to the project directory:
   ```bash
   cd S1.03-Collections

3. Open the project in your preferred IDE and ensure JDK compatibility.


>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)
### ▶️ Execution.

1. Navigate to the corresponding folder and open `Main.java`.
2. Run the file to test the exercise output.
3. You can add objects or simulate exceptions to see how they work.


### 🤝 Contributions.

1. Fork the repository.
2. Create a new branch:
<<<<<<< HEAD
	```bash
	git checkout -b feature/NewFeature
3. Make your changes and commit them:
	```bash 
	git commit -m “feat: add a new feature”
4. Push your changes:
	```bash
	git push origin feature/NewFeature
=======
   ```bash
   git checkout -b feature/NewFeature
3. Make your changes and commit them:
   ```bash 
   git commit -m “feat: add a new feature”
4. Push your changes:
   ```bash
   git push origin feature/NewFeature
>>>>>>> e1a4d39 (fix: change structure directories and refactor methods)
5. Open a pull request and we will review it.

### 💌 Contact.

For questions or suggestions, feel free to open an _Issue_ or reach out via the GitHub profile.




