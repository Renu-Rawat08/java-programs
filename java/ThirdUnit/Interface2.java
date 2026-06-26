interface  Camera{
    void takephoto();
}
interface Musicplayer{
    void Musicplayer();
}
class Smartphone implements Camera ,Musicplayer{
    @Override
    public void takephoto(){
        System.out.println("capturing the photo");
    }
    @Override
    public void Musicplayer(){
        System.out.println("playing an music");
    }
    public void makecall(){
        System.out.println("calling someone");
    }
} 
class Interface2{
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.Musicplayer();
        s.takephoto();
       s.makecall();
    }
}