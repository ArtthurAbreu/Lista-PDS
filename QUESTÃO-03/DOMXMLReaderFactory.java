public class DOMXMLReaderFactory extends XMLReaderFactory {
  @Override
  public XMLReader createXMLReader() {
      return new DOMXMLReader();  
  }
}


