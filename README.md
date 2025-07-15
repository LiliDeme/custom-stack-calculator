# Custom Stack Calculator

A Java Swing calculator built for educational purposes. It uses a custom generic stack implementation to convert infix expressions to postfix and evaluate them based on operator precedence, including parentheses handling.

---

## Educational Context

This project was developed as a final assignment for the course *Algorithms and Programming Models*. The main objective was to understand how stack-based evaluation works by manually implementing a generic stack structure, rather than relying on built-in Java collections, and applying it to arithmetic expression parsing and evaluation.

---

## Features

- Graphical User Interface (GUI) built with Java Swing
- GUI designed using the Eclipse IDE with the "WindowBuilder" plugin
- Supports infix expression input (e.g., `2 + 3 * (4 - 1)`)
- Converts expressions to postfix notation (Reverse Polish Notation)
- Handles operator precedence including parentheses
- Evaluates expressions using a custom generic stack class
- Displays results dynamically
- Supports input for keyboard

---

## Project Structure

```bash
custom-stack-calculator/
├── src/
│   ├── Calculator.java                      # Main GUI and controller logic
│   ├── expressionsInfixes/
│   │   ├── ConvertisseurInfixeEnSuffixe.java  # Infix → Postfix converter
│   │   └── EvaluateurSuffixe.java             # Postfix evaluator
│   └── PileGenerique/
│       └── Stack.java                         # Custom generic stack implementation
```

---

## How to Run

1. Make sure **Java (JDK 17+)** is installed.
2. Open the project in **VS Code** or your preferred IDE.
3. Run the `Calculator.java` file as a Java application.

Alternatively, from terminal:

```bash
javac src/**/*.java
java -cp src Calculator
```

---

## Notes

- The project currently lacks error handling for cases like **division by zero**.
- The UI layout is functional but minimal.
- Originally in French, as the course was taught in French (Traduction in progress).

---

## To-do

- [ ] Add exception handling (e.g., division by zero)
- [ ] Translate and improve in-code comments
- [ ] Refactor UI layout for better UX
- [ ] Add unit tests for core logic

---

## Author

Liliane Demers  
Junior Software Developer  
[LinkedIn – Liliane Demers](https://www.linkedin.com/in/lilianedemers)

---

## License

This project is open-source and available under the MIT License.
