package dev.hazar.metin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MetinController {
    @Autowired
    private MetinService metinService;

    @GetMapping("/listTexts")
    public ResponseEntity<List<Metin>> getAllMetins(){
        return new ResponseEntity<List<Metin>>(metinService.allMetins(), HttpStatus.OK);
    }

    @PostMapping("/addTexts")
    public ResponseEntity<Metin> addMetins(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Metin>(metinService.addMetins(
                payload.get("cikti")),
                HttpStatus.OK);
    }

    @PostMapping("/combineTexts")
    public ResponseEntity<String> combineMetins(@RequestBody Map<Integer, String> payload){

        return new ResponseEntity<String>(metinService.combineMetins
                (payload), HttpStatus.OK);
    }
}
