package OOPs.interfaces;

public abstract interface ak_35_Youtuber extends ak_35_VideoEditor{
    abstract void makeVideo();
   default void uploadVideo(){
        System.out.println("Uploading the video");
    }
}
