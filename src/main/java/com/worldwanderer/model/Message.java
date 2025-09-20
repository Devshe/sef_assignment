package com.worldwanderer.model;

import java.time.LocalDateTime;
//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Message {
    private int messageId;
    private int senderId;
    private int receiverId;
    private String content;
    private LocalDateTime timestamp;

    public Message(int messageId, int senderId, int receiverId, String content) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String sendMessage() {
        return "Message " + messageId + " sent from " + senderId + " to " + receiverId + " at " + timestamp;
    }

    public String receiveMessage() {
        return "Message " + messageId + " received by " + receiverId + " at " + timestamp + ": " + content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + messageId +
                ", senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
