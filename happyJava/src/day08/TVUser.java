package day08;

public class TVUser {

    //인터페이스 - 기능을 정의
    public static void main(String[] args) {
        //STV를 보던 사용자.
        //TV가 고장나서 LTV를 사왔다.
//        STV stv = new STV();
//        stv.togglePower();
//        stv.channelUp();
//        stv.channelUp();
//        stv.volumeDown();
//        stv.channelUp();
//        stv.volumeUp();
//        stv.togglePower();

//        LTV ltv = new LTV();
//        ltv.setPower();
//        ltv.channUp();
//        ltv.channUp();
//        ltv.soundUp();
//        ltv.channUp();
//        ltv.soundUp();
//        ltv.setPower();

        //인테페이스를 이용해서 TV 를 사용할 때..
        TV tv = new LTV();
        tv.togglePower();
        tv.channelUp();
        tv.channelUp();
        tv.volumeDown();
        tv.channelUp();
        tv.volumeUp();
        tv.togglePower();


    }
}
