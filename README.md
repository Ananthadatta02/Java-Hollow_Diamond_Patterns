

# Hollow Diamond Star Pattern Program in Java

## Introduction
This Java program generates a **hollow diamond star pattern** based on the user-specified size. It utilizes nested loops to print spaces and stars, forming a symmetric hollow diamond shape. The program effectively demonstrates the use of conditional statements, nested loops, and structured output formatting in Java.

## How the Program Works

1. The program starts by importing `java.util.Scanner` to read user input.
2. The user is prompted to enter a size, which determines the height of the hollow diamond.
3. The program consists of two major parts:
   - **Upper half of the diamond** (excluding the middle row)
   - **Lower half of the diamond** (including the middle row)
4. Nested `for` loops are used to print spaces and stars in the correct positions to form the hollow pattern.

---

## Code Breakdown

### 1. **Variable Declaration and Input Handling**
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter Size");
int size = s.nextInt();
```
- `Scanner s = new Scanner(System.in);` → Creates a Scanner object to take input.
- `System.out.println("Enter Size");` → Prompts the user to enter a size.
- `int size = s.nextInt();` → Reads the integer input from the user.

---

### 2. **Upper Half of the Hollow Diamond**
```java
for(int i = 1; i < size; i++)
```
- Outer loop controls the number of rows in the upper half.
- Runs from `i = 1` to `i < size` (excluding the middle row).

```java
for(int j = i; j < size; j++)
    System.out.print(" ");
```
- Prints leading spaces to align the stars correctly, decreasing with each row.

```java
for(int j = 1; j < i; j++) {
    if (j == 1)
        System.out.print("*");
    else
        System.out.print(" ");
}
```
- Prints the left boundary of the hollow diamond.
- Only prints `*` for the first position in each row.

```java
for(int j = 1; j <= i; j++) {
    if (j == i)
        System.out.print("*");
    else
        System.out.print(" ");
}
System.out.println();
```
- Prints the right boundary of the hollow diamond.
- `System.out.println();` moves to the next line.

---

### 3. **Lower Half of the Hollow Diamond**
```java
for(int i = 1; i <= size; i++)
```
- Outer loop controls the number of rows in the lower half.

```java
for(int j = 1; j < i; j++)
    System.out.print(" ");
```
- Prints increasing spaces for alignment.

```java
for(int j = i; j < size; j++) {
    if (j == i)
        System.out.print("*");
    else
        System.out.print(" ");
}
```
- Prints the left boundary of the hollow bottom half.

```java
for(int j = i; j <= size; j++) {
    if (j == size)
        System.out.print("*");
    else
        System.out.print(" ");
}
System.out.println();
```
- Prints the right boundary of the bottom half.
- Moves to the next line for the next iteration.

---

## Example Output
If the user enters **5**, the program prints:
```
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
```

## Summary
- The program effectively demonstrates **nested loops** and **conditional statements** to generate a structured output.
- The **leading spaces** ensure the correct shape alignment.
- The **conditional checks** ensure that only boundary stars are printed, keeping the inside hollow.
- It is an excellent example of **pattern printing in Java**.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Hollow_Diamond_Patterns.git
```
