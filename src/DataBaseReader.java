public class DataBaseReader implements IReader {
    @Override
    public void addPathToDataBaseName(String dataBaseName) {
        System.out.println( "connected to localhost:8080/" + dataBaseName);
    }
}
