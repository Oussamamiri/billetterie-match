package ma.emsi.ticketing.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<?> index() {
        return new ResponseEntity<>("Welcome to Ticketing App", HttpStatus.OK);
    }
}
