public class Proxy implements IReader {

    private IReader ireader = new DataBaseReader();

    @Override
    public void addPathToDataBaseName(String dataBaseName) {
        ireader.addPathToDataBaseName(dataBaseName);
    }
}
