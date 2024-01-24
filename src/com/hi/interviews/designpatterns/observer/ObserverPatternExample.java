package com.hi.interviews.designpatterns.observer;


/**
 * The Observer Design Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, called observers, that are notified of any changes in the subject's state. This pattern is widely used to implement distributed event-handling systems.
 *
 * Let's go through a simple example of the Observer Design Pattern in Java. Suppose we have a newspaper publisher (Subject) that publishes news articles. Subscribers (Observers) subscribe to the newspaper and receive updates whenever a new article is published.
 *
 * In this example:
 *
 * NewspaperPublisher is the concrete subject that maintains a list of subscribers and notifies them when new news is published.
 * NewsSubscriber is the concrete observer that receives updates from the publisher.
 * The ObserverPatternExample class demonstrates how to use the Observer Design Pattern by creating a publisher, subscribers, and observing the interactions.
 * The Observer Pattern allows for a loosely coupled relationship between the subject and its observers, making it easy to add or remove observers without modifying the subject.
 *
 */
public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a newspaper publisher (subject)
        NewspaperPublisher newspaperPublisher = new NewspaperPublisher();

        // Create news subscribers (observers)
        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");
        NewsSubscriber subscriber3 = new NewsSubscriber("Subscriber 3");

        // Register subscribers with the publisher
        newspaperPublisher.registerObserver(subscriber1);
        newspaperPublisher.registerObserver(subscriber2);
        newspaperPublisher.registerObserver(subscriber3);

        // Publish news, and subscribers will be notified
        newspaperPublisher.publishNews("Breaking News: Important event!");

        // Unsubscribe one subscriber
        newspaperPublisher.removeObserver(subscriber2);

        // Publish another news, and only remaining subscribers will be notified
        newspaperPublisher.publishNews("Latest updates: Weather forecast.");

        // Output:
        // Publishing news: Breaking News: Important event!
        // Subscriber 1 received news: Breaking News: Important event!
        // Subscriber 2 received news: Breaking News: Important event!
        // Subscriber 3 received news: Breaking News: Important event!
        // Subscriber 1 received news: Latest updates: Weather forecast!
        // Subscriber 3 received news: Latest updates: Weather forecast!
    }
}
