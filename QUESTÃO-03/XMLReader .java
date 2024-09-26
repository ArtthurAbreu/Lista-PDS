public interface XMLReader {
  public void setContentHandler(ContentHandler handler);
  public void parse(InputStream is);
}