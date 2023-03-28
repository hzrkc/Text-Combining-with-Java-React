package dev.hazar.metin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "metins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metin {
    @Id
    private ObjectId id;
    private String text1;
    private String text2;
    private String combinedText;

    public Metin (String text1, String text2, String combinedText){
        this.text1 = text1;
        this.text2 = text2;
        this.combinedText = combinedText;
    }
}
