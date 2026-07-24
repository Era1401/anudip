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