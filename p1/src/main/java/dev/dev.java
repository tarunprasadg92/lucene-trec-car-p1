package dev;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import edu.unh.cs.treccar.Data;
import edu.unh.cs.treccar.read_data.DeserializeData;

public class dev {
	
	public static void main(String[] args) throws Exception{
		
		Map <String, String> paraMap = new HashMap <String, String>();
		
        System.setProperty("file.encoding", "UTF-8");

        final FileInputStream fileInputStream2 = new FileInputStream(new File("train.test200.cbor.paragraphs"));

        for(Data.Paragraph p: DeserializeData.iterableParagraphs(fileInputStream2)) {
        	String paraId = p.getParaId();
            String text = p.getTextOnly();
            System.out.println("ID " + paraId + "\n" + text + "\n");
            
            paraMap.put(paraId, text);
        }

        System.out.println("\n\n");

    }
}
