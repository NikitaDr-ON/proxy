public class EntryPoint {
    private static final String DATA_BASE_NAME = "DataBaseName";

    public void connectToDataBase(){
        System.out.println("connection to DataBaseName");
        Proxy proxy = new Proxy();
        proxy.addPathToDataBaseName(DATA_BASE_NAME);
    }

}
