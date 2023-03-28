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

        long startTime = 0, endTime = 0;
        startTime = System.nanoTime();


        Collection<String> values = payload.values();
        String[] targetArray = values.toArray(new String[0]);

        StringBuilder result = new StringBuilder();

        int b;

        result.append(targetArray[0]);

        for(int a = 1; a < targetArray.length; a++){

                for( b=0 ; b < targetArray[a].length(); b++){

                    if(result.toString().contains(targetArray[a].substring(0,b)))
                    {
                        continue;
                    }

                    else
                    {
                        break;
                    }
                }
                result.append(targetArray[a].substring(b-1));
        }

        /*for (int i = 0; i < targetArray.length; i++) {
            String[] words = targetArray[i].split(" ");

            for (int j = 0; j < words.length; j++) {
                if (!result.toString().contains(words[j])) {
                    result.append(words[j]).append(" ");
                }
            }
        }*/
        endTime = System.nanoTime();

        Double fark = (((double) (endTime - startTime)) / 1000000);

        String sure = fark.toString();

        result.append(" | Çalışma Süresi: " + sure + " ms");
        String output = result.toString().trim();


        return output;
    }

}
