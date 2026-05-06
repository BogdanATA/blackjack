package com.pluralsight;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name Player 1: ");
        String player1 = scanner.nextLine();

        System.out.print("Enter Name Player 2: ");
        String player2 = scanner.nextLine();

        // create new deck and shuffle it at start of game
        Deck deck = new Deck();
        deck.shuffle();

        // create hands for both players
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        //Deal 2 cards to each player in alternating order
        hand1.deal(deck.deal());
        hand2.deal(deck.deal());
        hand1.deal(deck.deal());
        hand2.deal(deck.deal());

        System.out.printf("Player 1 card score: %s%n", hand1.getValue());
        System.out.printf("Player 2 card score: %s%n", hand2.getValue());
    }

    public static void promptForPlayers(Scanner scanner) {
        System.out.print("How many players are playing: ");
        int playerCount = scanner.nextInt();
        scanner.nextLine();


    }
}
