package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import se331.rest.util.CloudStirageHelper;

import javax.servlet.ServletException;
import java.io.IOException;

@Controller
public class BucketController {

    @Autowired
    CloudStirageHelper cloudStirageHelper;
    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam(value = "file")
                                        MultipartFile file) throws IOException, ServletException{
        return
                ResponseEntity.ok(this.cloudStirageHelper.getImageUrl(file,"imageupload-802aa.appspot.com"));
    }
}
