# Lambda Expressions & Method References Assignment

This assignment demonstrates advanced Java 8+ features including Lambda Expressions and Method References through practical real-world scenarios.

## 📁 Project Structure

```
Lambda Expression/
├── README.md                           # This file
├── SmartLight.java                     # Smart light entity
├── LightActivation.java                # Functional interface for light patterns
├── SmartHomeLightingSystem.java        # Lambda expressions for smart home automation
├── Product.java                        # E-commerce product entity
├── ECommerceSortingSystem.java         # Lambda expressions with Comparator for sorting
├── Alert.java                          # Hospital alert entity
├── HospitalNotificationSystem.java     # Lambda expressions with Predicate for filtering
├── Patient.java                        # Patient entity for method references
├── HospitalPatientPrinting.java        # Method references for printing patient IDs
├── Employee.java                       # Employee entity for name processing
├── HRNameUppercasingSystem.java        # String::toUpperCase method reference
├── Invoice.java                        # Invoice entity with constructor
└── InvoiceGenerationSystem.java        # Constructor references for object creation
```

## 🎯 Assignment Requirements

### Lambda Expressions

#### 1. Smart Home Lighting Automation 🏠
- **File**: `SmartHomeLightingSystem.java`
- **Scenario**: Smart lights with different triggers (motion, time, voice commands)
- **Implementation**: 
  - Uses lambda expressions to define light activation behaviors dynamically
  - No need for multiple classes - behaviors defined as lambdas
  - Supports motion detection, time-based activation, and voice commands
- **Key Features**:
  - Motion detection patterns
  - Time-based lighting (morning, evening, night)
  - Voice command activation
  - Custom pattern creation using lambdas
  - Security and emergency patterns

#### 2. Custom Sorting in E-Commerce 🛒
- **File**: `ECommerceSortingSystem.java`
- **Scenario**: Online shop sorting products by different criteria (price, rating, discount)
- **Implementation**:
  - Uses lambda expressions with `Comparator` for dynamic sorting
  - Multiple sorting strategies for different sales campaigns
- **Key Features**:
  - Sort by price (ascending/descending)
  - Sort by rating (highest first)
  - Sort by discount percentage
  - Campaign-specific sorting (Black Friday, Premium, Budget-friendly)
  - Multi-criteria custom sorting

#### 3. Notification Filtering 🏥
- **File**: `HospitalNotificationSystem.java`
- **Scenario**: Hospital app filtering patient alerts based on user preferences
- **Implementation**:
  - Uses lambda expressions with `Predicate` to filter alerts
  - Different user roles have different filtering preferences
- **Key Features**:
  - Filter by priority (Critical, High, Medium, Low)
  - Filter by alert type (Emergency, Medication, Vital Signs)
  - Filter by department (ICU, Surgery, etc.)
  - Complex filtering with AND/OR/NOT operations
  - Role-based filtering (Doctor, Nurse, Admin)

### Method References

#### 1. Hospital Patient ID Printing 🆔
- **File**: `HospitalPatientPrinting.java`
- **Scenario**: Print patient IDs for admin verification
- **Implementation**:
  - Uses method references instead of lambda expressions
  - Demonstrates all types of method references
- **Key Features**:
  - Static method references: `Patient::printPatientId`
  - Instance method references: `System.out::println`
  - Method references in stream operations
  - Grouping and sorting with method references

#### 2. Name Uppercasing 👔
- **File**: `HRNameUppercasingSystem.java`
- **Scenario**: Convert employee names to uppercase for HR letters
- **Implementation**:
  - Uses `String::toUpperCase` method reference in streams
  - Generates various HR documents with proper formatting
- **Key Features**:
  - Uppercase conversion for formal documents
  - HR letter generation
  - Employee directory creation
  - Payroll reports with uppercase names
  - Statistical analysis with consistent formatting

