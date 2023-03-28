package dev.hazar.metin;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetinService {

    @Autowired
    private MetinRepository metinRepository;
    public List<Metin> allMetins(){
        return metinRepository.findAll();
    }

    public Metin addMetins(String giris1, String giris2, String cikti){
        Metin metin = metinRepository.insert(new Metin(giris1,giris2,cikti));
        return metin;
    }

    public String combineMetins(String giris1, String giris2){
        String combinedText = "çıktı test deneme";
        return combinedText;
    }

}
