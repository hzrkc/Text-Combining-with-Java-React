package dev.hazar.metin;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MetinService {

    @Autowired
    private MetinRepository metinRepository;
    public List<Metin> allMetins(){
        return metinRepository.findAll();
    }

    public Metin addMetins(String cikti){
        Metin metin = metinRepository.insert(new Metin(cikti));
        return metin;
    }

    public String combineMetins(Map<Integer, String> payload){

        Collection<String> values = payload.values();
        String[] targetArray = values.toArray(new String[0]);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < targetArray.length; i++) {
            String[] words = targetArray[i].split(" ");

            for (int j = 0; j < words.length; j++) {
                if (!result.toString().contains(words[j])) {
                    result.append(words[j]).append(" ");
                }
            }
        }

        String output = result.toString().trim();

        return output;
    }

}
