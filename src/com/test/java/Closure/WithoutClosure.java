package com.test.java.Closure;
import java.util.*;
import org.apache.commons.collections.*;
import org.apache.commons.lang.*;
public class WithoutClosure
{
public static void main(String[] args)
{
  System.out.println("\nTest Number One Results :");
  
  int i = 1;
  List<DTO> collectionOfDTOs = Arrays.asList(new DTO(i++, "Java Tips and Tricks", "male", "Missouri"),
                                             new DTO(i++, "Apache Commons"      , "male", "Missouri"),
                                             new DTO(i++, "Jakarta Commons"     , "male", "Missouri"),
                                             new DTO(i++, "Collections"         , "male", "Missouri"),
                                             new DTO(i++, "Closures"            , "male", "Missouri") );
  for(DTO dto : collectionOfDTOs){
	  assert dto != null;
      String s = StringUtils.defaultIfEmpty(dto.getName(), "null");
      dto.setName("Yoda says, " + s + " Rocks!");
  }
  
  /*CollectionUtils.forAllDo(collectionOfDTOs, new Closure()
  {
    public void execute(Object o)
    {
      DTO dto = (DTO) o;
      assert dto != null;
      String s = StringUtils.defaultIfEmpty(dto.getName(), "null");
      dto.setName("Yoda says, " + s + " Rocks!");
    }
  });*/
  CollectionUtils.forAllDo(collectionOfDTOs,PrintIt.getInstance());
}
}