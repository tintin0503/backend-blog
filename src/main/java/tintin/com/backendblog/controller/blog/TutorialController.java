package tintin.com.backendblog.controller.blog;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tintin.com.backendblog.dto.tutorial.TutorialDto;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/blog/tutorials")
public class TutorialController {

    @GetMapping("/")
    public ResponseEntity<List<TutorialDto>> getAllTutorials(@RequestParam(required = false) String title) {

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutorialDto> getTutorialById(@PathVariable("id") long id) {

        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<TutorialDto> createTutorial(@RequestBody TutorialDto tutorial) {
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<TutorialDto> updateTutorial(@PathVariable("id") long id, @RequestBody TutorialDto tutorial) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/published")
    public ResponseEntity<List<TutorialDto>> findByPublished() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
