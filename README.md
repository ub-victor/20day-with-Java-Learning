# 📚 Java Projects Collection

A comprehensive collection of Java projects demonstrating object-oriented programming, design patterns, and software engineering principles. This workspace contains multiple projects ranging from fundamental concepts to advanced enterprise-level applications.

## 📁 Workspace Structure

```
eclipse-workspace/
├── back-management-system/          # Banking system with account management
├── Exams Project/                   # Exam management application
├── Flight Ticket Management System/ # Airline ticket booking system
├── Hotel-Management-System/         # Hotel operations management
├── MyJavaProject/                   # Learning projects organized by day
├── MyOopClassWithIvan/              # OOP principles and exercises
├── Stock_Management_System/         # Inventory management system
└── README.md                        # This file
```

---

## 🏦 Projects Overview

### 1. **back-management-system**
Banking system with core financial operations.

**Key Features:**
- Account management (opening, closing accounts)
- Deposit transactions
- Withdrawal operations
- Loan management

**Main Classes:**
- `Bank.java` - Core banking entity
- `OpenAccount.java` - Account creation logic
- `Deposite.java` - Deposit operations
- `Withdraw.java` - Withdrawal operations
- `Loan.java` - Loan management

**Package:** `bk`

---

### 2. **Exams Project**
Exam management and administration system.

**Key Features:**
- Exam scheduling
- Student registration
- Score management
- Result tracking

**Main Classes:**
- `BankApp.java` - Application entry point

**Package:** `bankSystem`

---

### 3. **Flight Ticket Management System** ✈️
Comprehensive airline ticket booking and management system.

**Key Features:**
- Passenger registration with passport validation
- Flight creation and seat management
- Ticket booking with auto-generated IDs
- Mobile payment processing (M-Pesa, AirtelMoney, etc.)
- Real-time seat availability tracking

**Main Classes:**
- `Main.java` - Interactive menu-driven application
- `Passenger.java` - Passenger entity with validation
- `Flight.java` - Flight management with booking
- `Ticket.java` - Abstract ticket processing
- `MobilePayment.java` - Mobile payment implementation
- Data Tables: `PassengerTable`, `FlightTable`, `TicketTable`

**Interfaces:**
- `Bookable.java` - Flight booking contracts
- `Payable.java` - Payment processing contracts

**Package:** `id27269`

**[➤ Detailed README](Flight%20Ticket%20Management%20System/README.md)**

---

### 4. **Hotel-Management-System**
Hotel operations and booking management.

**Capabilities:**
- Room management and availability
- Guest registration
- Reservation handling
- Billing and checkout

**Package:** `hotelSystem`

---

### 5. **MyJavaProject**
A comprehensive learning collection organized by progression level.

**Structure:**

| Folder | Topics |
|--------|--------|
| `day1-2` | Java fundamentals, Hello World programs |
| `day3-4` | Basic syntax, variables, operators |
| `day5` | Control structures, conditionals, loops |
| `day6` | Array operations and manipulation |
| `day7` | Object-Oriented Basics |
| `day8` | Methods and functions |
| `day9` | Classes and objects |
| `day10` | Student & Employee management |
| `day11` | Constructors and method types |
| `day12` | Method overloading, parameters |
| `day13` | Inheritance, static variables |
| `day14` | Hierarchical & multi-level inheritance |
| `day15+` | Advanced OOP concepts |

**Key Learning Projects:**
- `MyFisrtJavaProgram.java` - Classic "Hello World"
- `Employee.java` / `Student.java` - Entity classes
- `ConstructorExample.java` - Constructor patterns
- `Calculator.java` - Method implementation
- `BankAccount.java` - Banking logic
- Inheritance examples with various patterns

---

### 6. **MyOopClassWithIvan**
Advanced object-oriented programming course materials and exercises.

**Learning Areas:**
- Advanced exercises with complex OOP patterns
- Holiday programming challenges
- Equity and portfolio management scenarios
- Design patterns and best practices

**Package Folders:**
- `advancedexercises/` - Complex problem solving
- `day2/`, `day3/` - Progressive learning modules
- `equity/` - Financial equity management
- `exercises/` - Practice problems
- `holydayJavaExercises/` - Holiday coding challenges

---

### 7. **Stock_Management_System**
Inventory and stock management system for retail/warehouse operations.

**Key Features:**
- Product inventory tracking
- Stock level management
- Supply chain operations
- Warehouse operations

**Main Classes:**
- Stock management entities
- Inventory operations

**Package:** `stocksystem`

---

## 🛠️ Technologies & Tools

| Category | Details |
|----------|---------|
| **Language** | Java (Core) |
| **Version** | JDK 8+ recommended |
| **IDE** | Eclipse (Primary), VS Code, IntelliJ IDEA |
| **Build** | Manual compilation or IDE integration |
| **Paradigm** | Object-Oriented Programming (OOP) |
| **Data Structures** | Arrays, Lists, Collections Framework |
| **I/O** | Scanner, Console-based applications |

---

## 🎓 Learning Path

### Beginner Level
1. Start with **MyJavaProject/day1-5** - Core Java fundamentals
2. Progress to **MyJavaProject/day7-9** - OOP basics

### Intermediate Level
3. Study **MyJavaProject/day10-14** - Inheritance and polymorphism
4. Explore **back-management-system** - Practical application
5. Review **Hotel-Management-System** - Complex data management

### Advanced Level
6. Analyze **Flight Ticket Management System** - Complete system design
7. Work through **MyOopClassWithIvan** - Advanced patterns
8. Build with **Stock_Management_System** - Enterprise concepts

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later
- Eclipse IDE (or alternative Java IDE)
- Git (optional, for version control)

