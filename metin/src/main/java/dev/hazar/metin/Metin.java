package dev.hazar.metin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "metins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metin {
    @Id
    private ObjectId id;
    private String combinedText;

    public Metin (String combinedText){
        this.combinedText = combinedText;
    }
}
