package se.fk.rimfrost.framework.produceratresultat;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface ResultatMappable<T>
{

   ObjectMapper MAPPER = new ObjectMapper();

   /** Serialize this DTO to JSON string */
   default String toJson()
   {
      try
      {
         return MAPPER.writeValueAsString(this);
      }
      catch (Exception e)
      {
         throw new RuntimeException("Failed to serialize JSON", e);
      }
   }

   /** Deserialize a JSON string into the DTO */
   static <T> T fromJson(String json, Class<T> type)
   {
      try
      {
         return MAPPER.readValue(json, type);
      }
      catch (Exception e)
      {
         throw new RuntimeException("Failed to deserialize JSON", e);
      }
   }
}