### Setup Instructions

1. **Clone/Download the workspace**
   ```bash
   # Navigate to your workspace directory
   cd /home/victoire/eclipse-workspace
   ```

2. **Open in IDE**
   - Eclipse: File → Open Projects from File System
   - Select the workspace directory
   - Choose projects to import

3. **Build Projects**
   - Project → Clean and Build
   - Or use IDE's build automation

4. **Run Applications**
   - Right-click on `Main.java` or application entry point
   - Run As → Java Application

---

## 💾 Project Dependencies

Most projects are **self-contained** with minimal external dependencies:
- Standard Java Library (java.util, java.io, etc.)
- Some projects may use `Scanner` for console input
- Database projects may require JDBC drivers (if applicable)

---

## 📊 OOP Concepts Covered

- ✅ **Classes & Objects** - Entity definition and instantiation
- ✅ **Inheritance** - Single, multi-level, hierarchical
- ✅ **Polymorphism** - Method overriding, interface implementation
- ✅ **Abstraction** - Abstract classes, interfaces
- ✅ **Encapsulation** - Access modifiers, getters/setters
- ✅ **Static Members** - Class variables and methods
- ✅ **Collections** - Lists, arrays, data structures
- ✅ **Exception Handling** - Try-catch, validation
- ✅ **Design Patterns** - Factory, Strategy, Template Method

---

## 🔍 Code Quality Features

- **Input Validation**: Comprehensive data validation across projects
- **Error Handling**: Exception handling and error messages
- **Code Organization**: Logical package structure and naming conventions
- **Documentation**: Comments and method documentation
- **Data Integrity**: Constraint checking and business logic validation

---

## 🎯 Project Highlights

### Most Complete Project
**Flight Ticket Management System** - Full CRUD operations, multi-layer architecture, interface-based design

### Best Learning Resource
**MyJavaProject** - Progressive complexity, well-organized by topics

### Advanced Patterns
**MyOopClassWithIvan** - Real-world scenarios and complex problem-solving

### Practical Applications
- Banking operations (back-management-system)
- Hotel management (Hotel-Management-System)
- Inventory control (Stock_Management_System)

---

## 📈 Project Statistics

| Project | Type | Complexity | Status |
|---------|------|-----------|--------|
| back-management-system | Banking | Intermediate | Complete |
| Exams Project | Education | Beginner | Partial |
| Flight Ticket System | Booking | Advanced | Complete |
| Hotel Management | Hospitality | Intermediate | Partial |
| MyJavaProject | Learning | Beginner-Advanced | Complete |
| MyOopClassWithIvan | Learning | Advanced | Complete |
| Stock Management | Inventory | Intermediate | Partial |

---

## 🔧 Build & Compilation

### Using Eclipse IDE
```
1. Right-click project
2. Build Project (or Build All)
3. Check for errors in Problems panel
```

### Using Command Line (javac)
```bash
# Compile single file
javac src/package/ClassName.java

# Compile entire project
javac src/package/*.java

# Run with classpath
java -cp bin package.ClassName
```

### Using Maven (if applicable)
```bash
mvn clean compile
mvn clean package
mvn clean test
```

---

## 📚 Recommended Study Order

1. **Week 1-2**: MyJavaProject days 1-5 (Fundamentals)
2. **Week 3-4**: MyJavaProject days 7-9 (OOP Basics)
3. **Week 5-6**: MyJavaProject days 10-14 (Inheritance & Polymorphism)
4. **Week 7**: back-management-system (Practical Application)
5. **Week 8**: Flight Ticket Management System (Advanced)
6. **Week 9-10**: MyOopClassWithIvan advanced exercises
7. **Week 11+**: Hotel-Management-System & Stock_Management_System (Complex Systems)

---

## 🐛 Troubleshooting

### Common Issues

**Issue**: "Cannot find symbol" errors
- **Solution**: Ensure all files are in correct package folders and IDE has rebuilt

**Issue**: Scanner input not working
- **Solution**: Check console is active, ensure System.in is available

**Issue**: ClassNotFoundException
- **Solution**: Verify classpath includes bin folder with compiled classes

---

## 💡 Tips for Development

- **Modular Design**: Break complex problems into smaller classes
- **Validation First**: Always validate user input before processing
- **Error Messages**: Provide meaningful error messages for debugging
- **Comments**: Document complex logic and business rules
- **Testing**: Test each method independently before integration

---

## 🤝 Contributing & Improvements

This workspace is ideal for:
- Learning Java OOP principles
- Practicing design patterns
- Building enterprise applications
- Teaching programming concepts
- Portfolio development

Feel free to extend any project with:
- GUI implementations (JavaFX, Swing)
- Database integration (JDBC, JPA)
- Web services (REST APIs)
- Additional features and enhancements

---

## 📝 License

These projects are provided as educational materials. Use freely for learning and teaching purposes.

---

## 👨‍💼 Project Scope

**Experience Level**: Beginner to Advanced
**Duration**: Long-term learning progression
**Topics**: Core Java, OOP, Data Structures, Design Patterns
**Real-world Applications**: Banking, Hospitality, Aviation, Retail

---

## 🌟 Quick Reference

- **Language**: Java
- **Workspace Root**: `/home/victoire/eclipse-workspace/`
- **Most Recent**: Flight Ticket Management System
- **Most Comprehensive**: MyJavaProject
- **Most Advanced**: MyOopClassWithIvan

---

**Happy Coding! 🚀**

For specific project details, refer to individual project README files.
