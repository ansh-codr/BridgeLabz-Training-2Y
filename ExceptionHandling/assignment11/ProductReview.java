package assignment11;

public class ProductReview {
    public void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Invalid rating: Rating must be between 1 and 5");
        }
        if (comment == null || comment.isEmpty()) {
            throw new EmptyReviewException("Empty review: Comment cannot be empty");
        }
        System.out.println("Review submitted successfully");
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
    }
}
