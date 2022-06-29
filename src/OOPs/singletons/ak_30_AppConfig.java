package OOPs.singletons;

public class ak_30_AppConfig {
    private ak_30_AppConfig(){

    }
    private static ak_30_AppConfig obj = null;
    public static ak_30_AppConfig getInstance(){
        if(obj==null){
            obj = new ak_30_AppConfig();
        }
        return obj;
    }
}
