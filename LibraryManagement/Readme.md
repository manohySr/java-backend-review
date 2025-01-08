## Architecture style
Layered architecture, common in small and large applications.
Each layer will have a clear responsibility.

1. Model Layer 
- Represents the data and objects in the system.
- Example in our case: Book, Magazine, DVD 

2. Service Layer
- Contains the business logic.
- Example in our case: Managing borrowing, returning, and searching items.

3. Main/Controller Layer
- Provides the interface to interact the system.
- Example in our case: Menu-driven console interface to add books or borrow items.
