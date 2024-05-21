package org.library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // Generate empty array
        int booksArraySize;
        System.out.print("How many books would you like to add? ");
        booksArraySize = Integer.parseInt(scanner.nextLine());
        Book[] bookArray = new Book[booksArraySize];

        // Add books
        int i = 0;
        while (i < booksArraySize) {
            System.out.println("Please enter the book's details:");

            String title, author, publisher;
            int pages;

            System.out.print("Book title: ");
            title = scanner.nextLine();
            System.out.print("Page number: ");
            pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Author: ");
            author = scanner.nextLine();
            System.out.print("Publisher: ");
            publisher = scanner.nextLine();

            bookArray[i] = new Book(title, pages, author, publisher);
            i++;
        }

        // Print books
        System.out.println("****************");
        System.out.println("Here are the books you entered:");
        for (int j = 0; j < booksArraySize; j++) {
            System.out.println(bookArray[j]);
        }

        // Close Scanner
        scanner.close();
    }
}
