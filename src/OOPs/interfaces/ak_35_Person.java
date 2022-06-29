package OOPs.interfaces;

public class ak_35_Person implements ak_35_Student, ak_35_Youtuber{
    public static void main(String[] args) {
        ak_35_Person obj = new ak_35_Person();
        obj.makeVideo();
        obj.study();

        ak_35_Youtuber obj2 = obj; // It is not instantiation, It is giving reference after typecasting
        obj2.editVideos();
        obj2.makeVideo();
    }

    @Override
    public void study() {
        System.out.println("Person is Studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making a video");
    }

    @Override
    public void editVideos() {
        System.out.println("Youtuber is editing");
    }
}
