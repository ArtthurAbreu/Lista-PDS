public class SAXXMLReaderFactory extends XMLReaderFactory {
  @Override
  public XMLReader createXMLReader() {
      return new SAXXMLReader();  
  }
}