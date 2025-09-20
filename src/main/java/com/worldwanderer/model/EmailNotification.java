package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class EmailNotification {
    private int emailId;
    private String recipient;
    private String subject;
    private String content;

    public EmailNotification(int emailId, String recipient, String subject, String content) {
        this.emailId = emailId;
        this.recipient = recipient;
        this.subject = subject;
        this.content = content;
    }

    public String sendConfirmation(Booking booking) {
        return "Confirmation email sent to " + recipient +
                " for booking " + booking.getBookingId() +
                " with subject: '" + subject + "'";
    }

    public String sendItinerary(Booking booking) {
        return "Itinerary email sent to " + recipient +
                " for booking " + booking.getBookingId();
    }

    @Override
    public String toString() {
        return "EmailNotification{" +
                "id=" + emailId +
                ", recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
