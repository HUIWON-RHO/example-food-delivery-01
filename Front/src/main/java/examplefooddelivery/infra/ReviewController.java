package examplefooddelivery.infra;
import examplefooddelivery.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/reviews")
@Transactional
public class ReviewController {
    @Autowired
    ReviewRepository reviewRepository;



    @RequestMapping(value = "reviews/{id}/reviewwrite",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Review reviewWrite(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /review/reviewWrite  called #####");
            Optional<Review> optionalReview = reviewRepository.findById(id);
            
            optionalReview.orElseThrow(()-> new Exception("No Entity Found"));
            Review review = optionalReview.get();
            review.reviewWrite();
            
            reviewRepository.save(review);
            return review;
            
    }
    



}