#### 3. Invoice Object Creation 🧾
- **File**: `InvoiceGenerationSystem.java`
- **Scenario**: Generate invoice objects from transaction IDs
- **Implementation**:
  - Uses constructor reference `Invoice::new`
  - Demonstrates functional interfaces with constructor references
- **Key Features**:
  - Constructor references for object creation
  - Batch processing with constructor references
  - Parallel invoice generation
  - Performance comparison with lambda expressions
  - Advanced factory pattern implementation

## 🚀 How to Run

### Compile and Run Individual Components

```bash
# Navigate to the Lambda Expression directory
cd "Lambda Expression"

# Compile all Java files
javac *.java

# Run individual demonstrations
java SmartHomeLightingSystem
java ECommerceSortingSystem
java HospitalNotificationSystem
java HospitalPatientPrinting
java HRNameUppercasingSystem
java InvoiceGenerationSystem
```

### Expected Output

Each class contains comprehensive demonstrations with detailed console output showing:
- Before and after states
- Step-by-step processing
- Statistics and summaries
- Formatted reports and documents

## 📚 Learning Objectives

### Lambda Expressions
- **Functional Programming**: Understanding functional interfaces and lambda syntax
- **Dynamic Behavior**: Creating behaviors at runtime without additional classes
- **Stream API Integration**: Using lambdas with streams for data processing
- **Predicate Logic**: Filtering data with complex logical conditions
- **Comparator Composition**: Creating sophisticated sorting strategies

### Method References
- **Code Readability**: More concise and readable than equivalent lambdas
- **Performance**: Potential JVM optimizations for method references
- **Type Safety**: Compile-time checking and better IDE support
- **Maintenance**: Easier refactoring and code maintenance

## 🔧 Technical Features

### Advanced Lambda Patterns
- **Function Composition**: Combining multiple functions
- **Predicate Chaining**: Using `and()`, `or()`, `negate()` methods
- **Optional Integration**: Using lambdas with Optional operations
- **Parallel Processing**: Lambda expressions with parallel streams

### Method Reference Types
1. **Static Method References**: `ClassName::staticMethod`
2. **Instance Method References (specific object)**: `object::instanceMethod`
3. **Instance Method References (arbitrary object)**: `ClassName::instanceMethod`
4. **Constructor References**: `ClassName::new`

### Real-World Applications
- **IoT Device Control**: Smart home automation patterns
- **E-Commerce Platforms**: Dynamic product sorting and filtering
- **Healthcare Systems**: Alert management and filtering
- **Enterprise Applications**: Document generation and data processing

## 💡 Best Practices Demonstrated

1. **Functional Interface Design**: Clean, single-responsibility interfaces
2. **Lambda Readability**: Clear, concise lambda expressions
3. **Method Reference Usage**: When to prefer method references over lambdas
4. **Stream API Optimization**: Efficient data processing pipelines
5. **Error Handling**: Robust error handling in functional code
6. **Testing**: Testable functional code design

## 📈 Performance Considerations

- **Memory Efficiency**: Lambda expressions vs anonymous classes
- **Execution Speed**: Method references vs lambda expressions
- **Parallel Processing**: When to use parallel streams
- **JVM Optimizations**: How the JVM optimizes functional code

## 🎓 Educational Value

This assignment provides hands-on experience with:
- Modern Java functional programming paradigms
- Real-world application scenarios
- Performance optimization techniques
- Clean code principles
- Advanced Java 8+ features

Each component is designed to be educational while solving practical problems that developers encounter in enterprise applications.

## 🏆 Assignment Completion

✅ **Lambda Expressions**
- Smart Home Lighting Automation (Dynamic behavior definition)
- E-Commerce Custom Sorting (Comparator with lambdas)
- Hospital Notification Filtering (Predicate with lambdas)

✅ **Method References**
- Hospital Patient ID Printing (Method references instead of lambdas)
- HR Name Uppercasing (String::toUpperCase in streams)
- Invoice Object Creation (Constructor references)

All scenarios implemented with comprehensive examples, detailed output, and educational comments.