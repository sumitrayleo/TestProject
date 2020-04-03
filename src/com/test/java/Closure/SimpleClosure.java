package com.test.java.Closure;
import java.util.*;
import org.apache.commons.collections.*;
import org.apache.commons.lang.*;
public class SimpleClosure
{
public static void main(String[] args)
{
  System.out.println("\nTest Number One Results :");
  List<String> collectionOfWords = Arrays.asList("Java", "Example",
                                                 "Help", "Tips", "And",
                                                 "Tricks", "Apache",
                                                 "Commons", "Collections");
  // Lets call toString on every object and print it out.
  CollectionUtils.forAllDo(collectionOfWords, new Closure()
  {
    public void execute(Object o)
    {
      assert o != null;
      System.out.print(o.toString() + " ");
    }
  });
  System.out.println("\n\nTest Number Two Results :");
  
  int i = 1;
  List<DTO> collectionOfDTOs = Arrays.asList(new DTO(i++, "Java Tips and Tricks", "male", "Missouri"),
                                             new DTO(i++, "Apache Commons"      , "male", "Missouri"),
                                             new DTO(i++, "Jakarta Commons"     , "male", "Missouri"),
                                             new DTO(i++, "Collections"         , "male", "Missouri"),
                                             new DTO(i++, "Closures"            , "male", "Missouri") );
  CollectionUtils.forAllDo(collectionOfDTOs, new Closure()
  {
    public void execute(Object o)
    {
      DTO dto = (DTO) o;
      assert dto != null;
      String s = StringUtils.defaultIfEmpty(dto.getName(), "null");
      dto.setName("Yoda says, " + s + " Rocks!");
    }
  });
  CollectionUtils.forAllDo(collectionOfDTOs,PrintIt.getInstance());
}
}