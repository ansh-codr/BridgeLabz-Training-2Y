package assignment11;

public class Runner {
    public static void main(String[] args) {
        ProductReview review = new ProductReview();
        try {
            review.submitReview(6, "Great product");
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }
}
