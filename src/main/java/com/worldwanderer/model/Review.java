package com.worldwanderer.model;

import java.time.LocalDate;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Review {
    private int reviewId;
    private int userId;
    private int serviceId;
    private int rating; // 1-5
    private String comment;
    private LocalDate date;

    public Review(int reviewId, int userId, int serviceId, int rating, String comment) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.serviceId = serviceId;
        this.rating = rating;
        this.comment = comment;
        this.date = LocalDate.now();
    }

    public String editReview(int newRating, String newComment) {
        this.rating = newRating;
        this.comment = newComment;
        this.date = LocalDate.now(); // refresh edit date
        return "Review " + reviewId + " updated: " + newRating + "/5 - " + newComment;
    }

    public int getReviewId() { return reviewId; }
    public int getUserId() { return userId; }
    public int getServiceId() { return serviceId; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
    public LocalDate getDate() { return date; }

    public String getSummary() {
        return "Rating: " + rating + "/5 - " + comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", userId=" + userId +
                ", serviceId=" + serviceId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
