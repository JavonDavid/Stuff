public class light {
 boolean isOn;   
public light(boolean isOn){
this.isOn = isOn;
}
public void onOrOff(){
    if (isOn == true) {
        System.out.println("The light is on");
    }else{
        System.out.println("The light is off");
    }
    }

}
