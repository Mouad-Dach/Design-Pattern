# Strategy Pattern Implementation (DP-SP)

## Project Description
This project demonstrates the implementation of the Strategy design pattern in Java. The Strategy pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

## Project Structure
- `Strategy.java` - The strategy interface that defines the common operation
- `Context.java` - The context class that uses different strategies
- `DefaultStrategyImpl.java` - Default implementation of the strategy
- `StrategyImpl1.java`, `StrategyImpl2.java`, `StrategyImpl3.java` - Different concrete strategy implementations
- `Main.java` - The entry point of the application that demonstrates the pattern in action

## How to Use the Application
1. Run the `Main` class
2. When prompted "Quelle Strategie?", enter one of the following:
   - `1` for Strategy Implementation 1
   - `2` for Strategy Implementation 2
   - `3` for Strategy Implementation 3
3. The application will execute the selected strategy
4. The application will continue to prompt for strategies until terminated

## Design Pattern Explanation
The Strategy pattern is used when:
- You want to define a family of algorithms
- You need to switch between different algorithms at runtime
- You want to avoid conditional statements for selecting desired behavior
- You have multiple classes that differ only in their behavior

### Components in this Implementation:
1. **Strategy Interface** (`Strategy.java`): Defines the common interface for all concrete strategies
2. **Concrete Strategies**: 
   - `DefaultStrategyImpl.java` - The default strategy
   - `StrategyImpl1.java` - First alternative strategy
   - `StrategyImpl2.java` - Second alternative strategy
   - `StrategyImpl3.java` - Third alternative strategy
3. **Context** (`Context.java`): Maintains a reference to a Strategy object and delegates the algorithm execution to it

## Implementation Details
- The application uses reflection to dynamically instantiate strategy objects based on user input
- It maintains a cache of strategy objects in a HashMap to avoid creating duplicate instances
- The Context class is initialized with a default strategy but can switch to any other strategy at runtime
- Each strategy implementation provides a different behavior for the `operationStrategy()` method

## Technical Requirements
- Java 21
- Maven for dependency management