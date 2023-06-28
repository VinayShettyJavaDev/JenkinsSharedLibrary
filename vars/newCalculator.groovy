class Calculator {
    static int add(int a, int b) {
        return a + b
    }

    static int subtract(int a, int b) {
        return a - b
    }

    static int multiply(int a, int b) {
        return a * b
    }

    static double divide(int a, int b) {
        if (b == 0) {
            println("Error: Division by zero is not allowed.")
            return Double.NaN
        }
        return a.toDouble() / b.toDouble()
    }
}

// Prompt for user input and perform calculator operations
def userInput = System.console().readLine("Enter two numbers (space-separated): ")
def inputArray = userInput.trim().split("\\s+")
if (inputArray.length == 2) {
    def a = Integer.parseInt(inputArray[0])
    def b = Integer.parseInt(inputArray[1])

    println("Choose an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")

    def choice = System.console().readLine("Enter your choice: ")
    switch (choice) {
        case "1":
            println("Result: " + Calculator.add(a, b))
            break
        case "2":
            println("Result: " + Calculator.subtract(a, b))
            break
        case "3":
            println("Result: " + Calculator.multiply(a, b))
            break
        case "4":
            println("Result: " + Calculator.divide(a, b))
            break
        default:
            println("Invalid choice!")
    }
} else {
    println("Invalid input!")
}

