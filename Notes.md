### HashMap inner working

https://medium.com/@yashodhara.chowkar/internal-working-of-hashmap-in-java-and-performance-improvement-in-java-8-a28ee1660cda

1. Buckets - 16 (Linked List & Array)
2. Load factor & Rehashing (threshold of increase, rearrangement into increased buckets)
3. Hashing (Hashcode generation - map.hashcode())
4. Collision (Same hashcode for multiple keys)
5. equals() (Checks for collision)

Linked HashMap - maintains the order of insertion


### Multithreading
Concepts: CPU, Core, Program, Process, Thread, Multitasking
1. Time sharing (executes quickly and continuously - not parallel, used in single core processor)
2. Slicing (divides processing time into short, fixed intervals known as time quanta or slices)

Thread Life Cycle
1. NEW
2. Runnable (CPU allocation)
3. Running
4. Blocked/Waiting
5. Terminated

Thread methods:
1. join()
2. start()
3. run()
4. sleep()
5. setPriority() (hint not an order)
6. interrupt() (checks whether the currentThread is in runnable)
7. yield() (hint not an order to stop the current thread)
8. setDaemon()

### JDBC
Application
    |
   API
    | 
JDBC Driver Manager
/   |    \
SQL Oracle Data Source

JDBC Processing Model
- One Tier
- Two Tier (Client app -> Driver -> Database)
- Three Tier (Client app -> Application Server -> Database)

JDBC Drivers
1. JDBC-ODBC Bridge Driver
2. Native-API Driver (Partially Java Driver)
3. Network Protocol Driver (All-Java Middleware)
4. Thin Driver (Pure Java Driver)

JDBC Classes and Interfaces
1. Driver Manager (Establish connection)
2. Connection (Requests connection and session)
3. Statement (Excute the SQL queries)
4. Prepared Statement (Placeholder query)
5. Callable Statement (Stored procedure)
6. ResultSet (Input)
7. SQLException (Exceptions for SQL)

### SpringBoot
- IOC
- Dependency Injection
- Loose Coupling
- Lightweight
- OpenSource
- MVC
- Security
